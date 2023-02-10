package cibertec;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MantenimientoListarMaletas extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnListar;
	private JButton btnCerrar;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoListarMaletas dialog = new MantenimientoListarMaletas();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public MantenimientoListarMaletas() {
		setFont(new Font("Monospaced", Font.PLAIN, 13));
		getContentPane().setFont(new Font("Monospaced", Font.PLAIN, 13));
		setTitle("Mantenimiento | Listar Maletas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 205);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);

		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnListar.addActionListener(this);
		btnListar.setBounds(335, 227, 89, 23);
		getContentPane().add(btnListar);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(10, 227, 89, 23);
		getContentPane().add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		// mt0
		txtS.setText("C\u00f3digo: " + Proyecto.codigo0 + "\n");
		txtS.append("Modelo: " + Proyecto.modelo0 + "\n");
		txtS.append("Precio: " + String.format("%.2f", Proyecto.precio0) + "\n");
		txtS.append("Ancho: " + String.format("%.2f", Proyecto.ancho0) + "\n");
		txtS.append("Alto: " + String.format("%.2f", Proyecto.alto0) + "\n");
		txtS.append("Fondo: " + String.format("%.2f", Proyecto.fondo0) + "\n\n");

		// mt1
		txtS.append("C\u00f3digo: " + Proyecto.codigo1 + "\n");
		txtS.append("Modelo: " + Proyecto.modelo1 + "\n");
		txtS.append("Precio: " + String.format("%.2f", Proyecto.precio1) + "\n");
		txtS.append("Ancho: " + String.format("%.2f", Proyecto.ancho1) + "\n");
		txtS.append("Alto: " + String.format("%.2f", Proyecto.alto1) + "\n");
		txtS.append("Fondo: " + String.format("%.2f", Proyecto.fondo1) + "\n\n");

		// mt2
		txtS.append("C\u00f3digo: " + Proyecto.codigo2 + "\n");
		txtS.append("Modelo: " + Proyecto.modelo2 + "\n");
		txtS.append("Precio: " + String.format("%.2f", Proyecto.precio2) + "\n");
		txtS.append("Ancho: " + String.format("%.2f", Proyecto.ancho2) + "\n");
		txtS.append("Alto: " + String.format("%.2f", Proyecto.alto2) + "\n");
		txtS.append("Fondo: " + String.format("%.2f", Proyecto.fondo2) + "\n\n");

		// mt3
		txtS.append("C\u00f3digo: " + Proyecto.codigo3 + "\n");
		txtS.append("Modelo: " + Proyecto.modelo3 + "\n");
		txtS.append("Precio: " + String.format("%.2f", Proyecto.precio3) + "\n");
		txtS.append("Ancho: " + String.format("%.2f", Proyecto.ancho3) + "\n");
		txtS.append("Alto: " + String.format("%.2f", Proyecto.alto3) + "\n");
		txtS.append("Fondo: " + String.format("%.2f", Proyecto.fondo3) + "\n\n");

		// mt4
		txtS.append("C\u00f3digo: " + Proyecto.codigo4 + "\n");
		txtS.append("Modelo: " + Proyecto.modelo4 + "\n");
		txtS.append("Precio: " + String.format("%.2f", Proyecto.precio4) + "\n");
		txtS.append("Ancho: " + String.format("%.2f", Proyecto.ancho4) + "\n");
		txtS.append("Alto: " + String.format("%.2f", Proyecto.alto4) + "\n");
		txtS.append("Fondo: " + String.format("%.2f", Proyecto.fondo4));
	}
}