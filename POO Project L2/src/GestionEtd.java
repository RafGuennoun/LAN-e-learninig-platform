import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Window.Type;

public class GestionEtd extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEtd frame = new GestionEtd();
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
	public GestionEtd() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDesEtudiants = new JLabel("Gestion des Etudiants");
		lblGestionDesEtudiants.setBounds(10, 11, 673, 38);
		lblGestionDesEtudiants.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesEtudiants.setForeground(Color.WHITE);
		lblGestionDesEtudiants.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblGestionDesEtudiants.setBackground(Color.WHITE);
		contentPane.add(lblGestionDesEtudiants);
		
		JButton button = new JButton("Inscription des etudiants");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(0,153,51));
				button.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.WHITE);
				button.setForeground(Color.DARK_GRAY);
			}
		});
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setForeground(Color.DARK_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageInscriptionEtd page = new PageInscriptionEtd();
				page.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 19));
		button.setBounds(10, 99, 316, 62);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Liste des etudiants");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setBackground(new Color(0,153,51));
				button_1.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_1.setBackground(Color.WHITE);
				button_1.setForeground(Color.DARK_GRAY);
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBorder(null);
		button_1.setForeground(Color.DARK_GRAY);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageListeEtd pageEtd = new PageListeEtd();
				pageEtd.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_1.setBounds(367, 99, 316, 62);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Recherche des etudiants");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_2.setBackground(new Color(0,153,51));
				button_2.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_2.setBackground(Color.WHITE);
				button_2.setForeground(Color.DARK_GRAY);
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setBorder(null);
		button_2.setForeground(Color.DARK_GRAY);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageRechercheEtd page = new PageRechercheEtd();
				page.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_2.setBounds(10, 183, 316, 62);
		contentPane.add(button_2);
		
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
				btnRetour.setForeground(Color.RED);
			}
		});
		btnRetour.setBorder(null);
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
		btnRetour.setBounds(274, 361, 144, 50);
		contentPane.add(btnRetour);
		
		JButton btnSupprimerEtudiants = new JButton("Supprimer etudiants");
		btnSupprimerEtudiants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSupprimerEtudiants.setBackground(new Color(0,153,51));
				btnSupprimerEtudiants.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnSupprimerEtudiants.setBackground(Color.WHITE);
				btnSupprimerEtudiants.setForeground(Color.DARK_GRAY);
			}
		});
		btnSupprimerEtudiants.setBorder(null);
		btnSupprimerEtudiants.setBackground(Color.WHITE);
		btnSupprimerEtudiants.setForeground(Color.DARK_GRAY);
		btnSupprimerEtudiants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SuppEtd page = new SuppEtd();
				page.setVisible(true);
			}
		});
		btnSupprimerEtudiants.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSupprimerEtudiants.setBounds(186, 266, 316, 62);
		contentPane.add(btnSupprimerEtudiants);
		
		JButton btnModifierEtudiants = new JButton("Modifier etudiants");
		btnModifierEtudiants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnModifierEtudiants.setBackground(new Color(0,153,51));
				btnModifierEtudiants.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnModifierEtudiants.setBackground(Color.white);
				btnModifierEtudiants.setForeground(Color.DARK_GRAY);
			}
		});
		btnModifierEtudiants.setBorder(null);
		btnModifierEtudiants.setBackground(Color.WHITE);
		btnModifierEtudiants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifEtd page = new ModifEtd();
				page.setVisible(true);
			}
		});
		btnModifierEtudiants.setForeground(Color.DARK_GRAY);
		btnModifierEtudiants.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnModifierEtudiants.setBounds(367, 183, 316, 62);
		contentPane.add(btnModifierEtudiants);
		
		
	}
}
