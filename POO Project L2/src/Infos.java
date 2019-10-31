import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class Infos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infos frame = new Infos();
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
	public Infos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 454);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformationsGnrales = new JLabel("   Informations g\u00E9n\u00E9rales : ");
		lblInformationsGnrales.setForeground(Color.WHITE);
		lblInformationsGnrales.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblInformationsGnrales.setBounds(10, 23, 543, 49);
		contentPane.add(lblInformationsGnrales);
		
		JTextArea txtrMatricule = new JTextArea();
		txtrMatricule.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtrMatricule.setForeground(Color.WHITE);
		txtrMatricule.setBackground(new Color(0, 51, 102));
		txtrMatricule.setBounds(20, 88, 533, 244);
		contentPane.add(txtrMatricule);
		txtrMatricule.setText(" * Projet POO * \n\n * Matricule : 161731008781 * \n\n * Nom: Guennoun * \n\n * Prenom : Rafik * \n\n * L2 / ISIL B / Groupe : 1  *\n\n  ");
		
		JButton button = new JButton("Retour");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(204,0,0));
				button.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.white);
				button.setForeground(Color.RED);
			}
		});
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(225, 363, 136, 51);
		contentPane.add(button);
	}
}
