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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class PageRechMat extends JFrame {

	private JPanel contentPane;
	private JTextField rechMat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageRechMat frame = new PageRechMat();
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
	public PageRechMat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRechercheParMatricule = new JLabel("Recherche par matricule :");
		lblRechercheParMatricule.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercheParMatricule.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRechercheParMatricule.setForeground(Color.WHITE);
		lblRechercheParMatricule.setBounds(127, 11, 332, 45);
		contentPane.add(lblRechercheParMatricule);
		
		JLabel lblMatricule = new JLabel("Matricule  :");
		lblMatricule.setForeground(Color.WHITE);
		lblMatricule.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMatricule.setBounds(154, 67, 129, 45);
		contentPane.add(lblMatricule);
		
		rechMat = new JTextField();
		rechMat.setHorizontalAlignment(SwingConstants.CENTER);
		rechMat.setFont(new Font("Tahoma", Font.BOLD, 17));
		rechMat.setBounds(281, 72, 160, 37);
		contentPane.add(rechMat);
		rechMat.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Rechercher");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(0,153,51));
				btnNewButton.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(Color.white);
				btnNewButton.setForeground(Color.DARK_GRAY);
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			private Component erreurPanel;
			public void actionPerformed(ActionEvent arg0) {
				
				String matri = rechMat.getText();
	
				Main nvm = new Main();
				boolean v = false;
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(41, 238, 491, 112);
				contentPane.add(textArea);
				textArea.append(" \n");
				
				boolean f=false;
				
				if ( matri.isEmpty() )
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez saisir le matricule !"); /* message d'erreur */
				}
				
				if( !nvm.numbersOnly(matri))
				{
					JOptionPane.showMessageDialog(erreurPanel," Veuillez verifier les données !");
					f=true;
				}
				
				if(f==false)
				{
					
				for( int i=0 ; i< nvm.toutEtd.size() ; i++)
				{
					//textArea.append( nvm.toutEtd.get(i).toString() + "\n");
				
					if( matri.equals( Integer.toString( nvm.toutEtd.get(i).getMatricule() )) )
					{
						
						if( nvm.listeIsil.contains( nvm.toutEtd.get(i) ) )
						{
							textArea.append( nvm.toutEtd.get(i).toString() + nvm.Isil.getNom() );
							v=true;
						}
					
						if( nvm.listeAcad.contains( nvm.toutEtd.get(i) ) )
						{
							textArea.append( nvm.toutEtd.get(i).toString() + nvm.Acad.getNom() );
							v=true;
						}
						
						if( nvm.listeGtr.contains( nvm.toutEtd.get(i) ) )
						{
							textArea.append( nvm.toutEtd.get(i).toString() + nvm.Gtr.getNom() );
							v=true;
						}
					}
			
				}
				if(v==false)
				{
					textArea.append( " L'Etudiant immatriculé "+ matri + " n'existe pas !! " );
				}
		
					rechMat.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(127, 146, 332, 45);
		contentPane.add(btnNewButton);
		
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
		btnRetour.setBounds(127, 362, 332, 45);
		contentPane.add(btnRetour);
		
	
		
	}
}
