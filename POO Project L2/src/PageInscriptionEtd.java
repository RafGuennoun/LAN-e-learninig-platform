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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PageInscriptionEtd extends JFrame {

	private JPanel contentPane;
	private JTextField nomInscriptionEtd;
	private JTextField prenomInscriptionEtd;
	private JTextField jour;
	private JTextField mois;
	private JTextField annee;
	
	ArrayList<Etudiant> all = new ArrayList<Etudiant>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageInscriptionEtd frame = new PageInscriptionEtd();
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
	public PageInscriptionEtd() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nom :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(23, 103, 60, 50);
		contentPane.add(label);
		
		nomInscriptionEtd = new JTextField();
		nomInscriptionEtd.setToolTipText("Nom");
		nomInscriptionEtd.setHorizontalAlignment(SwingConstants.CENTER);
		nomInscriptionEtd.setFont(new Font("Tahoma", Font.BOLD, 15));
		nomInscriptionEtd.setColumns(10);
		nomInscriptionEtd.setBounds(77, 114, 131, 30);
		contentPane.add(nomInscriptionEtd);
		
		JLabel label_1 = new JLabel("Prenom :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(237, 103, 74, 50);
		contentPane.add(label_1);
		
		prenomInscriptionEtd = new JTextField();
		prenomInscriptionEtd.setToolTipText("Prenom");
		prenomInscriptionEtd.setHorizontalAlignment(SwingConstants.CENTER);
		prenomInscriptionEtd.setFont(new Font("Tahoma", Font.BOLD, 15));
		prenomInscriptionEtd.setColumns(10);
		prenomInscriptionEtd.setBounds(317, 114, 131, 30);
		contentPane.add(prenomInscriptionEtd);
		
		JLabel label_2 = new JLabel("Date de naissance : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(23, 170, 149, 50);
		contentPane.add(label_2);
		
		jour = new JTextField();
		jour.setToolTipText("Jour");
		jour.setHorizontalAlignment(SwingConstants.CENTER);
		jour.setFont(new Font("Tahoma", Font.BOLD, 15));
		jour.setColumns(10);
		jour.setBounds(178, 181, 70, 30);
		contentPane.add(jour);
		
		mois = new JTextField();
		mois.setToolTipText("Mois");
		mois.setHorizontalAlignment(SwingConstants.CENTER);
		mois.setFont(new Font("Tahoma", Font.BOLD, 15));
		mois.setColumns(10);
		mois.setBounds(278, 181, 70, 30);
		contentPane.add(mois);
		
		annee = new JTextField();
		annee.setToolTipText("Ann\u00E9e");
		annee.setHorizontalAlignment(SwingConstants.CENTER);
		annee.setFont(new Font("Tahoma", Font.BOLD, 15));
		annee.setColumns(10);
		annee.setBounds(378, 181, 70, 30);
		contentPane.add(annee);
		
		JLabel label_3 = new JLabel("/");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(258, 188, 14, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("/");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(358, 188, 14, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Specialit\u00E9 :");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(23, 245, 88, 36);
		contentPane.add(label_5);
		
		JComboBox choixSpecEtd = new JComboBox();
		choixSpecEtd.setToolTipText("");
		choixSpecEtd.addItem("ISIL");
		choixSpecEtd.addItem("ACAD");
		choixSpecEtd.addItem("GTR");
		choixSpecEtd.setSelectedItem(null);
		choixSpecEtd.setBounds(113, 250, 101, 30);
		contentPane.add(choixSpecEtd);
		
		JButton button = new JButton("Inscrire");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(0,153,51));
				button.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.WHITE);
				button.setForeground(Color.DARK_GRAY);
			}
		});
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				
				
				String nom = nomInscriptionEtd.getText();
				String prenom = prenomInscriptionEtd.getText();
				String j = jour.getText();
				String m = mois.getText();
				String a = annee.getText();
				String spec = (String) choixSpecEtd.getSelectedItem();
				boolean f = false;
				
				
				if( nom.isEmpty() || prenom.isEmpty()|| j.isEmpty()|| m.isEmpty()|| a.isEmpty()|| choixSpecEtd.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); /* message d'erreur */
					f=true;
				}
				
				else
				{
				
				if( nv.anneeExiste(Integer.valueOf(a))==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */
					annee.setText("");
					f=true;
				}
					
				if( ( Integer.valueOf(j)<1 || Integer.valueOf(j)>31) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */ 
					jour.setText("");
					f=true;
				}
		
					
				
				if( ( Integer.valueOf(m)<1 || Integer.valueOf(m)>12 ) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */ 
					mois.setText("");
					f=true;
				}
				
				
				
				// mois de fevrier : 
				if( (j.equals("30") && m.equals("2")) || (j.equals("31") && m.equals("2")) )
				{
					
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */
					jour.setText("");
					mois.setText("");
					annee.setText("");
					f=true;
				}
				
				// mois avril(4) , juin(6) , septembre(9) , novembre(11)
				if(  (j.equals("31") && m.equals("4")) || (j.equals("31") && m.equals("6")) || (j.equals("31") && m.equals("9")) || (j.equals("31") && m.equals("11"))  )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */
					jour.setText("");
					mois.setText("");
					annee.setText("");
					f=true;
					
				}
				
				// annee ou le 29/02 n'existe pas 
				if( j.equals("29") && m.equals("2") && nv.anneeBis(Integer.valueOf(a))==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */
					jour.setText("");
					mois.setText("");
					annee.setText("");
					f=true;
				}
				
				if( !nv.textOnly(nom) || !nv.textOnly(prenom) || !nv.numbersOnly(j) || !nv.numbersOnly(m) || !nv.numbersOnly(a))
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données  !");
					f=true;
				}
				
				if( f==false )
				{
				Etudiant e ;
				if(choixSpecEtd.getSelectedIndex()==0) //isil
				{
					DateDeNaiss D = new DateDeNaiss( Integer.valueOf(j) , Integer.valueOf(m) , Integer.valueOf(a) );
					e = new Etudiant(nom,prenom,D);
					nv.listeIsil.add(e);
					nv.toutEtd.add(e);
					JOptionPane.showMessageDialog(erreurPanel," Etudiant inscrit "); // message de succes
				}
				
				if(choixSpecEtd.getSelectedIndex()==1)
				{
					DateDeNaiss D = new DateDeNaiss( Integer.valueOf(j) , Integer.valueOf(m) , Integer.valueOf(a) );
					e = new Etudiant(nom,prenom,D);
					nv.listeAcad.add(e);
					nv.toutEtd.add(e);
					JOptionPane.showMessageDialog(erreurPanel," Etudiant inscrit "); // message de succes
				}
				
				if(choixSpecEtd.getSelectedIndex()==2)
				{
					DateDeNaiss D = new DateDeNaiss( Integer.valueOf(j) , Integer.valueOf(m) , Integer.valueOf(a) );
					e = new Etudiant(nom,prenom,D);
					nv.listeGtr.add(e);
					nv.toutEtd.add(e);					
					JOptionPane.showMessageDialog(erreurPanel," Etudiant inscrit "); // message de succes
				}

				
				
				
				//System.out.println(listeAll2.get(0).toString());
				nomInscriptionEtd.setText("");
				prenomInscriptionEtd.setText("");
				jour.setText("");
				mois.setText("");
				annee.setText("");
				choixSpecEtd.setSelectedItem(null);
				}
				}
				///////////////////////////////////////////////////////////////////////////////////////////////////////////
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(50, 307, 399, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Retour");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setBackground(new Color(204,0,0));
				button_1.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_1.setBackground(Color.WHITE);
				button_1.setForeground(Color.RED);
			}
		});
		button_1.setBorder(null);
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(190, 368, 131, 36);
		contentPane.add(button_1);
		
		JLabel lblInscriptionDes = new JLabel("* Inscription des etudiants *");
		lblInscriptionDes.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscriptionDes.setForeground(Color.WHITE);
		lblInscriptionDes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInscriptionDes.setBounds(10, 11, 375, 50);
		contentPane.add(lblInscriptionDes);
		
		JButton btnAff = new JButton("Afficher les etudiants inscrits ");
		btnAff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAff.setBackground(new Color(0,153,51));
				btnAff.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAff.setBackground(Color.white);
				btnAff.setForeground(Color.DARK_GRAY);
			}
		});
		btnAff.setBorder(null);
		btnAff.setBackground(Color.WHITE);
		btnAff.setForeground(Color.DARK_GRAY);
		btnAff.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				Main nv = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
				textArea.setBounds(492, 57, 346, 356);
				contentPane.add(textArea);
				
				
				for(int k=0 ; k<nv.toutEtd.size(); k++)
				{
					//textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString()+   "\n");
					if( nv.listeIsil.contains(nv.toutEtd.get(k)))
					{
						textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString()+"  "+ nv.Isil.getNom() + "\n");
					}
					
					if( nv.listeAcad.contains(nv.toutEtd.get(k)))
					{
						textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString()+"  "+ nv.Acad.getNom() + "\n");
					}
					
					if( nv.listeGtr.contains(nv.toutEtd.get(k)))
					{
						textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString()+"  "+ nv.Gtr.getNom() + "\n");
					}
				}
				
			}
		});
		btnAff.setBounds(503, 11, 318, 36);
		contentPane.add(btnAff);
		

		
		
		
		
		
		/*
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea.setBounds(492, 57, 346, 356);
		contentPane.add(textArea);
*/
	/*	for(int k=0 ; k<all.size(); k++)
		{
			textArea.append(all.get(k).toString());
		}
		*/
		
		//textArea.setText(listeAll2.get(k).getMatricule() + " " + listeAll2.get(k).getNom() + " " + listeAll2.get(k).getPrenom() + " " );
	
			

	}
}
