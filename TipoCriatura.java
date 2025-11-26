public enum TipoCriatura {
    GOBLIN("Baja", "Pequeños humanoides que atacan en grupo y roban objetos."),
    LOBO_SOMBRIO("Media", "Lobos corruptos que cazan en manada bajo la luz de la luna."),
    ESQUELETO_GUERRERO("Media", "Guerreros no-muertos que resurgen si no son destruidos completamente."),
    DRAGON_ANCIANO("Alta", "Dragones milenarios que escupen fuego y dominan los cielos.");

    private final String nivelAmenaza;
    private final String comportamiento;

    TipoCriatura(String nivelAmenaza, String comportamiento) {
        this.nivelAmenaza = nivelAmenaza;
        this.comportamiento = comportamiento;
    }

    public String getAmenaza() {
        return nivelAmenaza;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public String getInfoCompleta() {
        return name() + " - Amenaza: " + nivelAmenaza + ". " + comportamiento;
    }
}
