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
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PageInscriptionEns extends JFrame {

	private JPanel contentPane;
	private JTextField nomInscriptionEns;
	private JTextField prenomInscriptionEns;
	private JTextField jour;
	private JTextField mois;
	private JTextField annee;
	private JTextField moduleEns;
	private JTextField hDeTravail;
	private JTextField gradeEns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageInscriptionEns frame = new PageInscriptionEns();
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
	public PageInscriptionEns() {

		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nom :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(24, 59, 60, 50);
		contentPane.add(label);
		
		nomInscriptionEns = new JTextField();
		nomInscriptionEns.setToolTipText("Nom");
		nomInscriptionEns.setHorizontalAlignment(SwingConstants.CENTER);
		nomInscriptionEns.setFont(new Font("Tahoma", Font.BOLD, 15));
		nomInscriptionEns.setColumns(10);
		nomInscriptionEns.setBounds(101, 70, 131, 30);
		contentPane.add(nomInscriptionEns);
		
		JLabel label_1 = new JLabel("Prenom :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(24, 120, 74, 50);
		contentPane.add(label_1);
		
		prenomInscriptionEns = new JTextField();
		prenomInscriptionEns.setToolTipText("Prenom");
		prenomInscriptionEns.setHorizontalAlignment(SwingConstants.CENTER);
		prenomInscriptionEns.setFont(new Font("Tahoma", Font.BOLD, 15));
		prenomInscriptionEns.setColumns(10);
		prenomInscriptionEns.setBounds(101, 131, 131, 30);
		contentPane.add(prenomInscriptionEns);
		
		JLabel label_2 = new JLabel("Date de naissance : ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(24, 181, 164, 50);
		contentPane.add(label_2);
		
		jour = new JTextField();
		jour.setToolTipText("Jour");
		jour.setHorizontalAlignment(SwingConstants.CENTER);
		jour.setFont(new Font("Tahoma", Font.BOLD, 15));
		jour.setColumns(10);
		jour.setBounds(198, 192, 70, 30);
		contentPane.add(jour);
		
		mois = new JTextField();
		mois.setToolTipText("Mois");
		mois.setHorizontalAlignment(SwingConstants.CENTER);
		mois.setFont(new Font("Tahoma", Font.BOLD, 15));
		mois.setColumns(10);
		mois.setBounds(302, 192, 70, 30);
		contentPane.add(mois);
		
		annee = new JTextField();
		annee.setToolTipText("Ann\u00E9e");
		annee.setHorizontalAlignment(SwingConstants.CENTER);
		annee.setFont(new Font("Tahoma", Font.BOLD, 15));
		annee.setColumns(10);
		annee.setBounds(406, 192, 70, 30);
		contentPane.add(annee);
		
		JLabel label_3 = new JLabel("/");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(278, 199, 14, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("/");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(382, 199, 14, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Specialit\u00E9 :");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(24, 242, 88, 36);
		contentPane.add(label_5);
		
		JComboBox choixSpecEns = new JComboBox();
		choixSpecEns.setToolTipText("");
		choixSpecEns.addItem("ISIL");
		choixSpecEns.addItem("ACAD");
		choixSpecEns.addItem("GTR");
		choixSpecEns.setSelectedItem(null);
		choixSpecEns.setBounds(116, 247, 72, 30);
		contentPane.add(choixSpecEns);
		
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
				
				String nom = nomInscriptionEns.getText();
				String prenom = prenomInscriptionEns.getText();
				String j = jour.getText();
				String m = mois.getText();
				String a = annee.getText();
				String spec = (String) choixSpecEns.getSelectedItem();
				String module = moduleEns.getText();
				String grade = gradeEns.getText();
				
				
				Main nvm = new Main();
				boolean f = false;
				
				if( nom.isEmpty() || prenom.isEmpty() || j.isEmpty() || m.isEmpty() || a.isEmpty() || hDeTravail.getText().isEmpty() || grade.isEmpty() ||choixSpecEns.getSelectedItem()==null )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir toutes les données  !"); /* message d'erreur */ 
					
				}
				else
				{
					int hdt =  Integer.valueOf(hDeTravail.getText());
				
				if( nvm.anneeExiste(Integer.valueOf(a))==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */ 
					annee.setText("");
					f=true;
				}
					
				if( ( Integer.valueOf(j)<1 || Integer.valueOf(j)>31) )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */ 
					jour.setText("");
					//mois.setText("");
					//annee.setText("");
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
				
				if(hdt<1)
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur !"); /* message d'erreur */
					hDeTravail.setText("");
					f=true;
				}
				
				// annee ou le 29/02 n'existe pas 
				if( j.equals("29") && m.equals("2") && nvm.anneeBis(Integer.valueOf(a))==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Erreur Date !"); /* message d'erreur */
					jour.setText("");
					mois.setText("");
					annee.setText("");
					f=true;
				}
				
				if( nvm.textOnly(nom)==false || nvm.textOnly(prenom)==false || nvm.textOnly(module)==false || nvm.textOnly(grade)==false || nvm.numbersOnly(j)==false || nvm.numbersOnly(m)==false || nvm.numbersOnly(a)==false )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
					f=true;
				}
				if(f==false)
				{
		
				Enseignant e;
			
				
				
				if(choixSpecEns.getSelectedIndex()==0) //isil
				{
					DateDeNaiss D = new DateDeNaiss( Integer.valueOf(j) , Integer.valueOf(m) , Integer.valueOf(a) );
					e = new Enseignant(nom,prenom,D,module,grade,hdt,nvm.Isil);
					nvm.listeEns.add(e);
					JOptionPane.showMessageDialog(erreurPanel," Enseignant inscrit ");
				}
				
				if(choixSpecEns.getSelectedIndex()==1) //acad
				{
					DateDeNaiss D = new DateDeNaiss( Integer.valueOf(j) , Integer.valueOf(m) , Integer.valueOf(a) );
					e = new Enseignant(nom,prenom,D,module,grade,hdt,nvm.Acad);
					nvm.listeEns.add(e);
					JOptionPane.showMessageDialog(erreurPanel," Enseignant inscrit ");
				}
				
				if(choixSpecEns.getSelectedIndex()==2) //gtr
				{
					DateDeNaiss D = new DateDeNaiss( Integer.valueOf(j) , Integer.valueOf(m) , Integer.valueOf(a) );
					e = new Enseignant(nom,prenom,D,module,grade,hdt,nvm.Gtr);
					nvm.listeEns.add(e);
					JOptionPane.showMessageDialog(erreurPanel," Enseignant inscrit ");
				}
				
				
		
				
				nomInscriptionEns.setText("");
				prenomInscriptionEns.setText("");
				jour.setText("");
				mois.setText("");
				annee.setText("");
				moduleEns.setText("");
				choixSpecEns.setSelectedItem(null);
				hDeTravail.setText("");
				gradeEns.setText("");
				
				}
				
			}	
				////////////////////////////////////////////////////////////////////////////////////////////////////////////
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(305, 346, 279, 50);
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
				button_1.setBackground(Color.white);
				button_1.setForeground(Color.red);
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
		button_1.setBounds(457, 18, 105, 30);
		contentPane.add(button_1);
		
		JLabel lblModule = new JLabel("Module :");
		lblModule.setToolTipText("Module");
		lblModule.setForeground(Color.WHITE);
		lblModule.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblModule.setBounds(24, 307, 88, 36);
		contentPane.add(lblModule);
		
		moduleEns = new JTextField();
		moduleEns.setToolTipText("Module");
		moduleEns.setHorizontalAlignment(SwingConstants.CENTER);
		moduleEns.setFont(new Font("Tahoma", Font.BOLD, 15));
		moduleEns.setColumns(10);
		moduleEns.setBounds(101, 311, 131, 30);
		contentPane.add(moduleEns);
		
		JLabel lblHeuresDeTravail = new JLabel("Heures de travail :");
		lblHeuresDeTravail.setToolTipText("Heures de travail");
		lblHeuresDeTravail.setForeground(Color.WHITE);
		lblHeuresDeTravail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHeuresDeTravail.setBounds(24, 365, 156, 36);
		contentPane.add(lblHeuresDeTravail);
		
		hDeTravail = new JTextField();
		hDeTravail.setToolTipText("Heures de travail");
		hDeTravail.setHorizontalAlignment(SwingConstants.CENTER);
		hDeTravail.setFont(new Font("Tahoma", Font.BOLD, 15));
		hDeTravail.setColumns(10);
		hDeTravail.setBounds(173, 369, 70, 30);
		contentPane.add(hDeTravail);
		
		JLabel lblInscriptionDes = new JLabel("* Inscription des enseignants *");
		lblInscriptionDes.setForeground(Color.WHITE);
		lblInscriptionDes.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscriptionDes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInscriptionDes.setBounds(76, 11, 334, 42);
		contentPane.add(lblInscriptionDes);
		
		JLabel grade = new JLabel("Grade :");
		grade.setForeground(Color.WHITE);
		grade.setFont(new Font("Tahoma", Font.BOLD, 15));
		grade.setBounds(222, 233, 60, 50);
		contentPane.add(grade);
		
		gradeEns = new JTextField();
		gradeEns.setToolTipText("Grade");
		gradeEns.setHorizontalAlignment(SwingConstants.CENTER);
		gradeEns.setFont(new Font("Tahoma", Font.BOLD, 15));
		gradeEns.setColumns(10);
		gradeEns.setBounds(286, 246, 131, 30);
		contentPane.add(gradeEns);
		
	
		
	}
}
