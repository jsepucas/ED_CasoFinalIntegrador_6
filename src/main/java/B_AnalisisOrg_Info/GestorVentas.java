package B_AnalisisOrg_Info;

import java.util.ArrayList;
import java.util.Comparator;

public class GestorVentas {
    private ArrayList<RegistroVenta> ventas;

    public GestorVentas() {
        ventas = new ArrayList<>();
    }

    public void agregarVenta(RegistroVenta venta) {
        ventas.add(venta);
    }

    public boolean eliminarVenta(RegistroVenta venta) {
        return ventas.remove(venta);
    }

    // Ordenar ventas por monto
    public void ordenarPorMonto() {
        ventas.sort(Comparator.comparingDouble(RegistroVenta::getMonto));
    }

    // Ordenar ventas por fecha
    public void ordenarPorFecha() {
        ventas.sort(Comparator.comparing(RegistroVenta::getFecha));
    }

    public ArrayList<RegistroVenta> getVentas() {
        return ventas;
    }
}
