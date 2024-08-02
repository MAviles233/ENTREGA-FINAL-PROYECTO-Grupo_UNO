/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_cafeteria;

import clases.DataBase;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Grupo 1 - Proyecto Cafeteria - Curso 6-2
 */
public class Principal_Empleado extends javax.swing.JFrame {

    /**
     * Creates new form Principal_Empleado
     */
    
    Background fondo = new Background();
    DataBase db = new DataBase();
    
    public Principal_Empleado() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mnMostrar_Menu = new javax.swing.JMenuItem();
        mnAgregar_Menu = new javax.swing.JMenuItem();
        mnEditar_Menu = new javax.swing.JMenuItem();
        mnEliminar_Menu = new javax.swing.JMenuItem();
        mnPromociones_Menu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAgregar_Pedidos = new javax.swing.JMenuItem();
        mnMostrar_Pedidos = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mnAgregarPropina_Pedidos = new javax.swing.JMenuItem();
        mnMostrarPropina_Pedidos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnMostrar_Ingredientes = new javax.swing.JMenuItem();
        mnAgregar_Ingredientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnMostrar_Reservas = new javax.swing.JMenuItem();
        mnAgregar_Reservas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        mnMostrarTurnos_Informes = new javax.swing.JMenuItem();
        mnAgregarTurnos_Informes = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnSistema_Mostrar_Usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION CAFETERIA");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROL:");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleado");

        btnLogOut.setBackground(new java.awt.Color(255, 51, 51));
        btnLogOut.setText("LOG OUT");
        btnLogOut.setBorder(null);
        btnLogOut.setBorderPainted(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 204));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        menu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        menu.setText("Menú");
        menu.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        mnMostrar_Menu.setText("Mostrar");
        mnMostrar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrar_MenuActionPerformed(evt);
            }
        });
        menu.add(mnMostrar_Menu);

        mnAgregar_Menu.setText("Agregar");
        mnAgregar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregar_MenuActionPerformed(evt);
            }
        });
        menu.add(mnAgregar_Menu);

        mnEditar_Menu.setText("Editar");
        mnEditar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditar_MenuActionPerformed(evt);
            }
        });
        menu.add(mnEditar_Menu);

        mnEliminar_Menu.setText("Eliminar");
        mnEliminar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEliminar_MenuActionPerformed(evt);
            }
        });
        menu.add(mnEliminar_Menu);

        mnPromociones_Menu.setText("Promociones");
        mnPromociones_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPromociones_MenuActionPerformed(evt);
            }
        });
        menu.add(mnPromociones_Menu);

        jMenuBar1.add(menu);

        jMenu2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Pedidos");
        jMenu2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        mnAgregar_Pedidos.setText("Agregar");
        mnAgregar_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregar_PedidosActionPerformed(evt);
            }
        });
        jMenu2.add(mnAgregar_Pedidos);

        mnMostrar_Pedidos.setText("Mostrar");
        mnMostrar_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrar_PedidosActionPerformed(evt);
            }
        });
        jMenu2.add(mnMostrar_Pedidos);

        jMenu8.setText("Propina");

        mnAgregarPropina_Pedidos.setText("Agregar");
        mnAgregarPropina_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarPropina_PedidosActionPerformed(evt);
            }
        });
        jMenu8.add(mnAgregarPropina_Pedidos);

        mnMostrarPropina_Pedidos.setText("Mostrar");
        mnMostrarPropina_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrarPropina_PedidosActionPerformed(evt);
            }
        });
        jMenu8.add(mnMostrarPropina_Pedidos);

        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Gestion Ingredientes");
        jMenu3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        mnMostrar_Ingredientes.setText("Mostrar");
        mnMostrar_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrar_IngredientesActionPerformed(evt);
            }
        });
        jMenu3.add(mnMostrar_Ingredientes);

        mnAgregar_Ingredientes.setText("Agregar");
        mnAgregar_Ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregar_IngredientesActionPerformed(evt);
            }
        });
        jMenu3.add(mnAgregar_Ingredientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jMenu4.setText("Reservas");
        jMenu4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        mnMostrar_Reservas.setText("Mostrar");
        mnMostrar_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrar_ReservasActionPerformed(evt);
            }
        });
        jMenu4.add(mnMostrar_Reservas);

        mnAgregar_Reservas.setText("Agregar");
        mnAgregar_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregar_ReservasActionPerformed(evt);
            }
        });
        jMenu4.add(mnAgregar_Reservas);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jMenu5.setText("Informes");
        jMenu5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jMenu6.setText("Empleados");

        mnMostrarTurnos_Informes.setText("Mostrar Turnos");
        mnMostrarTurnos_Informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrarTurnos_InformesActionPerformed(evt);
            }
        });
        jMenu6.add(mnMostrarTurnos_Informes);

        mnAgregarTurnos_Informes.setText("Agregar Turnos");
        mnAgregarTurnos_Informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarTurnos_InformesActionPerformed(evt);
            }
        });
        jMenu6.add(mnAgregarTurnos_Informes);

        jMenu5.add(jMenu6);

        jMenu7.setText("Sistema");

        mnSistema_Mostrar_Usuarios.setText("Mostrar Usuarios del sistema");
        mnSistema_Mostrar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSistema_Mostrar_UsuariosActionPerformed(evt);
            }
        });
        jMenu7.add(mnSistema_Mostrar_Usuarios);

        jMenu5.add(jMenu7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleName("frame_principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //LLama a la ventana de editar un menu dando click a la opcion enlazada
    private void mnEditar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditar_MenuActionPerformed
        EditarFrame_Menu editarMenu = new EditarFrame_Menu();
        editarMenu.setVisible(true);    
    }//GEN-LAST:event_mnEditar_MenuActionPerformed

    //LLama a la ventana de mostrar propina dando click a la opcion enlazada
    private void mnMostrarPropina_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrarPropina_PedidosActionPerformed
        MostrarFrame_Propina propina = new MostrarFrame_Propina();
        propina.setVisible(true);
    }//GEN-LAST:event_mnMostrarPropina_PedidosActionPerformed

    //LLama a la ventana de mostrar los menus dando click a la opcion enlazada
    private void mnMostrar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrar_MenuActionPerformed
        MostrarFrame_Menu mostrarMenu = new MostrarFrame_Menu();
        mostrarMenu.setVisible(true);
    }//GEN-LAST:event_mnMostrar_MenuActionPerformed

    //LLama a la ventana de agregar un menu dando click a la opcion enlazada
    private void mnAgregar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregar_MenuActionPerformed
        AgregarFrame_Menu agregarMenu = new AgregarFrame_Menu();
        agregarMenu.setVisible(true);
    }//GEN-LAST:event_mnAgregar_MenuActionPerformed

    //LLama a la ventana de eliminar un menu dando click a la opcion enlazada
    private void mnEliminar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEliminar_MenuActionPerformed
        EliminarFrame_Menu eliminarMenu = new EliminarFrame_Menu();
        eliminarMenu.setVisible(true);
    }//GEN-LAST:event_mnEliminar_MenuActionPerformed

    //LLama a la ventana de agregar promociones para un menu dando click a la opcion enlazada
    private void mnPromociones_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPromociones_MenuActionPerformed
        PromocionesFrame_Menu promocionesMenu = new PromocionesFrame_Menu();
        promocionesMenu.setVisible(true);
    }//GEN-LAST:event_mnPromociones_MenuActionPerformed

    //LLama a la ventana de agregar pedidos realizado dando click a la opcion enlazada
    private void mnAgregar_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregar_PedidosActionPerformed
        AgregarFrame_Pedidos agregarPedidos = new AgregarFrame_Pedidos();
        agregarPedidos.setVisible(true);
    }//GEN-LAST:event_mnAgregar_PedidosActionPerformed

    //LLama a la ventana de mostrar los pedidos realizados dando click a la opcion enlazada
    private void mnMostrar_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrar_PedidosActionPerformed
        MostrarFrame_Pedidos mostrarPedidos = new MostrarFrame_Pedidos();
        mostrarPedidos.setVisible(true);
    }//GEN-LAST:event_mnMostrar_PedidosActionPerformed

    //LLama a la ventana de agregar propina dando click a la opcion enlazada
    private void mnAgregarPropina_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarPropina_PedidosActionPerformed
        AgregarFrame_Propina agregarPropina = new AgregarFrame_Propina();
        agregarPropina.setVisible(true);
    }//GEN-LAST:event_mnAgregarPropina_PedidosActionPerformed

    //LLama a la ventana de mostrar los ingredientes que hay disponibles dando click a la opcion enlazada
    private void mnMostrar_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrar_IngredientesActionPerformed
        MostrarFrame_Ingredientes mostrarIngredientes = new MostrarFrame_Ingredientes();
        mostrarIngredientes.setVisible(true);
    }//GEN-LAST:event_mnMostrar_IngredientesActionPerformed

    //LLama a la ventana de agregar ingredientes dando click a la opcion enlazada
    private void mnAgregar_IngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregar_IngredientesActionPerformed
        AgregarFrame_Ingredientes agregarIngredientes = new AgregarFrame_Ingredientes();
        agregarIngredientes.setVisible(true);
    }//GEN-LAST:event_mnAgregar_IngredientesActionPerformed

    //LLama a la ventana de mostrar las reservas realizadas dando click a la opcion enlazada
    private void mnMostrar_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrar_ReservasActionPerformed
        MostrarFrame_Reservas mostrarReservas = new MostrarFrame_Reservas();
        mostrarReservas.setVisible(true);
    }//GEN-LAST:event_mnMostrar_ReservasActionPerformed

    //LLama a la ventana de agregar reservas dando click a la opcion enlazada
    private void mnAgregar_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregar_ReservasActionPerformed
        AgregarFrame_Reservas agregarReservas = new AgregarFrame_Reservas();
        agregarReservas.setVisible(true);
    }//GEN-LAST:event_mnAgregar_ReservasActionPerformed

    //LLama a la ventana de mostrar los turnos de los empleados dando click a la opcion enlazada
    private void mnMostrarTurnos_InformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrarTurnos_InformesActionPerformed
        MostrarTurnoFrame_Empleado turnos = new MostrarTurnoFrame_Empleado();
        turnos.setVisible(true);
    }//GEN-LAST:event_mnMostrarTurnos_InformesActionPerformed

    //LLama a la ventana de agregar los turnos de los empleados dando click a la opcion enlazada
    private void mnAgregarTurnos_InformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarTurnos_InformesActionPerformed
        AgregarTurnoFrame_Empleado agregarTurno = new AgregarTurnoFrame_Empleado();
        agregarTurno.setVisible(true);
    }//GEN-LAST:event_mnAgregarTurnos_InformesActionPerformed

    //LLama a la ventana de ventas realizadas dando click a la opcion enlazada
    private void mnSistema_Mostrar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSistema_Mostrar_UsuariosActionPerformed
        MostrarFrame_Usuario mostrarUsuario = new MostrarFrame_Usuario();
        mostrarUsuario.setVisible(true);
    }//GEN-LAST:event_mnSistema_Mostrar_UsuariosActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere cerrar sesion del sistema?", "Cerrar Sesion", 2);
        
        if(opcion == 0){
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem mnAgregarPropina_Pedidos;
    private javax.swing.JMenuItem mnAgregarTurnos_Informes;
    private javax.swing.JMenuItem mnAgregar_Ingredientes;
    private javax.swing.JMenuItem mnAgregar_Menu;
    private javax.swing.JMenuItem mnAgregar_Pedidos;
    private javax.swing.JMenuItem mnAgregar_Reservas;
    private javax.swing.JMenuItem mnEditar_Menu;
    private javax.swing.JMenuItem mnEliminar_Menu;
    private javax.swing.JMenuItem mnMostrarPropina_Pedidos;
    private javax.swing.JMenuItem mnMostrarTurnos_Informes;
    private javax.swing.JMenuItem mnMostrar_Ingredientes;
    private javax.swing.JMenuItem mnMostrar_Menu;
    private javax.swing.JMenuItem mnMostrar_Pedidos;
    private javax.swing.JMenuItem mnMostrar_Reservas;
    private javax.swing.JMenuItem mnPromociones_Menu;
    private javax.swing.JMenuItem mnSistema_Mostrar_Usuarios;
    // End of variables declaration//GEN-END:variables

class Background extends JPanel{
    private Image background;
    
    public void paint(Graphics g){
        background = new ImageIcon(getClass().getResource("/Images/BackGround.png")).getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}

}

