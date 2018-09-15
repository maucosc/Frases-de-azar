package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelos.Accion;
import modelos.Lugar;
import modelos.Nombre;
import modelos.TMAccion;
import modelos.TMLugar;
import modelos.TMNombre;

public class App extends javax.swing.JFrame {

    private List<Nombre> listaNombres;
    private List<Accion> listaAcciones;
    private List<Lugar> listaLugares;
    
    private Random ran;

    private int cont;
    private int cont1;
    private int cont2;


    private TMNombre modelNombres;
    private TMAccion modelAcciones;
    private TMLugar modelLugares;

    public App() {
        initComponents();

        ran = new Random();
        listaNombres = new ArrayList<>();
        listaAcciones = new ArrayList<>();
        listaLugares = new ArrayList<>();

        setTitle("Frases Random");

        setCentered(true);
        setResizable(false);
        
        cont = 0;
        cont1 = 0;
        cont2 = 0;

        modelNombres = new TMNombre(listaNombres);
        tblListaNombres.setModel(modelNombres);

        modelAcciones = new TMAccion(listaAcciones);
        tblListaAccion.setModel(modelAcciones);
        
        modelLugares = new TMLugar(listaLugares);
        tblListaLugar.setModel(modelLugares);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtAccion = new javax.swing.JTextField();
        btnAñadirAccion = new javax.swing.JButton();
        lblContenidoAccion = new javax.swing.JLabel();
        btnAzarAccion = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblListaAccion = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAñadirNombre = new javax.swing.JButton();
        lblContenidoNom = new javax.swing.JLabel();
        btnAzarNombre = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblListaNombres = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        btnAñadirLugar = new javax.swing.JButton();
        lblContenidoLugar = new javax.swing.JLabel();
        btnAzarLugar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblListaLugar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblNombreAzar = new javax.swing.JLabel();
        lblAccionAzar = new javax.swing.JLabel();
        lblLugarAzar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));
        jPanel9.setToolTipText("");

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aim_32.png"))); // NOI18N
        jLabel13.setText("Accion");

        btnAñadirAccion.setText("Anadir");
        btnAñadirAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirAccionActionPerformed(evt);
            }
        });

        lblContenidoAccion.setText("contenido:");

        btnAzarAccion.setText("Azar");
        btnAzarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzarAccionActionPerformed(evt);
            }
        });

        tblListaAccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(tblListaAccion);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(btnAñadirAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAzarAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContenidoAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirAccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContenidoAccion)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAzarAccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/my-profile.png"))); // NOI18N
        jLabel2.setText("Nombre");

        btnAñadirNombre.setText("Anadir");
        btnAñadirNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirNombreActionPerformed(evt);
            }
        });

        lblContenidoNom.setText("contenido:");

        btnAzarNombre.setText("azar");
        btnAzarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzarNombreActionPerformed(evt);
            }
        });

        tblListaNombres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblListaNombres);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAñadirNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAzarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(lblContenidoNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContenidoNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnAzarNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(240, 0, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/if_15_2135924.png"))); // NOI18N
        jLabel4.setText("Lugar");

        btnAñadirLugar.setText("Anadir");
        btnAñadirLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirLugarActionPerformed(evt);
            }
        });

        lblContenidoLugar.setText("contenido:");

        btnAzarLugar.setText("azar");
        btnAzarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzarLugarActionPerformed(evt);
            }
        });

        tblListaLugar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblListaLugar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblContenidoLugar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtLugar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadirLugar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btnAzarLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirLugar)
                .addGap(3, 3, 3)
                .addComponent(lblContenidoLugar)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAzarLugar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));

        lblNombreAzar.setForeground(new java.awt.Color(255, 102, 102));
        lblNombreAzar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreAzar.setText("Nombre aletorio");

        lblAccionAzar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccionAzar.setText("Accion aletoria");

        lblLugarAzar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLugarAzar.setText("Lugar aletorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccionAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLugarAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblNombreAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccionAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLugarAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirNombreActionPerformed
        AnadirNombre();
    }//GEN-LAST:event_btnAñadirNombreActionPerformed

    private void btnAzarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzarNombreActionPerformed
        int size = listaNombres.size();
        if (size > 0) {
            int numRandom = ran.nextInt(size);
            System.out.println("Nombre " + numRandom);

            Nombre a = listaNombres.get(numRandom);
            lblNombreAzar.setText(a.getId() + "-" + a.getNombre());
        }
    }//GEN-LAST:event_btnAzarNombreActionPerformed

    private void btnAñadirAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirAccionActionPerformed
        AnadirAccion();
    }//GEN-LAST:event_btnAñadirAccionActionPerformed

    private void btnAzarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzarAccionActionPerformed
        int size = listaAcciones.size();
        if (size > 0) {
            int numRandom = ran.nextInt(size);
            System.out.println("RANDOM > " + numRandom);

            Accion a = listaAcciones.get(numRandom);
            lblAccionAzar.setText(a.getId() + " - " + a.getNombre());
        }
    }//GEN-LAST:event_btnAzarAccionActionPerformed

    private void btnAñadirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirLugarActionPerformed
        AnadirLugar();
    }//GEN-LAST:event_btnAñadirLugarActionPerformed

    private void btnAzarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzarLugarActionPerformed
        int size = listaLugares.size();
        if (size > 0) {
            int numRandom = ran.nextInt(size);
            System.out.println("RANDOM > " + numRandom);

            Lugar a = listaLugares.get(numRandom);
            lblLugarAzar.setText(a.getId() + " - " + a.getNombre());
        }
    }//GEN-LAST:event_btnAzarLugarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzarAccion;
    private javax.swing.JButton btnAzarLugar;
    private javax.swing.JButton btnAzarNombre;
    private javax.swing.JButton btnAñadirAccion;
    private javax.swing.JButton btnAñadirLugar;
    private javax.swing.JButton btnAñadirNombre;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAccionAzar;
    private javax.swing.JLabel lblContenidoAccion;
    private javax.swing.JLabel lblContenidoLugar;
    private javax.swing.JLabel lblContenidoNom;
    private javax.swing.JLabel lblLugarAzar;
    private javax.swing.JLabel lblNombreAzar;
    private javax.swing.JTable tblListaAccion;
    private javax.swing.JTable tblListaLugar;
    private javax.swing.JTable tblListaNombres;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void setCentered(boolean bool) {
        if (bool) {
            setLocationRelativeTo(null);
        }
    }

    private void AnadirNombre() {

        String nombre = txtNombre.getText();
        if (!nombre.trim().isEmpty()) {
            Nombre a = new Nombre();

            a.setNombre(nombre);
            a.setId(++cont);

            listaNombres.add(a);

            lblContenidoNom.setText("Contenido: " + listaNombres.size());

            txtNombre.setText(null);
            txtNombre.requestFocus();
            tblListaNombres.updateUI();
        }

    }

    private void AnadirAccion() {

        String accion = txtAccion.getText();
        if (!accion.trim().isEmpty()) {
            Accion a = new Accion();

            a.setNombre(accion);
            a.setId(++cont1);

            listaAcciones.add(a);

            lblContenidoAccion.setText("Contenido: " + listaAcciones.size());

            txtAccion.setText(null);
            txtAccion.requestFocus();
            tblListaAccion.updateUI();
        }
    }

    private void AnadirLugar() {

        String lugar = txtLugar.getText();
        if (!lugar.trim().isEmpty()) {
            Lugar a = new Lugar();

            a.setNombre(lugar);
            a.setId(++cont2);

            listaLugares.add(a);

            lblContenidoLugar.setText("Contenido: " + listaLugares.size());

            txtLugar.setText(null);
            txtLugar.requestFocus();
            tblListaLugar.updateUI();
        }
    }
}
