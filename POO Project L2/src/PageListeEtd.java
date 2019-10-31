import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class PageListeEtd extends JFrame {

	
	ArrayList<Etudiant> laListe = new ArrayList<Etudiant>();
	ArrayList<Etudiant> laIsil = new ArrayList<Etudiant>();
	ArrayList<Etudiant> laAcad = new ArrayList<Etudiant>();
	ArrayList<Etudiant> laGtr = new ArrayList<Etudiant>();
	private JPanel ListeDesEtd;
	public JTable table;
	PageApp p = new PageApp();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageListeEtd frame = new PageListeEtd();
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
	public PageListeEtd() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 439);
		ListeDesEtd = new JPanel();
		ListeDesEtd.setBackground(new Color(0, 51, 102));
		setContentPane(ListeDesEtd);
		ListeDesEtd.setLayout(null);
		
		
		JLabel lblListeDesEtudiants = new JLabel("Liste des etudiants :");
		lblListeDesEtudiants.setForeground(Color.WHITE);
		lblListeDesEtudiants.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListeDesEtudiants.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeDesEtudiants.setBounds(207, 11, 239, 32);
		ListeDesEtd.add(lblListeDesEtudiants);
		
		JButton btnAfficherTout = new JButton("TOUT");
		btnAfficherTout.setForeground(Color.DARK_GRAY);
		btnAfficherTout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAfficherTout.setBackground(new Color(0,153,51));
				btnAfficherTout.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAfficherTout.setBackground(Color.white);
				btnAfficherTout.setForeground(Color.DARK_GRAY);
			}
		});
		btnAfficherTout.setBorder(null);
		btnAfficherTout.setBackground(Color.WHITE);
		btnAfficherTout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAfficherTout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setBounds(57, 99, 526, 235);
				ListeDesEtd.add(textArea);
			
				
				if ( nv.toutEtd.isEmpty()== true)
				{
					textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					for(int k=0 ; k<nv.toutEtd.size(); k++)
					{
						//textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString() + "\n");
						if( nv.listeIsil.contains(nv.toutEtd.get(k)) )
						{
							textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString() +"  "+ nv.Isil.getNom() + "  \n");
						}
					
						if( nv.listeAcad.contains(nv.toutEtd.get(k)) )
						{
							textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString() +"  "+ nv.Acad.getNom() + "  \n");
						}
					
						if( nv.listeGtr.contains(nv.toutEtd.get(k)) )
						{
							textArea.append( (k+1)+")   "+ nv.toutEtd.get(k).toString() +"  "+ nv.Gtr.getNom() + "  \n");
						}
					}
				}
				
				
			/*	for(int k=0 ; k<laIsil.size() ; k++)
				{
					textArea.append( "azdadazd");	
				}*/
				
				
			
			}
		});
		btnAfficherTout.setBounds(57, 53, 89, 23);
		ListeDesEtd.add(btnAfficherTout);
		
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
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setBounds(532, 11, 89, 23);
		ListeDesEtd.add(btnRetour);
		
		JButton btnAfficherIsil = new JButton("ISIL");
		btnAfficherIsil.setForeground(Color.DARK_GRAY);
		btnAfficherIsil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAfficherIsil.setBackground(new Color(0,153,51));
				btnAfficherIsil.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAfficherIsil.setBackground(Color.WHITE);
				btnAfficherIsil.setForeground(Color.DARK_GRAY);
			}
		});
		btnAfficherIsil.setBorder(null);
		btnAfficherIsil.setBackground(Color.WHITE);
		btnAfficherIsil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setBounds(57, 99, 526, 235);
				ListeDesEtd.add(textArea);
				
				if ( nv.listeIsil.isEmpty()== true)
				{
					textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					for(int k=0 ; k<nv.listeIsil.size(); k++)
					{
						textArea.append( (k+1)+")   "+ nv.listeIsil.get(k).toString() + "  " + nv.Isil.getNom() +"\n");
					}
				}
			}
		});
		btnAfficherIsil.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAfficherIsil.setBounds(195, 54, 89, 23);
		ListeDesEtd.add(btnAfficherIsil);
		
		JButton btnAfficherAcad = new JButton("ACAD");
		btnAfficherAcad.setForeground(Color.DARK_GRAY);
		btnAfficherAcad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAfficherAcad.setBackground(new Color(0,153,51));
				btnAfficherAcad.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAfficherAcad.setBackground(Color.WHITE);
				btnAfficherAcad.setForeground(Color.DARK_GRAY);
			}
		});
		btnAfficherAcad.setBorder(null);
		btnAfficherAcad.setBackground(Color.WHITE);
		btnAfficherAcad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setBounds(57, 99, 526, 235);
				ListeDesEtd.add(textArea);
				
				if ( nv.listeAcad.isEmpty()== true)
				{
					textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					for(int k=0 ; k<nv.listeAcad.size(); k++)
					{
						textArea.append( (k+1)+")   "+ nv.listeAcad.get(k).toString() + "  " + nv.Acad.getNom() + "\n");
					}
				}
		}
		});
		btnAfficherAcad.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAfficherAcad.setBounds(347, 54, 89, 23);
		ListeDesEtd.add(btnAfficherAcad);
		
		JButton btnAfficherGtr = new JButton("GTR");
		btnAfficherGtr.setForeground(Color.DARK_GRAY);
		btnAfficherGtr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAfficherGtr.setBackground(new Color(0,153,51));
				btnAfficherGtr.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAfficherGtr.setBackground(Color.WHITE);
				btnAfficherGtr.setForeground(Color.DARK_GRAY);
			}
		});
		btnAfficherGtr.setBorder(null);
		btnAfficherGtr.setBackground(Color.WHITE);
		btnAfficherGtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                
				Main nv = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setBounds(57, 99, 526, 235);
				ListeDesEtd.add(textArea);
				
				if ( nv.listeGtr.isEmpty())
				{
					textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					for(int k=0 ; k<nv.listeGtr.size(); k++)
					{
						textArea.append( (k+1)+")   "+ nv.listeGtr.get(k).toString() +"  " + nv.Gtr.getNom() + "\n");
					}
				}
		}
		});
		btnAfficherGtr.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAfficherGtr.setBounds(491, 53, 89, 23);
		ListeDesEtd.add(btnAfficherGtr);
		
			
	}
}
