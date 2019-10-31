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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class SuppEtd extends JFrame {

	private JPanel contentPane;
	private JTextField matEtd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuppEtd frame = new SuppEtd();
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
	public SuppEtd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSupprimer = new JLabel("Supprimer un etudiant");
		lblSupprimer.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupprimer.setForeground(Color.WHITE);
		lblSupprimer.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSupprimer.setBounds(10, 11, 552, 45);
		contentPane.add(lblSupprimer);
		
		JLabel label_1 = new JLabel("Matricule  :");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(114, 67, 124, 45);
		contentPane.add(label_1);
		
		matEtd = new JTextField();
		matEtd.setHorizontalAlignment(SwingConstants.CENTER);
		matEtd.setFont(new Font("Tahoma", Font.BOLD, 17));
		matEtd.setColumns(10);
		matEtd.setBounds(237, 72, 224, 37);
		contentPane.add(matEtd);
		
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
			Component frame ;
			public void actionPerformed(ActionEvent arg0) {
				
				JTextArea textArea = new JTextArea();
				textArea.setBackground(new Color(0,51,102));
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 19));
				textArea.setForeground(Color.WHITE);
				textArea.setBounds(42, 206, 484, 130);
				contentPane.add(textArea);
				textArea.append("\n");
				
				Main nv = new Main();
				String matricule = matEtd.getText();
				Etudiant e = new Etudiant();
				int existe=0;
				boolean f=false;
				
				if( matEtd.getText().isEmpty() )
				{
					
					JOptionPane.showMessageDialog(frame," Veuillez donner le matricule");
				}
				
				if( !nv.numbersOnly(matricule) )
				{
					JOptionPane.showMessageDialog(frame," Veuillez verifier les données !");
					f=true;
				}
				if(f==false)
				{
					
				
				for( int i=0 ; i<nv.toutEtd.size() ; i++)
				{
					if( nv.toutEtd.get(i).getMatricule()==Integer.valueOf(matEtd.getText()) )
					{
						//existe=1;
						e = nv.toutEtd.get(i);
						nv.toutEtd.remove(nv.toutEtd.get(i));
						if ( nv.listeIsil.contains(e))
						{
							nv.listeIsil.remove(e);
						}
						if ( nv.listeAcad.contains(e))
						{
							nv.listeAcad.remove(e);
						}
						if ( nv.listeGtr.contains(e))
						{
							nv.listeGtr.remove(e);
						}
						textArea.append(" L'etudiant : \n" +" "+ e.toString() + " \n     a etait supprimé avec succés ");
					
					}
					else
					{
						textArea.append("\n    ");
						textArea.append(" L'etudiant immatriculé "+ matricule + " n'existe pas !! ");
					}
				}
				
				
			}
				
				
				
			}
		});
		btnSupprimer.setForeground(Color.DARK_GRAY);
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSupprimer.setBounds(114, 128, 347, 45);
		contentPane.add(btnSupprimer);
		
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
		button_1.setBounds(196, 382, 180, 45);
		contentPane.add(button_1);
		
		
	}
}
