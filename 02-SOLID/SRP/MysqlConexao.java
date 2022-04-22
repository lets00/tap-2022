public class MysqlConexao {
	public static Connection criarConexao() throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/srp", "root", "root");
		return conexao;
	}
}

