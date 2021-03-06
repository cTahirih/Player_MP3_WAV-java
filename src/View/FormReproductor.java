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
public class FormReproductor extends javax.swing.JFrame {

    /**
     * Creates new form FormReproductor
     */
    public FormReproductor() {
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

        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblEquializador = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblPausa = new javax.swing.JLabel();
        lblStop = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblRepetir = new javax.swing.JLabel();
        lblEquializador2 = new javax.swing.JLabel();
        lblTituloMusica = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSliderVolumen = new javax.swing.JSlider();
        lblVolumen = new javax.swing.JLabel();
        lblVolumenPorcentaje = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        lblMinimizar.setToolTipText("Minimizar");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblMinimizar);
        lblMinimizar.setBounds(380, 0, 20, 20);

        lblCerrar.setToolTipText("Cerrar");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblCerrar);
        lblCerrar.setBounds(400, 0, 20, 20);
        getContentPane().add(lblEquializador);
        lblEquializador.setBounds(0, 120, 420, 50);

        lblPlay.setToolTipText("Reproducir");
        lblPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblPlay);
        lblPlay.setBounds(160, 60, 70, 60);

        lblPausa.setToolTipText("Pausar");
        lblPausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblPausa);
        lblPausa.setBounds(270, 80, 50, 40);

        lblStop.setToolTipText("Detener");
        lblStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblStop);
        lblStop.setBounds(70, 80, 50, 40);

        lblMenu.setToolTipText("Abrir Lista de Canciones");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblMenu);
        lblMenu.setBounds(10, 20, 20, 20);

        lblRepetir.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        lblRepetir.setForeground(new java.awt.Color(0, 51, 153));
        lblRepetir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRepetir.setText("OF");
        lblRepetir.setToolTipText("Repetir Musica");
        lblRepetir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblRepetir);
        lblRepetir.setBounds(10, 110, 40, 20);
        getContentPane().add(lblEquializador2);
        lblEquializador2.setBounds(150, 60, 90, 110);

        lblTituloMusica.setForeground(new java.awt.Color(153, 51, 0));
        lblTituloMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloMusica.setText(". . .");
        lblTituloMusica.setToolTipText("Título");
        lblTituloMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblTituloMusica);
        lblTituloMusica.setBounds(50, 20, 320, 16);

        jProgressBar1.setBackground(new java.awt.Color(0, 102, 102));
        jProgressBar1.setForeground(new java.awt.Color(102, 0, 102));
        jProgressBar1.setToolTipText("Progreso");
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 40, 420, 5);

        jSliderVolumen.setBackground(new java.awt.Color(0, 102, 102));
        jSliderVolumen.setForeground(new java.awt.Color(204, 102, 0));
        jSliderVolumen.setToolTipText("Volumen");
        jSliderVolumen.setValue(15);
        jSliderVolumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSliderVolumen);
        jSliderVolumen.setBounds(160, 0, 90, 16);

        lblVolumen.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        lblVolumen.setForeground(new java.awt.Color(153, 0, 153));
        lblVolumen.setText("Volumen: ");
        getContentPane().add(lblVolumen);
        lblVolumen.setBounds(110, 0, 46, 12);

        lblVolumenPorcentaje.setForeground(new java.awt.Color(153, 0, 153));
        lblVolumenPorcentaje.setText("15 %");
        getContentPane().add(lblVolumenPorcentaje);
        lblVolumenPorcentaje.setBounds(260, 0, 40, 16);

        lblAdd.setToolTipText("Guardar en la Base de Dato");
        lblAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblAdd);
        lblAdd.setBounds(350, 106, 30, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 40, 40, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 40, 40, 20);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ReproductorJAVAFinal.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 420, 170);

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
            java.util.logging.Logger.getLogger(FormReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JSlider jSliderVolumen;
    public javax.swing.JLabel lblAdd;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JLabel lblEquializador;
    public javax.swing.JLabel lblEquializador2;
    public javax.swing.JLabel lblFondo;
    public javax.swing.JLabel lblMenu;
    public javax.swing.JLabel lblMinimizar;
    public javax.swing.JLabel lblPausa;
    public javax.swing.JLabel lblPlay;
    public javax.swing.JLabel lblRepetir;
    public javax.swing.JLabel lblStop;
    public javax.swing.JLabel lblTituloMusica;
    private javax.swing.JLabel lblVolumen;
    public javax.swing.JLabel lblVolumenPorcentaje;
    // End of variables declaration//GEN-END:variables
}
