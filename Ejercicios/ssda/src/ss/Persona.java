package ss;

public class Persona {
    protected String nombre;
    protected String primerApellido;

    public Persona(String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }
}