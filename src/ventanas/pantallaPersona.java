/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import modelos.Constantes;
import modelos.Persona;

/**
 *
 * @author SPARTAN PC
 */
public class pantallaPersona extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPersona
     */
    public pantallaPersona() {
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

        jLabelNombre = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jButtonValidar = new javax.swing.JButton();
        jLabelValEdad = new javax.swing.JLabel();
        jLabelValIMC = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        jLabelValSexo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombre.setText("Nombre");

        jLabelEdad.setText("Edad");

        jLabelSexo.setText("Sexo");

        jLabelPeso.setText("Peso");

        jLabelAltura.setText("Altura");

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });

        jTextFieldSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSexoKeyTyped(evt);
            }
        });

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jLabelValEdad.setForeground(new java.awt.Color(204, 0, 0));

        jLabelValIMC.setForeground(new java.awt.Color(204, 0, 0));

        jLabelValSexo.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButtonValidar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Result)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAltura)
                                    .addComponent(jLabelPeso)
                                    .addComponent(jLabelSexo)
                                    .addComponent(jLabelEdad)
                                    .addComponent(jLabelNombre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEdad)
                                    .addComponent(jTextFieldSexo)
                                    .addComponent(jTextFieldPeso)
                                    .addComponent(jTextFieldAltura))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelValSexo)
                                    .addComponent(jLabelValEdad)
                                    .addComponent(jLabelValIMC))))))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEdad)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValIMC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAltura)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonValidar)
                .addGap(27, 27, 27)
                .addComponent(Result)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        Persona persona = new Persona(
                this.jTextFieldNombre.getText(), Integer.parseInt(this.jTextFieldEdad.getText()),
                "",this.jTextFieldSexo.getText().charAt(0),
                Double.parseDouble(this.jTextFieldPeso.getText()),Double.parseDouble(this.jTextFieldAltura.getText()));
        this.jLabelValEdad.setText(persona.esMayorDeEdad()?Constantes.MAYOR_EDAD:Constantes.MENOR_EDAD); 
        switch(persona.calcularIMC())
        { 
            case Constantes.PESO_PORDEBAJO:
                this.jLabelValIMC.setText(Constantes.PESO_PORDEBAJO_S);
                break;
            case Constantes.PESO_IDEAL:
                this.jLabelValIMC.setText(Constantes.PESO_IDEAL_S);
                break;
            case Constantes.SOBREPESO:
                this.jLabelValIMC.setText(Constantes.SOBREPESO_S);
                break;
            default:
                break;
        }
        this.jLabelValSexo.setText(Constantes.CHAR_FAIL==persona.getSexo()?Constantes.SEXO_ERROR:Constantes.CADENA_VACIA);
        
        this.Result.setText(persona.toString());
                
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jTextFieldSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSexoKeyTyped
         if(jTextFieldSexo.getText().length()>=1) {  
   evt.consume();
 }
    }//GEN-LAST:event_jTextFieldSexoKeyTyped

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
            java.util.logging.Logger.getLogger(pantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Result;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelValEdad;
    private javax.swing.JLabel jLabelValIMC;
    private javax.swing.JLabel jLabelValSexo;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldSexo;
    // End of variables declaration//GEN-END:variables
}