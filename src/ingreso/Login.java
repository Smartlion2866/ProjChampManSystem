package ingreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JLabel lblOlvidasteContrasena;
	private JLabel lblRegistrate;
	private JButton btnIniciarSesion;
	
	public static String contrasena = "Lima2022";
	public static String correo = "mike@gmail.com";
	
	public static Integer  contador = 0;
	public static int estado = 0;
	public static int estadocorreo = 0;
	public static int estadocontrasena = 0;

	/* Launch the application */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame */
	
	public Login() {
		setLocationRelativeTo(null);
		
		setTitle("LOGIN AL SISTEMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		txtUsuario = new JTextField();
		txtUsuario.setBounds(40, 66, 290, 25);
		txtUsuario.setForeground(Color.LIGHT_GRAY);
		txtUsuario.setText("USUARIO");
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(40, 112, 290, 25);
		txtContrasena.setForeground(Color.LIGHT_GRAY);
		txtContrasena.setText("CONTRASEÑA");
		txtContrasena.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		lblOlvidasteContrasena = new JLabel("\u00BFOlvidaste la contrase\u00F1a?");
		lblOlvidasteContrasena.setFont(new Font("Arial", Font.PLAIN, 13));
		lblOlvidasteContrasena.setForeground(Color.WHITE);
		lblOlvidasteContrasena.setBounds(40, 150, 210, 14);
		contentPane.add(lblOlvidasteContrasena);
		
		lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRegistrate.setForeground(Color.WHITE);
		lblRegistrate.setBounds(260, 150, 124, 14);
		contentPane.add(lblRegistrate);
		
		btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.addActionListener(this);
		btnIniciarSesion.setBackground(Color.ORANGE);
		btnIniciarSesion.setFont(new Font("Arial", Font.PLAIN, 17));
		btnIniciarSesion.setBounds(40, 200, 290, 30);
		contentPane.add(btnIniciarSesion);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIniciarSesion) {
			actionPerformedIniciarSesion(e);
		}
	}
	
	public void actionPerformedIniciarSesion(ActionEvent e) {
		String usuario="";
		String password="";
		do {
			if ( !usuario.equals(correo) ) {
				usuario = txtUsuario.getText();
			}
			if (!password.equals(contrasena)) {
				password = txtContrasena.getText();
			}
						
			if (usuario.equals(correo)) {
				if (password.equals(contrasena)) {
					JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!!!");
					Principal frame = new Principal();
					frame.setVisible(true);
					
					estado = 1;
					//dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Estimado Usuario la contrase�a es incorrecta !!!");
					contador = contador + 1;
					estadocontrasena = 1;
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Estimado Usuario usted a ingresado mal el correo !!!");
				estadocorreo = 1;
			}
			
		} while ( contador != 3 && estado != 1 && estadocontrasena !=1 && estadocorreo != 1 );
		
		if (contador == 3) {
			JOptionPane.showMessageDialog(null, "Estimado Usuario su cuenta de correo ha sido bloqueada !!!");
			dispose();
		}
	}
}