package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {
	
	public static void main (String [] args ) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		String slq =  "CREATE TABLE IF NOT EXISTS pessoas ("
				+"codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+"nome VARCHAR(80) NOT NULL"
				+")";
				
		Statement stmt = conexao.createStatement();
		stmt.execute(slq);
		
		System.out.println("Tabela craiada com sucesso!");
		
		conexao.close();
		
	}

}