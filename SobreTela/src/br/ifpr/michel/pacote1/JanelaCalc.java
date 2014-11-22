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

public class JanelaCalc extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;


	/**
	 * Create the dialog.
	 */
	public JanelaCalc() {
		setBounds(100, 100, 262, 275);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(10, 11, 234, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("C");
			btnNewButton.setBounds(10, 42, 50, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton button = new JButton("+");
			button.setBounds(74, 42, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("-");
			button.setBounds(134, 42, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("9");
			button.setBounds(134, 77, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("8");
			button.setBounds(74, 77, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("7");
			button.setBounds(10, 77, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("3");
			button.setBounds(134, 146, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("2");
			button.setBounds(74, 146, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("1");
			button.setBounds(10, 146, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("5");
			button.setBounds(74, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("4");
			button.setBounds(10, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("6");
			button.setBounds(134, 111, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("=");
			button.setBounds(194, 42, 50, 23);
			contentPanel.add(button);
		}
		{
			JButton btnX = new JButton("X");
			btnX.setBounds(194, 77, 50, 23);
			contentPanel.add(btnX);
		}
		{
			JButton button = new JButton("/");
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
			button.setBounds(74, 180, 110, 23);
			contentPanel.add(button);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
