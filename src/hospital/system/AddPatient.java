
package hospital.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class AddPatient extends javax.swing.JFrame {

     Connection con;
    Statement stmt, stmt1,stmt2;
    ResultSet re, re1,re2;
    public AddPatient() {
        initComponents();
       this.setTitle("Welcome to clinic");
        this.setSize(1200,745);
         ch.add("Male");
        ch.add("Female");
        Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth() / 2, sd.height / 2 - this.getHeight() / 2);
        doconnect();
    }
   public void doconnect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
            stmt = con.createStatement();
            stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            re = stmt.executeQuery("select * from PATIENT");
            if (re.next()) {
                re1 = stmt1.executeQuery("select * from PATIENT");
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
                    System.out.println(re1.getString(6));
                    


                    re1.next();
                }
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
         Calendar c= Calendar.getInstance();
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy,hh:mm:ss");
        gdate.setText(df.format(c.getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mLabel = new java.awt.Label();
        tmobno = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ch = new java.awt.Choice();
        jLabel12 = new javax.swing.JLabel();
        bsave = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        tname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gdate = new javax.swing.JTextField();
        co = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        diagno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        inves = new javax.swing.JTextField();
        ref = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        trtment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        oe = new javax.swing.JTextField();
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
                .addContainerGap(83, Short.MAX_VALUE))
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
                .addContainerGap(332, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 230, 250, 540);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 150, 250, 80);

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Welcome to Clinic");
        getContentPane().add(mLabel);
        mLabel.setBounds(0, 10, 1260, 150);

        tmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmobnoActionPerformed(evt);
            }
        });
        getContentPane().add(tmobno);
        tmobno.setBounds(900, 320, 280, 40);

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid);
        pid.setBounds(470, 180, 200, 40);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText("Mobile number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(730, 330, 150, 40);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 290, 110, 40);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setText("Patient id");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 190, 150, 30);
        getContentPane().add(tage);
        tage.setBounds(900, 260, 250, 40);

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setText("Age");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(790, 260, 70, 40);

        ch.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        getContentPane().add(ch);
        ch.setBounds(470, 300, 200, 40);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("Appoinment  Time ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 230, 210, 50);

        bsave.setBackground(new java.awt.Color(0, 153, 153));
        bsave.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        getContentPane().add(bsave);
        bsave.setBounds(340, 600, 130, 60);

        bclear.setBackground(new java.awt.Color(0, 153, 153));
        bclear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bclear.setText("Clear");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        getContentPane().add(bclear);
        bclear.setBounds(510, 600, 150, 60);

        bexit.setBackground(new java.awt.Color(0, 153, 153));
        bexit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(720, 600, 140, 60);

        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        getContentPane().add(tname);
        tname.setBounds(890, 180, 310, 60);

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel13.setText("Patient Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(700, 180, 130, 50);
        getContentPane().add(gdate);
        gdate.setBounds(470, 240, 210, 50);

        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });
        getContentPane().add(co);
        co.setBounds(470, 410, 250, 50);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setText("C/O");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(330, 410, 80, 40);

        diagno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnoActionPerformed(evt);
            }
        });
        getContentPane().add(diagno);
        diagno.setBounds(900, 440, 280, 50);

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel16.setText("Diagnosis");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(770, 440, 100, 40);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setText("Investigation");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(270, 460, 170, 50);
        getContentPane().add(address);
        address.setBounds(470, 350, 260, 50);

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel18.setText("O/E");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(800, 380, 80, 50);

        inves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invesActionPerformed(evt);
            }
        });
        getContentPane().add(inves);
        inves.setBounds(470, 470, 250, 50);

        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        getContentPane().add(ref);
        ref.setBounds(900, 510, 280, 50);

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel19.setText("References");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(760, 520, 120, 40);

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setText("Treatement ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(280, 520, 150, 50);

        trtment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trtmentActionPerformed(evt);
            }
        });
        getContentPane().add(trtment);
        trtment.setBounds(470, 530, 250, 40);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 350, 130, 40);
        getContentPane().add(oe);
        oe.setBounds(900, 380, 280, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ddd.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 0, 980, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed

        try {
            stmt1.executeUpdate("INSERT INTO  PATIENT VALUES('" + pid.getText()
                + "','" + tname.getText()
                + "','" + gdate.getText()
                + "','" + tage.getText()
                + "','" + ch.getSelectedItem()
                + "','" + tmobno.getText()
                 + "','" + address.getText()
                + "','" + oe.getText()
                + "','" + co.getText()
                + "','" + diagno.getText()
                 + "','" + inves.getText()
                + "','" + ref.getText()
                + "','" + trtment.getText()    
                    
                + "')");
            JOptionPane.showMessageDialog(new AddPatient(), "Patient  Information inserted Successfully");

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed

        pid.setText("");
       
        tname.setText("");
        tage.setText("");
        tmobno.setText("");
         address.setText("");
       
        oe.setText("");
        co.setText("");
        diagno.setText("");
         inves.setText("");
       
        ref.setText("");
        trtment.setText("");
        
        
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

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bexit;
    private javax.swing.JButton bsave;
    private java.awt.Choice ch;
    private javax.swing.JTextField co;
    private javax.swing.JTextField diagno;
    private javax.swing.JTextField gdate;
    private javax.swing.JTextField inves;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label mLabel;
    private javax.swing.JTextField oe;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField tage;
    private javax.swing.JTextField tmobno;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField trtment;
    // End of variables declaration//GEN-END:variables
}
