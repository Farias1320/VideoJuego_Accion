public class CriaturaEnemiga {
    // ENCAPSULAMIENTO
    private String nombre;
    private int salud;
    private int danio;
    private TipoCriatura tipo;

    public CriaturaEnemiga(String nombre, int salud, int danio, TipoCriatura tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.danio = danio;
        this.tipo = tipo;
    }

    // GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getSalud() { return salud; }
    public void setSalud(int salud) { this.salud = salud; }

    public int getDanio() { return danio; }
    public void setDanio(int danio) { this.danio = danio; }

    public TipoCriatura getTipo() { return tipo; }
    public void setTipo(TipoCriatura tipo) { this.tipo = tipo; }

    // COMPORTAMIENTOS
    public void atacar(Jugador jugador) {
        System.out.println("👹 " + nombre + " (" + tipo.name() + ") ataca a " +
                jugador.getNombre() + "!");
        System.out.println("💬 Comportamiento: " + tipo.getComportamiento());
        jugador.recibirDanio(danio);
    }

    public void recibirDanio(int danio) {
        int saludAnterior = salud;
        salud = Math.max(0, salud - danio);
        System.out.println("💥 " + nombre + " recibe " + danio + " de daño! (" +
                saludAnterior + " → " + salud + " HP)");

        if (salud <= 0) {
            System.out.println("🎉 " + nombre + " ha sido derrotado!");
        }
    }

    public boolean estaViva() {
        return salud > 0;
    }

    public void mostrarInfo() {
        System.out.println("\n---- INFORMACIÓN DE CRIATURA ----");
        System.out.println("👹 Nombre: " + nombre);
        System.out.println("❤️ Salud: " + salud);
        System.out.println("⚔️ Daño: " + danio);
        System.out.println("⚠️ Tipo: " + tipo.name() + " - Amenaza: " + tipo.getAmenaza());
        System.out.println("🎯 Comportamiento: " + tipo.getComportamiento());
    }
}
