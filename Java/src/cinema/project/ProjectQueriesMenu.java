package cinema.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ProjectQueriesMenu extends javax.swing.JDialog {

    final void Fill_project_query_a_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) project_Query_A_Table.getModel();
            String Query = "select movies_seen.title_of_movie, movie.genre, movies_seen.code_customer from movies_seen "
                    + "inner join movie ON title = movies_seen.title_of_movie "
                    + "inner join customer ON movies_seen.code_customer = customer.code "
                    + "where customer.gender = \"male\" and movies_seen.rating between '4' and '5' "
                    + "and movies_seen.date_seen between '2011-02-15' and '2014-01-22';";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                String str2 = rs.getString(2);
                int str3 = rs.getInt(3);

                model.addRow(new Object[]{str1,str2,str3} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }  
    } //ok
    final void Fill_project_query_b_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) project_Query_B_Table.getModel();
            String Query = "select ticket_movie_title, count(*) from ticket "
                    + "where ticket.date_buyed between '2009-07-14' and '2016-01-25' "
                    + "group by ticket_movie_title DESC "
                    + "having count(ticket_movie_title) = (select count(ticket_movie_title) AS great "
                    + "from ticket "
                    + "where ticket.date_buyed between '2009-07-14' and '2016-01-25' "
                    + "group by ticket_movie_title order by great desc limit 1);";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                int str2 = rs.getInt(2);       
                
                model.addRow(new Object[]{str1,str2} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    } //ok
    final void Fill_project_query_c_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) project_Query_C_Table.getModel();
            String Query = "select customer.name, count(*) from customer "
                    + "inner join movies_seen ON movies_seen.code_customer = customer.code "
                    + "where movies_seen.date_seen between '2009-07-14' and '2016-01-25' and projection = '3D' "
                    + "group by Name desc limit 1; ";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                int str2 = rs.getInt(2);
                
                model.addRow(new Object[]{str1,str2} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    } //ok
    final void Fill_project_query_d_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) project_Query_D_Table.getModel();
            
            String Query = "select movie.title, movie.genre, movies_seen.code_customer from movies_seen "
                    + "inner join movie ON title = movies_seen.title_of_movie "
                    + "inner join customer ON movies_seen.code_customer = customer.code "
                    + "where customer.gender = \"female\" and customer.age between 20 and 30 "
                    + "order by customer.age DESC;";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                String str2 = rs.getString(2);
                int str3 = rs.getInt(3);
                
                model.addRow(new Object[]{str1,str2,str3});
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    } //ok
    final void Fill_project_query_e_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) project_Query_E_Table.getModel();
            String Query = "select member_card.id, member_card.bonus + count(*),(( member_card.bonus % 200) + count(*) ) div 200, "
                    + "CASE WHEN (member_card.bonus < 200 or (member_card.bonus+count(*))%200 <= 1) "
                    + "THEN 'tickets not cashed' ELSE 'tickets cashed' END "
                    + "from member_card inner join ticket ON ticket.ticket_card_id = member_card.id "
                    + "where ticket.date_buyed between '2009-07-14' and '2016-01-25' and 'Times Earned' >= 0 "
                    + "group by id;";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                int str1 = rs.getInt(1);
                int str2 = rs.getInt(2);
                int str3 = rs.getInt(3);
                String str4 = rs.getString(4);
                  
                model.addRow(new Object[]{str1,str2,str3,str4} );
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    } //ok
    final void Fill_project_query_f_table(){
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) project_Query_F_Table.getModel();
            
            String Query = "select shift_emp_name AS Name, count(*)*10, count(*)*5*10 AS Kostos from shifts "
                    + "where shift_date between '2016-07-20' and '2016-07-25' "
                    + "group by Name order by Kostos desc;";
            ResultSet rs = stmt.executeQuery(Query);
 
            while(rs.next()){
                String str1 = rs.getString(1);
                int str2 = rs.getInt(2);
                int str3 = rs.getInt(3);
                
                model.addRow(new Object[]{str1,str2,str3});
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        } 
    } //ok
    
    public ProjectQueriesMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Fill_project_query_a_table();
        Fill_project_query_b_table();
        Fill_project_query_c_table();
        Fill_project_query_d_table();
        Fill_project_query_e_table();
        Fill_project_query_f_table();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        project_Query_A_Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        project_Query_B_Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        project_Query_C_Table = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        project_Query_D_Table = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        project_Query_E_Table = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        project_Query_F_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        project_Query_A_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movies", "Genre", "Member ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(project_Query_A_Table);

        project_Query_B_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie", "Tickets"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(project_Query_B_Table);

        project_Query_C_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "3D Projections"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(project_Query_C_Table);

        project_Query_D_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Genre", "Member ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane4.setViewportView(project_Query_D_Table);

        project_Query_E_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Card ID", "Current Bonus", "Times Earned", "Bonus Cashed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(project_Query_E_Table);

        project_Query_F_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Ores Ergasias", "Kostos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane6.setViewportView(project_Query_F_Table);

        jLabel1.setText("Project Query A");

        jLabel2.setText("Project Query B");

        jLabel3.setText("Project Query D");

        jLabel4.setText("Project Query C");

        jLabel5.setText("Project Query E");

        jLabel6.setText("Project Query F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ProjectQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectQueriesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectQueriesMenu dialog = new ProjectQueriesMenu(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable project_Query_A_Table;
    private javax.swing.JTable project_Query_B_Table;
    private javax.swing.JTable project_Query_C_Table;
    private javax.swing.JTable project_Query_D_Table;
    private javax.swing.JTable project_Query_E_Table;
    private javax.swing.JTable project_Query_F_Table;
    // End of variables declaration//GEN-END:variables
}
