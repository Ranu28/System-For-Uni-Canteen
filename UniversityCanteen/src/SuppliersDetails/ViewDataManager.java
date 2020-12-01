
package SuppliersDetails;
import DatabaseConnection.DBconnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Employee.ManagerHomePage;

public class ViewDataManager extends javax.swing.JFrame {


    public ViewDataManager() {
        initComponents();
    }
PreparedStatement statement;
ResultSet resultset;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnHomepage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleSupplier = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("VIEW SUPPLIER DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 580, 80);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 13, 0, 722);

        btnHomepage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnHomepage.setText("Home Page");
        btnHomepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomepageActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomepage);
        btnHomepage.setBounds(760, 510, 210, 50);

        tbleSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SupplierID", "FirstName", "LastName", "ContactNumber", "Email", "Address", "Company ", "CompanyContact No.", "CompanyEmail", "CompanyAddress"
            }
        ));
        jScrollPane1.setViewportView(tbleSupplier);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 950, 370);

        btnView.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnView);
        btnView.setBounds(530, 510, 210, 50);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(310, 510, 210, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        
        try{
           
            String selectQry = "SELECT * FROM supplier_details ";
            
            statement = DBconnect.getConnect().prepareStatement(selectQry);
            
            resultset = statement.executeQuery();
            
            //Clear the table after click tht button again
            DefaultTableModel dm = (DefaultTableModel)tbleSupplier.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();
                
            while (resultset.next()){
                
               
               
                int SuplierID  = resultset.getInt("SupplierID");
                String fname = resultset.getString("SupplierFirstName");
                String lname =resultset.getString("SupplierLastName");
                int cno =resultset.getInt("SupplierContactNo");
                String email=resultset.getString("SupplierAddress");
                String address=resultset.getString("SupplierEmail");
                String comName =resultset.getString("CompanyName");
                int comConNo =resultset.getInt("CompanyContactNo");
                String comEmail =resultset.getString("CompanyAddress");
                String comAddres = resultset.getString("CompanyEmail");
                        
                Object[] rowData = {SuplierID,fname,lname,cno,email,address,comName,comConNo,comEmail,comAddres};
                DefaultTableModel dtm = (DefaultTableModel) tbleSupplier.getModel();

                dtm.addRow(rowData);
                

           
            }
        
            
        }catch(SQLException es){
            
            JOptionPane.showMessageDialog(null, "Error :"+es);
            System.out.println("Erroe "+es );
        }
        
            
        
        
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                try {
            String deleteSuplierID = JOptionPane.showInputDialog(this," Suplier ID : ");
            
            //Integer.parseInt(deleteSuplierID);
            
            String delQry = "DELETE FROM `supplier_details` WHERE `SupplierID`= ?";
            statement = DBconnect.getConnect().prepareStatement(delQry);
            statement.setInt(1,Integer.parseInt(deleteSuplierID));
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleted...");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data deleted successfully"+ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnHomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomepageActionPerformed
        ManagerHomePage mhp = new ManagerHomePage();
        mhp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomepageActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDataManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHomepage;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbleSupplier;
    // End of variables declaration//GEN-END:variables
}