public class AuthGoogle extends ProveedorIdentidad{
    public AuthGoogle() {
        super("Google OAuth2");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {
        System.out.println("-> Conectando con Google API para verificar token...");
        return tokenAcceso.startsWith("goog_");
    }
}
