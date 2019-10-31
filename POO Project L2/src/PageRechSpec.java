import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageRechSpec extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageRechSpec frame = new PageRechSpec();
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
	public PageRechSpec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 489);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRechercheParSpecialit = new JLabel("Recherche par specialit\u00E9 :");
		lblRechercheParSpecialit.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercheParSpecialit.setForeground(Color.WHITE);
		lblRechercheParSpecialit.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRechercheParSpecialit.setBounds(10, 11, 332, 45);
		contentPane.add(lblRechercheParSpecialit);
		
		JComboBox spec = new JComboBox();
		spec.addItem("ISIL");
		spec.addItem("ACAD");
		spec.addItem("GTR");
		spec.setSelectedItem(null);
		spec.setFont(new Font("Tahoma", Font.BOLD, 15));
		spec.setBounds(151, 67, 154, 33);
		contentPane.add(spec);
		
		JLabel lblSpecialit = new JLabel("Specialit\u00E9 :");
		lblSpecialit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialit.setForeground(Color.WHITE);
		lblSpecialit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSpecialit.setBounds(20, 69, 128, 31);
		contentPane.add(lblSpecialit);
		
		JButton button = new JButton("Rechercher");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(new Color(0,153,51));
				button.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.white);
				button.setForeground(Color.DARK_GRAY);
			}
		});
		button.setBorder(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nvm = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(41, 124, 563, 315);
				contentPane.add(textArea);
				
				if( spec.getSelectedIndex()==0) // isil
				{
					if ( nvm.listeIsil.isEmpty()== true)
					{
						textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
						textArea.append("\n");
					}
					else
					{
					for ( int i=0 ; i<nvm.listeIsil.size() ; i++)
					{
						textArea.append( nvm.listeIsil.get(i).toString() + "  "+ nvm.Isil.getNom() + "\n" );
					}
					}
				}
				
				if( spec.getSelectedIndex()==1) // Acad
				{
					if ( nvm.listeAcad.isEmpty()== true)
					{
						textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
						textArea.append("\n");
					}
					else
					{
					for ( int i=0 ; i<nvm.listeAcad.size() ; i++)
					{
						textArea.append( nvm.listeAcad.get(i).toString() + "  "+ nvm.Acad.getNom() + "\n" );
					}
					}
				}
				
				if( spec.getSelectedIndex()==2) // Grt
				{
					if ( nvm.listeGtr.isEmpty()== true)
					{
						textArea.setText(" Pas d'Etudiants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
						textArea.append("\n");
					}
					else
					{
					for ( int i=0 ; i<nvm.listeGtr.size() ; i++)
					{
						textArea.append( nvm.listeGtr.get(i).toString() + "  "+ nvm.Gtr.getNom() + "\n" );
					}
					}
				}
				
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(337, 68, 285, 31);
		contentPane.add(button);
		
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
				btnRetour.setForeground(Color.red);
			}
		});
		btnRetour.setBorder(null);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnRetour.setForeground(Color.RED);
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetour.setBounds(515, 21, 107, 31);
		contentPane.add(btnRetour);
	}
}
