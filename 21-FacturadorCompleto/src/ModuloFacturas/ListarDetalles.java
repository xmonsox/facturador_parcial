
package ModuloFacturas;

import Clases.Factura;
import Clases.FacturaProducto;
import Clases.Producto;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class ListarDetalles extends javax.swing.JFrame {
    int id_factura;
    int cedula_cliente;
    int cedula_vendedor;
    int total;
    JLabel etqTemporal;
    FacturaProducto arreglo_productos [];
    

    public ListarDetalles(int id_factura, int cedula_cliente, int cedula_vendedor, int total, FacturaProducto[] arreglo_productos) {
        this.id_factura = id_factura;
        this.cedula_cliente = cedula_cliente;
        this.cedula_vendedor = cedula_vendedor;
        this.total = total;
        this.arreglo_productos = arreglo_productos;
        initComponents();
        initAlternComponents();
        imprimirDetalles();
        imprimirProductos();
    }

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqTituloClientes1 = new javax.swing.JLabel();
        campoCedulaVendedor = new javax.swing.JTextField();
        etqCedulaVendedor = new javax.swing.JLabel();
        etqListaProductos = new javax.swing.JLabel();
        etqTituloClientes = new javax.swing.JLabel();
        etqCedulaCliente = new javax.swing.JLabel();
        campoCedulaCliente = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        etqTotal = new javax.swing.JLabel();
        etqTituloFactura = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        etqTituloClientes1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etqTituloClientes1.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloClientes1.setText("DATOS VENDEDOR:");

        campoCedulaVendedor.setForeground(new java.awt.Color(0, 0, 0));
        campoCedulaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaVendedorActionPerformed(evt);
            }
        });

        etqCedulaVendedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedulaVendedor.setForeground(new java.awt.Color(0, 0, 0));
        etqCedulaVendedor.setText("Cedula:");

        etqListaProductos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etqListaProductos.setForeground(new java.awt.Color(0, 0, 0));
        etqListaProductos.setText("LISTA PRODUCTOS FACTURADOS:");

        etqTituloClientes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etqTituloClientes.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloClientes.setText("DATOS CLIENTE:");

        etqCedulaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedulaCliente.setForeground(new java.awt.Color(0, 0, 0));
        etqCedulaCliente.setText("Cedula:");

        campoCedulaCliente.setForeground(new java.awt.Color(0, 0, 0));
        campoCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaClienteActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etqTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTotal.setForeground(new java.awt.Color(0, 0, 0));
        etqTotal.setText("Total: $ 0");

        etqTituloFactura.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etqTituloFactura.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloFactura.setText("Factura: -");

        textAreaResultado.setBackground(new java.awt.Color(255, 255, 255));
        textAreaResultado.setColumns(20);
        textAreaResultado.setForeground(new java.awt.Color(0, 0, 0));
        textAreaResultado.setRows(5);
        jScrollPane2.setViewportView(textAreaResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqCedulaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqListaProductos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqCedulaVendedor)
                        .addGap(18, 18, 18)
                        .addComponent(campoCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqTituloClientes1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqTituloClientes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(etqTituloFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(btnAtras)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTituloFactura)
                .addGap(19, 19, 19)
                .addComponent(etqTituloClientes)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedulaCliente)
                    .addComponent(campoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(etqTituloClientes1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedulaVendedor)
                    .addComponent(campoCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(etqListaProductos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void imprimirDetalles(){
       etqTituloFactura.setText("Factura: "+this.id_factura);
       campoCedulaCliente.setText(String.valueOf(this.cedula_cliente));
       campoCedulaVendedor.setText(String.valueOf(this.cedula_vendedor));
       etqTotal.setText(String.valueOf("Total: $"+this.total));
    }
   
   public void imprimirProductos(){
        
        
        for(int i = 0; i < arreglo_productos.length; i++){
            if(arreglo_productos[i] != null){

                String id_producto = arreglo_productos[i].getId_producto();
                String cantidad = String.valueOf(arreglo_productos[i].getCant());
                String subtotal = String.valueOf(arreglo_productos[i].getSubtotal());

                String productos = id_producto+" - "+cantidad+" - "+subtotal+"\n";

                textAreaResultado.append(productos);
            }else{
                break;
            }
        }
        revalidate();
        
    }
    
    private void campoCedulaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaVendedorActionPerformed
        
    }//GEN-LAST:event_campoCedulaVendedorActionPerformed

    private void campoCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaClienteActionPerformed

    }//GEN-LAST:event_campoCedulaClienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
     dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JTextField campoCedulaCliente;
    private javax.swing.JTextField campoCedulaVendedor;
    private javax.swing.JLabel etqCedulaCliente;
    private javax.swing.JLabel etqCedulaVendedor;
    private javax.swing.JLabel etqListaProductos;
    private javax.swing.JLabel etqTituloClientes;
    private javax.swing.JLabel etqTituloClientes1;
    private javax.swing.JLabel etqTituloFactura;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAreaResultado;
    // End of variables declaration//GEN-END:variables
}
