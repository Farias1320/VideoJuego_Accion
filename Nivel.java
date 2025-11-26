import java.util.ArrayList;
import java.util.List;

public class Nivel {
    // ENCAPSULAMIENTO
    private String nombre;
    private int numero;
    private String ambiente;
    private List<CriaturaEnemiga> criaturas;
    private List<Objeto> objetos;

    public Nivel(String nombre, int numero, String ambiente) {
        this.nombre = nombre;
        this.numero = numero;
        this.ambiente = ambiente;
        this.criaturas = new ArrayList<>();
        this.objetos = new ArrayList<>();
    }

    // GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getAmbiente() { return ambiente; }
    public void setAmbiente(String ambiente) { this.ambiente = ambiente; }

    public void agregarCriatura(CriaturaEnemiga criatura) {
        criaturas.add(criatura);
        System.out.println("👹 " + criatura.getNombre() + " aparece en " + nombre + "!");
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
        System.out.println("📦 " + objeto.getNombre() + " disponible en " + nombre + "!");
    }

    public void explorar(Jugador jugador) {
        System.out.println("\n🌄 ---- EXPLORANDO " + nombre.toUpperCase() + " ---- 🌄");
        System.out.println("🏞️ Ambiente: " + ambiente);
        System.out.println("🔢 Nivel: " + numero);

        // Encontrar objetos
        if (!objetos.isEmpty()) {
            System.out.println("\n🎁 Has encontrado objetos!");
            for (Objeto objeto : objetos) {
                jugador.recolectarObjeto(objeto);
            }
            objetos.clear();
        }

        // Enfrentar criaturas
        if (!criaturas.isEmpty()) {
            System.out.println("\n⚔️ Criaturas enemigas te atacan!");
            for (CriaturaEnemiga criatura : criaturas) {
                if (jugador.estaVivo()) {
                    criatura.atacar(jugador);
                    if (jugador.estaVivo()) {
                        // El jugador contraataca
                        jugador.atacar();
                        criatura.recibirDanio(15);

                        if (!criatura.estaViva()) {
                            jugador.ganarExperiencia(25);
                        }
                    }
                }
            }
        }
    }
}
