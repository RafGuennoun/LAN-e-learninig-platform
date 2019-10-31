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
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageParam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageParam frame = new PageParam();
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
	public PageParam() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParamtres = new JLabel("Param\u00E8tres ");
		lblParamtres.setHorizontalAlignment(SwingConstants.CENTER);
		lblParamtres.setBounds(0, 11, 592, 42);
		lblParamtres.setForeground(Color.WHITE);
		lblParamtres.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblParamtres);
		
		JButton btnReinitialiser = new JButton("Reinitialiser ");
		btnReinitialiser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnReinitialiser.setBackground(new Color(0,153,51));
				btnReinitialiser.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnReinitialiser.setBackground(Color.white);
				btnReinitialiser.setForeground(Color.DARK_GRAY);
			}
		});
		btnReinitialiser.setBorder(null);
		btnReinitialiser.setBackground(Color.WHITE);
		btnReinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reinit p = new Reinit();
				p.setVisible(true);
			}
		});
		btnReinitialiser.setForeground(Color.DARK_GRAY);
		btnReinitialiser.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnReinitialiser.setBounds(41, 102, 230, 62);
		contentPane.add(btnReinitialiser);
		
		JButton btnInformations = new JButton("Informations");
		btnInformations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnInformations.setBackground(new Color(0,153,51));
				btnInformations.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnInformations.setBackground(Color.white);
				btnInformations.setForeground(Color.DARK_GRAY);
			}
		});
		btnInformations.setBorder(null);
		btnInformations.setBackground(Color.WHITE);
		btnInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Infos page = new Infos();
				page.setVisible(true);
			}
		});
		btnInformations.setForeground(Color.DARK_GRAY);
		btnInformations.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnInformations.setBounds(314, 102, 230, 62);
		contentPane.add(btnInformations);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(204,0,0));
				btnRetour.setForeground(Color.WHITE);
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
				PageAcceuil p = new PageAcceuil();
				p.setVisible(true);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRetour.setBounds(176, 190, 230, 62);
		contentPane.add(btnRetour);
	}

}
