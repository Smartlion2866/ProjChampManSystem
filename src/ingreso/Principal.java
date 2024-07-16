package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;


public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setMaximumSize(new Dimension(0, 0));
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("SISTEMA DE GESTIÓN DE CAMPEONATOS DE FÚTBOL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Opcion1");
		mntmNewMenuItem_1.setFocusable(true);
		mntmNewMenuItem_1.setForeground(new Color(0, 0, 205));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mntmNewMenuItem_1);
				
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Opcion2");
		mntmNewMenuItem_2.setFocusable(true);
		mntmNewMenuItem_2.setForeground(new Color(0, 0, 205));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Opcion3");
		mntmNewMenuItem_3.setFocusable(true);
		mntmNewMenuItem_3.setForeground(new Color(0, 0, 205));
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Opcion4");
		mntmNewMenuItem_4.setFocusable(true);
		mntmNewMenuItem_4.setForeground(new Color(0, 0, 205));
		mntmNewMenuItem_4.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mntmNewMenuItem_4);
		

		setContentPane(contentPane);
		
	}

}
