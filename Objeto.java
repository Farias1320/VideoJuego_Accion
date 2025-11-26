public class Objeto {
    // ENCAPSULAMIENTO
    private String nombre;
    private String descripcion;
    private RarezaObjeto rareza;

    public Objeto(String nombre, String descripcion, RarezaObjeto rareza) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rareza = rareza;
    }

    // GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public RarezaObjeto getRareza() { return rareza; }
    public void setRareza(RarezaObjeto rareza) { this.rareza = rareza; }

    public void usar() {
        System.out.println("🔮 Usando " + nombre + " - " + descripcion);
        System.out.println("💎 Rareza: " + rareza.getNombre());
        System.out.println("💡 " + rareza.getDescripcionValor());
    }

    public void mostrarInfo() {
        System.out.println("\n---- INFORMACIÓN DEL OBJETO ----");
        System.out.println("📦 Nombre: " + nombre);
        System.out.println("📝 Descripción: " + descripcion);
        System.out.println("💎 Rareza: " + rareza.getNombre() +
                " (" + (rareza.getProbabilidad() * 100) + "%)");
        System.out.println("🎯 Valor: " + rareza.getDescripcionValor());
    }
}
