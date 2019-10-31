import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageRechercheEtd extends JFrame {

	private JPanel contentPane;


	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageRechercheEtd frame = new PageRechercheEtd();
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
	public PageRechercheEtd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRechercheDesEtudiants = new JLabel("* Recherche des etudiants *");
		lblRechercheDesEtudiants.setForeground(Color.WHITE);
		lblRechercheDesEtudiants.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRechercheDesEtudiants.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercheDesEtudiants.setBounds(287, 11, 288, 48);
		contentPane.add(lblRechercheDesEtudiants);
		
		JButton retour = new JButton("Retour");
		retour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				retour.setBackground(new Color(204,0,0));
				retour.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				retour.setBackground(Color.white);
				retour.setForeground(Color.red);
			}
		});
		retour.setBorder(null);
		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		retour.setForeground(Color.RED);
		retour.setFont(new Font("Tahoma", Font.BOLD, 18));
		retour.setBounds(248, 349, 327, 56);
		contentPane.add(retour);
		
		JLabel label = new JLabel("----------------------------------------------------------");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(260, 45, 354, 21);
		contentPane.add(label);
		
		JButton btnRechMatricule = new JButton("Matricule");
		btnRechMatricule.setBackground(Color.WHITE);
		btnRechMatricule.setBorder(null);
		btnRechMatricule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRechMatricule.setBackground(new Color(0,153,51));
				btnRechMatricule.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRechMatricule.setBackground(Color.white);
				btnRechMatricule.setForeground(Color.DARK_GRAY);
			}
		});
		btnRechMatricule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageRechMat y = new PageRechMat();
				y.setVisible(true);
				
			}
		});
		btnRechMatricule.setForeground(Color.DARK_GRAY);
		btnRechMatricule.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRechMatricule.setBounds(28, 103, 303, 50);
		contentPane.add(btnRechMatricule);
		
		JButton btnNomprenomdate = new JButton("Nom,Prenom,Date");
		btnNomprenomdate.setBackground(Color.WHITE);
		btnNomprenomdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNomprenomdate.setBackground(new Color(0,153,51));
				btnNomprenomdate.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNomprenomdate.setBackground(Color.white);
				btnNomprenomdate.setForeground(Color.DARK_GRAY);
			}
		});
		btnNomprenomdate.setBorder(null);
		btnNomprenomdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageRechNPD p = new PageRechNPD();
				p.setVisible(true);
			}
		});
		btnNomprenomdate.setForeground(Color.DARK_GRAY);
		btnNomprenomdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNomprenomdate.setBounds(467, 103, 303, 50);
		contentPane.add(btnNomprenomdate);
		
		JButton btnEnseignant = new JButton("Enseignant");
		btnEnseignant.setBackground(Color.WHITE);
		btnEnseignant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnEnseignant.setBackground(new Color(0,153,51));
				btnEnseignant.setForeground(Color.white);
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnEnseignant.setBackground(Color.white);
				btnEnseignant.setForeground(Color.DARK_GRAY);
			}
		});
		btnEnseignant.setBorder(null);
		btnEnseignant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PageRechEns p = new PageRechEns();
				p.setVisible(true);
				
				
			}
		});
		btnEnseignant.setForeground(Color.DARK_GRAY);
		btnEnseignant.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEnseignant.setBounds(28, 212, 303, 50);
		contentPane.add(btnEnseignant);
		
		JButton btnSpecialite = new JButton("Specialit\u00E9");
		btnSpecialite.setBackground(Color.WHITE);
		btnSpecialite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSpecialite.setBackground(new Color(0,153,51));
				btnSpecialite.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnSpecialite.setBackground(Color.white);
				btnSpecialite.setForeground(Color.DARK_GRAY);
			}
		});
		btnSpecialite.setBorder(null);
		btnSpecialite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PageRechSpec p = new PageRechSpec();
				p.setVisible(true);
				
				
			}
		});
		btnSpecialite.setForeground(Color.DARK_GRAY);
		btnSpecialite.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSpecialite.setBounds(467, 212, 303, 50);
		contentPane.add(btnSpecialite);
		

	
		
	}
}
