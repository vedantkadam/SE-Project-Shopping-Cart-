
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedant kadam
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jop1 = new javax.swing.JRadioButton();
        jop2 = new javax.swing.JRadioButton();
        jop3 = new javax.swing.JRadioButton();
        jop4 = new javax.swing.JRadioButton();
        bcheckout = new java.awt.Button();
        jproductselect = new javax.swing.JComboBox<>();
        bvieworder = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jcartwallet = new javax.swing.JRadioButton();
        jcashod = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Screenshot_2021-10-15_231629-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My Cart");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel4.setText("Select the Product :");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel5.setText("Select the Quantity:");

        jop1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jop1);
        jop1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jop1.setText("1");
        jop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jop1ActionPerformed(evt);
            }
        });

        jop2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jop2);
        jop2.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jop2.setText("2");
        jop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jop2ActionPerformed(evt);
            }
        });

        jop3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jop3);
        jop3.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jop3.setText("3");
        jop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jop3ActionPerformed(evt);
            }
        });

        jop4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jop4);
        jop4.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jop4.setText("4");
        jop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jop4ActionPerformed(evt);
            }
        });

        bcheckout.setBackground(new java.awt.Color(0, 102, 255));
        bcheckout.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        bcheckout.setForeground(new java.awt.Color(255, 255, 255));
        bcheckout.setLabel("Checkout");
        bcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcheckoutActionPerformed(evt);
            }
        });

        jproductselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iphone", "OnePlus9", "Realme", "Lgtv", "Washing Machine", "Ac" }));
        jproductselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jproductselectActionPerformed(evt);
            }
        });

        bvieworder.setBackground(new java.awt.Color(0, 102, 255));
        bvieworder.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        bvieworder.setForeground(new java.awt.Color(255, 255, 255));
        bvieworder.setLabel("View My Orders");
        bvieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvieworderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel6.setText("Select Payment Options :");

        jcartwallet.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jcartwallet);
        jcartwallet.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jcartwallet.setText("Cart Wallet");
        jcartwallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcartwalletActionPerformed(evt);
            }
        });

        jcashod.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jcashod);
        jcashod.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jcashod.setText("Cash on Delivery");
        jcashod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcashodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(bcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(bvieworder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcartwallet)
                        .addGap(18, 18, 18)
                        .addComponent(jcashod))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jop1)
                        .addGap(18, 18, 18)
                        .addComponent(jop2)
                        .addGap(18, 18, 18)
                        .addComponent(jop3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jop4))
                    .addComponent(jLabel6)
                    .addComponent(jproductselect, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jproductselect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jop1)
                    .addComponent(jop2)
                    .addComponent(jop3)
                    .addComponent(jop4))
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcartwallet)
                    .addComponent(jcashod))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bvieworder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void jop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jop1ActionPerformed

    private void jop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jop2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jop2ActionPerformed

    private void jop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jop3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jop3ActionPerformed

    private void jop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jop4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jop4ActionPerformed

    private void bvieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvieworderActionPerformed
        // TODO add your handling code here:
        Confirm c=new Confirm();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_bvieworderActionPerformed

    private void bcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcheckoutActionPerformed
try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingcart_app","root","");
           String q="insert into cart values(?,?,?)";
           PreparedStatement pt=con.prepareStatement(q);
           String radio="";
           radio=jproductselect.getSelectedItem().toString();
           pt.setString(1, radio);
          
           String d="";
           if(jop1.isSelected())
                   {      
            d=jop1.getText();
                   }
            if(jop2.isSelected())
            {
            d=jop2.getText();
            }  
            if(jop3.isSelected())
            {
            d=jop3.getText();
            }
            if(jop4.isSelected())
            {
            d=jop4.getText();
            } 
            pt.setString(2,d);
           
            
             String c="";
           if(jcartwallet.isSelected())
                   {      
            c=jcartwallet.getText();
                   }
            if(jcashod.isSelected())
            {
            c=jcashod.getText();
            }  
            pt.setString(3,c);
          
           
            pt.executeUpdate();
              JOptionPane.showMessageDialog(null, "Added Successfully to Cart");
              con.close();
             
    
        }
         catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
    }       
        Confirm c =new Confirm();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_bcheckoutActionPerformed

    private void jcartwalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcartwalletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcartwalletActionPerformed

    private void jcashodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcashodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcashodActionPerformed

    private void jproductselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jproductselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jproductselectActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bcheckout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Button bvieworder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jcartwallet;
    private javax.swing.JRadioButton jcashod;
    private javax.swing.JRadioButton jop1;
    private javax.swing.JRadioButton jop2;
    private javax.swing.JRadioButton jop3;
    private javax.swing.JRadioButton jop4;
    private javax.swing.JComboBox<String> jproductselect;
    // End of variables declaration//GEN-END:variables
}
