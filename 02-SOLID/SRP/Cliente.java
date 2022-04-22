// Imports omitidos somente para clareza (...)
public class Cliente {
	
	private int id;
	private String nome;
	// Gets e sets omitidos por clareza (...)
}

public class ListaClientes {
	public void listarClientes() throws Exception {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/srp", "root", "root")) {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM clientes");
			while (rs.next()){
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getInt("nome"));
				clientes.add(cliente)
			}
			rs.close();
			st.close();
		}
		clientes.forEach(cliente -> {
			System.out.println(cliente.toString()); // Considerando que "toString()" está devidamente sobrescrito
		});
	}
}
