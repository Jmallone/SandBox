package br.ifpr.michel.pacote1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtVisor;
	String operacao = "";
	String memoria = "";
	/**
	 * Launch the application.
	 */
	public void clickNumero(String umNumero){
		String tmp = txtVisor.getText();
		tmp = tmp+umNumero;
		txtVisor.setText(tmp);
	}
	
	public void clickOp(String umaOp){
		if (operacao != "")
		{
			clickIgual();
		}
		operacao = umaOp;
		memoria = txtVisor.getText();
		txtVisor.setText( "" );
	}
	
	public void clickIgual(){
		int num1 = Integer.parseInt(memoria);
		String tmp = txtVisor.getText();
		int num2 = Integer.parseInt(tmp);
		int resultado = 0;
		switch (operacao) {
			case "+":
					resultado = num1+num2;
				break;
				
			case "-":
				resultado = num1-num2;
			break;
			
			case "x":
				resultado = num1*num2;
			break;
			
			case "/":
				resultado = num1/num2;
			break;
		}
		tmp = Integer.toString(resultado);
		txtVisor.setText( tmp );
		memoria = "";
		operacao = "";
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 239, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtVisor = new JTextField();
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setBounds(0, 0, 231, 31);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("4");
			}
		});
		button.setBounds(10, 110, 41, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("5");
			}
		});
		button_1.setBounds(61, 110, 41, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("6");
			}
		});
		button_2.setBounds(112, 110, 41, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("9");
			}
		});
		button_3.setBounds(112, 76, 41, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("8");
			}
		});
		button_4.setBounds(61, 76, 41, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("7");
			}
		});
		button_5.setBounds(10, 76, 41, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("3");
			}
		});
		button_6.setBounds(112, 144, 41, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("2");
			}
		});
		button_7.setBounds(61, 144, 41, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("1");
			}
		});
		button_8.setBounds(10, 144, 41, 23);
		contentPane.add(button_8);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnC.setBounds(10, 42, 92, 23);
		contentPane.add(btnC);
		
		JButton button_10 = new JButton(".");
		button_10.setBounds(10, 178, 41, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickNumero("0");
			}
		});
		button_11.setBounds(61, 178, 41, 23);
		contentPane.add(button_11);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickOp("+");
			}
		});
		button_9.setBounds(163, 76, 52, 23);
		contentPane.add(button_9);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickOp("-");
			}
		});
		button_12.setBounds(163, 110, 52, 23);
		contentPane.add(button_12);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickOp("x");
			}
		});
		btnX.setBounds(163, 42, 52, 23);
		contentPane.add(btnX);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickOp("/");
			}
		});
		button_14.setBounds(112, 42, 41, 23);
		contentPane.add(button_14);
		
		JButton bttIgual = new JButton("=");
		bttIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickIgual();
			}
		});
		bttIgual.setBounds(163, 144, 52, 56);
		contentPane.add(bttIgual);
	}
}
