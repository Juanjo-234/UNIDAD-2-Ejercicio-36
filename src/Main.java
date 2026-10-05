import java.util.ArrayList;
import java.util.List;
void main() {
    List<ProveedorIdentidad> proveedores = new ArrayList<>();
    proveedores.add(new AuthGoogle());
    proveedores.add(new AuthGitHub());
    proveedores.add(new AuthApple());

    String tokenPrueba = "goog_abc123xyz";

    System.out.println("=== Ejecutando Autenticación Polimórfica ===\n");

    for (ProveedorIdentidad proveedor : proveedores) {
        try {
            System.out.println("Probando con: " + proveedor.nombreProveedor);
            boolean accesoConcedido = proveedor.validarToken(tokenPrueba);

            if (accesoConcedido) {
                System.out.println("[ÉXITO] Acceso concedido por " + proveedor.nombreProveedor + "\n");
            } else {
                System.out.println("[DENEGADO] Token inválido para " + proveedor.nombreProveedor + "\n");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
    System.out.println("=== Probando Validación de Token Vacío ===");
    try {
        ProveedorIdentidad googleAuth = new AuthGoogle();
        googleAuth.validarToken(""); // Esto lanzará la excepción esperada
    } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }
}

