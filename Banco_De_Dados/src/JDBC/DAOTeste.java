package JDBC;

public class DAOTeste {
	
	public static void main(String [] agrs) {
	
	DAO dao =  new DAO();
	
	String sql = "INSERT INTO pessoa (nome) VALUES (?)";
	System.out.println(dao.incluir(sql, "João da silva"));
	System.out.println(dao.incluir(sql, "Ana Julia"));
	System.out.println(dao.incluir(sql, "Ana Paula Medeiros"));
	
	dao.close();
	
	}

}
