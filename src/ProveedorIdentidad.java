public abstract class ProveedorIdentidad {
String nombreProveedor;
public ProveedorIdentidad(String nombreProveedor){
    this.nombreProveedor = nombreProveedor;
}

    public abstract boolean validarToken(String tokenAcceso);
    protected void validarTokenNuloOVacio(String tokenAcceso) {
        if (tokenAcceso == null || tokenAcceso.trim().isEmpty()) {
            throw new IllegalArgumentException("[" + nombreProveedor + "] Error: El token de acceso no puede ser nulo o estar vacío.");
        }
    }
}
