package ss;


import ss.Persona;

public class Cliente extends Persona {

    public Cliente(String nombre, String primerApellido) {
        super(nombre, primerApellido);
    }

    @Override
    public String toString() {
        return nombre + " " + primerApellido;
    }
}
