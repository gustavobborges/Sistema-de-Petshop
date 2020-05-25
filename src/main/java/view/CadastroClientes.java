package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroClientes extends JInternalFrame {
	private JTextField textNome;
	private JTextField textRua;
	private JTextField textFieldNumero;
	private JTextField textField;
	private JTextField textEmail;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClientes frame = new CadastroClientes();
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
	public CadastroClientes() {
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 650, 410);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(10, 10, 45, 25);
		getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNome.setBounds(70, 10, 445, 25);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF: ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF.setBounds(10, 45, 45, 25);
		getContentPane().add(lblCPF);
		
		JFormattedTextField formattedTextCPF = new JFormattedTextField();
		formattedTextCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		formattedTextCPF.setBounds(70, 50, 200, 25);
		getContentPane().add(formattedTextCPF);
		
		JLabel lblRua = new JLabel("Rua: ");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRua.setBounds(10, 80, 45, 25);
		getContentPane().add(lblRua);
		
		textRua = new JTextField();
		textRua.setBounds(70, 85, 445, 25);
		getContentPane().add(textRua);
		textRua.setColumns(10);
		
		JLabel lblNumero = new JLabel("Número: ");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(10, 115, 50, 25);
		getContentPane().add(lblNumero);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldNumero.setBounds(70, 120, 200, 25);
		getContentPane().add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(10, 150, 45, 25);
		getContentPane().add(lblBairro);
		
		textField = new JTextField();
		textField.setBounds(70, 155, 200, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 225, 50, 25);
		getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textEmail.setBounds(70, 225, 250, 25);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(10, 190, 55, 25);
		getContentPane().add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textTelefone.setBounds(70, 190, 200, 25);
		getContentPane().add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setBounds(185, 320, 85, 30);
		getContentPane().add(btnLimpar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvar.setBounds(335, 320, 85, 30);
		getContentPane().add(btnSalvar);

	}
}
