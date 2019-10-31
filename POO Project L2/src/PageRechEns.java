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
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageRechEns extends JFrame {

	private JPanel contentPane;
	private JTextField rechNom;
	private JTextField rechPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageRechEns frame = new PageRechEns();
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
	public PageRechEns() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 427);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nom  :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(32, 80, 73, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Prenom :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(354, 80, 99, 45);
		contentPane.add(label_1);
		
		rechNom = new JTextField();
		rechNom.setHorizontalAlignment(SwingConstants.CENTER);
		rechNom.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechNom.setColumns(10);
		rechNom.setBounds(105, 85, 160, 37);
		contentPane.add(rechNom);
		
		rechPrenom = new JTextField();
		rechPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		rechPrenom.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechPrenom.setColumns(10);
		rechPrenom.setBounds(451, 85, 160, 37);
		contentPane.add(rechPrenom);
		
		JLabel lblRechercheParEnseignant = new JLabel("Recherche par enseignant :");
		lblRechercheParEnseignant.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercheParEnseignant.setForeground(Color.WHITE);
		lblRechercheParEnseignant.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRechercheParEnseignant.setBounds(176, 11, 333, 45);
		contentPane.add(lblRechercheParEnseignant);
		
		JButton btnRech = new JButton("Rechercher");
		btnRech.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRech.setBackground(new Color(0,153,51));
				btnRech.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRech.setBackground(Color.white);
				btnRech.setForeground(Color.DARK_GRAY);
			}
		});
		btnRech.setBackground(Color.WHITE);
		btnRech.setBorder(null);
		btnRech.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				
				String nom = rechNom.getText();
				String prenom = rechPrenom.getText();
				boolean existe=false;
				boolean ex=false;
				
				boolean f=false;
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(Color.WHITE);
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(32, 199, 582, 188);
				contentPane.add(textArea);
				
				textArea.append("   \n");
				
				if ( nom.isEmpty() || prenom.isEmpty() )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données !"); /* message d'erreur */
				}
				
				if( !nv.textOnly(nom) || !nv.textOnly(prenom) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données  !");
					f=true;
				}
				
				if(f==false)
				{
				for( int i=0 ; i<nv.listeEns.size() ; i++)
				{
					if( nv.listeEns.get(i).getNom().equals(nom) && nv.listeEns.get(i).getPrenom().equals(prenom) )
					{
						existe=true;
						if( nv.listeEns.get(i).spec == nv.Isil )
						{
						
							if(nv.listeIsil.isEmpty())
							{
								textArea.append(" La liste des etudiants de Mr/Mme "+nom+" "+prenom+" est vide !");
							}
							else
							{
								for( int j=0 ; j<nv.listeIsil.size() ; j++ )
								{
									textArea.append( Main.listeIsil.get(j).toString() + " " +nv.Isil.getNom() + "\n");
								}
							}
						}
						
						if( nv.listeEns.get(i).spec == nv.Acad )
						{
						
							if(nv.listeAcad.isEmpty())
							{
								textArea.append(" La liste des etudiants de Mr/Mme "+nom+" "+prenom+" est vide !");
							}
							else
							{
								for( int j=0 ; j<nv.listeAcad.size() ; j++ )
								{
									textArea.append( Main.listeAcad.get(j).toString() + " " +nv.Acad.getNom() + "\n");
								}
							}
						}
						
						
						if( nv.listeEns.get(i).spec == nv.Gtr )
						{
						
							if(nv.listeGtr.isEmpty())
							{
								textArea.append(" La liste des etudiants de Mr/Mme "+nom+" "+prenom+" est vide !");
							}
							else
							{
								for( int j=0 ; j<nv.listeGtr.size() ; j++ )
								{
									textArea.append( Main.listeGtr.get(j).toString() + " " +nv.Gtr.getNom() + "\n");
								}
							}
						}
			
					}
				}
	
				if( existe==false)
				{
					textArea.append("Mr/Mme '' "+nom+" "+prenom+" ''  n'existe pas !");
				}
				rechNom.setText("");
				rechPrenom.setText("");
			}
			
			}
		});
		btnRech.setForeground(Color.DARK_GRAY);
		btnRech.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRech.setBounds(175, 136, 319, 45);
		contentPane.add(btnRech);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(201,0,0));
				btnRetour.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(Color.WHITE);
				btnRetour.setForeground(Color.RED);
			}
		});
		btnRetour.setBorder(null);
		btnRetour.setBackground(Color.WHITE);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetour.setBounds(535, 12, 99, 45);
		contentPane.add(btnRetour);
		
		/*
		 JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setBounds(32, 146, 580, 231);
		contentPane.add(textArea);
		  */
		 
		 
	}
}
