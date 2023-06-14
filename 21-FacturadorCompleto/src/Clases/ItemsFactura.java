package Clases;

public class ItemsFactura {
    
    private int cedula_cliente;
    private int cedula_vendedor;
    private int total;
    private int id_factura;

    public ItemsFactura(int cedula_cliente, int cedula_vendedor, int total, int id_factura) {
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.total = total;
        this.id_factura = id_factura;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public int getCedula_vendedor() {
        return cedula_vendedor;
    }

    public void setCedula_vendedor(int cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
    
    
}
