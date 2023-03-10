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

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtHola;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
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
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(123, 29, 243, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/23231-5-one-piece-chibi-image-thumb.png")));
		lblNewLabel_1.setBounds(320, -35, 173, 278);
		panel.add(lblNewLabel_1);
		
		JLabel lblEnterYourPersonal = new JLabel("Enter your personal data");
		lblEnterYourPersonal.setForeground(Color.BLACK);
		lblEnterYourPersonal.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblEnterYourPersonal.setBounds(157, 52, 173, 53);
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
		
		txtHola = new JTextField();
		txtHola.setToolTipText("hola");
		txtHola.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		txtHola.setForeground(new Color(0, 0, 0));
		txtHola.setBackground(new Color(255, 128, 0));
		txtHola.setBounds(59, 161, 164, 30);
		contentPane.add(txtHola);
		txtHola.setColumns(10);
		
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
		
		textField = new JTextField();
		textField.setToolTipText("hola");
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		textField.setColumns(10);
		textField.setBackground(new Color(255, 128, 0));
		textField.setBounds(59, 241, 376, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("hola");
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 128, 0));
		textField_1.setBounds(59, 481, 376, 30);
		contentPane.add(textField_1);
		
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
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setBounds(184, 635, 118, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblYouAreAlready = new JLabel("You are already signed in?");
		lblYouAreAlready.setForeground(Color.BLACK);
		lblYouAreAlready.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblYouAreAlready.setBounds(144, 675, 176, 30);
		contentPane.add(lblYouAreAlready);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/51CeYLr3qCL._AC_UF1000_1000_QL80_-removebg-preview (2).png")));
		lblNewLabel_4.setBounds(22, 618, 105, 87);
		contentPane.add(lblNewLabel_4);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(new Color(0, 0, 0));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnLogIn.setBackground(new Color(255, 128, 0));
		btnLogIn.setBounds(306, 682, 83, 23);
		contentPane.add(btnLogIn);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setForeground(Color.BLACK);
		lblSurname.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblSurname.setBounds(238, 121, 93, 30);
		contentPane.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("hola");
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 128, 0));
		textField_2.setBounds(233, 161, 202, 30);
		contentPane.add(textField_2);
		
		JLabel lblSelectYourCountry = new JLabel("Select your Country:");
		lblSelectYourCountry.setForeground(Color.BLACK);
		lblSelectYourCountry.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblSelectYourCountry.setBounds(59, 521, 164, 30);
		contentPane.add(lblSelectYourCountry);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Spain", "France", "United States", "Mexico", "Germany", "United Kingdom", "Italy"}));
		comboBox.setBackground(new Color(255, 128, 0));
		comboBox.setBounds(59, 564, 376, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("");
		lblNewLabel_3_4_1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Images/country_30px.png")));
		lblNewLabel_3_4_1.setBounds(22, 521, 33, 30);
		contentPane.add(lblNewLabel_3_4_1);
	}
}

