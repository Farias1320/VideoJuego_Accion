import java.util.ArrayList;
import java.util.List;

public class Jugador {
    // ENCAPSULAMIENTO
    private Personaje personaje;
    private List<Objeto> inventario;
    private int experiencia;

    public Jugador(String nombre, int nivel, int saludMaxima, TipoPersonaje tipo) {
        // Creación de instancias anónimas
        this.personaje = new Personaje(nombre, nivel, saludMaxima, tipo) {
            @Override
            public void atacar() {
                System.out.println("⚔️ " + getNombre() + " el " + getTipo().name() +
                        " ataca con su estilo característico!");
            }

            @Override
            public void usarHabilidadEspecial() {
                System.out.println("🔥 " + getNombre() + " usa habilidad especial: " +
                        getTipo().getDescripcion());
            }

            @Override
            public void mostrarInfo() {
                System.out.println("\n---- INFORMACIÓN DEL PERSONAJE ----");
                System.out.println("👤 Nombre: " + getNombre());
                System.out.println("📊 Nivel: " + getNivel());
                System.out.println("❤️ Salud: " + getSalud() + "/" + getSaludMaxima());
                System.out.println("🎯 Tipo: " + getTipo().getInfoCompleta());
            }
        };

        this.inventario = new ArrayList<>();
        this.experiencia = 0;
    }

    // MÉTODOS DELEGADOS AL PERSONAJE
    public void atacar() {
        personaje.atacar();
    }

    public void usarHabilidadEspecial() {
        personaje.usarHabilidadEspecial();
    }

    public void recibirDanio(int danio) {
        personaje.recibirDanio(danio);
    }

    public void curar(int puntos) {
        personaje.curar(puntos);
    }

    public boolean estaVivo() {
        return personaje.estaVivo();
    }

    // MÉTODOS ESPECÍFICOS DEL JUGADOR
    public void recolectarObjeto(Objeto objeto) {
        inventario.add(objeto);
        System.out.println("🎒 " + personaje.getNombre() + " recolecta: " + objeto.getNombre() +
                " [" + objeto.getRareza().getNombre() + "]");
        System.out.println("💬 " + objeto.getRareza().getDescripcionValor());
    }

    public void usarObjeto(int indice) {
        if (indice >= 0 && indice < inventario.size()) {
            Objeto objeto = inventario.get(indice);
            System.out.println("✨ " + personaje.getNombre() + " usa: " + objeto.getNombre());
            objeto.usar();
            inventario.remove(indice);
        } else {
            System.out.println("❌ Índice de objeto inválido.");
        }
    }

    public void ganarExperiencia(int exp) {
        experiencia += exp;
        System.out.println("🌟 " + personaje.getNombre() + " gana " + exp +
                " puntos de experiencia! (Total: " + experiencia + ")");
    }

    // GETTERS para acceder a información del personaje
    public String getNombre() { return personaje.getNombre(); }
    public int getSalud() { return personaje.getSalud(); }
    public int getSaludMaxima() { return personaje.getSaludMaxima(); }
    public TipoPersonaje getTipo() { return personaje.getTipo(); }

    public void mostrarInfoCompleta() {
        personaje.mostrarInfo();
        System.out.println("⭐ Experiencia: " + experiencia);
        System.out.println("🎒 Objetos en inventario: " + inventario.size());

        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + inventario.get(i).getNombre());
        }
    }
}