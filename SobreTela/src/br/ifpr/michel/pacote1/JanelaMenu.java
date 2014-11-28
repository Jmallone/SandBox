package br.ifpr.michel.pacote1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class JanelaMenu extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	JanelaCalc umaJanela = new JanelaCalc();
	
	public void ClickIniciar(){
		umaJanela.setModal(true);
		umaJanela.setVisible(true);
	}
	public JanelaMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\IFPR\\SandBox\\SobreTela\\img\\1417143814_List_bullets.png"));
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 215, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClickIniciar();
			}
		});
		btnIniciar.setBounds(10, 104, 170, 48);
		contentPane.add(btnIniciar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnSair.setBounds(10, 163, 170, 48);
		contentPane.add(btnSair);
		
		JLabel lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setForeground(Color.DARK_GRAY);
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setBounds(0, 10, 218, 83);
		contentPane.add(lblMenuPrincipal);
	}
}
