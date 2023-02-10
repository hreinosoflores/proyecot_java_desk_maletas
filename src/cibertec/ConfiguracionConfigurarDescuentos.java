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

public class ConfiguracionConfigurarDescuentos extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lbl1a3Maletas;
	private JLabel lbl4a5Maletas;
	private JLabel lbl6a8Maletas;
	private JLabel lblMasDe8Maletas;
	private JTextField txt1a3Maletas;
	private JTextField txt4a5Maletas;
	private JTextField txt6a8Maletas;
	private JTextField txtMasDe8Maletas;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/** * Launch the application. */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionConfigurarDescuentos dialog = new ConfiguracionConfigurarDescuentos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** * Create the dialog. */
	public ConfiguracionConfigurarDescuentos() {
		setTitle("Configuraci\u00f3n | Configurar Porcentajes De Descuentos");
		setBounds(100, 100, 400, 150);
		getContentPane().setLayout(null);

		lbl1a3Maletas = new JLabel("1 a 3 maletas");
		lbl1a3Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl1a3Maletas.setBounds(10, 11, 135, 14);
		getContentPane().add(lbl1a3Maletas);

		lbl4a5Maletas = new JLabel("4 a 5 maletas");
		lbl4a5Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl4a5Maletas.setBounds(10, 36, 135, 14);
		getContentPane().add(lbl4a5Maletas);

		lbl6a8Maletas = new JLabel("6 a 8 maletas");
		lbl6a8Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl6a8Maletas.setBounds(10, 61, 135, 14);
		getContentPane().add(lbl6a8Maletas);

		lblMasDe8Maletas = new JLabel("M\u00E1s de 8 maletas");
		lblMasDe8Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblMasDe8Maletas.setBounds(10, 86, 135, 14);
		getContentPane().add(lblMasDe8Maletas);

		txt1a3Maletas = new JTextField("" + Proyecto.porcentaje1);
		txt1a3Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txt1a3Maletas.setBounds(155, 8, 86, 20);
		txt1a3Maletas.setColumns(10);
		getContentPane().add(txt1a3Maletas);

		txt4a5Maletas = new JTextField("" + Proyecto.porcentaje2);
		txt4a5Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txt4a5Maletas.setBounds(155, 33, 86, 20);
		txt4a5Maletas.setColumns(10);
		getContentPane().add(txt4a5Maletas);

		txt6a8Maletas = new JTextField("" + Proyecto.porcentaje3);
		txt6a8Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txt6a8Maletas.setBounds(155, 58, 86, 20);
		txt6a8Maletas.setColumns(10);
		getContentPane().add(txt6a8Maletas);

		txtMasDe8Maletas = new JTextField("" + Proyecto.porcentaje4);
		txtMasDe8Maletas.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtMasDe8Maletas.setBounds(155, 83, 86, 20);
		txtMasDe8Maletas.setColumns(10);
		getContentPane().add(txtMasDe8Maletas);

		lbl1 = new JLabel("%");
		lbl1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl1.setBounds(251, 10, 14, 14);
		getContentPane().add(lbl1);

		lbl2 = new JLabel("%");
		lbl2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl2.setBounds(251, 36, 14, 14);
		getContentPane().add(lbl2);

		lbl3 = new JLabel("%");
		lbl3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl3.setBounds(251, 61, 14, 14);
		getContentPane().add(lbl3);

		lbl4 = new JLabel("%");
		lbl4.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lbl4.setBounds(251, 86, 14, 14);
		getContentPane().add(lbl4);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(275, 7, 100, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(275, 32, 100, 23);
		getContentPane().add(btnCancelar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {
		try {
			Proyecto.porcentaje1 = Double.parseDouble(txt1a3Maletas.getText());
			Proyecto.porcentaje2 = Double.parseDouble(txt4a5Maletas.getText());
			Proyecto.porcentaje3 = Double.parseDouble(txt6a8Maletas.getText());
			Proyecto.porcentaje4 = Double.parseDouble(txtMasDe8Maletas.getText());
			dispose();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Entrada inv\u00e1lida, ingrese un n\u00famero");
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}