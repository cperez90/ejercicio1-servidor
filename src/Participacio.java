public class Participacio {
    private Rol rol;
    private int horesFetes;
    private Desenvolupador desenvolupador;

    public Participacio(Desenvolupador desenvolupador,Rol rol, int horesFetes) {
        this.rol = rol;
        this.horesFetes = horesFetes;
        this.desenvolupador = desenvolupador;
    }

    public Rol getRol() {
        return rol;
    }

    public int getHoresFetes() {
        return horesFetes;
    }

    public Desenvolupador getDesenvolupador() {
        return desenvolupador;
    }
}
