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
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PageListeEns extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageListeEns frame = new PageListeEns();
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
	public PageListeEns() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 448);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListeDesEnseignants = new JLabel("Liste des enseignants :");
		lblListeDesEnseignants.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeDesEnseignants.setForeground(Color.WHITE);
		lblListeDesEnseignants.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblListeDesEnseignants.setBounds(128, 10, 435, 32);
		contentPane.add(lblListeDesEnseignants);
		
		JButton btnTout = new JButton("TOUT");
		btnTout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnTout.setBackground(new Color(0,153,51));
				btnTout.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnTout.setBackground(Color.white);
				btnTout.setForeground(Color.DARK_GRAY);
			}
		});
		btnTout.setBorder(null);
		btnTout.setBackground(Color.WHITE);
		btnTout.setForeground(Color.DARK_GRAY);
		btnTout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nvm = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(45, 109, 606, 258);
				contentPane.add(textArea);
				
				if ( nvm.listeEns.isEmpty()== true)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                                                 \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					for(int i=0 ; i<nvm.listeEns.size();i++)
					{
						textArea.append( nvm.listeEns.get(i).toString() );
					}
				}
			}
		});
		btnTout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTout.setBounds(45, 57, 115, 32);
		contentPane.add(btnTout);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(new Color(201,0,0));
				btnRetour.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setBackground(Color.WHITE);
				btnRetour.setForeground(Color.RED);
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
		btnRetour.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRetour.setBounds(583, 12, 93, 32);
		contentPane.add(btnRetour);
		
		JButton btnIsil = new JButton("ISIL");
		btnIsil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnIsil.setBackground(new Color(0,153,51));
				btnIsil.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnIsil.setBackground(Color.white);
				btnIsil.setForeground(Color.DARK_GRAY);
			}
		});
		btnIsil.setBorder(null);
		btnIsil.setForeground(Color.DARK_GRAY);
		btnIsil.setBackground(Color.WHITE);
		btnIsil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nvm = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(45, 109, 606, 258);
				contentPane.add(textArea);
				boolean ex=false;
				if ( nvm.listeEns.isEmpty()== true)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                             \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					
				for(int i=0 ; i<nvm.listeEns.size();i++)
				{
					//textArea.append( nvm.listeEns.get(i).aff() );
					if( nvm.listeEns.get(i).spec.getNom().equals(nvm.Isil.getNom()) )
					{
						ex=true;
						textArea.append( nvm.listeEns.get(i).toString() +"\n");
					}
				}
				}
				if(ex==false)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                              \n\n\n\n  \n");
					textArea.append("\n");
				}
			}
		});
		btnIsil.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIsil.setBounds(216, 57, 115, 32);
		contentPane.add(btnIsil);
		
		JButton btnAcad = new JButton("ACAD");
		btnAcad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAcad.setBackground(new Color(0,153,51));
				btnAcad.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAcad.setBackground(Color.white);
				btnAcad.setForeground(Color.DARK_GRAY);
			}
		});
		btnAcad.setBorder(null);
		btnAcad.setForeground(Color.DARK_GRAY);
		btnAcad.setBackground(Color.WHITE);
		btnAcad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nvm = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(45, 109, 606, 258);
				contentPane.add(textArea);
				boolean ex = false;
				if ( nvm.listeEns.isEmpty()== true)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                         \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
					
				for(int i=0 ; i<nvm.listeEns.size();i++)
				{
					//textArea.append( nvm.listeEns.get(i).aff() );
					if( nvm.listeEns.get(i).spec.getNom().equals(nvm.Acad.getNom()) )
					{
						ex = true;
						textArea.append( nvm.listeEns.get(i).toString() +"\n");
					}
				}
				}
				if(ex==false)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                     \n\n\n\n  \n");
					textArea.append("\n");
				}
			}
		});
		btnAcad.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAcad.setBounds(398, 57, 115, 32);
		contentPane.add(btnAcad);
		
		JButton btnGtr = new JButton("GTR");
		btnGtr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGtr.setBackground(new Color(0,153,51));
				btnGtr.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnGtr.setBackground(Color.white);
				btnGtr.setForeground(Color.DARK_GRAY);
			}
		});
		btnGtr.setBorder(null);
		btnGtr.setForeground(Color.DARK_GRAY);
		btnGtr.setBackground(Color.WHITE);
		btnGtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main nvm = new Main();
				
				JTextArea textArea = new JTextArea();
				textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
				textArea.setForeground(Color.WHITE);
				textArea.setBackground(new Color(0,51,102));
				textArea.setBounds(45, 109, 606, 258);
				contentPane.add(textArea);
				boolean ex=false;
				if ( nvm.listeEns.isEmpty()== true)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                        \n\n\n\n  \n");
					textArea.append("\n");
				}
				else
				{
				for(int i=0 ; i<nvm.listeEns.size();i++)
				{
					//textArea.append( nvm.listeEns.get(i).aff() );
					if( nvm.listeEns.get(i).spec.getNom().equals("Gtr") )
					{
						ex=true;
						textArea.append( nvm.listeEns.get(i).toString() +"\n");
					}
				}
				}
				if(ex==false)
				{
					textArea.setText(" Pas d'Enseignants .. Liste vide !!                                                                   \n\n\n\n  \n");
					textArea.append("\n");
				}
			}
		});
		btnGtr.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGtr.setBounds(561, 57, 115, 32);
		contentPane.add(btnGtr);
		
	
	}

}
