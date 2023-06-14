/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author SENA
 */
public class FacturaProducto {
    String factura_producto;
    String id_producto;
    int cant;
    int subtotal;

    public FacturaProducto(String factura, String id_producto, int cant, int subtotal) {
        this.factura_producto=factura;
        this.id_producto = id_producto;
        this.cant = cant;
        this.subtotal=subtotal;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getId_producto() {
        return id_producto;
    }

    

    public int getCant() {
        return cant;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

  
    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getFactura_producto() {
        return factura_producto;
    }

    public void setFactura_producto(String factura_producto) {
        this.factura_producto = factura_producto;
    }
    
    
}
