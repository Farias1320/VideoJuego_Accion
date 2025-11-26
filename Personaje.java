public abstract class Personaje {
    // ATRIBUTOS ENCAPSULADOS
    private String nombre;
    private int nivel;
    private int salud;
    private int saludMaxima;
    private TipoPersonaje tipo;

    // CONSTRUCTOR
    public Personaje(String nombre, int nivel, int saludMaxima, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.saludMaxima = saludMaxima;
        this.salud = saludMaxima; // Comienza con salud completa
        this.tipo = tipo;
    }

    // MÉTODOS PÚBLICOS DE ACCESO (getters) - ENCAPSULAMIENTO
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    public int getSaludMaxima() {
        return saludMaxima;
    }

    public TipoPersonaje getTipo() {
        return tipo;
    }

    // MÉTODOS PÚBLICOS DE MODIFICACIÓN (setters) - ENCAPSULAMIENTO
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setSalud(int salud) {
        if (salud < 0) {
            this.salud = 0;
        } else if (salud > saludMaxima) {
            this.salud = saludMaxima;
        } else {
            this.salud = salud;
        }
    }

    // COMPORTAMIENTOS ABSTRACTOS
    public abstract void atacar();
    public abstract void usarHabilidadEspecial();
    public abstract void mostrarInfo();

    // COMPORTAMIENTOS CONCRETOS CON DESCRIPCIONES NARRATIVAS
    public void recibirDanio(int danio) {
        int saludAnterior = salud;
        setSalud(salud - danio);
        System.out.println("💥 " + nombre + " recibe " + danio + " puntos de daño! (" +
                saludAnterior + " → " + salud + " HP)");

        if (salud <= 0) {
            System.out.println("💀 " + nombre + " ha sido derrotado!");
        }
    }

    public void curar(int puntosCuracion) {
        int saludAnterior = salud;
        setSalud(salud + puntosCuracion);
        System.out.println("❤️ " + nombre + " se cura " + puntosCuracion + " puntos! (" +
                saludAnterior + " → " + salud + " HP)");
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}