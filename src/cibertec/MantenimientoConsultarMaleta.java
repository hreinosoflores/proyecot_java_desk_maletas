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
import javax.swing.JTextField;

public class MantenimientoConsultarMaleta extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JComboBox<String> cboCodigo;
	private JLabel lblModelo;
	private JTextField txtModelo;
	private JLabel lblPrecios;
	private JLabel lblAnchocm;
	private JLabel lblAltocm;
	private JLabel lblFondocm;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnCerrar;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoConsultarMaleta dialog = new MantenimientoConsultarMaleta();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public MantenimientoConsultarMaleta() {
		setTitle("Mantenimiento | Consultar Maleta");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);

		lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblCodigo.setBounds(10, 11, 101, 14);
		getContentPane().add(lblCodigo);

		cboCodigo = new JComboBox<String>();
		cboCodigo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel<String>(new String[] { "MT0", "MT1", "MT2", "MT3", "MT4" }));
		cboCodigo.setBounds(121, 5, 86, 20);
		getContentPane().add(cboCodigo);

		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblModelo.setBounds(10, 36, 101, 14);
		getContentPane().add(lblModelo);

		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblPrecios.setBounds(10, 61, 101, 14);
		getContentPane().add(lblPrecios);

		lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblAnchocm.setBounds(10, 86, 101, 14);
		getContentPane().add(lblAnchocm);

		lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblAltocm.setBounds(10, 111, 101, 14);
		getContentPane().add(lblAltocm);

		lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblFondocm.setBounds(10, 136, 101, 14);
		getContentPane().add(lblFondocm);

		txtModelo = new JTextField("" + Proyecto.modelo0);
		txtModelo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtModelo.setEditable(false);
		txtModelo.setBounds(121, 30, 86, 20);
		getContentPane().add(txtModelo);

		txtModelo.setColumns(10);
		txtPrecio = new JTextField("" + Proyecto.precio0);
		txtPrecio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(121, 55, 86, 20);
		getContentPane().add(txtPrecio);

		txtPrecio.setColumns(10);
		txtAncho = new JTextField("" + Proyecto.ancho0);
		txtAncho.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtAncho.setEditable(false);
		txtAncho.setBounds(121, 80, 86, 20);
		getContentPane().add(txtAncho);

		txtAncho.setColumns(10);
		txtAlto = new JTextField("" + Proyecto.alto0);
		txtAlto.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtAlto.setEditable(false);
		txtAlto.setBounds(121, 105, 86, 20);
		getContentPane().add(txtAlto);

		txtAlto.setColumns(10);
		txtFondo = new JTextField("" + Proyecto.fondo0);
		txtFondo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtFondo.setEditable(false);
		txtFondo.setBounds(121, 130, 86, 20);
		getContentPane().add(txtFondo);

		txtFondo.setColumns(10);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 8, 89, 23);
		getContentPane().add(btnCerrar);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboCodigo) {
			actionPerformedCboCodigo(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}

	protected void actionPerformedCboCodigo(ActionEvent arg0) {
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
}