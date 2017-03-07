/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import static java.lang.Thread.sleep;

/**
 *
 * @author usrlab01
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTAPrincipal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTASec1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTASec2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLblContadorPrincipal = new javax.swing.JLabel();
        jLblContadorSecundario1 = new javax.swing.JLabel();
        jLblContadorSecundario2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTAPrincipal.setColumns(20);
        jTAPrincipal.setRows(5);
        jScrollPane1.setViewportView(jTAPrincipal);

        jTASec1.setColumns(20);
        jTASec1.setRows(5);
        jScrollPane2.setViewportView(jTASec1);

        jTASec2.setColumns(20);
        jTASec2.setRows(5);
        jScrollPane3.setViewportView(jTASec2);

        jLabel1.setText("Thread Principal");

        jLabel2.setText("Thread Secundária 1");

        jLabel3.setText("Thread Secundária 2");

        jButton1.setText("Inicializar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLblContadorPrincipal.setText("0");

        jLblContadorSecundario1.setText("0");

        jLblContadorSecundario2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLblContadorPrincipal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLblContadorSecundario1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblContadorSecundario2)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblContadorPrincipal)
                    .addComponent(jLblContadorSecundario1)
                    .addComponent(jLblContadorSecundario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Thread tPrincipal = new Thread() {
            public void run() {
                while (true) {
                    /*jTAPrincipal.append("Fluxo Principal\n");
                    jTAPrincipal.setCaretPosition(jTAPrincipal.getDocument().getLength());*/
                    
                    int qtdAtual = Integer.parseInt(jLblContadorPrincipal.getText());
                    jLblContadorPrincipal.setText((qtdAtual+1)+"");
                    try {
                        //sleep(200);
                    } catch (Exception e) {
                        //trata-se falha
                    }
                }
            }
        };
        //não mudo a prioridade da thread principal, ou seja, ela se mantem em 5 (média)
        tPrincipal.setPriority(5);
        tPrincipal.start();
        
        //criação de uma thread inline
        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    /*jTASec1.append("Fluxo secundário 1\n");
                    jTASec1.setCaretPosition(jTASec1.getDocument().getLength());*/
                    
                    int qtdAtual = Integer.parseInt(jLblContadorSecundario1.getText());
                    jLblContadorSecundario1.setText((qtdAtual+1)+"");
                    try {
                        //sleep(200);
                    } catch (Exception e) {
                        //trata-se falha
                    }
                }
            }
        };
        //mudo a prioridade para a thread t1 para 10, ou seja, prioridade máxima de CPU
        t1.setPriority(10);
        t1.start();//start faz com que o run execute sua tarefa em paralelo

        //criação de uma thread inline
        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    /*jTASec2.append("Fluxo secundário 2\n");
                    jTASec2.setCaretPosition(jTASec2.getDocument().getLength());*/
                    
                    int qtdAtual = Integer.parseInt(jLblContadorSecundario2.getText());
                    jLblContadorSecundario2.setText((qtdAtual+1)+"");
                    try {
                        //sleep(200);
                    } catch (Exception e) {
                        //trata-se falha
                    }
                }
            }
        };
        //mudo a prioridade para a thread t2 para 1, ou seja, prioridade mínima de CPU
        t2.setPriority(1);
        t2.start();

        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblContadorPrincipal;
    private javax.swing.JLabel jLblContadorSecundario1;
    private javax.swing.JLabel jLblContadorSecundario2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTAPrincipal;
    private javax.swing.JTextArea jTASec1;
    private javax.swing.JTextArea jTASec2;
    // End of variables declaration//GEN-END:variables
}
