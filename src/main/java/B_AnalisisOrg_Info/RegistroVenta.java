package B_AnalisisOrg_Info;

public class RegistroVenta {

    private String cliente;
    private double monto;
    private String fecha;

    public RegistroVenta(String cliente, double monto, String fecha) {
        this.cliente = cliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Monto: $" + monto + ", Fecha: " + fecha;
    }


}
