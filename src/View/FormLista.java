/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Ronny matute
 */
public class FormLista extends javax.swing.JFrame {

    /**
     * Creates new form FormLista
     */
    public FormLista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPC = new javax.swing.JLabel();
        lblDB = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaMusicas = new javax.swing.JList<>();
        lblLoads = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblTotalMusicas = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.8F);
        getContentPane().setLayout(null);

        lblPC.setToolTipText("Abrir desde el PC");
        lblPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblPC);
        lblPC.setBounds(10, 10, 60, 50);

        lblDB.setToolTipText("Abrir desde la Base de Dato");
        lblDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblDB);
        lblDB.setBounds(90, 10, 50, 50);

        lblCerrar.setToolTipText("Cerrar lista");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblCerrar);
        lblCerrar.setBounds(380, 10, 30, 20);

        jListaMusicas.setBackground(new java.awt.Color(0, 102, 102));
        jListaMusicas.setForeground(new java.awt.Color(102, 0, 102));
        jListaMusicas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListaMusicas.setToolTipText("Seleccione una musica");
        jListaMusicas.setAutoscrolls(false);
        jListaMusicas.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jListaMusicas.setOpaque(false);
        jListaMusicas.setSelectionBackground(new java.awt.Color(102, 0, 102));
        jListaMusicas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jListaMusicas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 440, 150);

        lblLoads.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoads.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/loads.gif"))); // NOI18N
        lblLoads.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblLoads);
        lblLoads.setBounds(60, 60, 40, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Lista de Musicas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 70, 150, 24);

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("Buscar musica");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField1.setDisabledTextColor(new java.awt.Color(102, 0, 102));
        jTextField1.setSelectedTextColor(new java.awt.Color(102, 0, 102));
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 24, 190, 20);

        lblTotalMusicas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTotalMusicas.setForeground(new java.awt.Color(102, 0, 102));
        lblTotalMusicas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalMusicas.setText(". . .");
        getContentPane().add(lblTotalMusicas);
        lblTotalMusicas.setBounds(300, 50, 110, 40);

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ReproductorLISTA3.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 420, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList<String> jListaMusicas;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JLabel lblDB;
    public javax.swing.JLabel lblFondo;
    public javax.swing.JLabel lblLoads;
    public javax.swing.JLabel lblPC;
    public javax.swing.JLabel lblTotalMusicas;
    // End of variables declaration//GEN-END:variables
}
