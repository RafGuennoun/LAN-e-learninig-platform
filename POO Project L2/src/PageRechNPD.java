import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageRechNPD extends JFrame {

	private JPanel contentPane;
	private JTextField rechNom;
	private JTextField rechPrenom;
	private JTextField rechJour;
	private JTextField rechMois;
	private JTextField rechAnnee;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageRechNPD frame = new PageRechNPD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PageRechNPD() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRechercheParNom = new JLabel("Recherche par Nom , Prenom , Date de naissance :");
		lblRechercheParNom.setBounds(10, 11, 808, 50);
		lblRechercheParNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercheParNom.setForeground(Color.WHITE);
		lblRechercheParNom.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblRechercheParNom);
		
		JLabel lblNom = new JLabel("Nom  :");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNom.setBounds(104, 72, 73, 45);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setForeground(Color.WHITE);
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrenom.setBounds(416, 72, 99, 45);
		contentPane.add(lblPrenom);
		
		JLabel lblJour = new JLabel("Jour :");
		lblJour.setForeground(Color.WHITE);
		lblJour.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblJour.setBounds(146, 120, 65, 45);
		contentPane.add(lblJour);
		
		rechNom = new JTextField();
		rechNom.setHorizontalAlignment(SwingConstants.CENTER);
		rechNom.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechNom.setColumns(10);
		rechNom.setBounds(177, 77, 160, 37);
		contentPane.add(rechNom);
		
		rechPrenom = new JTextField();
		rechPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		rechPrenom.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechPrenom.setColumns(10);
		rechPrenom.setBounds(513, 77, 160, 37);
		contentPane.add(rechPrenom);
		
		JLabel lblMois = new JLabel("Mois :");
		lblMois.setForeground(Color.WHITE);
		lblMois.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMois.setBounds(299, 120, 65, 45);
		contentPane.add(lblMois);
		
		JLabel lblAnne = new JLabel("Ann\u00E9e :");
		lblAnne.setForeground(Color.WHITE);
		lblAnne.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAnne.setBounds(455, 120, 84, 45);
		contentPane.add(lblAnne);
		
		rechJour = new JTextField();
		rechJour.setHorizontalAlignment(SwingConstants.CENTER);
		rechJour.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechJour.setColumns(10);
		rechJour.setBounds(208, 125, 60, 37);
		contentPane.add(rechJour);
		
		rechMois = new JTextField();
		rechMois.setHorizontalAlignment(SwingConstants.CENTER);
		rechMois.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechMois.setColumns(10);
		rechMois.setBounds(365, 125, 60, 37);
		contentPane.add(rechMois);
		
		rechAnnee = new JTextField();
		rechAnnee.setHorizontalAlignment(SwingConstants.CENTER);
		rechAnnee.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechAnnee.setColumns(10);
		rechAnnee.setBounds(538, 125, 73, 37);
		contentPane.add(rechAnnee);
		
		JButton button = new JButton("Rechercher");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(0,153,51));
				button.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.white);
				button.setForeground(Color.DARK_GRAY);
			}
		});
		button.setBorder(null);
		button.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Main nvm = new Main();
				
				String nom = rechNom.getText();
				String prenom = rechPrenom.getText();
				String j = rechJour.getText();
				String m = rechMois.getText();
				String a = rechAnnee.getText();
				boolean b = false;
				boolean f = false;
		
			//	DateDeNaiss d = new DateDeNaiss(Integer.valueOf(rechJour.getText()),Integer.valueOf(rechMois.getText()),Integer.valueOf(rechAnnee.getText()));
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(44, 235, 760, 171);
				contentPane.add(textArea);
				
				int cas=0;
				
				if( nom.isEmpty() && prenom.isEmpty() && j.isEmpty() && m.isEmpty() && a.isEmpty() )
				{
					cas = 1; 	// tout est vide 
				}
					
				if( nom.isEmpty()==false && prenom.isEmpty() && j.isEmpty() && m.isEmpty() && a.isEmpty() )
				{
					cas = 2; 	// nom !vide 
				}
				
				if( nom.isEmpty() && prenom.isEmpty()==false && j.isEmpty() && m.isEmpty() && a.isEmpty() )
				{
					cas = 3; 	// prenom !vide 
				}
					
				if( nom.isEmpty() && prenom.isEmpty() && j.isEmpty()==false && m.isEmpty()==false && a.isEmpty()==false )
				{
					cas = 4; 	// date !vide 
				}
				
				if(  nom.isEmpty()==false && prenom.isEmpty()==false && j.isEmpty() && m.isEmpty() && a.isEmpty() )
				{
					cas = 5;
				}
				
				if(  nom.isEmpty()==false && prenom.isEmpty() && j.isEmpty()==false && m.isEmpty()==false && a.isEmpty()==false )
				{
					cas = 6;
				}
				
				if(  nom.isEmpty() && prenom.isEmpty()==false && j.isEmpty()==false && m.isEmpty()==false && a.isEmpty()==false )
				{
					cas = 7;
				}
				
				if(  nom.isEmpty()==false && prenom.isEmpty()==false && j.isEmpty()==false && m.isEmpty()==false && a.isEmpty()==false )
				{
					cas = 8;
				}
				
				
				if( !nvm.textOnly(nom) || !nvm.textOnly(prenom) || !nvm.numbersOnly(j) || !nvm.numbersOnly(m) || !nvm.numbersOnly(a) )
				{
					cas = 9;
				}
				
				
				
				switch (cas)
				{
					case 1: // tout est vide 
						JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir les données !");
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
					case 2: // nom !vide
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if ( nvm.toutEtd.get(x).getNom().equals(nom) )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
						
					case 3: //prenom !vide
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if ( nvm.toutEtd.get(x).getPrenom().equals(prenom) )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
					
					case 4: // date !vide
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if ( nvm.toutEtd.get(x).getDateDeNaiss().getjDeNaiss()==Integer.valueOf(j) && nvm.toutEtd.get(x).getDateDeNaiss().getmDeNaiss()==Integer.valueOf(m) && nvm.toutEtd.get(x).getDateDeNaiss().getaDeNaiss()==Integer.valueOf(a)  )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
						
					case 5: // nom + penom
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if (  nvm.toutEtd.get(x).getNom().equals(nom) && nvm.toutEtd.get(x).getPrenom().equals(prenom) )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
						
					case 6: // nom + date 
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if (    nvm.toutEtd.get(x).getNom().equals(nom) && nvm.toutEtd.get(x).getDateDeNaiss().getjDeNaiss()==Integer.valueOf(j) && nvm.toutEtd.get(x).getDateDeNaiss().getmDeNaiss()==Integer.valueOf(m) && nvm.toutEtd.get(x).getDateDeNaiss().getaDeNaiss()==Integer.valueOf(a)  )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
						
					case 7: //prenom + date
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if (    nvm.toutEtd.get(x).getPrenom().equals(prenom) && nvm.toutEtd.get(x).getDateDeNaiss().getjDeNaiss()==Integer.valueOf(j) && nvm.toutEtd.get(x).getDateDeNaiss().getmDeNaiss()==Integer.valueOf(m) && nvm.toutEtd.get(x).getDateDeNaiss().getaDeNaiss()==Integer.valueOf(a)  )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
						
						
					case 8: // tout est donné
						for( int x=0 ; x<nvm.toutEtd.size(); x++)
						{
							if (    nvm.toutEtd.get(x).getNom().equals(nom)  && nvm.toutEtd.get(x).getPrenom().equals(prenom) && nvm.toutEtd.get(x).getDateDeNaiss().getjDeNaiss()==Integer.valueOf(j) && nvm.toutEtd.get(x).getDateDeNaiss().getmDeNaiss()==Integer.valueOf(m) && nvm.toutEtd.get(x).getDateDeNaiss().getaDeNaiss()==Integer.valueOf(a)  )
							{
								//textArea.append( nvm.listeIsil.get(x).toString() + nvm.Isil.getNom() + "\n");
								if( nvm.listeIsil.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Isil.getNom() + "\n");
									b=true;
								}
								if( nvm.listeAcad.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Acad.getNom() + "\n");
									b=true;
								}
								if( nvm.listeGtr.contains(nvm.toutEtd.get(x)) )
								{
									textArea.append( nvm.toutEtd.get(x).toString() + nvm.Gtr.getNom() + "\n");
									b=true;
								}
							}
							
							
					       }
						if(b==false)
						{
							textArea.append("L'etudiant que vous cherchez n'existe pas !! \n\n");
						}
						rechNom.setText("");
						rechPrenom.setText("");
						rechJour.setText("");
						rechMois.setText("");
						rechAnnee.setText("");
						break;
						
						
					case 9:
						JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
						break;
						
						
					default:
						JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir les données !");
						break;
					
				}
				
			
			}
				
				
			});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(246, 176, 319, 45);
		contentPane.add(button);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(204,0,0));
				btnRetour.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(Color.white);
				btnRetour.setForeground(Color.red);
			}
		});
		btnRetour.setBorder(null);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetour.setBounds(687, 176, 131, 45);
		contentPane.add(btnRetour);
		
	
	}

}
