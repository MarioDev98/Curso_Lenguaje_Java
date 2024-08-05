package ss;

public class Producto {
    protected String nombre;
    protected String descripcion;
    protected double costoSinIVA;

    public Producto(String nombre, String descripcion, double costoSinIVA) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoSinIVA = costoSinIVA;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCostoSinIVA() {
        return costoSinIVA;
    }
}
