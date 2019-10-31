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
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class SuppEns extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField jour;
	private JTextField mois;
	private JTextField annee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppEns frame = new SuppEns();
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
	public SuppEns() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nom :");
		label.setBounds(28, 93, 60, 36);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label);
		
		nom = new JTextField();
		nom.setBounds(82, 97, 131, 30);
		nom.setToolTipText("Nom");
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.BOLD, 15));
		nom.setColumns(10);
		contentPane.add(nom);
		
		JLabel label_1 = new JLabel("Prenom :");
		label_1.setBounds(28, 154, 74, 36);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_1);
		
		prenom = new JTextField();
		prenom.setBounds(112, 158, 131, 30);
		prenom.setToolTipText("Prenom");
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setFont(new Font("Tahoma", Font.BOLD, 15));
		prenom.setColumns(10);
		contentPane.add(prenom);
		
		JLabel label_2 = new JLabel("Date de naissance : ");
		label_2.setBounds(28, 205, 164, 50);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_2);
		
		jour = new JTextField();
		jour.setBounds(192, 216, 70, 30);
		jour.setToolTipText("Jour");
		jour.setHorizontalAlignment(SwingConstants.CENTER);
		jour.setFont(new Font("Tahoma", Font.BOLD, 15));
		jour.setColumns(10);
		contentPane.add(jour);
		
		mois = new JTextField();
		mois.setBounds(288, 216, 70, 30);
		mois.setToolTipText("Mois");
		mois.setHorizontalAlignment(SwingConstants.CENTER);
		mois.setFont(new Font("Tahoma", Font.BOLD, 15));
		mois.setColumns(10);
		contentPane.add(mois);
		
		annee = new JTextField();
		annee.setBounds(384, 216, 70, 30);
		annee.setToolTipText("Ann\u00E9e");
		annee.setHorizontalAlignment(SwingConstants.CENTER);
		annee.setFont(new Font("Tahoma", Font.BOLD, 15));
		annee.setColumns(10);
		contentPane.add(annee);
		
		JLabel label_3 = new JLabel("/");
		label_3.setBounds(272, 223, 14, 14);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("/");
		label_4.setBounds(368, 223, 14, 14);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Specialit\u00E9 :");
		label_5.setBounds(28, 266, 88, 36);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label_5);
		
		JComboBox comboBoxSpec = new JComboBox();
		comboBoxSpec.setToolTipText("");
		comboBoxSpec.addItem("ISIL");
		comboBoxSpec.addItem("ACAD");
		comboBoxSpec.addItem("GTR");
		comboBoxSpec.setSelectedItem(null);
		comboBoxSpec.setBounds(126, 271, 72, 30);
		comboBoxSpec.setToolTipText("");
		contentPane.add(comboBoxSpec);
		
		JLabel lblSuppressionDesEnseignants = new JLabel("Suppression des enseignants");
		lblSuppressionDesEnseignants.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuppressionDesEnseignants.setForeground(Color.WHITE);
		lblSuppressionDesEnseignants.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSuppressionDesEnseignants.setBounds(10, 11, 582, 36);
		contentPane.add(lblSuppressionDesEnseignants);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSupprimer.setBackground(new Color(0,153,51));
				btnSupprimer.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnSupprimer.setBackground(Color.white);
				btnSupprimer.setForeground(Color.DARK_GRAY);
			}
		});
		btnSupprimer.setBorder(null);
		btnSupprimer.setBackground(Color.WHITE);
		btnSupprimer.addActionListener(new ActionListener() {
			private Component erreur;
			public void actionPerformed(ActionEvent arg0) {
				Main nv = new Main();
				
				String n = nom.getText();
				String p = prenom.getText();
				String j = jour.getText();
				String m = mois.getText();
				String a = annee.getText();

				boolean ex=false;
				boolean f=false;
				
				if( n.isEmpty() || p.isEmpty() || j.isEmpty() || m.isEmpty() || a.isEmpty() )
				{
					JOptionPane.showMessageDialog(erreur," Veuillez saisir toutes les données !!");
				}
				
				if( nv.textOnly(n)==false || nv.textOnly(p)==false || nv.numbersOnly(j)==false || nv.numbersOnly(m)==false || nv.numbersOnly(a)==false  )
				{
					f=true;
					JOptionPane.showMessageDialog(erreur," Veuillez verifier les données !!");
					
				}
				
				
				
				if(f==false) 
				{
					//DateDeNaiss d = new DateDeNaiss(Integer.valueOf(jour.getText()),Integer.valueOf(mois.getText()),Integer.valueOf(annee.getText()));
					for(int i=0 ; i<nv.listeEns.size() ; i++)
					{
						if( nv.listeEns.get(i).getNom().equals(n) && nv.listeEns.get(i).getPrenom().equals(p) &&  nv.listeEns.get(i).getDateDeNaiss().getjDeNaiss()==Integer.valueOf(j) &&  nv.listeEns.get(i).getDateDeNaiss().getmDeNaiss()==Integer.valueOf(m) && nv.listeEns.get(i).getDateDeNaiss().getaDeNaiss()==Integer.valueOf(a)  )
						{
							ex=true;
							nv.listeEns.remove(nv.listeEns.get(i));
							nom.setText("");
							prenom.setText("");
							jour.setText("");
							mois.setText("");
							annee.setText("");
						}
					}
		
					if(ex==false)
					{
						JOptionPane.showMessageDialog(erreur," L'enseignat n'existe pas !!"); 
					}

				
				}
				
								
			}
		});
		btnSupprimer.setForeground(Color.DARK_GRAY);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSupprimer.setBounds(114, 318, 365, 50);
		contentPane.add(btnSupprimer);
		
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
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetour.setBounds(235, 379, 123, 36);
		contentPane.add(btnRetour);
	}
}
