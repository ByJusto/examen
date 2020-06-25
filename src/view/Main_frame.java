package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main_frame extends JFrame {

	private JPanel contentPane;
	
	private JTable tableA;
	private JTable tableB;
	private JTable tableC;
	private JTable tableD;
	private JTable tableE;
	private JTable tableF;
	private JTable tableG;
	private JTable tableH;
	private JButton buttonListadoAlfabetico;
	private JButton buttonListadoGrupos;
	private JButton buttonBorrar;
	private JButton buttonSorteo;


	public JTable getTableA() {
		return tableA;
	}

	public JTable getTableB() {
		return tableB;
	}

	public JTable getTableC() {
		return tableC;
	}

	public JTable getTableD() {
		return tableD;
	}

	public JTable getTableE() {
		return tableE;
	}

	public JTable getTableF() {
		return tableF;
	}

	public JTable getTableG() {
		return tableG;
	}

	public JTable getTableH() {
		return tableH;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_frame frame = new Main_frame();
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
	public Main_frame() {
		
		setTitle("Sorteo Champions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panelSorteo = new JPanel();

		JPanel panelBotones = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelBotones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
						.addComponent(panelSorteo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panelSorteo, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE).addGap(18)
						.addComponent(panelBotones, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		panelBotones.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		buttonBorrar = new JButton("Borrar");
		
		buttonListadoAlfabetico = new JButton("Listado alfabeticamente");

		panelBotones.add(buttonListadoAlfabetico);

		buttonListadoGrupos = new JButton("Listado por grupos");

		panelBotones.add(buttonListadoGrupos);
		panelBotones.add(buttonBorrar);

		buttonSorteo = new JButton("Realizar sorteo");
		
		panelBotones.add(buttonSorteo);
		panelSorteo.setLayout(new GridLayout(2, 4, 0, 0));

		JPanel panelA = new JPanel();
		panelSorteo.add(panelA);
		panelA.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panelA.add(scrollPane, BorderLayout.CENTER);

		 tableA = new JTable();
		scrollPane.setViewportView(tableA);

		JPanel panelB = new JPanel();
		panelSorteo.add(panelB);
		panelB.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		panelB.add(scrollPane_1, BorderLayout.CENTER);

		tableB = new JTable();
		scrollPane_1.setViewportView(tableB);

		JPanel panelC = new JPanel();
		panelSorteo.add(panelC);
		panelC.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_2 = new JScrollPane();
		panelC.add(scrollPane_2, BorderLayout.CENTER);

		tableC = new JTable();
		scrollPane_2.setViewportView(tableC);

		JPanel panelD = new JPanel();
		panelSorteo.add(panelD);
		panelD.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_3 = new JScrollPane();
		panelD.add(scrollPane_3, BorderLayout.CENTER);

		tableD = new JTable();
		scrollPane_3.setViewportView(tableD);

		JPanel panelE = new JPanel();
		panelSorteo.add(panelE);
		panelE.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_4 = new JScrollPane();
		panelE.add(scrollPane_4, BorderLayout.CENTER);

		tableE = new JTable();
		scrollPane_4.setViewportView(tableE);

		JPanel panelF = new JPanel();
		panelSorteo.add(panelF);
		panelF.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_5 = new JScrollPane();
		panelF.add(scrollPane_5, BorderLayout.CENTER);

		tableF = new JTable();
		scrollPane_5.setViewportView(tableF);

		JPanel panelG = new JPanel();
		panelSorteo.add(panelG);
		panelG.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_6 = new JScrollPane();
		panelG.add(scrollPane_6, BorderLayout.CENTER);

		tableG = new JTable();
		scrollPane_6.setViewportView(tableG);

		JPanel panelH = new JPanel();
		panelSorteo.add(panelH);
		panelH.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_7 = new JScrollPane();
		panelH.add(scrollPane_7, BorderLayout.CENTER);

		tableH = new JTable();
		scrollPane_7.setViewportView(tableH);
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getButtonListadoAlfabetico() {
		return buttonListadoAlfabetico;
	}

	public JButton getButtonListadoGrupos() {
		return buttonListadoGrupos;
	}

	public JButton getButtonBorrar() {
		return buttonBorrar;
	}

	public JButton getButtonSorteo() {
		return buttonSorteo;
	}
}
