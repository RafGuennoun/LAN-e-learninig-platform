import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class ModifEtd extends JFrame {

	private JPanel contentPane;
	private JTextField nomAvant;
	private JTextField prenomAvant;
	private JTextField jAvant;
	private JTextField mAvant;
	private JTextField aAvant;
	private JTextField matAvant;
	private JTextField nomApres;
	private JTextField prenomApres;
	private JTextField jApres;
	private JTextField mApres;
	private JTextField aApres;
	private JTextField matApres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifEtd frame = new ModifEtd();
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
	public ModifEtd() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nom :");
		label.setBounds(20, 168, 60, 36);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label);
		
		nomAvant = new JTextField();
		nomAvant.setBounds(111, 172, 149, 30);
		nomAvant.setToolTipText("Nom");
		nomAvant.setHorizontalAlignment(SwingConstants.CENTER);
		nomAvant.setFont(new Font("Tahoma", Font.BOLD, 15));
		nomAvant.setColumns(10);
		contentPane.add(nomAvant);
		
		JLabel label_1 = new JLabel("Prenom :");
		label_1.setBounds(20, 217, 74, 36);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_1);
		
		prenomAvant = new JTextField();
		prenomAvant.setBounds(111, 221, 149, 30);
		prenomAvant.setToolTipText("Prenom");
		prenomAvant.setHorizontalAlignment(SwingConstants.CENTER);
		prenomAvant.setFont(new Font("Tahoma", Font.BOLD, 15));
		prenomAvant.setColumns(10);
		contentPane.add(prenomAvant);
		
		JLabel label_2 = new JLabel("Date de naissance : ");
		label_2.setBounds(20, 257, 149, 36);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_2);
		
		jAvant = new JTextField();
		jAvant.setBounds(49, 297, 60, 30);
		jAvant.setToolTipText("Jour");
		jAvant.setHorizontalAlignment(SwingConstants.CENTER);
		jAvant.setFont(new Font("Tahoma", Font.BOLD, 15));
		jAvant.setColumns(10);
		contentPane.add(jAvant);
		
		mAvant = new JTextField();
		mAvant.setBounds(120, 297, 60, 30);
		mAvant.setToolTipText("Mois");
		mAvant.setHorizontalAlignment(SwingConstants.CENTER);
		mAvant.setFont(new Font("Tahoma", Font.BOLD, 15));
		mAvant.setColumns(10);
		contentPane.add(mAvant);
		
		aAvant = new JTextField();
		aAvant.setBounds(194, 297, 66, 30);
		aAvant.setToolTipText("Ann\u00E9e");
		aAvant.setHorizontalAlignment(SwingConstants.CENTER);
		aAvant.setFont(new Font("Tahoma", Font.BOLD, 15));
		aAvant.setColumns(10);
		contentPane.add(aAvant);
		
		JLabel label_3 = new JLabel("/");
		label_3.setBounds(110, 304, 14, 14);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("/");
		label_4.setBounds(184, 304, 14, 14);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Specialit\u00E9 :");
		label_5.setBounds(20, 338, 88, 36);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_5);
		
		JComboBox comboBoxAvant = new JComboBox();
		comboBoxAvant.setToolTipText("");
		comboBoxAvant.addItem("ISIL");
		comboBoxAvant.addItem("ACAD");
		comboBoxAvant.addItem("GTR");
		comboBoxAvant.setSelectedItem(null);
		comboBoxAvant.setBounds(111, 343, 149, 30);
		comboBoxAvant.setToolTipText("");
		contentPane.add(comboBoxAvant);
		
		JLabel lblModifications = new JLabel("Modifications");
		lblModifications.setBounds(20, 11, 625, 38);
		lblModifications.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifications.setForeground(Color.WHITE);
		lblModifications.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblModifications.setBackground(Color.WHITE);
		contentPane.add(lblModifications);
		
		JLabel lblEtudiantAModifier = new JLabel("Enciennes coordonn\u00E9es");
		lblEtudiantAModifier.setHorizontalAlignment(SwingConstants.LEFT);
		lblEtudiantAModifier.setForeground(Color.WHITE);
		lblEtudiantAModifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEtudiantAModifier.setBackground(Color.WHITE);
		lblEtudiantAModifier.setBounds(20, 70, 264, 38);
		contentPane.add(lblEtudiantAModifier);
		
		JLabel lblMatricule = new JLabel("Matricule :");
		lblMatricule.setForeground(Color.WHITE);
		lblMatricule.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMatricule.setBounds(20, 115, 88, 36);
		contentPane.add(lblMatricule);
		
		matAvant = new JTextField();
		matAvant.setToolTipText("Matricule");
		matAvant.setHorizontalAlignment(SwingConstants.CENTER);
		matAvant.setFont(new Font("Tahoma", Font.BOLD, 15));
		matAvant.setColumns(10);
		matAvant.setBounds(111, 119, 149, 30);
		contentPane.add(matAvant);
		
		JLabel label_6 = new JLabel("Nom :");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(381, 170, 60, 36);
		contentPane.add(label_6);
		
		nomApres = new JTextField();
		nomApres.setToolTipText("Nom");
		nomApres.setHorizontalAlignment(SwingConstants.CENTER);
		nomApres.setFont(new Font("Tahoma", Font.BOLD, 15));
		nomApres.setColumns(10);
		nomApres.setBounds(473, 174, 149, 30);
		contentPane.add(nomApres);
		
		JLabel label_7 = new JLabel("Prenom :");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(381, 217, 74, 36);
		contentPane.add(label_7);
		
		prenomApres = new JTextField();
		prenomApres.setToolTipText("Prenom");
		prenomApres.setHorizontalAlignment(SwingConstants.CENTER);
		prenomApres.setFont(new Font("Tahoma", Font.BOLD, 15));
		prenomApres.setColumns(10);
		prenomApres.setBounds(473, 221, 149, 30);
		contentPane.add(prenomApres);
		
		JLabel label_8 = new JLabel("Date de naissance : ");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(381, 257, 149, 36);
		contentPane.add(label_8);
		
		jApres = new JTextField();
		jApres.setToolTipText("Jour");
		jApres.setHorizontalAlignment(SwingConstants.CENTER);
		jApres.setFont(new Font("Tahoma", Font.BOLD, 15));
		jApres.setColumns(10);
		jApres.setBounds(411, 297, 60, 30);
		contentPane.add(jApres);
		
		mApres = new JTextField();
		mApres.setToolTipText("Mois");
		mApres.setHorizontalAlignment(SwingConstants.CENTER);
		mApres.setFont(new Font("Tahoma", Font.BOLD, 15));
		mApres.setColumns(10);
		mApres.setBounds(482, 297, 60, 30);
		contentPane.add(mApres);
		
		aApres = new JTextField();
		aApres.setToolTipText("Ann\u00E9e");
		aApres.setHorizontalAlignment(SwingConstants.CENTER);
		aApres.setFont(new Font("Tahoma", Font.BOLD, 15));
		aApres.setColumns(10);
		aApres.setBounds(556, 297, 66, 30);
		contentPane.add(aApres);
		
		JLabel label_9 = new JLabel("/");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(472, 304, 14, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("/");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(546, 304, 14, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Specialit\u00E9 :");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(381, 338, 88, 36);
		contentPane.add(label_11);
		
		JComboBox comboBoxApres = new JComboBox();
		comboBoxApres.setToolTipText("");
		comboBoxApres.addItem("ISIL");
		comboBoxApres.addItem("ACAD");
		comboBoxApres.addItem("GTR");
		comboBoxApres.setSelectedItem(null);
		comboBoxApres.setBounds(473, 343, 149, 30);
		contentPane.add(comboBoxApres);
		
		JLabel lblNouvellesCoordonnes = new JLabel("Nouvelles coordonn\u00E9es");
		lblNouvellesCoordonnes.setHorizontalAlignment(SwingConstants.LEFT);
		lblNouvellesCoordonnes.setForeground(Color.WHITE);
		lblNouvellesCoordonnes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNouvellesCoordonnes.setBackground(Color.WHITE);
		lblNouvellesCoordonnes.setBounds(381, 70, 241, 38);
		contentPane.add(lblNouvellesCoordonnes);
		
		JLabel label_13 = new JLabel("Matricule :");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_13.setBounds(381, 115, 88, 36);
		contentPane.add(label_13);
		
		matApres = new JTextField();
		matApres.setToolTipText("Matricule");
		matApres.setHorizontalAlignment(SwingConstants.CENTER);
		matApres.setFont(new Font("Tahoma", Font.BOLD, 15));
		matApres.setColumns(10);
		matApres.setBounds(473, 119, 149, 30);
		contentPane.add(matApres);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnModifier.setBackground(new Color(0,153,51));
				btnModifier.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnModifier.setBackground(Color.WHITE);
				btnModifier.setForeground(Color.DARK_GRAY);
			}
		});
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBorder(null);
		btnModifier.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				int i=0;
			//	DateDeNaiss d = new DateDeNaiss(Integer.valueOf(jAvant.getText()),Integer.valueOf(mAvant.getText()),Integer.valueOf(aAvant.getText()));
				int ex=0;
				
				boolean f = false;
			
				//e.setMatricule(Integer.valueOf(matAvant.getText()));
				String matav = matAvant.getText();
				String nAvant = nomAvant.getText();
				String pAvant = prenomAvant.getText();
				String jav = jAvant.getText();
				String mav = mAvant.getText();
				String aav = aAvant.getText();
				
				String matap = matApres.getText();
				String nApres = nomApres.getText();
				String pApres = prenomApres.getText();
				String jap = jApres.getText();
				String map = mApres.getText();
				String aap = aApres.getText();
				
				
				
				if( matav.isEmpty() || nAvant.isEmpty() || pAvant.isEmpty() || jav.isEmpty() || mav.isEmpty() || aav.isEmpty() || matap.isEmpty() || nApres.isEmpty() || pApres.isEmpty() || jap.isEmpty() || map.isEmpty() || aap.isEmpty() || comboBoxAvant.getSelectedItem()==null || comboBoxApres.getSelectedItem()==null )
				{
						JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); /* message d'erreur */
						f=true;
				}
				else
				{
				
				if( nv.testDate(Integer.valueOf(jav), Integer.valueOf(mav), Integer.valueOf(aav))==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); 
					jAvant.setText("");
					mAvant.setText("");
					aAvant.setText("");
					f=true;
				}
				
				if( nv.testDate(Integer.valueOf(jap), Integer.valueOf(map), Integer.valueOf(aap))==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); 
					jApres.setText("");
					mApres.setText("");
					aApres.setText("");
					f=true;
				}
				
				if( !nv.numbersOnly(matav) || !nv.textOnly(nAvant) || !nv.textOnly(pAvant) || !nv.numbersOnly(jav) || !nv.numbersOnly(mav) || !nv.numbersOnly(aav) || !nv.numbersOnly(matap) || !nv.textOnly(nApres) || !nv.textOnly(pApres) || !nv.numbersOnly(jap) || !nv.numbersOnly(map) || !nv.numbersOnly(aap) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données  !");
					f=true;
				}
				 
				boolean err=false;
				for(int l=0 ; l<nv.toutEtd.size() ; l++)
				{
					if(Integer.valueOf(matap)==nv.toutEtd.get(l).getMatricule())
					{
						err=true;
					}
					if(err==true)
					{
						JOptionPane.showMessageDialog(erreurPanel," Le nouveau matricule existe deja , veuiller le changer !");
						matApres.setText("");
						f=true;
					}
				}
				
				
				}
				
				
				
				
				if( f==false )
				{	
				
					
				for( i=0 ; i<nv.toutEtd.size() ; i++)
				{
					if( nv.toutEtd.get(i).getMatricule() == Integer.valueOf(matAvant.getText()) )
					{
						ex=1;	
						nv.toutEtd.remove(nv.toutEtd.get(i));
					}
				}
				
				if( ex==0)
				{
					JOptionPane.showMessageDialog(erreurPanel," Etudiant donné n'existe pas !!"); /* message d'erreur */ 
				}
				
				if( ex==1)
				{
					int j,m,a;
					j=Integer.valueOf(jap); m=Integer.valueOf(map); a=Integer.valueOf(aap);
					DateDeNaiss d = new DateDeNaiss(j,m,a);
					
					
				if( comboBoxAvant.getSelectedIndex()==0 ) // isil
				{
					for(i=0;i<nv.listeIsil.size();i++)
					{
						if( nv.listeIsil.get(i).getMatricule() == Integer.valueOf(matAvant.getText()) )
						{
							Etudiant e1 = new Etudiant();
							e1.setNom(nApres);
							e1.setPrenom(pApres);
							e1.setMatricule(Integer.valueOf(matApres.getText()));
							e1.setDateDeNaiss(d);
							
						//	nv.listeIsil.remove(nv.listeIsil.get(i));
							
						
								if( comboBoxApres.getSelectedIndex()==0 ) // Isil
								{
									nv.listeIsil.get(i).setMatricule(Integer.valueOf(matap));
									nv.listeIsil.get(i).setNom(nApres);
									nv.listeIsil.get(i).setPrenom(pApres);
									nv.listeIsil.get(i).setDateDeNaiss(d);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */ 
								}
								if( comboBoxApres.getSelectedIndex()==1 ) // Acad
								{
									nv.listeIsil.remove(nv.listeIsil.get(i));
									nv.listeAcad.add(e1);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */  
								}
								if( comboBoxApres.getSelectedIndex()==2 ) // Gtr
								{
									nv.listeIsil.remove(nv.listeIsil.get(i));
									nv.listeGtr.add(e1);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */  
								}	
						}
					}
				}
	
				if( comboBoxAvant.getSelectedIndex()==1 ) // Acad
				{
					for(i=0;i<nv.listeAcad.size();i++)
					{
						if( nv.listeAcad.get(i).getMatricule() == Integer.valueOf(matAvant.getText()) )
						{
							Etudiant e1 = new Etudiant();
							e1.setNom(nApres);
							e1.setPrenom(pApres);
							e1.setMatricule(Integer.valueOf(matApres.getText()));
							e1.setDateDeNaiss(d);
							
							//nv.listeAcad.remove(nv.listeAcad.get(i));
						
								if( comboBoxApres.getSelectedIndex()==0 ) // Isil
								{
									nv.listeAcad.remove(nv.listeAcad.get(i));
									nv.listeIsil.add(e1);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */  
								}
								if( comboBoxApres.getSelectedIndex()==1 ) // Acad
								{
									
									nv.listeAcad.get(i).setMatricule(Integer.valueOf(matap));
									nv.listeAcad.get(i).setNom(nApres);
									nv.listeAcad.get(i).setPrenom(pApres);
									nv.listeAcad.get(i).setDateDeNaiss(d);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */  
								}
								if( comboBoxApres.getSelectedIndex()==2 ) // Gtr
								{
									nv.listeAcad.remove(nv.listeAcad.get(i));
									nv.listeGtr.add(e1);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */ 
								}	
						}
					}
				}
				
				if( comboBoxAvant.getSelectedIndex()==2 ) // Gtr
				{
					for(i=0;i<nv.listeGtr.size();i++)
					{
						if( nv.listeGtr.get(i).getMatricule() == Integer.valueOf(matAvant.getText()) )
						{
							Etudiant e1 = new Etudiant();
							e1.setNom(nApres);
							e1.setPrenom(pApres);
							e1.setMatricule(Integer.valueOf(matApres.getText()));
							e1.setDateDeNaiss(d);
							
							//nv.listeGtr.remove(nv.listeGtr.get(i));
						
								if( comboBoxApres.getSelectedIndex()==0 ) // Isil
								{
									nv.listeGtr.remove(nv.listeGtr.get(i));
									nv.listeIsil.add(e1);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */ 
								}
								if( comboBoxApres.getSelectedIndex()==1 ) // Acad
								{
									nv.listeGtr.remove(nv.listeGtr.get(i));
									nv.listeAcad.add(e1);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */  
								}
								if( comboBoxApres.getSelectedIndex()==2 ) // Gtr
								{
									
									nv.listeGtr.get(i).setMatricule(Integer.valueOf(matap));
									nv.listeGtr.get(i).setNom(nApres);
									nv.listeGtr.get(i).setPrenom(pApres);
									nv.listeGtr.get(i).setDateDeNaiss(d);
									nv.toutEtd.add(e1);
									JOptionPane.showMessageDialog(erreurPanel," Etudiant modifié!!"); /* message d'erreur */  
								}	
						}
					}
				}
							
			}	
			
				matAvant.setText("");
				nomAvant.setText("");
				prenomAvant.setText("");
				jAvant.setText("");
				mAvant.setText("");
				aAvant.setText("");
				
				matApres.setText("");
				nomApres.setText("");
				prenomApres.setText("");
				jApres.setText("");
				mApres.setText("");
				aApres.setText("");
				comboBoxAvant.setSelectedItem(null);
				comboBoxApres.setSelectedItem(null);
				
			//////////////////////////////////////////////	
			}	
			}
		});
		btnModifier.setForeground(Color.DARK_GRAY);
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnModifier.setBounds(213, 412, 202, 36);
		contentPane.add(btnModifier);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(204,0,0));
				btnRetour.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(Color.WHITE);
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
		btnRetour.setBounds(508, 412, 122, 36);
		contentPane.add(btnRetour);
	}
}
