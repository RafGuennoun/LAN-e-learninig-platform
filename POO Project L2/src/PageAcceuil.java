import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageAcceuil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageAcceuil frame = new PageAcceuil();
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
	public PageAcceuil() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestEtd = new JButton("Gestion des etudiants");
		btnGestEtd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGestEtd.setBackground(new Color(0,153,51));
				btnGestEtd.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnGestEtd.setBackground(Color.WHITE);
				btnGestEtd.setForeground(Color.DARK_GRAY);
			}
		});
		btnGestEtd.setBorder(null);
		btnGestEtd.setAutoscrolls(true);
		btnGestEtd.setBackground(Color.WHITE);
		btnGestEtd.setForeground(new Color(64, 64, 64));
		btnGestEtd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestionEtd page = new GestionEtd();
				page.setVisible(true);
				setVisible(false);
			}
		});
		btnGestEtd.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnGestEtd.setBounds(10, 104, 295, 79);
		contentPane.add(btnGestEtd);
		
		JLabel lblBienvenu = new JLabel("Gestion de scolarit\u00E9");
		lblBienvenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenu.setForeground(Color.WHITE);
		lblBienvenu.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblBienvenu.setBackground(Color.WHITE);
		lblBienvenu.setBounds(10, 11, 656, 51);
		contentPane.add(lblBienvenu);
		
		JButton btnGestEns = new JButton("Gestion des enseignats");
		btnGestEns.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGestEns.setBackground(new Color(0,153,51));
				btnGestEns.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnGestEns.setBackground(Color.WHITE);
				btnGestEns.setForeground(Color.DARK_GRAY);
			}
		});
		btnGestEns.setBackground(Color.WHITE);
		btnGestEns.setBorder(null);
		btnGestEns.setForeground(Color.DARK_GRAY);
		btnGestEns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestionEns page = new GestionEns();
				page.setVisible(true);
				setVisible(false);
			}
		});
		btnGestEns.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnGestEns.setBounds(371, 104, 295, 79);
		contentPane.add(btnGestEns);
		
		JButton btnParam = new JButton("Param\u00E8tres");
		btnParam.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnParam.setBackground(new Color(0,153,51));
				btnParam.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnParam.setBackground(Color.WHITE);
				btnParam.setForeground(Color.DARK_GRAY);
			}
		});
		btnParam.setBackground(Color.WHITE);
		btnParam.setBorder(null);
		btnParam.setForeground(Color.DARK_GRAY);
		btnParam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageParam page = new PageParam();
				page.setVisible(true);
				setVisible(false);
			}
		});
		btnParam.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnParam.setBounds(193, 219, 295, 79);
		contentPane.add(btnParam);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnExit.setBackground(new Color(204,0,0));
				btnExit.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnExit.setBackground(Color.WHITE);
				btnExit.setForeground(Color.RED);
			}
		});
		btnExit.setBorder(null);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(229, 344, 222, 45);
		contentPane.add(btnExit);
	}
}
