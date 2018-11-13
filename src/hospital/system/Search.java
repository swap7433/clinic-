
package hospital.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Search extends javax.swing.JFrame {

     Connection con;
    Statement stmt, stmt1,stmt2;
    ResultSet re, re1,re2;
    public Search() {
        initComponents();
           this.setTitle("Welcome to clinic");
         this.setSize(1180,745);
        Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth() / 2, sd.height / 2 - this.getHeight() / 2);
            
        doconnect();
        
         
         Calendar c= Calendar.getInstance();
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy,hh:mm:ss");
        cdate.setText(df.format(c.getTime())); 
    }
    
    
    

    public void doconnect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
            stmt = con.createStatement();
            stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            re = stmt.executeQuery("select * from patient");
            if (re.next()) {
                re1 = stmt1.executeQuery("select * from patient");
                re1.next();

                re1.last();
                int r = re1.getRow();
                re1.first();
                for (int i = 0; i < r; i++) {
                    System.out.println(re1.getString(1));
                    System.out.println(re1.getString(2));
                    System.out.println(re1.getString(3));
                    System.out.println(re1.getString(4));
                    System.out.println(re1.getString(5));
                    re1.next();
                }
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
    

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mLabel = new java.awt.Label();
        tmobno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cdate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bclear = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        tname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        co = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        diagno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        oe = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        inves = new javax.swing.JTextField();
        ref = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        trtment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bupdate = new javax.swing.JButton();
        bsearch = new javax.swing.JButton();
        tdate = new javax.swing.JTextField();
        taddress = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        tage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("to");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clinic");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 200, 210, 520);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 120, 210, 80);

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Welcome to Clinic");
        getContentPane().add(mLabel);
        mLabel.setBounds(0, -10, 1240, 130);

        tmobno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmobnoActionPerformed(evt);
            }
        });
        getContentPane().add(tmobno);
        tmobno.setBounds(870, 360, 240, 40);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText("Mobile number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 360, 150, 40);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 310, 110, 40);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setText("Enter Patient id");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 140, 180, 40);

        cdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(cdate);
        cdate.setBounds(430, 250, 250, 40);

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setText("Age");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(770, 310, 70, 40);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("today Appoinment");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 250, 200, 50);

        bclear.setBackground(new java.awt.Color(0, 153, 153));
        bclear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bclear.setText("Clear");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        getContentPane().add(bclear);
        bclear.setBounds(670, 630, 140, 60);

        bexit.setBackground(new java.awt.Color(0, 153, 153));
        bexit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(860, 630, 120, 60);

        tname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        getContentPane().add(tname);
        tname.setBounds(430, 200, 270, 40);

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel13.setText("Patient Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(250, 200, 160, 50);

        gender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(gender);
        gender.setBounds(430, 310, 260, 50);

        co.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });
        getContentPane().add(co);
        co.setBounds(430, 430, 260, 50);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setText("C/O");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(300, 440, 80, 40);

        diagno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        diagno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnoActionPerformed(evt);
            }
        });
        getContentPane().add(diagno);
        diagno.setBounds(870, 470, 290, 50);

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel16.setText("Diagnosis");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(750, 470, 100, 40);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setText("Investigation");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(250, 490, 170, 50);

        oe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(oe);
        oe.setBounds(870, 410, 270, 50);

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel18.setText("O/E");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(760, 400, 80, 50);

        inves.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invesActionPerformed(evt);
            }
        });
        getContentPane().add(inves);
        inves.setBounds(430, 490, 260, 50);

        ref.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        getContentPane().add(ref);
        ref.setBounds(870, 530, 290, 60);

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel19.setText("References");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(740, 540, 120, 40);

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setText("Treatement ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(250, 540, 170, 50);

        trtment.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        trtment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trtmentActionPerformed(evt);
            }
        });
        getContentPane().add(trtment);
        trtment.setBounds(430, 550, 260, 50);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 380, 130, 30);

        bupdate.setBackground(new java.awt.Color(0, 153, 153));
        bupdate.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bupdate.setText("Update Record");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });
        getContentPane().add(bupdate);
        bupdate.setBounds(390, 630, 200, 60);

        bsearch.setBackground(new java.awt.Color(0, 153, 153));
        bsearch.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });
        getContentPane().add(bsearch);
        bsearch.setBounds(750, 130, 150, 50);

        tdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tdate);
        tdate.setBounds(890, 250, 240, 50);

        taddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        taddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taddressActionPerformed(evt);
            }
        });
        getContentPane().add(taddress);
        taddress.setBounds(430, 370, 260, 50);

        pid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(pid);
        pid.setBounds(440, 140, 260, 40);

        tage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tage);
        tage.setBounds(870, 310, 220, 40);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setText("Last  visited date  ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(690, 250, 210, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ddd.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 0, 970, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed

     
        gender.setText("");
        tname.setText("");
        cdate.setText("");
        tmobno.setText("");
    }//GEN-LAST:event_bclearActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_bexitActionPerformed

    private void tmobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmobnoActionPerformed

    private void invesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invesActionPerformed

    private void trtmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trtmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trtmentActionPerformed

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coActionPerformed

    private void diagnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnoActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
      try {
            stmt1.executeUpdate("UPDATE  patient SET pid='"
                    + pid.getText()
                    + "',tname='" + tname.getText()
                    + "',gdate='" + cdate.getText()
                     + "',age='" + tage.getText()
                    + "',gender='" + gender.getText()
                    + "',mobno='" + tmobno.getText()
                     + "',address='" + taddress.getText()
                    + "',oe='" + oe.getText()
                    + "',co='" + co.getText()
                     + "',diagno='" + diagno.getText()
                    + "',inves='" + inves.getText()
                    + "',ref='" + ref.getText()
                    + "',trtment='" + trtment.getText()
                   
                   + "' WHERE pid='" + pid.getText()+"'");

            JOptionPane.showMessageDialog(new Search(), "data updated Successfully");

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_bupdateActionPerformed

    
    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearchActionPerformed

        try {
   
            re2 = stmt1.executeQuery("select *  from patient where pid  ='"+pid.getText()+"'");
               
                 if (re2.next()) {
               

              
                tname.setText(re2.getString(2));
                  tdate.setText (re2.getString(3));
                   tage.setText(re2.getString(4));
                  gender.setText (re2.getString(5));
                  tmobno.setText(re2.getString(6));
                  taddress.setText (re2.getString(7));
                   oe.setText(re2.getString(8));
                  co.setText (re2.getString(9));
                  diagno.setText(re2.getString(10));
                  inves.setText (re2.getString(11));
                   ref.setText(re2.getString(12));
                  trtment.setText (re2.getString(13));
                  
                }
      

        } catch (Exception e) {
            System.out.println("" + e);
        }
 

    }//GEN-LAST:event_bsearchActionPerformed

    private void taddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taddressActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclear;
    private javax.swing.JButton bexit;
    private javax.swing.JButton bsearch;
    private javax.swing.JButton bupdate;
    private javax.swing.JTextField cdate;
    private javax.swing.JTextField co;
    private javax.swing.JTextField diagno;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField inves;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label mLabel;
    private javax.swing.JTextField oe;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField tage;
    private javax.swing.JTextField tdate;
    private javax.swing.JTextField tmobno;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField trtment;
    // End of variables declaration//GEN-END:variables
}
