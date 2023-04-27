package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao{
	public static void  main(String [] agrs) throws SQLException {
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "kassia1324";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.print("Conexao com sucesso!");
		
		conexao.close();
	}
}