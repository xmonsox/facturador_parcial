/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloFacturas;

import Clases.FacturaProducto;
import Clases.Persona;
import Clases.Producto;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



public class CrearFactura extends javax.swing.JFrame {

    Menu ventanaMenu;
    Persona listaPersonas [];
    Persona listaClientes []; 
    Persona listaVendedores [];
    Producto listaProductos [];
    int indice;
    public FacturaProducto pro [];
    private JLabel etqTemporal;
    int precio;
    int subtotal;
    int acum;
    String id_factura;
    
    public CrearFactura(Menu ventanaMenu, Persona [] listaClientes,Persona [] listaVendedores,Producto [] listaProductos) {
        this.ventanaMenu = ventanaMenu;
        this.listaClientes = listaClientes;
        this.indice=0;
        this.listaVendedores = listaVendedores;
        this.listaProductos = listaProductos;
        this.pro=new FacturaProducto[100];
        this.id_factura = this.ventanaMenu.database.extraerId();
        
        initComponents();
        initAlternComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ContenMenu = new javax.swing.JPanel();
        etqTituloClientes = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        campoCedulaCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etqCedula1 = new javax.swing.JLabel();
        campoNombreCliente = new javax.swing.JTextField();
        etqCedula2 = new javax.swing.JLabel();
        campoDireccionCliente = new javax.swing.JTextField();
        etqTituloClientes1 = new javax.swing.JLabel();
        campoCedulaVendedor = new javax.swing.JTextField();
        etqCedula3 = new javax.swing.JLabel();
        campoNombreVendedor = new javax.swing.JTextField();
        etqCedula4 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarVendedor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        campoNombreProducto = new javax.swing.JTextField();
        campoCantProducto = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelResultado = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etqTotal = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContenMenu.setBackground(new java.awt.Color(204, 204, 204));
        ContenMenu.setForeground(new java.awt.Color(0, 0, 0));

        etqTituloClientes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etqTituloClientes.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloClientes.setText("DATOS CLIENTE:");

        etqCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula.setText("Cedula:");

        campoCedulaCliente.setForeground(new java.awt.Color(0, 0, 0));
        campoCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaClienteActionPerformed(evt);
            }
        });

        etqCedula1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula1.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula1.setText("Nombres:");

        campoNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        campoNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        etqCedula2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula2.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula2.setText("Direccion:");

        campoDireccionCliente.setForeground(new java.awt.Color(255, 255, 255));
        campoDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDireccionClienteActionPerformed(evt);
            }
        });

        etqTituloClientes1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etqTituloClientes1.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloClientes1.setText("DATOS VENDEDOR:");

        campoCedulaVendedor.setForeground(new java.awt.Color(0, 0, 0));
        campoCedulaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaVendedorActionPerformed(evt);
            }
        });

        etqCedula3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula3.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula3.setText("Cedula:");

        campoNombreVendedor.setForeground(new java.awt.Color(255, 255, 255));
        campoNombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreVendedorActionPerformed(evt);
            }
        });

        etqCedula4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCedula4.setForeground(new java.awt.Color(0, 0, 0));
        etqCedula4.setText("Nombres:");

        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnBuscarVendedor.setText("BUSCAR");
        btnBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendedorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LISTA PRODUCTOS FACTURADOS:");

        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });
        campoId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoIdKeyTyped(evt);
            }
        });

        campoNombreProducto.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        panelResultado.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelResultado);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMBRE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CANT");

        etqTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqTotal.setForeground(new java.awt.Color(0, 0, 0));
        etqTotal.setText("Total: $ 0");

        javax.swing.GroupLayout ContenMenuLayout = new javax.swing.GroupLayout(ContenMenu);
        ContenMenu.setLayout(ContenMenuLayout);
        ContenMenuLayout.setHorizontalGroup(
            ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenMenuLayout.createSequentialGroup()
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContenMenuLayout.createSequentialGroup()
                        .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ContenMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etqCedula1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ContenMenuLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(etqTituloClientes))
                                .addGroup(ContenMenuLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))
                                .addGroup(ContenMenuLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(etqCedula)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenMenuLayout.createSequentialGroup()
                                .addComponent(etqCedula2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etqTituloClientes1)
                            .addGroup(ContenMenuLayout.createSequentialGroup()
                                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqCedula3)
                                    .addComponent(etqCedula4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ContenMenuLayout.createSequentialGroup()
                                        .addComponent(campoCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3)))
                    .addGroup(ContenMenuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(ContenMenuLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(159, 159, 159))))
                    .addGroup(ContenMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenMenuLayout.createSequentialGroup()
                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarProducto)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addGap(20, 20, 20))
        );
        ContenMenuLayout.setVerticalGroup(
            ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTituloClientes)
                .addGap(19, 19, 19)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula)
                    .addComponent(btnBuscarCliente))
                .addGap(18, 18, 18)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula1))
                .addGap(18, 18, 18)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCedula2)
                    .addComponent(campoDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(etqTituloClientes1)
                .addGap(30, 30, 30)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula3)
                    .addComponent(campoCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVendedor))
                .addGap(13, 13, 13)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etqCedula4)))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoCantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarProducto))
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContenMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaClienteActionPerformed
        
    }//GEN-LAST:event_campoCedulaClienteActionPerformed

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void campoDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDireccionClienteActionPerformed

    private void campoCedulaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaVendedorActionPerformed

    private void campoNombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreVendedorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String cedula_cliente = campoCedulaCliente.getText();
        String cedula_vendedor = campoCedulaVendedor.getText();
        String total_factura = etqTotal.getText();
        
        
        if (!cedula_cliente.equals("") && !cedula_vendedor.equals("")  && !total_factura.equals("")) {
            Date fecha = new Date();
            String date = fecha.toString();
            this.ventanaMenu.database.insertarFactura(this.id_factura, cedula_cliente, cedula_vendedor, date, acum);
            this.ventanaMenu.database.insertarItemsFactura(this.pro);
            this.ventanaMenu.setVisible(true);
            Alert alerta = new Alert("EXITO", "Factura Creada.", "success");
            dispose();    
        }else{
            Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String cedula_cliente = campoCedulaCliente.getText();
        Persona temporal = (this.ventanaMenu.database.buscarCliente(cedula_cliente));
        
        if (temporal != null) {
            deshabilitarCampo(campoNombreCliente);
            deshabilitarCampo(campoDireccionCliente);
            campoNombreCliente.setText(temporal.getNombres());
            campoDireccionCliente.setText(temporal.getDireccion());
            campoCedulaVendedor.requestFocus();
            btnBuscarCliente.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "Cliente no encontrado.", "error");
            campoNombreCliente.setText("");
            campoDireccionCliente.setText("");
            deshabilitarCampo(campoNombreCliente);
            deshabilitarCampo(campoDireccionCliente);
            campoCedulaCliente.requestFocus();
            btnBuscarCliente.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendedorActionPerformed
        String cedula_vendedor = campoCedulaVendedor.getText();
        Persona temporal = (this.ventanaMenu.database.buscarVendedor(cedula_vendedor));
        
        if (temporal != null) {
            deshabilitarCampo(campoNombreVendedor);  
            campoNombreVendedor.setText(temporal.getNombres());
            campoId.requestFocus();
            btnBuscarVendedor.setEnabled(true);
        }else{
            Alert alerta = new Alert("NO EXISTE", "Cliente no encontrado.", "error");
            campoNombreVendedor.setText("");
            deshabilitarCampo(campoNombreVendedor);
            campoCedulaVendedor.requestFocus();
            btnBuscarVendedor.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarVendedorActionPerformed

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdActionPerformed

    private void campoIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdKeyPressed
        
    }//GEN-LAST:event_campoIdKeyPressed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        String id = campoId.getText();
        String nombre_producto = campoNombreProducto.getText();
        String texto_cant_producto = campoCantProducto.getText();
        int cant_producto = Integer.parseInt(texto_cant_producto);
        
        
        
        
        Producto temporal = ( this.ventanaMenu.database.buscarProducto(id)); 
        
        if (temporal != null) {
            precio = (temporal.getPrecio());
            subtotal = cant_producto*precio;
            acum+=subtotal;
        }
        
        String texto_acumulador = Integer.toString(acum);
        etqTemporal = new JLabel(id+" - "+nombre_producto+" -> "+texto_cant_producto+" -> "+precio+" -> "+subtotal);
        etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
        etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
        panelResultado.add(etqTemporal);
        etqTotal.setText("Total $"+texto_acumulador);
        campoNombreProducto.setText("");
        campoId.setText("");
        campoCantProducto.setText("");
        campoId.requestFocus();
        
        FacturaProducto temporales = new FacturaProducto(this.id_factura,id, cant_producto,subtotal);
        this.pro[indice]=temporales;
        indice++;
        
        revalidate(); 
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void campoIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdKeyReleased
        String id = campoId.getText();
        Producto temporal = ( this.ventanaMenu.database.buscarProducto(id)); 
        
        if (temporal != null) {
            deshabilitarCampo(campoNombreProducto);
            campoNombreProducto.setText(temporal.getNombre());
            btnAgregarProducto.setEnabled(true);
        }else{
            campoNombreProducto.setText("");
            campoCantProducto.setText("");
            deshabilitarCampo(campoNombreProducto);
            campoId.requestFocus();
            btnAgregarProducto.setEnabled(false);
        }
    }//GEN-LAST:event_campoIdKeyReleased

    private void campoIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdKeyTyped
        
    }//GEN-LAST:event_campoIdKeyTyped

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        panelResultado.setLayout( new BoxLayout(panelResultado, BoxLayout.Y_AXIS) );
        panelResultado.setBackground(Color.WHITE);
        
        deshabilitarCampo(campoNombreCliente);
        deshabilitarCampo(campoDireccionCliente);
        deshabilitarCampo(campoNombreVendedor);

    }
    
    public void validarTodosInputs(){
        validarInput(campoNombreCliente);
        validarInput(campoDireccionCliente);
        validarInput(campoNombreVendedor);
        validarInput(campoId);
        validarInput(campoNombreProducto);
        validarInput(campoCantProducto);
    }
    
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo.setBorder(borderRojo);
            campo.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            campo.setBorder( referencia.getBorder() );
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenMenu;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarVendedor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField campoCantProducto;
    private javax.swing.JTextField campoCedulaCliente;
    private javax.swing.JTextField campoCedulaVendedor;
    private javax.swing.JTextField campoDireccionCliente;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNombreCliente;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoNombreVendedor;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqCedula1;
    private javax.swing.JLabel etqCedula2;
    private javax.swing.JLabel etqCedula3;
    private javax.swing.JLabel etqCedula4;
    private javax.swing.JLabel etqTituloClientes;
    private javax.swing.JLabel etqTituloClientes1;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelResultado;
    // End of variables declaration//GEN-END:variables
}
