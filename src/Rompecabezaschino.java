import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Rompecabezaschino extends JFrame {

	private JPanel contentPane;

	private JButton[] fichas;
	private int[] tablero;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezaschino frame = new Rompecabezaschino();
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
	public Rompecabezaschino() {

		List<String> values = Arrays.asList("1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15", "");
		Collections.shuffle(values);
		System.out.println(values);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 128));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));



		//Botones


		fichas = new JButton[16];
		tablero = new int[16];
		for (int i = 0; i < 16; i++) {
			final int indice = i;
			JButton botones = new JButton();
			botones.setBackground(new Color(255, 128, 0));
			if (i < 16) {
				botones.setText(values.get(i));
			} else {
				botones.setText("");
			}
			botones.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jugar(indice);
				}
			});
			panel.add(botones);
			fichas[i] = botones;
		}


		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 128, 128));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 128));
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(255, 128, 128));
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		contentPane.add(panel_3, BorderLayout.SOUTH);



		JButton revolver = new JButton("Recombinar");
		revolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recombinar();
			}
		});
		panel_3.add(revolver);






		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 128, 128));
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 128));
		contentPane.add(panel_4, BorderLayout.EAST);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(new Color(255, 128, 128));
		panel_4.add(lblNewLabel_3);
	}

	private void jugar(int index) {

	}


	//La funcion recombinar ya revuelve los botones

	private void recombinar() {
		List<String> values = Arrays.asList("1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15","");
		Collections.shuffle(values);
		for (int i = 0; i < 16; i++) {
			fichas[i].setText(values.get(i));
		}
	}
}
