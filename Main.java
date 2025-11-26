public class Main {
    public static void main(String[] args) {
        System.out.println("🎮 ---- LEGENDS OF AETHER ---- 🎮\n");

        // CREACION JUGADOR
        Jugador jugador = new Jugador("Aetherion", 5, 100, TipoPersonaje.GUERRERO);

        // CREAR OBJETOS
        Objeto pocion = new Objeto("Poción de Vida", "Restaura 30 puntos de salud", RarezaObjeto.COMUN);
        Objeto espada = new Objeto("Espada del Dragón", "Aumenta el daño en batalla", RarezaObjeto.RARO);

        // CREAR CRIATURAS
        CriaturaEnemiga goblin = new CriaturaEnemiga("Goblin Saltarín", 30, 8, TipoCriatura.GOBLIN);
        CriaturaEnemiga dragon = new CriaturaEnemiga("Ignis el Dragón", 80, 20, TipoCriatura.DRAGON_ANCIANO);

        // CREAR NIVEL
        Nivel bosque = new Nivel("Bosque Encantado", 1, "Bosque denso con luz");
        bosque.agregarObjeto(pocion);
        bosque.agregarObjeto(espada);
        bosque.agregarCriatura(goblin);

        // EXPLORAR
        jugador.mostrarInfoCompleta();
        bosque.explorar(jugador);

        // USAR OBJETOS
        System.out.println("\n=== USANDO OBJETOS ===");
        jugador.usarObjeto(0);
        jugador.curar(30);

        // MOSTRAR INFO FINAL
        System.out.println("\n=== ESTADO FINAL ===");
        jugador.mostrarInfoCompleta();
    }
}