package imc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Imc extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel lblResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc frame = new Imc();
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
	public Imc() {
		setResizable(false);
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// bot縊 sobre
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "IMC ver 1.0\nAutor: Jos� de Assis", "Sobre",
						JOptionPane.DEFAULT_OPTION);
			}
		});
		btnSobre.setBounds(0, 0, 89, 23);
		contentPane.add(btnSobre);

		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setBounds(25, 62, 48, 14);
		contentPane.add(lblNewLabel);

		txtPeso = new JTextField();
		txtPeso.setBounds(76, 59, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(25, 105, 48, 14);
		contentPane.add(lblNewLabel_1);

		txtAltura = new JTextField();
		txtAltura.setBounds(76, 102, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("Calcular IMC");
		btnCalcular.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc.png")));
		btnCalcular.setBounds(25, 160, 64, 64);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso.setText(null);
				txtAltura.setText(null);
				lblResultado.setText(null);
				lblStatus.setText(null);
				lblStatus.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc0.png")));
			}
		});
		btnLimpar.setIcon(new ImageIcon(Imc.class.getResource("/icones/borracha.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(125, 160, 64, 64);
		contentPane.add(btnLimpar);

		JLabel lblNewLabel_2 = new JLabel("IMC:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(25, 257, 48, 14);
		contentPane.add(lblNewLabel_2);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(83, 253, 64, 23);
		contentPane.add(lblResultado);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc0.png")));
		lblStatus.setBounds(279, 24, 111, 302);
		contentPane.add(lblStatus);
	}// fim do construtor
		// metode para calcular o IMC

	void calcular() {
		double peso, altura, imc;
		// entrada
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));    	
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
		// processamento
		imc = peso / (altura * altura);
		// saida
		lblResultado.setText("" + imc);
		// status
		if (imc < 17) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc1.png")));

		} else if (imc >= 17 && imc < 18.5) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc2.png")));

		} else if (imc >= 18.5 && imc < 24.99) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc3.png")));

		} else if (imc >= 25 && imc < 29.99) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc4.png")));

		} else if (imc >= 30 && imc < 34.99) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc5.png")));

		} else if (imc >= 35 && imc < 39.99) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc6.png")));

		} else if (imc >= 40) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc7.png")));

		}

	}
}
