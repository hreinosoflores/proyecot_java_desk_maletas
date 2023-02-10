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

public class ConfiguracionConfigurarCantidadOptimaDeMaletasVendidas extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblCantidadptimaDe;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionConfigurarCantidadOptimaDeMaletasVendidas dialog = new ConfiguracionConfigurarCantidadOptimaDeMaletasVendidas();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public ConfiguracionConfigurarCantidadOptimaDeMaletasVendidas() {
		setTitle("Configuraci\u00f3n | Configurar Cantidad \u00F3ptima De Maletas Vendidas");
		setBounds(100, 100, 427, 110);
		getContentPane().setLayout(null);

		lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de maletas vendidas ");
		lblCantidadptimaDe.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblCantidadptimaDe.setBounds(10, 11, 290, 14);
		getContentPane().add(lblCantidadptimaDe);

		txtCantidad = new JTextField("" + Proyecto.cantidadOptima);
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtCantidad.setBounds(310, 8, 79, 20);
		txtCantidad.setColumns(10);
		getContentPane().add(txtCantidad);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Proyecto.cantidadOptima = Integer.parseInt(txtCantidad.getText());
					dispose();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Entrada inv\u00e1lida, ingrese un n\u00famero entero");
				}

			}
		});
		btnAceptar.setBounds(57, 36, 128, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(234, 36, 134, 23);
		getContentPane().add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
	}

}