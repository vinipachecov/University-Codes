/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17marco;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class FinalAula extends javax.swing.JFrame {
    String nome;
    String email;
    String cidade;
    String estadocivil;
    
    
    DefaultTableModel model;
    /**
     * 
     * Creates new form FinalAula
     */
    public FinalAula() {
        initComponents();
        model = ((DefaultTableModel)tabelaF.getModel());
        nomeTextField.setText("");
        emailTextField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        estadocivilLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        solteiroRadiobutton = new javax.swing.JRadioButton();
        casadoRadiobutton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaF = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cidadeCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeLabel.setText("Nome");

        nomeTextField.setText("jTextField1");
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

        emailTextField.setText("jTextField2");

        estadocivilLabel.setText("Estado Civil");

        cidadeLabel.setText("Cidade");

        solteiroRadiobutton.setText("Solteiro");

        casadoRadiobutton.setText("Casado");

        tabelaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Estado Civil", "Cidade"
            }
        ));
        jScrollPane1.setViewportView(tabelaF);

        jButton1.setText("+");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cidadeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Maria", "Porto Alegre", "Caxias. Capão da Canoa", "Caçapava" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadocivilLabel)
                    .addComponent(solteiroRadiobutton)
                    .addComponent(casadoRadiobutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLabel)
                    .addComponent(cidadeLabel)
                    .addComponent(emailTextField)
                    .addComponent(cidadeCombobox, 0, 247, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadocivilLabel)
                    .addComponent(cidadeLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(solteiroRadiobutton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casadoRadiobutton)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        novoRegistro();
            
    }//GEN-LAST:event_jButton1MousePressed

    
    
    private boolean novoRegistro(){
        try {
            nome = nomeTextField.getText().toString();
            email = emailTextField.getText().toString();            
            // radio buttons
            if(solteiroRadiobutton.isSelected() || casadoRadiobutton.isSelected()){
                if(solteiroRadiobutton.isSelected())
                    estadocivil = "solteiro";
                else
                    estadocivil = "casado";
            }else
            estadocivil = "complicado";
            cidade = cidadeCombobox.getSelectedItem().toString();
            model.addRow(new String[] {nome, email, estadocivil, cidade});
            return true;
        } catch (Exception e) {
            return false;
        }       
    }
    
    
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
            java.util.logging.Logger.getLogger(FinalAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalAula().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton casadoRadiobutton;
    private javax.swing.JComboBox<String> cidadeCombobox;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel estadocivilLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JRadioButton solteiroRadiobutton;
    private javax.swing.JTable tabelaF;
    // End of variables declaration//GEN-END:variables
}

