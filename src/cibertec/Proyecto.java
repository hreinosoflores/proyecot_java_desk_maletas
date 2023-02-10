package cibertec;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Proyecto extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JMenuBar menuProyecto;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarMaleta;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmListarMaletas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
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
	public Proyecto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/maleta.png")));
		setTitle("TIENDA MALETAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		menuProyecto = new JMenuBar();
		menuProyecto.setFont(new Font("Monospaced", Font.PLAIN, 13));
		setJMenuBar(menuProyecto);

		mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		menuProyecto.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Monospaced", Font.PLAIN, 13));
		menuProyecto.add(mnMantenimiento);

		mntmConsultarMaleta = new JMenuItem("Consultar maleta");
		mntmConsultarMaleta.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmConsultarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmConsultarMaleta);

		mntmModificarMaleta = new JMenuItem("Modificar maleta ");
		mntmModificarMaleta.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmModificarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmModificarMaleta);

		mntmListarMaletas = new JMenuItem("Listar maletas ");
		mntmListarMaletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmListarMaletas.addActionListener(this);
		mnMantenimiento.add(mntmListarMaletas);

		mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		menuProyecto.add(mnVentas);

		mntmVender = new JMenuItem("Vender ");
		mntmVender.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);

		mntmGenerarReportes = new JMenuItem("Generar reportes ");
		mntmGenerarReportes.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);

		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Monospaced", Font.PLAIN, 13));
		menuProyecto.add(mnConfiguracion);

		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos ");
		mntmConfigurarDescuentos.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);

		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio ");
		mntmConfigurarObsequio.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequio);

		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de maletas vendidas ");
		mntmConfigurarCantidadptima.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadptima);

		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa ");
		mntmConfigurarPremioSorpresa.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarPremioSorpresa);

		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Monospaced", Font.PLAIN, 13));
		menuProyecto.add(mnAyuda);

		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda ");
		mntmAcercaDeTienda.setFont(new Font("Monospaced", Font.PLAIN, 13));
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		if (e.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(e);
		}
		if (e.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(e);
		}
		if (e.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(e);
		}
		if (e.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarMaletas) {
			actionPerformedMntmListarMaletas(e);
		}
		if (e.getSource() == mntmModificarMaleta) {
			actionPerformedMntmModificarMaleta(e);
		}
		if (e.getSource() == mntmConsultarMaleta) {
			actionPerformedMntmConsultarMaleta(e);
		}
	}

	protected void actionPerformedMntmConsultarMaleta(ActionEvent e) {
		MantenimientoConsultarMaleta dv = new MantenimientoConsultarMaleta();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);

	}

	protected void actionPerformedMntmModificarMaleta(ActionEvent e) {
		MantenimientoModificarMaleta dv = new MantenimientoModificarMaleta();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmListarMaletas(ActionEvent e) {
		MantenimientoListarMaletas dv = new MantenimientoListarMaletas();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		VentasVender dv = new VentasVender();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		VentasGenerarReportes dv = new VentasGenerarReportes();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		ConfiguracionConfigurarDescuentos dv = new ConfiguracionConfigurarDescuentos();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarObsequio(ActionEvent e) {
		ConfiguracionConfigurarObsequio dv = new ConfiguracionConfigurarObsequio();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent e) {
		ConfiguracionConfigurarCantidadOptimaDeMaletasVendidas dv = new ConfiguracionConfigurarCantidadOptimaDeMaletasVendidas();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent e) {
		ConfiguracionConfigurarPremioSorpresa dv = new ConfiguracionConfigurarPremioSorpresa();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmAcercaDeTienda(ActionEvent e) {
		AyudaAcercaDeTienda dv = new AyudaAcercaDeTienda();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}

	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}

	// Datos minimos del primer modelo
	public static String codigo0 = "MT0";
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;
	public static int cantidadVentas0;
	public static int cantidadMaletasVendidas0;
	public static double importeTotalAcumulado0;

	// Datos minimos del segundo modelo
	public static String codigo1 = "MT1";
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;
	public static int cantidadVentas1;
	public static int cantidadMaletasVendidas1;
	public static double importeTotalAcumulado1;

	// Datos minimos del tercer modelo
	public static String codigo2 = "MT2";
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;
	public static int cantidadVentas2;
	public static int cantidadMaletasVendidas2;
	public static double importeTotalAcumulado2;

	// Datos minimos del cuarto modelo
	public static String codigo3 = "MT3";
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;
	public static int cantidadVentas3;
	public static int cantidadMaletasVendidas3;
	public static double importeTotalAcumulado3;

	// Datos minimos del quinto modelo
	public static String codigo4 = "MT4";
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;
	public static int cantidadVentas4;
	public static int cantidadMaletasVendidas4;
	public static double importeTotalAcumulado4;

	// Porcentajes de descuento
	public static double porcentaje1 = 4.0;
	public static double porcentaje2 = 5.5;
	public static double porcentaje3 = 7.0;
	public static double porcentaje4 = 8.5;

	// Cantidad óptima de maletas vendidas
	public static int cantidadOptima = 50;
	public static double importeTotalAcumuladoGeneral;

	// Cantidad mínima de maletas adquiridas para obtener el obsequio
	public static int cantidadMinima = 20;

	// Obsequio
	public static String obsequio = "USB";

	// número de cliente que recibe el premio sorpresa (cliente 3,6,9,12,etc...)
	public static int contClientes;
	public static int numeroClientePremiado = 3;

	// premio sorpresa
	public static String premioSorpresa = "Una agenda";

	// contadores y acumuladores primer modelo
	public static int contventas0;
	public static int contmaletas0;
	public static double acumimporte0;

	// contadores y acumuladores segundo modelo
	public static int contventas1;
	public static int contmaletas1;
	public static double acumimporte1;

	// contadores y acumuladores tercer modelo
	public static int contventas2;
	public static int contmaletas2;
	public static double acumimporte2;

	// contadores y acumuladores cuarto modelo
	public static int contventas3;
	public static int contmaletas3;
	public static double acumimporte3;

	// contadores y acumuladores quinto modelo
	public static int contventas4;
	public static int contmaletas4;
	public static double acumimporte4;

}
