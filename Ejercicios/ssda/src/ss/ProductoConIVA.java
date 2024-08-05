package ss;


import ss.Producto;

public class ProductoConIVA extends Producto {
    private static final double IVA = 0.16;

    public ProductoConIVA(String nombre, String descripcion, double costoSinIVA) {
        super(nombre, descripcion, costoSinIVA);
    }

    public double getCostoConIVA() {
        return costoSinIVA * (1 + IVA);
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion + " - Costo con IVA: " + getCostoConIVA();
    }
}
