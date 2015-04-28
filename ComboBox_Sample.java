package michel_30cm;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.ResultSet;
 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
 
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class Principal extends JFrame {
 
	private JPanel contentPane;
 
	/* Codigo do ComboBox começa aqui */
	static void Click(JComboBox comboBox){ // <-- Não altere saporra dessa linha vlw flw, deixe comboBox mesmo
		
		
		  String url = "jdbc:mysql://localhost:3306/caqui"; // Aqui você troca caqui pelo nome do seu banco de dados
		  String usr = "root";
		  String pwd = "ifpr123456"; // aqui troca sua senha
		
		
		comboBox.removeAllItems(); // Remove todos os Itens dentro do ComboBox
		
		try {
			
			String sql = "SELECT * from grupo_produtos"; // em grupos_produtos, coloque a tabela que quer pegar os nomes para preencher o comboBox 
			Connection conn = (Connection) DriverManager.getConnection( url, usr, pwd ); // faz a conexao com o banco de dados
			Statement sessao = (Statement) conn.createStatement(); // cria uma sessão 
			ResultSet resposta = sessao.executeQuery( sql ); // executa o comando que esta dentro da String sql
			
			while( resposta.next() ) {
				
				String umNome = resposta.getString( "Nome" ); // troca o "Nome" pelo seu campo dentro da tabela que voce quer colocar dentro do comboBox
				comboBox.addItem(umNome);// Adiciona um novo item no ComboBox
				
				// E assim fica no While(que é um loop) até adicionar todos os itens que tem na tabela
				
			}
		} catch( Exception e1 ) {
			JOptionPane.showMessageDialog(null, "Aconteceu um erro \n "+e1 ); // mostra uma mensagem se ouver erro 
		}
		
	}
	/* Codigo do ComboBox termina aqui */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* Isso o programa cria automaticamente quando voce adiciona um comboBox */
		JComboBox MeuComboLindu = new JComboBox();
		MeuComboLindu.setBounds(29, 76, 83, 20);
		contentPane.add(MeuComboLindu);
		/*fim do codigo criado automaticamente */
		
		
		/* coloque essa função no meio do codigo para quando iniciar o programa ja executar ele*/
		Click(MeuComboLindu);// Ira para função Click, que apagara todos os itens no ComboBox e Atualizara em seguida
		// em Click(MeuComboLindu) troque MeuComboLindu pelo nome do seu comboBox 
		
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Click(MeuComboLindu); // troque MeuComboLindu pelo nome do seu ComboBox		
			}
		});
		btnAtualizar.setBounds(23, 131, 89, 23);
		contentPane.add(btnAtualizar);
	}
}
