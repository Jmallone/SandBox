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
	public void clickNumero(String umNumero){ //umNumero recebe o valor do bot�o
		String tmp = txtVisor.getText(); // A String tmp recebe oque esta no visor
		tmp = tmp+umNumero; // tmp recebe ele mesmo e concatena com o valor do botao
		txtVisor.setText(tmp);// tmp � mostrado no visor
	}
	
	//Rotina para saber qual opera��o o usuario selecionou
	public void clickOp(String umaOp){ // umaOp recebe o valor do botao de opera��es
		if (operacao != "") // Compara se operacao existe algo
		{
			clickIgual(); // Se existir algo diferente de nulo, executa esta rotina
		}
		operacao = umaOp; // operacao recebe o valor de umaOp
		memoria = txtVisor.getText(); // memoria recebe o valor no visor
		txtVisor.setText( "" ); // O Visor � limpado
		txaHistory.append(memoria); // Imprimi o valor de memoria no TextArea
		txaHistory.append(operacao); // Imprimi a opera��o no TextArea
	}
	
	//Rotina para mostrar o resultado
	public void clickIgual(){
		int num1 = Integer.parseInt(memoria); // Criando variavel local e atribuindo a num1 o valor dentro da variavel memoria
		String tmp = txtVisor.getText(); // Variavel local, em tmp � atribuido oque esta no visor
		txaHistory.append(tmp); // No TextArea � imprimido o valor de tmp
		int num2 = Integer.parseInt(tmp); // Variavel Local num2 recebe o valor convertido de tmp
		int resultado = 0; // Variavel Local, para o resultado final
		switch (operacao) { // Switch de Opera�oes realizada pela calculadora, a variavel resultado recebe o "Resultado" da Opera�ao
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
		tmp = Integer.toString(resultado); // tmp recebe o valor convertido para String de resultado
		txaHistory.append(" = "); // Imprimi no TextArea " = "
		txaHistory.append(tmp); // Imprimi no TextArea o conteudo da string tmp
		txaHistory.append("\n");// Pula uma linha no TextArea 
		txtVisor.setText( tmp );// No visor � mostrado o valor de tmp
		memoria = ""; // memoria recebe nada
		operacao = ""; // operacao recebe nada
	}
	
	//Rotina de Limpeza, usada no botao "C" e "Voltar"
	public void clickClear()
	{
		txtVisor.setText(""); // No visor � imprimido nada
		memoria = ""; // memoria recebe nada
		operacao = ""; // operacao recebe nada
		txaHistory.setText("");//Todo o conteudo do TextArea � apagada
		
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
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clickNumero(",");
				}
			});
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
