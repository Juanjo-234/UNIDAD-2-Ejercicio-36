public class AuthGitHub extends ProveedorIdentidad{
    public AuthGitHub() {
        super("GitHub OAuth");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {
        System.out.println("-> Conectando con GitHub API para verificar token...");
        return tokenAcceso.startsWith("gh_");
    }
}
