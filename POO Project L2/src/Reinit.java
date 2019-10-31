import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Window.Type;

public class Reinit extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reinit frame = new Reinit();
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
	public Reinit() {
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 223);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setToolTipText("Mot de passe");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(238, 26, 241, 36);
		contentPane.add(passwordField);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setForeground(Color.WHITE);
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMotDePasse.setBounds(25, 14, 214, 51);
		contentPane.add(lblMotDePasse);
		
		JButton btnNewButton = new JButton("Reinitialiser");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(0, 153, 51));
				btnNewButton.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setForeground(Color.DARK_GRAY);
			}
		});
		/*btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				//btnNewButton.setBackground(new Color(0, 128, 128));
				//btnNewButton.setForeground(Color.WHITE);
	
			}
		});*/
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			private Component pan;
			public void actionPerformed(ActionEvent arg0) {
				
				Main nv = new Main();
				
				String mdp = passwordField.getText();
				if( mdp.equals("rafik") )
				{
					nv.listeEns.clear();
					nv.listeIsil.clear();
					nv.listeAcad.clear();
					nv.listeGtr.clear();
					JOptionPane.showMessageDialog(pan," Reinitialisation avec succés ");
					passwordField.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(pan," Mot de passe incorrecte !!");
					passwordField.setText("");
				}
					
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(124, 83, 291, 42);
		contentPane.add(btnNewButton);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(204, 0, 0));
				btnRetour.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(Color.WHITE);
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
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRetour.setBounds(168, 136, 200, 42);
		contentPane.add(btnRetour);
	}
}
