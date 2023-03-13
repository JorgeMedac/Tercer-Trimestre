package zTercerTrimestre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextField;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtEnterYourEmail;
	private JTextField txtEnterYourPhone;
	private JTextField txtEnterYourSurname;
	private JTextField txtEnterYourName;
	static VentanaRegistro ventana_registro;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_registro = new VentanaRegistro();
					ventana_registro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 503, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FORM");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblNewLabel.setBounds(124, 29, 243, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/23231-5-one-piece-chibi-image-thumb.png")));
		lblNewLabel_1.setBounds(320, -35, 173, 278);
		panel.add(lblNewLabel_1);
		
		JLabel lblEnterYourPersonal = new JLabel("Enter your personal data");
		lblEnterYourPersonal.setForeground(Color.BLACK);
		lblEnterYourPersonal.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblEnterYourPersonal.setBounds(149, 51, 173, 53);
		panel.add(lblEnterYourPersonal);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/images-removebg-preview (1) (1).png")));
		lblNewLabel_3.setBounds(0, 2, 127, 115);
		panel.add(lblNewLabel_3);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 128, 0));
		panel_1.setBounds(0, 711, 503, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("© Jorge Fernández Cea • 2023 • Programación");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_2.setBounds(77, 0, 346, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNombre = new JLabel("Name:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNombre.setBounds(59, 121, 93, 30);
		contentPane.add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblEmail.setBounds(59, 201, 83, 30);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblPassword.setBounds(59, 281, 83, 30);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setForeground(Color.BLACK);
		lblConfirmPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblConfirmPassword.setBounds(59, 361, 164, 30);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblPhoneNumber.setBounds(59, 441, 124, 30);
		contentPane.add(lblPhoneNumber);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 128, 0));
		passwordField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		passwordField.setBounds(59, 321, 376, 30);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		passwordField_1.setBackground(new Color(255, 128, 0));
		passwordField_1.setBounds(59, 401, 376, 30);
		contentPane.add(passwordField_1);
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setText("Enter Your Email");
		txtEnterYourEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterYourEmail.getText().equals("Enter Your Email")) {
					txtEnterYourEmail.setText("");
					txtEnterYourEmail.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterYourEmail.getText().equals("")) {
					txtEnterYourEmail.setText("Enter Your Email");
					txtEnterYourEmail.setForeground(new Color(71,75,78));
				}
			}
		});
		txtEnterYourEmail.setToolTipText("");
		txtEnterYourEmail.setForeground(new Color(71, 75, 78));
		txtEnterYourEmail.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		txtEnterYourEmail.setColumns(10);
		txtEnterYourEmail.setBackground(new Color(255, 128, 0));
		txtEnterYourEmail.setBounds(59, 241, 376, 30);
		contentPane.add(txtEnterYourEmail);
		
		txtEnterYourPhone = new JTextField();
		txtEnterYourPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

			    boolean numeros = key >= 48 && key <= 57;
			        
			    if (!numeros)
			    {
			        e.consume();
			    }
			    if (txtEnterYourPhone.getText().trim().length() == 9) {
			        e.consume();
			    }
			}
		});
		txtEnterYourPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterYourPhone.getText().equals("Enter Your Phone Number")) {
					txtEnterYourPhone.setText("");
					txtEnterYourPhone.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterYourPhone.getText().equals("")) {
					txtEnterYourPhone.setText("Enter Your Phone Number");
					txtEnterYourPhone.setForeground(new Color(71, 75, 78));
				}
			}
			
		});
		txtEnterYourPhone.setText("Enter Your Phone Number");
		txtEnterYourPhone.setToolTipText("");
		txtEnterYourPhone.setForeground(new Color(71, 75, 78));
		txtEnterYourPhone.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		txtEnterYourPhone.setColumns(10);
		txtEnterYourPhone.setBackground(new Color(255, 128, 0));
		txtEnterYourPhone.setBounds(59, 481, 376, 30);
		contentPane.add(txtEnterYourPhone);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Remember Me");
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		rdbtnNewRadioButton.setBackground(new Color(255, 250, 205));
		rdbtnNewRadioButton.setBounds(111, 600, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSubscribeToNewsletter = new JRadioButton("Subscribe to Newsletter");
		rdbtnSubscribeToNewsletter.setSelected(true);
		rdbtnSubscribeToNewsletter.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		rdbtnSubscribeToNewsletter.setBackground(new Color(255, 250, 205));
		rdbtnSubscribeToNewsletter.setBounds(238, 600, 170, 23);
		contentPane.add(rdbtnSubscribeToNewsletter);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/icons8_Email_Sign_30px.png")));
		lblNewLabel_3_1.setBounds(22, 201, 33, 30);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/icons8_password_30px.png")));
		lblNewLabel_3_2.setBounds(22, 281, 33, 30);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/icons8_confirm_30px.png")));
		lblNewLabel_3_3.setBounds(22, 361, 33, 30);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/icons8_phone_30px.png")));
		lblNewLabel_3_4.setBounds(22, 441, 33, 30);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/icons8_name_30px_1.png")));
		lblNewLabel_3_2_1.setBounds(22, 121, 33, 30);
		contentPane.add(lblNewLabel_3_2_1);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "¡Registro Completado!","MUNDO ANIME",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setBounds(184, 635, 118, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblYouAreAlready = new JLabel("Are you already registered?");
		lblYouAreAlready.setForeground(Color.BLACK);
		lblYouAreAlready.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblYouAreAlready.setBounds(126, 675, 176, 30);
		contentPane.add(lblYouAreAlready);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/51CeYLr3qCL._AC_UF1000_1000_QL80_-removebg-preview (2).png")));
		lblNewLabel_4.setBounds(22, 618, 105, 87);
		contentPane.add(lblNewLabel_4);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(new Color(0, 0, 0));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new Login();
				frame.setVisible(true);
				ventana_registro.setVisible(false);
			}
		});
		btnLogIn.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnLogIn.setBackground(new Color(255, 128, 0));
		btnLogIn.setBounds(303, 679, 83, 23);
		contentPane.add(btnLogIn);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setForeground(Color.BLACK);
		lblSurname.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblSurname.setBounds(238, 121, 93, 30);
		contentPane.add(lblSurname);
		
		txtEnterYourSurname = new JTextField();
		txtEnterYourSurname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

			    boolean mayusculas = key >= 65 && key <= 90;
			    boolean minusculas = key >= 97 && key <= 122;
			    boolean espacio = key == 32;
			            
			     if (!(minusculas || mayusculas || espacio))
			    {
			        e.consume();
			    }
			}
		});
		txtEnterYourSurname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterYourSurname.getText().equals("Enter Your Surname")) {
					txtEnterYourSurname.setText("");
					txtEnterYourSurname.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterYourSurname.getText().equals("")) {
					txtEnterYourSurname.setText("Enter Your Surname");
					txtEnterYourSurname.setForeground(new Color(71,75,78));
				}
			}
		});
		txtEnterYourSurname.setText("Enter Your Surname");
		txtEnterYourSurname.setToolTipText("");
		txtEnterYourSurname.setForeground(new Color(71, 75, 78));
		txtEnterYourSurname.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		txtEnterYourSurname.setColumns(10);
		txtEnterYourSurname.setBackground(new Color(255, 128, 0));
		txtEnterYourSurname.setBounds(233, 161, 202, 30);
		contentPane.add(txtEnterYourSurname);
		
		JLabel lblSelectYourCountry = new JLabel("Select your Country:");
		lblSelectYourCountry.setForeground(Color.BLACK);
		lblSelectYourCountry.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblSelectYourCountry.setBounds(59, 521, 164, 30);
		contentPane.add(lblSelectYourCountry);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Your Country", "Spain", "France", "United States", "Mexico", "Germany", "United Kingdom", "Italy"}));
		comboBox.setBackground(new Color(255, 128, 0));
		comboBox.setBounds(59, 564, 376, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("");
		lblNewLabel_3_4_1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/country_30px.png")));
		lblNewLabel_3_4_1.setBounds(22, 521, 33, 30);
		contentPane.add(lblNewLabel_3_4_1);
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

			    boolean mayusculas = key >= 65 && key <= 90;
			    boolean minusculas = key >= 97 && key <= 122;
			    boolean espacio = key == 32;
			            
			     if (!(minusculas || mayusculas || espacio))
			    {
			        e.consume();
			    }
			}
		});
		txtEnterYourName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterYourName.getText().equals("Enter Your Name")) {
					txtEnterYourName.setText("");
					txtEnterYourName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterYourName.getText().equals("")) {
					txtEnterYourName.setText("Enter Your Name");
					txtEnterYourName.setForeground(new Color(71,75,78));
				}
			}
		});
		txtEnterYourName.setForeground(new Color(71, 75, 78));
		txtEnterYourName.setBackground(new Color(255, 128, 0));
		txtEnterYourName.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		txtEnterYourName.setText("Enter Your Name");
		txtEnterYourName.setBounds(56, 162, 167, 28);
		contentPane.add(txtEnterYourName);
		txtEnterYourName.setColumns(10);
	}
}

