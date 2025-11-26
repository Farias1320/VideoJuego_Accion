public enum RarezaObjeto {
    COMUN("Común", 0.6, "Objetos básicos que se encuentran frecuentemente."),
    RARO("Raro", 0.3, "Objetos con propiedades especiales y útiles."),
    EPICO("Épico", 0.08, "Artefactos poderosos que pueden cambiar el curso de una batalla."),
    LEGENDARIO("Legendario", 0.02, "Reliquias ancestrales con poder inimaginable.");

    private final String nombre;
    private final double probabilidad;
    private final String descripcionValor;

    RarezaObjeto(String nombre, double probabilidad, String descripcionValor) {
        this.nombre = nombre;
        this.probabilidad = probabilidad;
        this.descripcionValor = descripcionValor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public String getDescripcionValor() {
        return descripcionValor;
    }

    public String getInfoCompleta() {
        return nombre + " (" + (probabilidad * 100) + "% de probabilidad): " + descripcionValor;
    }
}
