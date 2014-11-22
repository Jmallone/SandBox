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
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 130, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClickIniciar();
			}
		});
		btnIniciar.setBounds(10, 47, 91, 23);
		contentPane.add(btnIniciar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnSair.setBounds(10, 81, 91, 23);
		contentPane.add(btnSair);
		
		JLabel lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setBounds(10, 11, 102, 14);
		contentPane.add(lblMenuPrincipal);
	}
}
