package br.com.livro.domain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	public BaseDAO() {
		try {
			// Necessário para utilizar o driver JDBC dp MySQL
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Erro de drive JDBC (adiciona o drive .jar do MYSQL em /WEB-INF/lib)
			e.printStackTrace();
		}	
	}

	protected Connection getConnection() throws SQLException {
		//URL de conexão com o banco de dados
		String url = "jdbc:mysql://localhost/livro";
		
		// Connecta utilizando a URL, usuário e senha.
		Connection conn = DriverManager.getConnection(url, "livro", "livro123");
		
		return conn;
	} 
	
	public static void main(String[] args) throws SQLException{
		BaseDAO db = new BaseDAO();
		//Testa a conexão
		Connection conn = db.getConnection();
		System.out.println(conn);
		
	}
	
}

