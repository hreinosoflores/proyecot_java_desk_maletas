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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentasGenerarReportes extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblReporte;
	private JComboBox<String> cboReporte;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private double precioPromedio = (Proyecto.precio0 + Proyecto.precio1 + Proyecto.precio2 + Proyecto.precio3
			+ Proyecto.precio4) / 5;
	private double anchoPromedio = (Proyecto.ancho0 + Proyecto.ancho1 + Proyecto.ancho2 + Proyecto.ancho3
			+ Proyecto.ancho4) / 5;
	private double altoPromedio = (Proyecto.alto0 + Proyecto.alto1 + Proyecto.alto2 + Proyecto.alto3 + Proyecto.alto4)
			/ 5;
	private double fondoPromedio = (Proyecto.fondo0 + Proyecto.fondo1 + Proyecto.fondo2 + Proyecto.fondo3
			+ Proyecto.fondo4) / 5;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasGenerarReportes dialog = new VentasGenerarReportes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public VentasGenerarReportes() {
		setTitle("Ventas | Generar Reportes");
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(null);

		lblReporte = new JLabel("Tipo de reporte");
		lblReporte.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblReporte.setBounds(10, 11, 120, 14);
		getContentPane().add(lblReporte);

		cboReporte = new JComboBox<String>();
		cboReporte.setFont(new Font("Monospaced", Font.PLAIN, 13));
		cboReporte.addActionListener(this);
		cboReporte.setModel(new DefaultComboBoxModel<String>(new String[] { "Ventas por maleta",
				"Maletas con venta \u00F3ptima", "Maletas con precios mayores al precio promedio",
				"Maletas con precios menores al precio promedio", "Precios menor, mayor y promedio" }));
		cboReporte.setBounds(140, 8, 339, 20);
	
		getContentPane().add(cboReporte);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(489, 7, 85, 23);
		getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 564, 364);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		//Primer Reporte
		cboReporte.setSelectedIndex(0);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboReporte) {
			actionPerformedCboReporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedCboReporte(ActionEvent e) {
		int cantMaletas = 0;
		int contadorMaleta;
		int posReporte = cboReporte.getSelectedIndex();
		switch (posReporte) {
		case 0:
			txtS.setText("VENTAS POR MALETA" + "\n\n");
			EscribirVentasPorMaleta(Proyecto.codigo0, Proyecto.modelo0, Proyecto.cantidadVentas0,
					Proyecto.cantidadMaletasVendidas0, Proyecto.importeTotalAcumulado0);
			EscribirVentasPorMaleta(Proyecto.codigo1, Proyecto.modelo1, Proyecto.cantidadVentas1,
					Proyecto.cantidadMaletasVendidas1, Proyecto.importeTotalAcumulado1);
			EscribirVentasPorMaleta(Proyecto.codigo2, Proyecto.modelo2, Proyecto.cantidadVentas2,
					Proyecto.cantidadMaletasVendidas2, Proyecto.importeTotalAcumulado2);
			EscribirVentasPorMaleta(Proyecto.codigo3, Proyecto.modelo3, Proyecto.cantidadVentas3,
					Proyecto.cantidadMaletasVendidas3, Proyecto.importeTotalAcumulado3);
			EscribirVentasPorMaleta(Proyecto.codigo4, Proyecto.modelo4, Proyecto.cantidadVentas4,
					Proyecto.cantidadMaletasVendidas4, Proyecto.importeTotalAcumulado4);
			txtS.append("Importe total acumulado general: S/."
					+ String.format("%.2f", Proyecto.importeTotalAcumuladoGeneral));
			break;
		case 1:
			txtS.setText("MALETAS CON VENTA \u00d3PTIMA" + "\n\n");
			EscribirMaletasConVentasOptimas(Proyecto.cantidadMaletasVendidas0, Proyecto.codigo0, Proyecto.modelo0);
			EscribirMaletasConVentasOptimas(Proyecto.cantidadMaletasVendidas1, Proyecto.codigo1, Proyecto.modelo1);
			EscribirMaletasConVentasOptimas(Proyecto.cantidadMaletasVendidas2, Proyecto.codigo2, Proyecto.modelo2);
			EscribirMaletasConVentasOptimas(Proyecto.cantidadMaletasVendidas3, Proyecto.codigo3, Proyecto.modelo3);
			EscribirMaletasConVentasOptimas(Proyecto.cantidadMaletasVendidas4, Proyecto.codigo4, Proyecto.modelo4);
			break;
		case 2:
			txtS.setText("MALETAS CON PRECIOS MAYORES AL PRECIO PROMEDIO" + "\n\n");
			contadorMaleta = EscribirMaletasMayoresAlPromedio(Proyecto.precio0, Proyecto.modelo0);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMayoresAlPromedio(Proyecto.precio1, Proyecto.modelo1);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMayoresAlPromedio(Proyecto.precio2, Proyecto.modelo2);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMayoresAlPromedio(Proyecto.precio3, Proyecto.modelo3);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMayoresAlPromedio(Proyecto.precio4, Proyecto.modelo4);
			cantMaletas += contadorMaleta;
			txtS.append("Cantidad de maletas: " + cantMaletas);
			break;
		case 3:
			txtS.setText("MALETAS CON PRECIOS MENORES AL PRECIO PROMEDIO" + "\n\n");
			contadorMaleta = EscribirMaletasMenoresAlPromedio(Proyecto.precio0, Proyecto.modelo0);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMenoresAlPromedio(Proyecto.precio1, Proyecto.modelo1);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMenoresAlPromedio(Proyecto.precio2, Proyecto.modelo2);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMenoresAlPromedio(Proyecto.precio3, Proyecto.modelo3);
			cantMaletas += contadorMaleta;
			contadorMaleta = EscribirMaletasMenoresAlPromedio(Proyecto.precio4, Proyecto.modelo4);
			cantMaletas += contadorMaleta;
			txtS.append("Cantidad de maletas: " + cantMaletas);
			break;
		default:
			txtS.setText("PROMEDIOS, M\u00c1XIMOS Y M\u00cdNIMOS" + "\n\n");
			EscribirPromedioMaximoMinimo("Precio");
			EscribirPromedioMaximoMinimo("Ancho");
			EscribirPromedioMaximoMinimo("Alto");
			EscribirPromedioMaximoMinimo("Fondo");
		}
	}

	private void EscribirPromedioMaximoMinimo(String item) {
		double itemPromedio, itemMinimo, itemMaximo;
		switch (item) {
		case "Precio":
			itemPromedio = precioPromedio;
			itemMinimo = minimo(Proyecto.precio0, Proyecto.precio1, Proyecto.precio2, Proyecto.precio3,
					Proyecto.precio4);
			itemMaximo = maximo(Proyecto.precio0, Proyecto.precio1, Proyecto.precio2, Proyecto.precio3,
					Proyecto.precio4);
			break;
		case "Ancho":
			itemPromedio = anchoPromedio;
			itemMinimo = minimo(Proyecto.ancho0, Proyecto.ancho1, Proyecto.ancho2, Proyecto.ancho3, Proyecto.ancho4);
			itemMaximo = maximo(Proyecto.ancho0, Proyecto.ancho1, Proyecto.ancho2, Proyecto.ancho3, Proyecto.ancho4);
			break;
		case "Alto":
			itemPromedio = altoPromedio;
			itemMinimo = minimo(Proyecto.alto0, Proyecto.alto1, Proyecto.alto2, Proyecto.alto3, Proyecto.alto4);
			itemMaximo = maximo(Proyecto.alto0, Proyecto.alto1, Proyecto.alto2, Proyecto.alto3, Proyecto.alto4);
			break;
		default:
			itemPromedio = fondoPromedio;
			itemMinimo = minimo(Proyecto.fondo0, Proyecto.fondo1, Proyecto.fondo2, Proyecto.fondo3, Proyecto.fondo4);
			itemMaximo = maximo(Proyecto.fondo0, Proyecto.fondo1, Proyecto.fondo2, Proyecto.fondo3, Proyecto.fondo4);
			break;
		}

		if (item == "Precio") {
			txtS.append(item + " promedio: S/." + String.format("%.2f", itemPromedio) + "\n");
			txtS.append(item + " m\u00ednimo: S/." + String.format("%.2f", itemMinimo) + "\n");
			txtS.append(item + " m\u00e1ximo: S/." + String.format("%.2f", itemMaximo) + "\n\n");
		} else {
			txtS.append(item + " promedio: " + String.format("%.2f", itemPromedio) + "cm.\n");
			txtS.append(item + " m\u00ednimo: " + String.format("%.2f", itemMinimo) + "cm.\n");
			txtS.append(item + " m\u00e1ximo: " + String.format("%.2f", itemMaximo) + "cm.\n\n");
		}

	}

	private double minimo(double a, double b, double c, double d, double e) {
		double minimo = a;
		if (minimo > b)
			minimo = b;
		if (minimo > c)
			minimo = c;
		if (minimo > d)
			minimo = d;
		if (minimo > e)
			minimo = e;
		return minimo;
	}

	private double maximo(double a, double b, double c, double d, double e) {
		double maximo = a;
		if (maximo < b)
			maximo = b;
		if (maximo < c)
			maximo = c;
		if (maximo < d)
			maximo = d;
		if (maximo < e)
			maximo = e;
		return maximo;
	}

	private int EscribirMaletasMayoresAlPromedio(double precio, String modelo) {
		if (precio >= precioPromedio) {
			txtS.append("Modelo: " + modelo + "\n");
			txtS.append("Precio: S/." + String.format("%.2f", precio) + "\n\n");
			return 1;
		}
		return 0;
	}

	private int EscribirMaletasMenoresAlPromedio(double precio, String modelo) {
		if (precio <= precioPromedio) {
			txtS.append("Modelo: " + modelo + "\n");
			txtS.append("Precio: S/." + String.format("%.2f", precio) + "\n\n");
			return 1;
		}
		return 0;
	}

	private void EscribirMaletasConVentasOptimas(int cantidadMaletasVendidas, String codigo, String modelo) {
		if (cantidadMaletasVendidas >= Proyecto.cantidadOptima) {
			txtS.append("C\u00f3digo: " + codigo + "\n");
			txtS.append("Modelo: " + modelo + "\n");
			txtS.append("Cantidad total de maletas vendidas: " + cantidadMaletasVendidas + "\n\n");
		}

	}

	private void EscribirVentasPorMaleta(String codigo, String modelo, int cantidadVentas, int cantidadMaletasVendidas,
			double importeTotalAcumulado) {
		txtS.append("C\u00f3digo: " + codigo + "\n");
		txtS.append("Modelo: " + modelo + "\n");
		txtS.append("Cantidad total de ventas: " + cantidadVentas + "\n");
		txtS.append("Cantidad total de maletas vendidas: " + cantidadMaletasVendidas + "\n");
		txtS.append("Importe total acumulado: S/." + String.format("%.2f", importeTotalAcumulado) + "\n\n");

	}
}