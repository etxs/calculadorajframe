package practica10_gomez_faustino_aranzazu_hannay;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Hanny
 */
public class Calculadora extends javax.swing.JFrame {
    int num1, num2;
    String signo;
    
    public Calculadora() {
        setTitle("¡PANADERIA HANNAY <3!");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/iconkuromi.png"));
        initComponents();
        setLocationRelativeTo(null);		
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        Txt = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JLabel();
        btn0 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        btnModulo = new javax.swing.JButton();
        btnPotencia1 = new javax.swing.JButton();
        TxtFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn1.setForeground(new java.awt.Color(255, 102, 255));
        Btn1.setText("1");
        Btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 40, 40));

        btnResultado.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(255, 102, 255));
        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/kuromi2.png"))); // NOI18N
        btnResultado.setText("=");
        btnResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, 100));

        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/128.png"))); // NOI18N
        btnSuma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 80, 100));

        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/resta.png"))); // NOI18N
        btnResta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 30, 30));

        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/multiplicacion.png"))); // NOI18N
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 30, 30));

        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/division.png"))); // NOI18N
        btnDivision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 30, 30));

        btnLimpiar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 102, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/kuromi1.png"))); // NOI18N
        btnLimpiar.setText("C");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 40));

        Txt.setForeground(new java.awt.Color(102, 0, 102));
        Txt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        Txt.setOpaque(true);
        jPanel1.add(Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, 30));

        TxtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        TxtTitulo.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        TxtTitulo.setForeground(new java.awt.Color(255, 153, 255));
        TxtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtTitulo.setText("Calculadora");
        jPanel1.add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btn0.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 102, 255));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/kuromi3.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 1, true));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 100, 40));

        Btn2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn2.setForeground(new java.awt.Color(255, 102, 255));
        Btn2.setText("2");
        Btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 40, 40));

        Btn3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn3.setForeground(new java.awt.Color(255, 102, 255));
        Btn3.setText("3");
        Btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 40, 40));

        Btn4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn4.setForeground(new java.awt.Color(255, 102, 255));
        Btn4.setText("4");
        Btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 40, 40));

        Btn5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn5.setForeground(new java.awt.Color(255, 102, 255));
        Btn5.setText("5");
        Btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, 40));

        Btn6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn6.setForeground(new java.awt.Color(255, 102, 255));
        Btn6.setText("6");
        Btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, 40));

        Btn7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn7.setForeground(new java.awt.Color(255, 102, 255));
        Btn7.setText("7");
        Btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 40, 40));

        Btn8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn8.setForeground(new java.awt.Color(255, 102, 255));
        Btn8.setText("8");
        Btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 40));

        Btn9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Btn9.setForeground(new java.awt.Color(255, 102, 255));
        Btn9.setText("9");
        Btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 40, 40));

        btnModulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnModulo.setForeground(new java.awt.Color(255, 102, 255));
        btnModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/kuromi9.png"))); // NOI18N
        btnModulo.setText("%");
        btnModulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        btnModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloActionPerformed(evt);
            }
        });
        jPanel1.add(btnModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, 40));

        btnPotencia1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnPotencia1.setForeground(new java.awt.Color(255, 102, 255));
        btnPotencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/potencia.png"))); // NOI18N
        btnPotencia1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        btnPotencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotencia1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPotencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 40, 40));

        TxtFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica10_gomez_faustino_aranzazu_hannay/fondonegro.jpg"))); // NOI18N
        TxtFondo.setText("Calculadora");
        jPanel1.add(TxtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
                num1=Integer.parseInt(Txt.getText());
        signo="-";
        Txt.setText("");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void btnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(Txt.getText());
        signo="^";
        Txt.setText("");
    }//GEN-LAST:event_btnModuloActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        Txt.setText(Txt.getText()+"9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Txt.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(Txt.getText());
        signo="/";
        Txt.setText("");
        
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(Txt.getText());
        signo="*";
        Txt.setText("");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(Txt.getText());
        signo="+";
        Txt.setText("");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed

        num2=Integer.parseInt(Txt.getText());

        switch(signo){
            case "+":
            Txt.setText(Integer.toString(num1+num2));
            break;
            case "-":
            Txt.setText(Integer.toString(num1-num2));
            break;
            case "*":
            Txt.setText(Integer.toString(num1*num2));
            break;
            case "/":
            Txt.setText(Integer.toString(num1/num2));
            break;
            case "^":
            Txt.setText(Integer.toString(num1^num2));
            break;

        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnPotencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPotencia1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel TxtFondo;
    private javax.swing.JLabel TxtTitulo;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModulo;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPotencia1;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
