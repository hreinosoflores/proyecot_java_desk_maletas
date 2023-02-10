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

public class ConfiguracionConfigurarObsequio extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblCantidadMnimaDe;
	private JLabel lblObsequio;
	private JTextField txtCantidadMinima;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionConfigurarObsequio dialog = new ConfiguracionConfigurarObsequio();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public ConfiguracionConfigurarObsequio() {
		setTitle("Configuraci\u00f3n | Configurar Obsequio");
		setBounds(100, 100, 500, 100);
		getContentPane().setLayout(null);

		lblCantidadMnimaDe = new JLabel("Cantidad m\u00EDnima de maletas adquiridas");
		lblCantidadMnimaDe.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblCantidadMnimaDe.setBounds(10, 11, 304, 14);
		getContentPane().add(lblCantidadMnimaDe);

		lblObsequio = new JLabel("Obsequio");
		lblObsequio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblObsequio.setBounds(10, 36, 304, 14);
		getContentPane().add(lblObsequio);

		txtCantidadMinima = new JTextField("" + Proyecto.cantidadMinima);
		txtCantidadMinima.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidadMinima.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtCantidadMinima.setBounds(312, 8, 47, 20);
		txtCantidadMinima.setColumns(10);
		getContentPane().add(txtCantidadMinima);

		txtObsequio = new JTextField(Proyecto.obsequio);
		txtObsequio.setHorizontalAlignment(SwingConstants.CENTER);
		txtObsequio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtObsequio.setBounds(201, 33, 158, 20);
		txtObsequio.setColumns(10);
		getContentPane().add(txtObsequio);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Proyecto.cantidadMinima = Integer.parseInt(txtCantidadMinima.getText());
					Proyecto.obsequio = txtObsequio.getText();
					dispose();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Entrada inv\u00e1lida en Cantidad M\u00EDnima, ingrese un n\u00famero entero");
				}
			}
		});
		btnAceptar.setBounds(369, 7, 100, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(369, 32, 100, 23);
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