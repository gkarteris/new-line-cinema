package cinema.project;

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class MemberMenu extends javax.swing.JDialog {

    final void Fill_my_members_codes_List(){
       
       String url = "jdbc:mysql://localhost:3306/cinema";
       String username = "user";
       String password = "user";
            
       System.out.println("Connecting database...");
            
       try(Connection con = DriverManager.getConnection(url,username,password)){   
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            
            String Query1 = "SELECT customer.code FROM cinema.customer";
            
            DefaultListModel DLM1 = new DefaultListModel(); //members_codes list

            ResultSet rs1 = stmt.executeQuery(Query1);
            while(rs1.next()){
                DLM1.addElement(rs1.getString(1));
            }
            MemberCodesList.setModel(DLM1);
            rs1.close();    
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }

        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        
    }
    
    final void Fill_my_members_movies_seen_List(){

       String url = "jdbc:mysql://localhost:3306/cinema";
       String username = "user";
       String password = "user";
            
       System.out.println("Connecting database...");
            
       try(Connection con = DriverManager.getConnection(url,username,password)){   
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            
            String Query1 = "SELECT Distinct title_of_movie FROM cinema.movies_seen";
            
            DefaultListModel DLM1 = new DefaultListModel(); //movies_seen_from_members list

            ResultSet rs1 = stmt.executeQuery(Query1);
            while(rs1.next()){
                DLM1.addElement(rs1.getString(1));
            }
            Members_moviesList.setModel(DLM1);
            rs1.close();    
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }

        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        
    }
    
    public MemberMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        Fill_my_members_codes_List();
        Fill_my_members_movies_seen_List();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberCodesList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Members_moviesList = new javax.swing.JList<>();
        movies_seen_code_customer_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        movies_seen_date_seen_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        movies_seen_ticket_code_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        movies_seen_title_movie_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        movies_seen_Rating_ComboBox = new javax.swing.JComboBox<>();
        movies_seen_projection_ComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ENTERbutton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        member_card_bonus_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        member_card_id_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        member_name_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        member_unique_code_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Member Menu");
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(700, 700));

        MemberCodesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                MemberCodesListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(MemberCodesList);

        jLabel2.setText("Member Codes");

        Members_moviesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Members_moviesListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(Members_moviesList);

        jLabel7.setText("Projection");

        jLabel6.setText("Rating");

        jLabel3.setText("Ticket Code");

        jLabel4.setText("Your Code");

        jLabel5.setText("Title of Movie");

        jLabel8.setText("Date Seen");

        movies_seen_Rating_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        movies_seen_projection_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2D", "3D" }));

        jLabel9.setText("You can ONLY Edit your Movie Rating");

        ENTERbutton.setText("EDIT OK");
        ENTERbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERbuttonActionPerformed(evt);
            }
        });

        jLabel10.setText("CARD ID");

        jLabel11.setText("CARD BONUS");

        jLabel12.setText("NAME");

        jLabel13.setText("UNIQUE CODE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(movies_seen_Rating_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(movies_seen_ticket_code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(movies_seen_code_customer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(movies_seen_title_movie_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(movies_seen_date_seen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(movies_seen_projection_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(member_card_bonus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 289, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(member_card_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(member_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(member_unique_code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(59, 59, 59)
                .addComponent(ENTERbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movies_seen_ticket_code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movies_seen_code_customer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movies_seen_title_movie_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movies_seen_Rating_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(movies_seen_date_seen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movies_seen_projection_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ENTERbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member_card_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member_card_bonus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(member_unique_code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(member_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Members_moviesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Members_moviesListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM movies_seen where code_customer = '"+MemberCodesList.getSelectedValue()+"' "
                    + "and title_of_movie = '"+Members_moviesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);


            while(rs.next()){
                movies_seen_ticket_code_txt.setText(rs.getString(1));
                movies_seen_code_customer_txt.setText(rs.getString(2));
                movies_seen_title_movie_txt.setText(rs.getString(3));
                movies_seen_Rating_ComboBox.setSelectedItem(rs.getString(4));
                movies_seen_date_seen_txt.setText(rs.getString(5));
                movies_seen_projection_ComboBox.setSelectedItem(rs.getString(6));
            }
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_Members_moviesListValueChanged

    private void MemberCodesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_MemberCodesListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM movies_seen where code_customer = '"+MemberCodesList.getSelectedValue()+"' "
                    + "and title_of_movie = '"+Members_moviesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);


            while(rs.next()){
                movies_seen_ticket_code_txt.setText(rs.getString(1));
                movies_seen_code_customer_txt.setText(rs.getString(2));
                movies_seen_title_movie_txt.setText(rs.getString(3));
                movies_seen_Rating_ComboBox.setSelectedItem(rs.getString(4));
                movies_seen_date_seen_txt.setText(rs.getString(5));
                movies_seen_projection_ComboBox.setSelectedItem(rs.getString(6));
            }
            
            Statement stmt1 = con.createStatement();
            String Query1 = "SELECT code,card_id,name FROM customer where code = '"+MemberCodesList.getSelectedValue()+"'";
            ResultSet rs1 = stmt.executeQuery(Query1);

            while(rs1.next()){
                member_card_id_txt.setText(rs1.getString(2));
                member_unique_code_txt.setText(rs1.getString(1));
                member_name_txt.setText(rs1.getString(3));
            }
            
            Statement stmt2 = con.createStatement();
            String Query2 = "SELECT bonus FROM member_card "
                    + "inner join customer ON card_id = member_card.id "
                    + " where customer.code = '"+MemberCodesList.getSelectedValue()+"'";

            ResultSet rs2 = stmt.executeQuery(Query2);

            while(rs2.next()){
                member_card_bonus_txt.setText(rs2.getString(1));
            }
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_MemberCodesListValueChanged

    private void ENTERbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERbuttonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;
        
        String update_Query = " UPDATE movies_seen SET "
                    + "rating = ?"
                    + "WHERE code_customer = ? and title_of_movie = ?";
                
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            pr_stmt = con.prepareStatement(update_Query);
 
            pr_stmt.setObject(1,movies_seen_Rating_ComboBox.getSelectedItem());
            pr_stmt.setString(2,MemberCodesList.getSelectedValue());
            pr_stmt.setString(3,Members_moviesList.getSelectedValue());         

            
            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The rating for the movie updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_ENTERbuttonActionPerformed


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
            java.util.logging.Logger.getLogger(MemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MemberMenu dialog = new MemberMenu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ENTERbutton;
    private javax.swing.JList<String> MemberCodesList;
    private javax.swing.JList<String> Members_moviesList;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField member_card_bonus_txt;
    private javax.swing.JTextField member_card_id_txt;
    private javax.swing.JTextField member_name_txt;
    private javax.swing.JTextField member_unique_code_txt;
    private javax.swing.JComboBox<String> movies_seen_Rating_ComboBox;
    private javax.swing.JTextField movies_seen_code_customer_txt;
    private javax.swing.JTextField movies_seen_date_seen_txt;
    private javax.swing.JComboBox<String> movies_seen_projection_ComboBox;
    private javax.swing.JTextField movies_seen_ticket_code_txt;
    private javax.swing.JTextField movies_seen_title_movie_txt;
    // End of variables declaration//GEN-END:variables
}
