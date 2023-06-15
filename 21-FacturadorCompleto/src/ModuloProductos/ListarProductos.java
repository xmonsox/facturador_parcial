package ModuloProductos;

import Clases.Persona;
import Clases.Producto;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListarProductos extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    private JLabel etqTemporal;
    
    public ListarProductos(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        contenProductos.setLayout( new BoxLayout(contenProductos, BoxLayout.Y_AXIS) );
        contenProductos.setBackground(Color.WHITE);
        imprimirProductos();
    }
    
    public void imprimirProductos(){
         
         Producto listaProductos [] =( this.ventanaMenu.database.listaProductos()); 
        
        if (listaProductos!=null) {
            for(int i = 0; i < listaProductos.length; i++){
                if(listaProductos[i] != null){
                    etqTemporal = new JLabel(listaProductos[i].getId()+" - "+listaProductos[i].getNombre()+" "+listaProductos[i].getPrecio());
                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                    contenProductos.add(etqTemporal);
                }else{
                    break;
                }
            }
            revalidate();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalContainer = new javax.swing.JPanel();
        EtqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenProductos = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);

        principalContainer.setBackground(new java.awt.Color(153, 153, 255));

        EtqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EtqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtqTitulo.setText("LISTAR PRODUCTOS");
        EtqTitulo.setToolTipText("");

        javax.swing.GroupLayout contenProductosLayout = new javax.swing.GroupLayout(contenProductos);
        contenProductos.setLayout(contenProductosLayout);
        contenProductosLayout.setHorizontalGroup(
            contenProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        contenProductosLayout.setVerticalGroup(
            contenProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenProductos);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalContainerLayout = new javax.swing.GroupLayout(principalContainer);
        principalContainer.setLayout(principalContainerLayout);
        principalContainerLayout.setHorizontalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principalContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(EtqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        principalContainerLayout.setVerticalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(EtqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contenProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principalContainer;
    // End of variables declaration//GEN-END:variables
}
