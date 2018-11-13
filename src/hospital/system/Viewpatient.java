
package hospital.system;



import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import oracle.net.aso.i;


public class Viewpatient extends javax.swing.JFrame {

      Connection con;
    Statement stmt, stmt1;
    ResultSet re, re1;
    
    String[]id =new String[1000];
    String[]name =new String[1000];
    String[]gdate =new String[1000];
    String[]age =new String[1000];
    String[]gender =new String[1000];
    String[]mobno =new String[1000];
     String[]address =new String[1000];
    String[]oe =new String[1000];
    String[]co =new String[1000];
    String[] inves =new String[1000];
      String[] diagno =new String[1000];
    String[]ref =new String[1000];
    String[]trtment =new String[1000];
      int count=0;
      int i;
        DefaultTableModel model;
        
 
    public Viewpatient() {
        initComponents();
         this.setTitle("Welcome to clinic");
         
        this.setSize(1180,745);
        Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(sd.width / 2 - this.getWidth() / 2, sd.height / 2 - this.getHeight() / 2);
        
        model =new DefaultTableModel();
         model.addColumn("id");
          model.addColumn("name");
           model.addColumn("gdate");
           model.addColumn("age");
           
          model.addColumn("gender");
          model.addColumn("mobno");
            model.addColumn("address");
           model.addColumn("O/E");
           
          model.addColumn("C/O");
          model.addColumn("inves");
           model.addColumn("diagno");
           model.addColumn("ref");
           
          model.addColumn("trtment");
          
          
         table.setModel(model);
        doconnect();
    }
    public void doconnect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
            stmt = con.createStatement();
            stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            re = stmt.executeQuery("select * from patient");
            if (re.next()) {
                re1 = stmt1.executeQuery("select * from patient");
                re1.next();

                re1.last();
                int r = re1.getRow();
                count=r;
                re1.first();
                for (int i = 0; i < r; i++) {
                   id[i]=(re1.getString(1));
                 name[i]=(re1.getString(2));
                   gdate[i]=(re1.getString(3));
                    age[i]=(re1.getString(4));
                     gender[i]=(re1.getString(5));
                    mobno[i]=(re1.getString(6));
                      address[i]=(re1.getString(7));
                 oe[i]=(re1.getString(8));
                   co[i]=(re1.getString(9));
                    inves[i]=(re1.getString(10));
                     diagno[i]=(re1.getString(11));
                    ref[i]=(re1.getString(12));
                    trtment[i]=(re1.getString(13));


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

        mLabel = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bexit = new javax.swing.JButton();
        btnpdf = new javax.swing.JButton();
        bprint = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Welcome to Clinic");
        getContentPane().add(mLabel);
        mLabel.setBounds(0, 0, 1430, 150);

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
                        .addGap(52, 52, 52)
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
                .addContainerGap(302, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 230, 250, 510);

        showd.setBackground(new java.awt.Color(0, 153, 153));
        showd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showd.setText("show All patient");
        showd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdActionPerformed(evt);
            }
        });
        getContentPane().add(showd);
        showd.setBounds(280, 520, 460, 60);

        table.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 180, 810, 330);

        bexit.setBackground(new java.awt.Color(0, 153, 153));
        bexit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(760, 610, 190, 60);

        btnpdf.setBackground(new java.awt.Color(0, 153, 153));
        btnpdf.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnpdf.setText("Generate PDF");
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnpdf);
        btnpdf.setBounds(390, 600, 300, 70);

        bprint.setBackground(new java.awt.Color(0, 153, 153));
        bprint.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bprint.setText("print");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });
        getContentPane().add(bprint);
        bprint.setBounds(760, 520, 190, 60);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 150, 250, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ddd.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 10, 1100, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdActionPerformed
        try{
            model.setRowCount(0);

            for(int i=0;i<count;i++)
            {
                String[] request={id[i],name[i],gdate[i],age[i],gender[i],mobno[i],address[i],oe[i],co[i],inves[i],diagno[i],ref[i],trtment[i]};
                model.addRow(request);

            }
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }//GEN-LAST:event_showdActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_bexitActionPerformed

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
          try {                                       
              String path="";
              JFileChooser j=new JFileChooser();
              j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
              int x=j.showSaveDialog(this);
              
              if(x==JFileChooser.APPROVE_OPTION)
              {
                  path=j.getSelectedFile().getPath();
              }
              
              Document doc= new Document();
              
              
              
              
              
              try {
                  PdfWriter.getInstance( doc, new FileOutputStream(path+"report.pdf"));
              } catch (FileNotFoundException ex) {
                  Logger.getLogger(Viewpatient.class.getName()).log(Level.SEVERE, null, ex);
              } catch (DocumentException ex) {
                  Logger.getLogger(Viewpatient.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              
              doc.open();
              
              Paragraph para=new Paragraph("hii ");
              try {
                  doc.add(para);
              } catch (DocumentException ex) {
                  Logger.getLogger(Viewpatient.class.getName()).log(Level.SEVERE, null, ex);
              }
              PdfPTable tb1= new PdfPTable(13);
              tb1.addCell("id");
              tb1.addCell("name");
              tb1.addCell("gdate");
              tb1.addCell("age");
              
              tb1.addCell("gender");
              tb1.addCell("mobno");
              tb1.addCell("address");
              tb1.addCell("O/E");
              
              tb1.addCell("C/O");
              tb1.addCell("inves");
              tb1.addCell("diagno");
              tb1.addCell("ref");
              tb1.addCell("trtment");
              
              Class.forName("oracle.jdbc.driver.OracleDriver");
              
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
              stmt = con.createStatement();
              stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
              re = stmt.executeQuery("select * from patient");
              
              while(re.next())
              {
                
                 model.setRowCount(0);

            for(int i=0;i<count;i++)
            {
                String[] request={id[i],name[i],gdate[i],age[i],gender[i],mobno[i],address[i],oe[i],co[i],inves[i],diagno[i],ref[i],trtment[i]};
                model.addRow(request);

            }
               
                     
                   
                   
                  
              }
                
              
              
              try {
                  doc.add(tb1);
              } catch (DocumentException ex) {
                  Logger.getLogger(Viewpatient.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              
              doc.close();
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Viewpatient.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(Viewpatient.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_btnpdfActionPerformed

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
        MessageFormat header =new MessageFormat(" report printed");
        
         MessageFormat footer =new MessageFormat(" page");
        
        try {
            table.print(JTable.PrintMode.NORMAL,header,footer);
            
              } catch (Exception  ex) {
                    System.err.format("cannot print",ex.getMessage());
              }
    }//GEN-LAST:event_bprintActionPerformed

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
            java.util.logging.Logger.getLogger(Viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton bprint;
    private javax.swing.JButton btnpdf;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label mLabel;
    private javax.swing.JButton showd;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
