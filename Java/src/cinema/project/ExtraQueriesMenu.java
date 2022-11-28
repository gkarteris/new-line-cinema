package cinema.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ExtraQueriesMenu extends javax.swing.JDialog {

    final void Fill_extra_query_a_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) extra_Query_A_Table.getModel();
            String Query = "SELECT movie.title,movie.date_produced,award.name from movie "
                    + "inner join award ON award.movie_title = movie.title "
                    + "order by movie.title ASC, award.movie_title ASC";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                int str2 = rs.getInt(2);
                String str3 = rs.getString(3);
                model.addRow(new Object[]{str1,str2,str3} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }  
    }
    final void Fill_extra_query_b_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) extra_Query_B_Table.getModel();
            String Query = "SELECT title,starring,directors,genre,date_produced,review from movie "
                    + "where title = 'The Dark Knight' ";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                String str2 = rs.getString(2);
                String str3 = rs.getString(3);
                String str4 = rs.getString(4);
                int str5 = rs.getInt(5);       
                String str6 = rs.getString(6);
                
                model.addRow(new Object[]{str1,str2,str3,str4,str5,str6} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    }
    final void Fill_extra_query_c_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) extra_Query_C_Table.getModel();
            String Query = "select auditorioum_name,number,corridor,horizontial,vertical,auditorioum.floor,auditorioum.seats_num, "
                    + "auditorioum.air_con from seats inner join auditorioum ON aud_name = auditorioum_name "
                    + "where auditorioum_name = 'Max Auditorioum 1' and number = 12";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                int str2 = rs.getInt(2);
                String str3 = rs.getString(3);
                String str4 = rs.getString(4);
                String str5 = rs.getString(5);
                int str6 = rs.getInt(6);
                int str7 = rs.getInt(7);
                String str8 = rs.getString(8);
                
                model.addRow(new Object[]{str1,str2,str3,str4,str5,str6,str7,str8} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    }
    final void Fill_extra_query_d_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) extra_Query_D_Table.getModel();
            
            String Query = "select emp_name, degree, resume, experience, hired from employee "
                    + "where emp_name = \"Katerina Giouvarlaki\";";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                String str2 = rs.getString(2);
                String str3 = rs.getString(3);
                int str4 = rs.getInt(4);
                int str5 = rs.getInt(5);
                
                model.addRow(new Object[]{str1,str2,str3,str4,str5});
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    }    
    
    public ExtraQueriesMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Fill_extra_query_a_table();
        Fill_extra_query_b_table();
        Fill_extra_query_c_table();
        Fill_extra_query_d_table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        extra_Query_A_Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        extra_Query_B_Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        extra_Query_C_Table = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        extra_Query_D_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Extra Queries Menu");

        extra_Query_A_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Title", "Movie Date Producted", "Award Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(extra_Query_A_Table);

        extra_Query_B_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Title", "Actors", "Directors", "Genre", "Produced", "Review"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(extra_Query_B_Table);

        extra_Query_C_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Auditorioum Name", "Seat Number", "Corridor", "Horizontial Axis Position", "Verical Axis Position", "Auditorioum Floor", "Number of Seats", "A/C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(extra_Query_C_Table);

        extra_Query_D_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Degree", "Resume", "Experience", "Date Hired"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(extra_Query_D_Table);

        jLabel1.setText("Extra Query A");

        jLabel2.setText("Extra Query B");

        jLabel3.setText("Extra Query D");

        jLabel4.setText("Extra Query C");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(205, 205, 205)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ExtraQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtraQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtraQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtraQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExtraQueriesMenu dialog = new ExtraQueriesMenu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable extra_Query_A_Table;
    private javax.swing.JTable extra_Query_B_Table;
    private javax.swing.JTable extra_Query_C_Table;
    private javax.swing.JTable extra_Query_D_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
