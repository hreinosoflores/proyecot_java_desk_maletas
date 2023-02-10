package cibertec;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentasVender extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox<String> cboCodigo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtSalida;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasVender dialog = new VentasVender();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public VentasVender() {
		setTitle("Ventas | Vender");
		setBounds(100, 100, 550, 300);
		getContentPane().setLayout(null);

		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblCodigo.setBounds(10, 11, 155, 14);
		getContentPane().add(lblCodigo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblPrecio.setBounds(10, 36, 155, 14);
		getContentPane().add(lblPrecio);

		lblCantidad = new JLabel("Cantidad de maletas");
		lblCantidad.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblCantidad.setBounds(10, 61, 155, 14);
		getContentPane().add(lblCantidad);

		cboCodigo = new JComboBox<String>();
		cboCodigo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel<String>(new String[] { Proyecto.codigo0, Proyecto.codigo1,
				Proyecto.codigo2, Proyecto.codigo3, Proyecto.codigo4 }));
		cboCodigo.setBounds(175, 8, 108, 20);
		getContentPane().add(cboCodigo);

		txtPrecio = new JTextField("" + Proyecto.precio0);
		txtPrecio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(175, 33, 108, 20);
		getContentPane().add(txtPrecio);

		txtPrecio.setColumns(10);
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtCantidad.setBounds(175, 58, 109, 20);
		getContentPane().add(txtCantidad);

		txtCantidad.setColumns(10);
		btnVender = new JButton("Vender");
		btnVender.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnVender.addActionListener(this);
		btnVender.setBounds(435, 7, 89, 23);
		getContentPane().add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(435, 32, 89, 23);
		getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 514, 164);
		getContentPane().add(scrollPane);

		txtSalida = new JTextArea();
		txtSalida.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtSalida);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboCodigo) {
			actionPerformedCboCodigo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedCboCodigo(ActionEvent e) {
		int posCodigo;
		posCodigo = cboCodigo.getSelectedIndex();
		switch (posCodigo) {
		case 0:
			txtPrecio.setText("" + Proyecto.precio0);
			break;
		case 1:
			txtPrecio.setText("" + Proyecto.precio1);
			break;
		case 2:
			txtPrecio.setText("" + Proyecto.precio2);
			break;
		case 3:
			txtPrecio.setText("" + Proyecto.precio3);
			break;
		default:
			txtPrecio.setText("" + Proyecto.precio4);
		}
	}

	protected void actionPerformedBtnVender(ActionEvent e) {
		int cantidad, posCodigo;
		double precio, icompra, idescuento, ipagar;
		try {

			precio = Double.parseDouble(txtPrecio.getText());
			cantidad = Integer.parseInt(txtCantidad.getText());
			icompra = precio * cantidad;
			idescuento = setDescuento(cantidad, icompra);
			ipagar = icompra - idescuento;
			posCodigo = cboCodigo.getSelectedIndex();
			EscribirSalida(posCodigo);
			txtSalida.append("Cantidad: " + cantidad + "\n");
			txtSalida.append("Importe de compra: S/." + String.format("%.2f",  icompra) + "\n");
			txtSalida.append("Importe de descuento: S/." + String.format("%.2f", idescuento) + "\n");
			txtSalida.append("Importe a pagar: S/." + String.format("%.2f", ipagar) + "\n");

			// Obsequio
			if (cantidad >= Proyecto.cantidadMinima) {
				txtSalida.append("Obsequio: " + Proyecto.obsequio + "\n");
			}

			switch (posCodigo) {
			case 0:
				Proyecto.cantidadVentas0++;
				Proyecto.cantidadMaletasVendidas0 += cantidad;
				Proyecto.importeTotalAcumulado0 += ipagar;
				break;
			case 1:
				Proyecto.cantidadVentas1++;
				Proyecto.cantidadMaletasVendidas1 += cantidad;
				Proyecto.importeTotalAcumulado1 += ipagar;
				break;
			case 2:
				Proyecto.cantidadVentas2++;
				Proyecto.cantidadMaletasVendidas2 += cantidad;
				Proyecto.importeTotalAcumulado2 += ipagar;
				break;
			case 3:
				Proyecto.cantidadVentas3++;
				Proyecto.cantidadMaletasVendidas3 += cantidad;
				Proyecto.importeTotalAcumulado3 += ipagar;
				break;
			default:
				Proyecto.cantidadVentas4++;
				Proyecto.cantidadMaletasVendidas4 += cantidad;
				Proyecto.importeTotalAcumulado4 += ipagar;
			}
			
			
			Proyecto.importeTotalAcumuladoGeneral += ipagar;
			Proyecto.contClientes++;

			// Cliente premiado
			if (Proyecto.contClientes % Proyecto.numeroClientePremiado == 0) {
				txtSalida.append("Premio sorpresa: " + Proyecto.premioSorpresa);
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Cantidad inv\u00e1lida, por favor ingrese un n\u00famero entero");
		}

	}

	private void EscribirSalida(int posCodigo) {
		switch (posCodigo) {
		case 0:
			EscribirSalidaPrimerosParrafos(Proyecto.codigo0, Proyecto.modelo0, Proyecto.precio0);
			break;
		case 1:
			EscribirSalidaPrimerosParrafos(Proyecto.codigo1, Proyecto.modelo1, Proyecto.precio1);
			break;
		case 2:
			EscribirSalidaPrimerosParrafos(Proyecto.codigo2, Proyecto.modelo2, Proyecto.precio2);
			break;
		case 3:
			EscribirSalidaPrimerosParrafos(Proyecto.codigo3, Proyecto.modelo3, Proyecto.precio3);
			break;
		default:
			EscribirSalidaPrimerosParrafos(Proyecto.codigo4, Proyecto.modelo4, Proyecto.precio4);
		}
	}

	private void EscribirSalidaPrimerosParrafos(String codigo, String modelo, double precio) {
		txtSalida.setText("C\u00f3digo de la maleta: " + codigo + "\n");
		txtSalida.append("Modelo de la maleta: " + modelo + "\n");
		txtSalida.append("Precio de la maleta: " + "" + precio + "\n");
	}

	private double setDescuento(int cantidad, double icompra) {
		if (cantidad <= 0)
			return 0;
		else if (cantidad >= 1 && cantidad <= 3)
			return icompra * Proyecto.porcentaje1 / 100;
		else if (cantidad >= 4 && cantidad <= 5)
			return icompra * Proyecto.porcentaje2 / 100;
		else if (cantidad >= 6 && cantidad <= 8)
			return icompra * Proyecto.porcentaje3 / 100;
		else
			return icompra * Proyecto.porcentaje4 / 100;
	}

}