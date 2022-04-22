public class UIExibicaoClientes {
	public void listarClientes() {
		  try {
			ClienteDAO clienteDAO = new ClienteDAO();
			ArrayList<Cliente> clientes = clienteDAO.lerClientes();
			clientes.forEach(cliente -> {
        		System.out.println(cliente.toString());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
