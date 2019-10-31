import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PageApp extends JFrame {
	private JPanel contentPane;

	
	ArrayList<Etudiant> listeIsil = new ArrayList<Etudiant>();
    Specialite Isil = new Specialite("Isil","Informatique","L2", listeIsil);
    public ArrayList<Etudiant> getListeIsil()
    {
    	return listeIsil;
    }
	
    ArrayList<Etudiant> listeAcad = new ArrayList<Etudiant>();
	Specialite Acad = new Specialite("Acad","Informatique","L2", listeAcad);
	 public ArrayList<Etudiant> getListeAcad()
	    {
	    	return listeAcad;
	    }
	
	ArrayList<Etudiant> listeGtr = new ArrayList<Etudiant>();
	Specialite Gtr = new Specialite("Gtr","Informatique","L2", listeGtr);
	 public ArrayList<Etudiant> getListeGtr()
	    {
	    	return listeGtr;
	    }
	
	ArrayList<Etudiant> allSpecsListe = new ArrayList<Etudiant>();
	Specialite allSpecs = new Specialite("All","Informatique","L2", allSpecsListe);
	 public ArrayList<Etudiant> getListeAllSpecs()
	    {
	    	return allSpecsListe;
	    }
	
	ArrayList<Enseignant> listeEns = new ArrayList<Enseignant>();
	 public ArrayList<Enseignant> getListeEns()
	    {
	    	return listeEns;
	    }
	
	
	public void afficheListeEns(ArrayList<Enseignant> listeEns)
	{
		int i;
		for(i=0 ; i<listeEns.size() ; i++)
		{
			listeEns.get(i).description();
			System.out.println("");
		}	
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageApp frame = new PageApp();
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
	public PageApp() {
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 460);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(355, 148, 46, 14);
		contentPane.add(label);
		
		JButton btnInscription = new JButton("Inscription des etudiants");
		btnInscription.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PageInscriptionEtd page = new PageInscriptionEtd();
				page.setVisible(true);
				 
				//setVisible(false);
				
			}
		});
		btnInscription.setBounds(24, 49, 316, 33);
		contentPane.add(btnInscription);
		
		JButton btnEnseignants = new JButton("Enseignants");
		btnEnseignants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageInscriptionEns page = new PageInscriptionEns();
				page.setVisible(true); 
				
			}
		});
		btnEnseignants.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnseignants.setBounds(24, 112, 316, 33);
		contentPane.add(btnEnseignants);
		
		JButton btnLiseDesEns = new JButton("Liste des enseignants");
		btnLiseDesEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageListeEns p = new PageListeEns();
				p.setVisible(true);
			}
		});
		btnLiseDesEns.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLiseDesEns.setBounds(385, 112, 316, 33);
		contentPane.add(btnLiseDesEns);
		
		JButton btnListeEtd = new JButton("Liste des etudiants");
		btnListeEtd.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				PageListeEtd pageEtd = new PageListeEtd();
				pageEtd.setVisible(true);
				
			}
		});
		btnListeEtd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnListeEtd.setBounds(385, 49, 316, 33);
		contentPane.add(btnListeEtd);
		
		JButton btnRecherche = new JButton("Recherche des etudiants");
		btnRecherche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageRechercheEtd page = new PageRechercheEtd();
				page.setVisible(true);
			}
		});
		btnRecherche.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRecherche.setBounds(24, 174, 316, 33);
		contentPane.add(btnRecherche);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(300, 370, 144, 50);
		contentPane.add(btnExit);
	}
}
