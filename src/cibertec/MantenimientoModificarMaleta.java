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
import javax.swing.JTextField;

public class MantenimientoModificarMaleta extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JLabel lblCodigo;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAnchocm;
	private JLabel lblAltocm;
	private JLabel lblFondocm;
	private JComboBox<String> cboCodigo;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoModificarMaleta dialog = new MantenimientoModificarMaleta();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public MantenimientoModificarMaleta() {
		setTitle("Mantenimiento | Modificar Maleta");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);

		lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblCodigo.setBounds(10, 11, 90, 14);
		getContentPane().add(lblCodigo);

		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblModelo.setBounds(10, 36, 90, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblPrecio.setBounds(10, 61, 90, 14);
		getContentPane().add(lblPrecio);

		lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblAnchocm.setBounds(10, 86, 90, 14);
		getContentPane().add(lblAnchocm);

		lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblAltocm.setBounds(10, 111, 90, 14);
		getContentPane().add(lblAltocm);

		lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblFondocm.setBounds(10, 136, 90, 14);
		getContentPane().add(lblFondocm);

		cboCodigo = new JComboBox<String>();
		cboCodigo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel<String>(new String[] { "MT0", "MT1", "MT2", "MT3", "MT4" }));
		cboCodigo.setBounds(110, 8, 90, 20);
		getContentPane().add(cboCodigo);

		txtModelo = new JTextField("" + Proyecto.modelo0);
		txtModelo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtModelo.setColumns(10);
		txtModelo.setBounds(110, 33, 90, 20);
		getContentPane().add(txtModelo);

		txtPrecio = new JTextField("" + Proyecto.precio0);
		txtPrecio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(110, 58, 90, 20);
		getContentPane().add(txtPrecio);

		txtAncho = new JTextField("" + Proyecto.ancho0);
		txtAncho.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtAncho.setColumns(10);
		txtAncho.setBounds(110, 83, 90, 20);
		getContentPane().add(txtAncho);

		txtAlto = new JTextField("" + Proyecto.alto0);
		txtAlto.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtAlto.setColumns(10);
		txtAlto.setBounds(110, 108, 90, 20);
		getContentPane().add(txtAlto);

		txtFondo = new JTextField("" + Proyecto.fondo0);
		txtFondo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtFondo.setColumns(10);
		txtFondo.setBounds(110, 133, 90, 20);
		getContentPane().add(txtFondo);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(260, 82, 90, 23);
		getContentPane().add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(260, 32, 90, 23);
		getContentPane().add(btnGrabar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboCodigo) {
			actionPerformedComboBox(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
	}

	protected void actionPerformedComboBox(ActionEvent e) {
		int posCodigo = cboCodigo.getSelectedIndex();
		switch (posCodigo) {
		case 0:
			txtModelo.setText("" + Proyecto.modelo0);
			txtPrecio.setText("" + Proyecto.precio0);
			txtAncho.setText("" + Proyecto.ancho0);
			txtAlto.setText("" + Proyecto.alto0);
			txtFondo.setText("" + Proyecto.fondo0);
			break;
		case 1:
			txtModelo.setText("" + Proyecto.modelo1);
			txtPrecio.setText("" + Proyecto.precio1);
			txtAncho.setText("" + Proyecto.ancho1);
			txtAlto.setText("" + Proyecto.alto1);
			txtFondo.setText("" + Proyecto.fondo1);
			break;
		case 2:
			txtModelo.setText("" + Proyecto.modelo2);
			txtPrecio.setText("" + Proyecto.precio2);
			txtAncho.setText("" + Proyecto.ancho2);
			txtAlto.setText("" + Proyecto.alto2);
			txtFondo.setText("" + Proyecto.fondo2);
			break;
		case 3:
			txtModelo.setText("" + Proyecto.modelo3);
			txtPrecio.setText("" + Proyecto.precio3);
			txtAncho.setText("" + Proyecto.ancho3);
			txtAlto.setText("" + Proyecto.alto3);
			txtFondo.setText("" + Proyecto.fondo3);
			break;
		default:
			txtModelo.setText("" + Proyecto.modelo4);
			txtPrecio.setText("" + Proyecto.precio4);
			txtAncho.setText("" + Proyecto.ancho4);
			txtAlto.setText("" + Proyecto.alto4);
			txtFondo.setText("" + Proyecto.fondo4);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnGrabar(ActionEvent e) {
		int posCodigo = cboCodigo.getSelectedIndex();
		switch (posCodigo) {
		case 0:
			Proyecto.modelo0 = txtModelo.getText();
			try {
				Proyecto.precio0 = Double.parseDouble(txtPrecio.getText());
				Proyecto.ancho0 = Double.parseDouble(txtAncho.getText());
				Proyecto.alto0 = Double.parseDouble(txtAlto.getText());
				Proyecto.fondo0 = Double.parseDouble(txtFondo.getText());
				dispose();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Hay una entrada inv\u00e1lida, ingrese un n\u00famero");
			}

			break;
		case 1:
			Proyecto.modelo1 = txtModelo.getText();
			try {
				Proyecto.precio1 = Double.parseDouble(txtPrecio.getText());
				Proyecto.ancho1 = Double.parseDouble(txtAncho.getText());
				Proyecto.alto1 = Double.parseDouble(txtAlto.getText());
				Proyecto.fondo1 = Double.parseDouble(txtFondo.getText());
				dispose();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Hay una entrada inv\u00e1lida, ingrese un n\u00famero");
			}
			break;
		case 2:
			Proyecto.modelo2 = txtModelo.getText();
			try {
				Proyecto.precio2 = Double.parseDouble(txtPrecio.getText());
				Proyecto.ancho2 = Double.parseDouble(txtAncho.getText());
				Proyecto.alto2 = Double.parseDouble(txtAlto.getText());
				Proyecto.fondo2 = Double.parseDouble(txtFondo.getText());
				dispose();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Hay una entrada inv\u00e1lida, ingrese un n\u00famero");
			}
			break;
		case 3:
			Proyecto.modelo3 = txtModelo.getText();
			try {
				Proyecto.precio3 = Double.parseDouble(txtPrecio.getText());
				Proyecto.ancho3 = Double.parseDouble(txtAncho.getText());
				Proyecto.alto3 = Double.parseDouble(txtAlto.getText());
				Proyecto.fondo3 = Double.parseDouble(txtFondo.getText());
				dispose();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Hay una entrada inv\u00e1lida, ingrese un n\u00famero");
			}
			break;
		default:
			Proyecto.modelo4 = txtModelo.getText();
			try {
				Proyecto.precio4 = Double.parseDouble(txtPrecio.getText());
				Proyecto.ancho4 = Double.parseDouble(txtAncho.getText());
				Proyecto.alto4 = Double.parseDouble(txtAlto.getText());
				Proyecto.fondo4 = Double.parseDouble(txtFondo.getText());
				dispose();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Hay una entrada inv\u00e1lida, ingrese un n\u00famero");
			}
			break;
		}

	}
}
