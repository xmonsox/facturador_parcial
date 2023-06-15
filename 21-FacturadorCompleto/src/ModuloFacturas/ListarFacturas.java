package ModuloFacturas;

import Clases.DataBase;
import Clases.Factura;
import Clases.FacturaProducto;
import Clases.Producto;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class ListarFacturas extends javax.swing.JFrame {
    
    private Menu ventanaMenu;
    private JLabel etqTemporal;
    private JButton btnDetalles [];
   
    
    public ListarFacturas(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        EtqTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenFacturas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        EtqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EtqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtqTitulo.setText("LISTADO FACTURAS");
        EtqTitulo.setToolTipText("");

        javax.swing.GroupLayout contenFacturasLayout = new javax.swing.GroupLayout(contenFacturas);
        contenFacturas.setLayout(contenFacturasLayout);
        contenFacturasLayout.setHorizontalGroup(
            contenFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        contenFacturasLayout.setVerticalGroup(
            contenFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(contenFacturas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(EtqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(EtqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        contenFacturas.setLayout( new BoxLayout(contenFacturas, BoxLayout.Y_AXIS) );
        contenFacturas.setBackground(Color.WHITE);
        imprimirFacturas();
    }
    
    public void imprimirFacturas(){
       
        Factura listaFacturas [] = ( this.ventanaMenu.database.listaFacturas()); 
        btnDetalles = new JButton [listaFacturas.length];
        
        if (listaFacturas!=null) {
            for(int i = 0; i < listaFacturas.length; i++) {
                Factura factura = listaFacturas[i];
                
                if(factura != null) {
                    etqTemporal = new JLabel("Id Factura: " + factura.getId() + " - Cedula Vendedor: " + factura.getCedula_vendedor() + " - Fecha: " + factura.getFecha() + "- Total: " + factura.getTotal() + " - ");
                    btnDetalles[i] = new JButton("Detalles");

                    ActionListener evento_01 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            DataBase instancia = new DataBase();
                            FacturaProducto arreglo_productos [] = instancia.buscarProductoFactura(String.valueOf(factura.getId()));
                            ListarDetalles ventana = new ListarDetalles(factura.getId(), factura.getCedula_cliente(), factura.getCedula_vendedor(), factura.getTotal(), arreglo_productos);
                            ventana.setVisible(true);
                        }
                    };
                    btnDetalles[i].addActionListener(evento_01);

                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2, 10, 2, 10));
                    contenFacturas.add(etqTemporal);
                    contenFacturas.add(btnDetalles[i]);
                } else {
                    break;
                }
            }

            revalidate();
        }
    }
    
  
    
            
            
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contenFacturas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
