/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tela1.java
 *
 * Created on 01/10/2012, 14:43:27
 */

package conexion;

/**
 *
 * @author Fabio
 */
public class Tela1 extends javax.swing.JFrame {

    /** Creates new form Tela1 */
    public Tela1() {
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

        jLabel1 = new javax.swing.JLabel();
        EXCLUIR = new javax.swing.JButton();
        CAD = new javax.swing.JButton();
        CONSU = new javax.swing.JButton();
        ALT = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PROGRAMA DE CADASTRO");

        EXCLUIR.setText("EXCLUIR");
        EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIRActionPerformed(evt);
            }
        });

        CAD.setText("CADASTRAR");
        CAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADActionPerformed(evt);
            }
        });

        CONSU.setText("CONSULTAR");
        CONSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSUActionPerformed(evt);
            }
        });

        ALT.setText("ALTERAR");
        ALT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTActionPerformed(evt);
            }
        });

        SAIR.setText("SAIR");
        SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(SAIR)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CAD)
                            .addGap(15, 15, 15)
                            .addComponent(CONSU)
                            .addGap(7, 7, 7)
                            .addComponent(ALT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(SAIR)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 101, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CAD)
                        .addComponent(CONSU)
                        .addComponent(ALT)
                        .addComponent(EXCLUIR))
                    .addGap(0, 101, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIRActionPerformed
        new Excluir().setVisible(true);
}//GEN-LAST:event_EXCLUIRActionPerformed

    private void CADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADActionPerformed
        new Cadastra().setVisible(true);
}//GEN-LAST:event_CADActionPerformed

    private void CONSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSUActionPerformed
        new Consulta().setVisible(true);
}//GEN-LAST:event_CONSUActionPerformed

    private void ALTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTActionPerformed
        new Alterar().setVisible(true);
}//GEN-LAST:event_ALTActionPerformed

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
        this.dispose();
}//GEN-LAST:event_SAIRActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALT;
    private javax.swing.JButton CAD;
    private javax.swing.JButton CONSU;
    private javax.swing.JButton EXCLUIR;
    private javax.swing.JButton SAIR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
