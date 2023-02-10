package cibertec;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AyudaAcercaDeTienda extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lblTienda;
	private JLabel lblAutores;
	private JButton btnCerrar;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AyudaAcercaDeTienda dialog = new AyudaAcercaDeTienda();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public AyudaAcercaDeTienda() {
		setTitle("Ayuda | Acerca De Tienda");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("TIENDA MALETAS");
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienda.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblTienda.setBounds(10, 11, 414, 39);
		getContentPane().add(lblTienda);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblAutores.setBounds(10, 61, 414, 14);
		getContentPane().add(lblAutores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(113, 227, 208, 23);
		getContentPane().add(btnCerrar);

		JLabel label1 = new JLabel("Salcedo Retamozo Leonel Alexander\r\n");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(10, 86, 414, 14);
		getContentPane().add(label1);

		JLabel label2 = new JLabel("Reinoso Flores, Humberto Daniel\n");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(10, 111, 414, 14);
		getContentPane().add(label2);

		JLabel label3 = new JLabel("Salvador Sanchez, Alvaro Marcelo");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(10, 136, 414, 14);
		getContentPane().add(label3);

		JLabel label4 = new JLabel("Sotomayor Alhuay, Mariangeles Karol");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(10, 160, 414, 14);
		getContentPane().add(label4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}