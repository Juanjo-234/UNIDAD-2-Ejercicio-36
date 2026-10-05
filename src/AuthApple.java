public class AuthApple extends  ProveedorIdentidad{
    public AuthApple() {
        super("Iniciar sesión con Apple");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {
        System.out.println("-> Conectando con Apple Auth Services para verificar token...");
        return tokenAcceso.startsWith("apple");
    }
}
