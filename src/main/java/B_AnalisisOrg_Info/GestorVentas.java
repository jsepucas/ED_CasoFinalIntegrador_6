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




}
