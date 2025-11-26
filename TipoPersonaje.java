public enum TipoPersonaje {
    GUERRERO("Tanque", "Un guerrero especializado en combate cuerpo a cuerpo con alta resistencia y daño físico."),
    ARQUERO("Distancia", "Maestro del arco y las flechas, capaz de atacar desde lejos con precisión mortal."),
    MAGO("Magia", "Manipulador de elementos mágicos que puede lanzar hechizos devastadores."),
    SANADOR("Apoyo", "Especialista en curar aliados y proporcionar buffs al equipo.");

    private final String rol;
    private final String descripcion;

    TipoPersonaje(String rol, String descripcion) {
        this.rol = rol;
        this.descripcion = descripcion;
    }

    public String getRol() {
        return rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInfoCompleta() {
        return name() + " (" + rol + "): " + descripcion;
    }
}