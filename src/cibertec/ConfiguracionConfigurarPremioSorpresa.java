package cibertec;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConfiguracionConfigurarPremioSorpresa extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblNmeroDeCliente;
	private JLabel lblPremioSorpresa;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtNumero;
	private JTextField txtPremio;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionConfigurarPremioSorpresa dialog = new ConfiguracionConfigurarPremioSorpresa();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public ConfiguracionConfigurarPremioSorpresa() {
		setTitle("Configuraci\u00f3n | Configurar Premio Sorpresa ");
		setBounds(100, 100, 400, 100);
		getContentPane().setLayout(null);
		
		lblNmeroDeCliente = new JLabel("N\u00FAmero de cliente");
		lblNmeroDeCliente.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNmeroDeCliente.setBounds(10, 11, 140, 14);
		getContentPane().add(lblNmeroDeCliente);
		
		lblPremioSorpresa = new JLabel("Premio sorpresa");
		lblPremioSorpresa.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblPremioSorpresa.setBounds(10, 36, 140, 14);
		getContentPane().add(lblPremioSorpresa);
		
		txtNumero = new JTextField("" + Proyecto.numeroClientePremiado);
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtNumero.setBounds(160, 8, 95, 20);
		txtNumero.setColumns(10);
		getContentPane().add(txtNumero);		
		
		txtPremio = new JTextField(Proyecto.premioSorpresa);
		txtPremio.setHorizontalAlignment(SwingConstants.CENTER);
		txtPremio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtPremio.setBounds(160, 33, 95, 20);
		txtPremio.setColumns(10);
		getContentPane().add(txtPremio);
		
	
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnAceptar.setBounds(265, 7, 100, 23);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Proyecto.numeroClientePremiado = Integer.parseInt(txtNumero.getText());
					Proyecto.premioSorpresa = txtPremio.getText();
					dispose();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Entrada inv\u00e1lida en N\u00famero de cliente, ingrese un n\u00famero entero");
				}
			}
		});				
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(265, 32, 100, 23);
		getContentPane().add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}