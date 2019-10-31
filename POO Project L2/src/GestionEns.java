import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class GestionEns extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEns frame = new GestionEns();
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
	public GestionEns() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDesEnseignants = new JLabel("Gestion des enseignants");
		lblGestionDesEnseignants.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesEnseignants.setForeground(Color.WHITE);
		lblGestionDesEnseignants.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblGestionDesEnseignants.setBackground(Color.WHITE);
		lblGestionDesEnseignants.setBounds(10, 11, 673, 38);
		contentPane.add(lblGestionDesEnseignants);
		
		JButton btnInscriptionEns = new JButton("Inscription des enseignants");
		btnInscriptionEns.setBorder(null);
		btnInscriptionEns.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnInscriptionEns.setBackground(new Color(0,153,51));
				btnInscriptionEns.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnInscriptionEns.setBackground(Color.WHITE);
				btnInscriptionEns.setForeground(Color.DARK_GRAY);
			}
		});
		btnInscriptionEns.setForeground(Color.DARK_GRAY);
		btnInscriptionEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageInscriptionEns page = new PageInscriptionEns();
				page.setVisible(true); 
			}
		});
		btnInscriptionEns.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnInscriptionEns.setBounds(10, 107, 316, 62);
		contentPane.add(btnInscriptionEns);
		
		JButton btnListeEns = new JButton("Liste des enseignants");
		btnListeEns.setBorder(null);
		btnListeEns.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnListeEns.setBackground(new Color(0,153,51));
				btnListeEns.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnListeEns.setBackground(Color.WHITE);
				btnListeEns.setForeground(Color.DARK_GRAY);
			}
		});
		btnListeEns.setForeground(Color.DARK_GRAY);
		btnListeEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageListeEns p = new PageListeEns();
				p.setVisible(true);
			}
		});
		btnListeEns.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnListeEns.setBounds(367, 107, 316, 62);
		contentPane.add(btnListeEns);
		
		JButton btnRechercheDesEnseignants = new JButton("Recherche des enseignants");
		btnRechercheDesEnseignants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRechercheDesEnseignants.setBackground(new Color(0,153,51));
				btnRechercheDesEnseignants.setForeground(Color.WHITE);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRechercheDesEnseignants.setBackground(Color.WHITE);
				btnRechercheDesEnseignants.setForeground(Color.DARK_GRAY);
			}
		});
		btnRechercheDesEnseignants.setBorder(null);
		btnRechercheDesEnseignants.setForeground(Color.DARK_GRAY);
		btnRechercheDesEnseignants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageRechEns p = new PageRechEns();
				p.setVisible(true);
			}
		});
		btnRechercheDesEnseignants.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRechercheDesEnseignants.setBounds(10, 207, 316, 62);
		contentPane.add(btnRechercheDesEnseignants);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(204,0,0));
				btnRetour.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(Color.WHITE);
				btnRetour.setForeground(Color.RED);
			}
		});
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				PageAcceuil p = new PageAcceuil();
				p.setVisible(true);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetour.setBackground(Color.WHITE);
		btnRetour.setBounds(277, 361, 144, 50);
		contentPane.add(btnRetour);
		
		JButton btnSupprimerEnseignants = new JButton("Supprimer enseignants");
		btnSupprimerEnseignants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSupprimerEnseignants.setBackground(new Color(0,153,51));
				btnSupprimerEnseignants.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnSupprimerEnseignants.setBackground(Color.WHITE);
				btnSupprimerEnseignants.setForeground(Color.DARK_GRAY);
			}
		});
		btnSupprimerEnseignants.setBorder(null);
		btnSupprimerEnseignants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuppEns page = new SuppEns();
				page.setVisible(true);
			}
		});
		btnSupprimerEnseignants.setForeground(Color.DARK_GRAY);
		btnSupprimerEnseignants.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSupprimerEnseignants.setBounds(367, 207, 316, 62);
		contentPane.add(btnSupprimerEnseignants);
	}
}
