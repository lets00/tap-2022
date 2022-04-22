public class ClienteDAO {	
	public ArrayList<Cliente> lerClientes() throws Exception {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try (Connection conexao = MysqlConexao.criarConexao()) {
			Statement comando = conexao.createStatement();
			ResultSet rs = comando.executeQuery("SELECT * FROM clientes");
			while (rs.next()) {
				clientes.add(this.extrairClienteDoResultSet(rs));
			}
		}
		return clientes;
	}

	private Cliente extrairClienteDoResultSet(ResultSet rs) {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getInt("id"));
		cliente.setNome(rs.getString("nome"));
		return cliente;
	}
}
