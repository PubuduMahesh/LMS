package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTextField;
	private JPasswordField passwordField;
	private Button submitButton;
	private Button cancelButton;
	private boolean visibility = true;

	

	/**
	 * Create the Login frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("user name");
		lblNewLabel.setBounds(25, 39, 80, 15);
		contentPane.add(lblNewLabel);
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(156, 37, 154, 19);
		contentPane.add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel label = new JLabel("password");
		label.setBounds(25, 69, 70, 15);
		contentPane.add(label);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(156, 68, 154, 19);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		submitButton = new Button("submit");
		submitButton.setBounds(318, 111, 59, 38);
		contentPane.add(submitButton);
		
		cancelButton = new Button("Cancel");		
		cancelButton.setBounds(251, 111, 59, 38);
		contentPane.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
		
}
