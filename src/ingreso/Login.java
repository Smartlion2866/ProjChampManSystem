package ingreso;

/*import java.awt.BorderLayout;*/
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
	private JLabel lblUsuario;
	private JLabel lblContrasena;
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
		setTitle("Sistema de Ingreso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(10, 69, 108, 14);
		contentPane.add(lblUsuario);
		
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContrasena.setBounds(10, 115, 108, 14);
		contentPane.add(lblContrasena);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(135, 66, 173, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(135, 112, 173, 20);
		contentPane.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		lblOlvidasteContrasena = new JLabel("\u00BFOlvidaste la contrase\u00F1a?");
		lblOlvidasteContrasena.setBounds(97, 198, 210, 14);
		contentPane.add(lblOlvidasteContrasena);
		
		lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setBounds(97, 223, 124, 14);
		contentPane.add(lblRegistrate);
		
		btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.addActionListener(this);
		btnIniciarSesion.setBackground(Color.BLUE);
		btnIniciarSesion.setBounds(95, 164, 213, 23);
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
					JOptionPane.showMessageDialog(null, "Bienvenido !!!");
					estado = 1;
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Estimado Usuario la contraseña es incorrecta !!!");
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