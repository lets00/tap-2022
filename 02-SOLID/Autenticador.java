public class Autenticador {
    private repositorioUsuarios;

    public boolean autenticarUsuario(string email, string senha) {
        UsuarioDAO usuario = repositorioUsuarios.getUsuarioPorEmail(email);
        String senhaHasheada = getHash(senha)

        if (usuario == null) {
            return false;
        }

        if (usuario.getHashSenha() != senhaHasheada) {
            return false;
        }
        // atualiza usuário para autenticado
        usuario.autenticado = true;
        repositorioUsuarios.registraLogin(usuario)
        return true;
    }
}