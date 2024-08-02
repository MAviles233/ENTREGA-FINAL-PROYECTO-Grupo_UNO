/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_cafeteria;

import GestionDatos.DB_Menu;
import clases.Menu;
import clases.ValidacionDatos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 1 - Proyecto Cafeteria - Curso 6-2
 */
public class AgregarFrame_Menu extends javax.swing.JFrame {

    private Menu menu;
    private DB_Menu db_menu;
    /**
     * Creates new form AgregarFrame_Menu
     */
    public AgregarFrame_Menu() {
        initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(249, 248, 204));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoria = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        txtCalorias = new java.awt.TextField();
        txtPrecio = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtIngredientes = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO MENU");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel3.setText("Categoria:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 204, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));
        jPanel1.add(txtCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 70, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel6.setText("Ingredientes:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel7.setText("Calorias:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane6.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 210, 100));

        txtIngredientes.setColumns(20);
        txtIngredientes.setRows(5);
        jScrollPane7.setViewportView(txtIngredientes);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, 100));

        btnGuardar.setBackground(new java.awt.Color(204, 250, 250));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoGuardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 120, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 204, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel1.setText("Nombre del Menu:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel2.setText("Descripcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 15)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 2, 48)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuIcon.png"))); // NOI18N
        jLabel8.setText("Ingreso de datos de un menú");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setIconTextGap(100);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isNullorEmpty(String text){
        return text == null || text.isEmpty();
    }
    
    private void limpiarCampos(){
        txtCalorias.setText("");
        txtCategoria.setText("");
        txtDescripcion.setText("");
        txtIngredientes.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtEstado.setText("");
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        menu = new Menu();
        db_menu = new DB_Menu();
        boolean camposLlenos = !isNullorEmpty(txtCalorias.getText()) && !isNullorEmpty(txtCategoria.getText()) &&
                !isNullorEmpty(txtDescripcion.getText()) && !isNullorEmpty(txtIngredientes.getText()) &&
                !isNullorEmpty(txtNombre.getText()) && !isNullorEmpty(txtPrecio.getText()) && !isNullorEmpty(txtEstado.getText());
        
        boolean camposCorrectos = isNullorEmpty(ValidacionDatos.texto(txtNombre.getText())) && 
                isNullorEmpty(ValidacionDatos.texto(txtIngredientes.getText())) && 
                isNullorEmpty(ValidacionDatos.texto(txtEstado.getText()));
        
        if(camposLlenos){
            if(camposCorrectos){
                menu.setCalorias(Double.parseDouble(txtCalorias.getText()));
                menu.setCategoria(txtCategoria.getText());
                menu.setDescripcion(txtDescripcion.getText());
                menu.setIngredientes(txtIngredientes.getText());
                menu.setNombre(txtNombre.getText());
                menu.setPrecio(Double.parseDouble(txtPrecio.getText()));
                menu.setEstado(txtEstado.getText());
                
                db_menu.guardarMenu(menu);
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS INCORRECTOS");
            }
        }else{
            JOptionPane.showMessageDialog(null, "FALTAN DE LLENAR CAMPOS");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.TextField txtCalorias;
    private java.awt.TextField txtCategoria;
    private javax.swing.JTextArea txtDescripcion;
    private java.awt.TextField txtEstado;
    private javax.swing.JTextArea txtIngredientes;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
