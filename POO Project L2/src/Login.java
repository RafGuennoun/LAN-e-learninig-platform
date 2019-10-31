import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import java.awt.Window.Type;

public class Login {

	private JFrame frame;
	private JTextField Username;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFocusCycleRoot(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 730, 331);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel username = new JLabel("Nom d'utilisateur :");
		username.setBounds(26, 109, 308, 30);
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setForeground(Color.WHITE);
		username.setBackground(Color.DARK_GRAY);
		username.setFont(new Font("Consolas", Font.BOLD, 27));
		frame.getContentPane().add(username);
		
		JLabel password = new JLabel("Mot de passe :");
		password.setBounds(26, 159, 308, 30);
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Consolas", Font.BOLD, 27));
		frame.getContentPane().add(password);
		
		Username = new JTextField();
		Username.setBounds(344, 109, 338, 33);
		Username.setForeground(Color.DARK_GRAY);
		Username.setBackground(Color.WHITE);
		Username.setFont(new Font("Tahoma", Font.BOLD, 15));
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Username);
		Username.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(344, 159, 338, 33);
		Password.setEchoChar('*');
		Password.setForeground(Color.DARK_GRAY);
		Password.setBackground(Color.WHITE);
		Password.setFont(new Font("Tahoma", Font.BOLD, 15));
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(247, 235, 231, 40);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnLogin.setBackground(new Color(0,153,51));
				btnLogin.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnLogin.setBackground(Color.WHITE);
				btnLogin.setForeground(Color.DARK_GRAY);
			}
		});
		btnLogin.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
			}
		});
		btnLogin.setBorder(null);
		btnLogin.setAutoscrolls(true);
		btnLogin.setForeground(new Color(0, 51, 102));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Consolas", Font.BOLD, 25));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* l'inscription */
				String nom = Username.getText();
				String mdp = Password.getText();
				
				if( nom.equals("guennoun") && mdp.equals("rafik"))
				{
					//JOptionPane.showMessageDialog(frame," Connecté "); /* message de succes */
					
					
					/* acces a la deuxieme page */ 
					
					PageAcceuil page = new PageAcceuil();
					page.setVisible(true); 
					frame.setVisible(false);
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame," Nom d'utilisateur ou mot de passe incorrecte"); /* message d'erreur */ 
					Username.setText("");
					Password.setText("");
				}
			}
		});
		frame.getContentPane().add(btnLogin);
		
		JLabel lblBonjour = new JLabel("Login");
		lblBonjour.setBounds(10, 21, 704, 57);
		lblBonjour.setForeground(Color.WHITE);
		lblBonjour.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonjour.setBackground(Color.WHITE);
		lblBonjour.setFont(new Font("Consolas", Font.BOLD, 58));
		frame.getContentPane().add(lblBonjour);
	}
}
