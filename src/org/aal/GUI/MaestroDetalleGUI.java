package org.aal.GUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.aal.entities.Album;
import org.aal.entities.Artista;
import org.aal.service.AlbumService;
import org.aal.service.ArtistaService;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * MaestroDetalleGUI.java
 *
 * Created on 16/09/2012, 12:34:31 PM
 */
/**
 *
 * @author Jose Luis
 */
public  class MaestroDetalleGUI extends javax.swing.JFrame {

    ArtistaService artistaService = new ArtistaService();
    AlbumService albumService = new AlbumService();
    List<Album> albumes = new ArrayList<Album>();
    List<Artista> artistas = new ArrayList<Artista>();
    Album album = new Album();
    Artista artista = new Artista();
    int fila;
    DefaultTableModel modelotable = new DefaultTableModel(null,getColumnas());
    /** Creates new form MaestroDetalleGUI */
    public MaestroDetalleGUI() {
        initComponents();
        /*Buscar Datos de la BDD*/
        iniciarComboBox();
    }
    public MaestroDetalleGUI(int flag)
    {
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboArtista = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoIdArtista = new javax.swing.JTextField();
        añadirArtista = new javax.swing.JButton();
        eliminarArtista = new javax.swing.JButton();
        añadirDetalleArtista = new javax.swing.JButton();
        eliminarDetalleArtista = new javax.swing.JButton();
        actualizarDetalle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maestro-Detalle");

        tablaDetalle.setModel(modelotable);
        tablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDetalle);

        jLabel1.setText("Detalle");

        jLabel2.setText("Maestro");

        comboArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboArtistaActionPerformed(evt);
            }
        });

        jLabel3.setText("Artista:");

        jLabel4.setText("ID:");

        textoIdArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdArtistaActionPerformed(evt);
            }
        });

        añadirArtista.setText("Añadir");
        añadirArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirArtistaActionPerformed(evt);
            }
        });

        eliminarArtista.setText("Eliminar");
        eliminarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArtistaActionPerformed(evt);
            }
        });

        añadirDetalleArtista.setText("Añadir Detalle");
        añadirDetalleArtista.setEnabled(false);
        añadirDetalleArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDetalleArtistaActionPerformed(evt);
            }
        });

        eliminarDetalleArtista.setText("Eliminar Detalle");
        eliminarDetalleArtista.setEnabled(false);
        eliminarDetalleArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDetalleArtistaActionPerformed(evt);
            }
        });

        actualizarDetalle.setText("Actualizar Detalle");
        actualizarDetalle.setEnabled(false);
        actualizarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDetalleActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoIdArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(añadirArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarArtista))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(506, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(añadirDetalleArtista)
                .addGap(70, 70, 70)
                .addComponent(eliminarDetalleArtista)
                .addGap(65, 65, 65)
                .addComponent(actualizarDetalle)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(añadirArtista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(textoIdArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eliminarArtista))
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirDetalleArtista)
                    .addComponent(actualizarDetalle)
                    .addComponent(eliminarDetalleArtista))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String[] getColumnas()
    {
          String columna[]=new String[]{"Id","Nombre Album","Fecha Lanzamiento","Genero",
          "Duracion","Precio"};
          return columna;
    }

    public void iniciarComboBox ()
    {
        try
        {
            artistas = artistaService.getAll();
        /*Llenar comboBox con datos de BDD*/
        for(Artista artistalista:artistas)
        {    //JOptionPane.showMessageDialog(null,artistalista.getNombreArtista(),"Mensaje",JOptionPane.INFORMATION_MESSAGE );
             comboArtista.addItem(artistalista.getNombreArtista());
        }
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "Base De Datos Vacía: Agregue Datos Por Favor", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void reiniciarJTable()
    {
        DefaultTableModel  modelo = (DefaultTableModel)tablaDetalle.getModel();
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
    }
    public void iniciarJTable(int idArtista)
    {
        albumes=albumService.getByIdArtista(idArtista);
        Object [] fila = new Object[6];
        try
        {
            for(Album albumlista:albumes)
            {
                fila[0]=albumlista.getId();
                fila[1]=(albumlista.getNombreAlbum());
                fila[2]=(albumlista.getFechaLanzamiento());
                fila[3]=(albumlista.getGenero());
                fila[4]=(albumlista.getDuracion());
                fila[5]=(albumlista.getPrecio());
                modelotable.addRow(fila);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void actualizarComboBox()
    {
        artistas.clear();
        artistas=artistaService.getAll();
        comboArtista.addItem(artistas.get(artistas.size()-1).getNombreArtista());
    }
    private void añadirDetalleArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDetalleArtistaActionPerformed
        // TODO add your handling code here:
        artista=artistaService.getById(Integer.parseInt(textoIdArtista.getText()));
        AñadirDetalleArtista añadirDetalleArtista = new AñadirDetalleArtista(artista);
        añadirDetalleArtista.setVisible(true);
    }//GEN-LAST:event_añadirDetalleArtistaActionPerformed

    private void añadirArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirArtistaActionPerformed
        // TODO add your handling code here:
      Artista artistaNuevo = new Artista();
      String nombreArtista;
      nombreArtista=JOptionPane.showInputDialog(null,"Ingrese el Nombre del Artista","Ingresar Artista",JOptionPane.OK_OPTION);
      artistaNuevo.setNombreArtista(nombreArtista);
      artistaService.persistArtista(artistaNuevo);
      actualizarComboBox();
    }//GEN-LAST:event_añadirArtistaActionPerformed

    private void comboArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboArtistaActionPerformed
        // TODO add your handling code here:
        String nombreArtista = comboArtista.getSelectedItem().toString();
        artista = artistaService.getByName(nombreArtista);
        textoIdArtista.setText(String.valueOf(artista.getId()));
        reiniciarJTable();
        iniciarJTable(artista.getId());
        añadirDetalleArtista.setEnabled(true);
    }//GEN-LAST:event_comboArtistaActionPerformed

    private void textoIdArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIdArtistaActionPerformed
    public void limpiarComboBox()
    {
        comboArtista.removeAllItems();
    }
    public void removerItemComboBox(String nombre)
    {
        comboArtista.removeItem(nombre);
    }
    private void eliminarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArtistaActionPerformed
        // TODO add your handling code here:
        Artista artistaEliminar= new Artista();
        int flag;
        flag=JOptionPane.showConfirmDialog(null, "Todos los registros de este artista se eliminaran\n "
                + "¿Está seguro de Continuar?","Confirmación",JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            artistaEliminar=artistaService.getById(Integer.parseInt(textoIdArtista.getText()));
            artistaService.deleteArtistaOnCascade(artistaEliminar);
            removerItemComboBox(artistaEliminar.getNombreArtista());
            reiniciarJTable();
        }
    }//GEN-LAST:event_eliminarArtistaActionPerformed

    private void tablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetalleMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1)
        {
          fila = tablaDetalle.getSelectedRow();
          if(fila!=-1)
          {
              eliminarDetalleArtista.setEnabled(true);
              actualizarDetalle.setEnabled(true);
          }
        }
    }//GEN-LAST:event_tablaDetalleMouseClicked

    private void eliminarDetalleArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDetalleArtistaActionPerformed
        // TODO add your handling code here:
        int flag =JOptionPane.showConfirmDialog(null, "Se eliminará el registro permanentemente \n" +
               "¿Desea Continuar?","Confirmación",JOptionPane.YES_NO_OPTION);
        album=albumService.getById(Integer.parseInt(tablaDetalle.getValueAt(fila, 0).toString()));
        if(flag==0)
        {
            albumService.deleteAlbum(album);
            reiniciarJTable();
            iniciarJTable(artista.getId());
        }
    }//GEN-LAST:event_eliminarDetalleArtistaActionPerformed

    private void actualizarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDetalleActionPerformed
        // TODO add your handling code here:
        int idAlbum; int fila=tablaDetalle.getSelectedRow();
        idAlbum = Integer.parseInt(tablaDetalle.getValueAt(fila, 0).toString());
        //JOptionPane.showMessageDialog(null, idAlbum);
        album=albumService.getById(idAlbum);
        artista=artistaService.getById(Integer.parseInt(textoIdArtista.getText()));
        AñadirDetalleArtista actualizarDetalle = new AñadirDetalleArtista(artista,album);
        actualizarDetalle.setVisible(true);
        reiniciarJTable();
        iniciarJTable(artista.getId());
    }//GEN-LAST:event_actualizarDetalleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reiniciarJTable();
        iniciarJTable(Integer.parseInt(textoIdArtista.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MaestroDetalleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaestroDetalleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaestroDetalleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaestroDetalleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MaestroDetalleGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDetalle;
    private javax.swing.JButton añadirArtista;
    private javax.swing.JButton añadirDetalleArtista;
    private javax.swing.JComboBox comboArtista;
    private javax.swing.JButton eliminarArtista;
    private javax.swing.JButton eliminarDetalleArtista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField textoIdArtista;
    // End of variables declaration//GEN-END:variables
}