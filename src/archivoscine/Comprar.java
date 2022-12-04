package archivoscine;


import com.mysql.cj.util.StringUtils;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDTypelFont;


public class Comprar extends javax.swing.JFrame {
    //construyendo tabla
    JTable tabla;
    ResultSet rs;
    public Comprar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cine action");          
        panelRecibo.setVisible(false);
    }

    DefaultComboBoxModel modeloPeli = new DefaultComboBoxModel();

    

    
    ArrayList mListaPeliculas;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        cbNPelicula = new javax.swing.JComboBox<>();
        numComp = new javax.swing.JTextField();
        btnReservar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Generar = new javax.swing.JButton();
        numNSilla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        panelRecibo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnomPeli = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txthIF = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnSilla = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbNPelicula.setModel(modeloPeli);
        cbNPelicula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbNPeliculaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbNPeliculaFocusLost(evt);
            }
        });
        cbNPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNPeliculaActionPerformed(evt);
            }
        });

        numComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numCompMouseClicked(evt);
            }
        });

        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jLabel4.setText("Elija una pelicula.");

        jLabel5.setText("Digite el o los numeros de sillas:");

        jLabel6.setText("Nombre comprador");

        Generar.setText("Generar Boleto");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        numNSilla.setText("#columna#fila,nSilla");
        numNSilla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numNSillaFocusLost(evt);
            }
        });
        numNSilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numNSillaMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pelicula", "Hora Inicio", "Hora Fin", "# Sala"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        txtnUsuario.setText("jLabel1");

        jLabel7.setText("Nombre Pelicula");

        txtnomPeli.setText("jLabel1");

        jLabel9.setText("Horario");

        txthIF.setText("jLabel1");

        jLabel11.setText("Silla");

        txtnSilla.setText("jLabel1");

        javax.swing.GroupLayout panelReciboLayout = new javax.swing.GroupLayout(panelRecibo);
        panelRecibo.setLayout(panelReciboLayout);
        panelReciboLayout.setHorizontalGroup(
            panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReciboLayout.createSequentialGroup()
                .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReciboLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReciboLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)))
                .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnomPeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthIF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnSilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelReciboLayout.setVerticalGroup(
            panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReciboLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtnomPeli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txthIF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnSilla)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("(ingresar primeramente los datos para poder guardar los datos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numComp)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numNSilla))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbNPelicula, 0, 162, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Generar)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numNSilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservar)
                    .addComponent(Generar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numCompMouseClicked
      numComp.setText("");
    }//GEN-LAST:event_numCompMouseClicked

    private void cbNPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNPeliculaActionPerformed
        
    }//GEN-LAST:event_cbNPeliculaActionPerformed

    private void cbNPeliculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbNPeliculaFocusGained
        //Llenado dinamico de las lista desplegable
        String peticion= "nomPeli";
        Operaciones op = new Operaciones();
        mListaPeliculas = new ArrayList();
        mListaPeliculas = op.getListaPeli(peticion);
        Iterator iterador = mListaPeliculas.iterator();  
            while (iterador.hasNext()) {
                listaConsultas mConsultas = (listaConsultas) iterador.next();
                modeloPeli.addElement(mConsultas.getNomPeli());
            }
    }//GEN-LAST:event_cbNPeliculaFocusGained

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        
        // imprimir el recibo de compra en pdf
        /*
        try{
        PDDocument documento= new PDDocument();
        PDPage pagina= new PDPage(PDRectangle.A4);
        documento.addPage(pagina);
        PDPageContentStream contenido= new PDPageContentStream(documento,pagina);
        
        contenido.beginText();
        contenido.newLineAtOffset(20, pagina.getMediaBox().getHeight()-52);
        contenido.showText(this.cbNPelicula.getActionCommand());
        //contenido.showText(this.numComp.getActionCommand());
        //contenido.showText(this.numNSilla.getActionCommand());
        contenido.endText();
        
        contenido.close();
        
        //documento.save(Ubicacion);
        
    }   catch (IOException ex) {
            Logger.getLogger(Comprar.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //mostrar recibo en ventana
        Operaciones op = new Operaciones();
        panelRecibo.setVisible(true);
        txtnUsuario.setText(numComp.getText());
        txtnomPeli.setText(cbNPelicula.getSelectedItem().toString());
        txthIF.setText(jTable1.getValueAt(0, 1).toString()+jTable1.getValueAt(0, 2).toString());
        txtnSilla.setText(numNSilla.getText());
        
        modeloPeli.removeAllElements();
        numComp.setText("");
        numNSilla.setText("");
    }//GEN-LAST:event_GenerarActionPerformed

    private void numNSillaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numNSillaFocusLost
        
    }//GEN-LAST:event_numNSillaFocusLost

    private void cbNPeliculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbNPeliculaFocusLost
        //Traer el horario de la pelicula seleccionada
        String peticion= (String) cbNPelicula.getSelectedItem();
        
        DefaultTableModel dfm = new DefaultTableModel();
        tabla=this.jTable1;
        tabla.setModel(dfm);
        
        dfm.setColumnIdentifiers(new Object[]{"Nombre pelicula","Hora inicio","Hora fin","# Sala"});
        Operaciones op = new Operaciones();
        rs = op.getListaPeliH(peticion);
        try {
            while (rs.next()) {                
                dfm.addRow(new  Object[]{rs.getString("nomPeli"),rs.getString("hInicio"),rs.getString("hFin"),rs.getInt("nSala")});
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbNPeliculaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Guardar datos de la silla
        //validar tipo de silla antes de guardar
        String nSala= jTable1.getValueAt(0, 3).toString();
        String nSillas = numNSilla.getText();
        String subCadena=nSillas.substring(0,1);

        int tipoSilla;
        Operaciones op = new Operaciones();
        rs= op.getTipoSilla(nSala);
        
        try {
            while (rs.next()) {                
                
                if (subCadena==rs.getString("nColumVIP")) {
                    tipoSilla=1;
                    op.insertSillas(tipoSilla, numNSilla.getText());
                }else{
                    tipoSilla=0;
                    op.insertSillas(tipoSilla, numNSilla.getText());
                }
               
            }
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        //guardando datos en latabla taquilla y llamado de la clave foranea para el tipo de silla
        System.out.println(numComp.getText());
        Operaciones op = new Operaciones();
        rs = op.getNSilla(numNSilla.getText());
        try {
            while (rs.next()) {
                op.insertTaquilla(numComp.getText(), cbNPelicula.getSelectedItem().toString() , rs.getInt(numNSilla.getText()));
            }
        } catch (Exception e) {
        }

       
    }//GEN-LAST:event_btnReservarActionPerformed

    private void numNSillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numNSillaMouseClicked
        numNSilla.setText("");
    }//GEN-LAST:event_numNSillaMouseClicked

    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cbNPelicula;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numComp;
    private javax.swing.JTextField numNSilla;
    private javax.swing.JPanel panelRecibo;
    private javax.swing.JLabel txthIF;
    private javax.swing.JLabel txtnSilla;
    private javax.swing.JLabel txtnUsuario;
    private javax.swing.JLabel txtnomPeli;
    // End of variables declaration//GEN-END:variables
}
