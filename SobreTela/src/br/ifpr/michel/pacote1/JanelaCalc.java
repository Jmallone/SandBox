package br.ifpr.michel.pacote1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class JanelaCalc extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVisor;
	private JTextArea txaHistory;
	String operacao = "";
	String memoria = "";
	
	// Rotina para colocar o numero apertado na tela
	public void clickNumero(String umNumero){
		String tmp = txtVisor.getText();
		tmp = tmp+umNumero;
		txtVisor.setText(tmp);
	}
	
	//Rotina para saber qual operação o usuario selecionou
	public void clickOp(String umaOp){
		if (operacao != "")
		{
			clickIgual();
		}
		operacao = umaOp;
		memoria = txtVisor.getText();
		txtVisor.setText( "" );
		txaHistory.append(memoria);
		txaHistory.append(operacao);
	}
	
	//Rotina para mostrar o resultado
	public void clickIgual(){
		int num1 = Integer.parseInt(memoria);
		String tmp = txtVisor.getText();
		txaHistory.append(tmp);
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
		txaHistory.append(" = ");
		txaHistory.append(tmp);
		txaHistory.append("\n");
		txtVisor.setText( tmp );
		memoria = "";
		operacao = "";
	}
	
	//Rotina de Limpeza, usada no botao "C" e "Voltar"
	public void clickClear()
	{
		txtVisor.setText("");
		operacao = "";
		memoria = "";
		txaHistory.setText("");
		
	}
	
	public JanelaCalc() {
		setBounds(100, 100, 450, 275);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtVisor = new JTextField();
			txtVisor.setBounds(10, 11, 234, 20);
			contentPanel.add(txtVisor);
			txtVisor.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickClear();
				}
			});
			btnNewButton.setBounds(10, 42, 50, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton button = new JButton("+");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickOp("+");
				}
			});
			button.setBounds(74, 42, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("-");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickOp("-");
				}
			});
			button.setBounds(134, 42, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("9");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("9");
				}
			});
			button.setBounds(134, 77, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("8");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("8");
				}
			});
			button.setBounds(74, 77, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("7");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("7");
				}
			});
			button.setBounds(10, 77, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("3");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("3");
				}
			});
			button.setBounds(134, 146, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("2");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("2");
				}
			});
			button.setBounds(74, 146, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("1");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("1");
				}
			});
			button.setBounds(10, 146, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("5");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("5");
				}
			});
			button.setBounds(74, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("4");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("4");
				}
			});
			button.setBounds(10, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("6");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("6");
				}
			});
			button.setBounds(134, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("=");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 clickIgual();
				}
			});
			button.setBounds(194, 42, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickOp("x");
				}
			});
			btnX.setBounds(194, 77, 50, 23);
			contentPanel.add(btnX);
		}
		{
			JButton button = new JButton("/");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickOp("/");
				}
			});
			button.setBounds(194, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton(".");
			button.setBounds(10, 180, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("0");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero("0");
				}
			});
			button.setBounds(74, 180, 110, 23);
			contentPanel.add(button);
		}
		
		txaHistory = new JTextArea();
		txaHistory.setBounds(254, 10, 178, 194);
		contentPanel.add(txaHistory);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Voltar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						clickClear();
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
