package cinema.project;

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CashierMenu extends javax.swing.JDialog {

    final void Fill_my_List(){
       //edw gemisw ti DLM(Default List Model) me ta dedomena poy pairnw
       //apo ti vasi dedomenwn cinema
       
       String url = "jdbc:mysql://localhost:3306/cinema";
       String username = "user";
       String password = "user";
            
       System.out.println("Connecting database...");
            
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            
            String Query1 = "SELECT DISTINCT plays_aud_name FROM plays";
            String Query2 = "SELECT DISTINCT date_plays FROM plays";
            String Query3 = "SELECT DISTINCT start_hour FROM plays";
            String Query4 = "SELECT DISTINCT name FROM customer";
            
            DefaultListModel DLM1 = new DefaultListModel(); //auditorioum
            DefaultListModel DLM2 = new DefaultListModel(); //date_plays
            DefaultListModel DLM3 = new DefaultListModel(); //start_hour
            DefaultListModel DLM4 = new DefaultListModel(); //customer names
            
            ResultSet rs1 = stmt.executeQuery(Query1);
            while(rs1.next()){
                DLM1.addElement(rs1.getString(1));
            }
            AuditorioumNamesList.setModel(DLM1);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query2);
            while(rs1.next()){
                DLM2.addElement(rs1.getString(1));
            }
            Auditorioum_movies_date_plays_List.setModel(DLM2);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query3);
            while(rs1.next()){
                DLM3.addElement(rs1.getString(1));
            }
            Auditorioum_movies_start_hour_List.setModel(DLM3);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query4);
            while(rs1.next()){
                DLM4.addElement(rs1.getString(1));
            }
            CustomersList.setModel(DLM4);
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
    
    public CashierMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        Fill_my_List();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        check_ticket_code_txt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        check_movie_title_txt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        check_auditorioum_txt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        check_date_buyed_txt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        check_price_2D_txt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        check_price_3D_txt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        check_member_card_ID_txt = new javax.swing.JTextField();
        Check_ticket_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        code_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cardID_txt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        customer_name_txt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        age_txt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Gender_ComboBox = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        marital_status_ComboBox = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        CustomersList = new javax.swing.JList<>();
        edit_ok_customer_Button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        air_condition_ComboBox = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        num_of_seats_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        floor_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AuditorioumNamesList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        Auditorioum_name_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Auditorioum_movie_playing_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Auditorioum_movie_start_hour_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Auditorioum_movie_end_hour_txt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Auditorioum_movies_date_plays_List = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Auditorioum_movies_start_hour_List = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashier Menu");
        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(700, 700));

        jLabel26.setText("Ticket Code");

        jLabel27.setText("Movie to watch");

        jLabel28.setText("Auditorioum");

        jLabel29.setText("Date Buyed");

        jLabel30.setText("Price 2D");

        jLabel31.setText("Price 3D");

        jLabel32.setText("Member Card ID");

        Check_ticket_Button.setText("Check");
        Check_ticket_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_ticket_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("You can leave it null (It is auto-increment)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_date_buyed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(check_member_card_ID_txt))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(check_price_3D_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_ticket_code_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_auditorioum_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_price_2D_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(301, 301, 301)
                        .addComponent(Check_ticket_Button))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_movie_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_ticket_code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_ticket_Button)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_movie_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_auditorioum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_date_buyed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_price_2D_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_price_3D_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_member_card_ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check a Ticket", jPanel4);

        jLabel21.setText("Code");

        jLabel22.setText("Card ID");

        jLabel23.setText("Customer Name");

        jLabel24.setText("Age");

        jLabel25.setText("Gender");

        Gender_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        jLabel54.setText("Marital Status");

        marital_status_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "single", "married" }));

        CustomersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CustomersListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(CustomersList);

        edit_ok_customer_Button.setText("EDIT OK");
        edit_ok_customer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok_customer_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Gender_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customer_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marital_status_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(edit_ok_customer_Button)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_ok_customer_Button)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gender_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marital_status_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Member Info", jPanel1);

        jLabel52.setText("Air Condition");

        air_condition_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        jLabel53.setText("Number of Seats Available");

        jLabel10.setText("Floor");

        AuditorioumNamesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AuditorioumNamesListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(AuditorioumNamesList);

        jLabel8.setText("Auditorioum Name");

        jLabel9.setText("Movie Playing NOW");

        jLabel11.setText("Start Hour");

        jLabel12.setText("End Hour");

        Auditorioum_movies_date_plays_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Auditorioum_movies_date_plays_ListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(Auditorioum_movies_date_plays_List);

        Auditorioum_movies_start_hour_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Auditorioum_movies_start_hour_ListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Auditorioum_movies_start_hour_List);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(Auditorioum_movie_start_hour_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(Auditorioum_movie_end_hour_txt)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Auditorioum_movie_playing_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Auditorioum_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(air_condition_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(floor_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(num_of_seats_txt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Auditorioum_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_of_seats_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(air_condition_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Auditorioum_movie_playing_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Auditorioum_movie_start_hour_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Auditorioum_movie_end_hour_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Auditorioum Info", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Auditorioum_movies_start_hour_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Auditorioum_movies_start_hour_ListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM auditorioum where aud_name = '"+AuditorioumNamesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);

            while(rs.next()){
                Auditorioum_name_txt.setText(rs.getString(1));
                floor_txt.setText(rs.getString(2));
                num_of_seats_txt.setText(rs.getString(3));
                air_condition_ComboBox.setSelectedItem(rs.getString(4));
            }
            String Query1 = "SELECT * FROM plays where plays_aud_name = '"+AuditorioumNamesList.getSelectedValue()+"' and "
            + "date_plays = '"+Auditorioum_movies_date_plays_List.getSelectedValue()+"' and "
            + "start_hour = '"+Auditorioum_movies_start_hour_List.getSelectedValue()+"'";
            ResultSet rs1 = stmt.executeQuery(Query1);

            while(rs1.next()){
                Auditorioum_movie_playing_txt.setText(rs1.getString(2));
                Auditorioum_movie_start_hour_txt.setText(rs1.getString(3));
                Auditorioum_movie_end_hour_txt.setText(rs1.getString(4));
            }

        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_Auditorioum_movies_start_hour_ListValueChanged

    private void Auditorioum_movies_date_plays_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Auditorioum_movies_date_plays_ListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM auditorioum where aud_name = '"+AuditorioumNamesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);

            while(rs.next()){
                Auditorioum_name_txt.setText(rs.getString(1));
                floor_txt.setText(rs.getString(2));
                num_of_seats_txt.setText(rs.getString(3));
                air_condition_ComboBox.setSelectedItem(rs.getString(4));
            }
            String Query1 = "SELECT * FROM plays where plays_aud_name = '"+AuditorioumNamesList.getSelectedValue()+"' and "
            + "date_plays = '"+Auditorioum_movies_date_plays_List.getSelectedValue()+"' and "
            + "start_hour = '"+Auditorioum_movies_start_hour_List.getSelectedValue()+"'";
            ResultSet rs1 = stmt.executeQuery(Query1);

            while(rs1.next()){
                Auditorioum_movie_playing_txt.setText(rs1.getString(2));
                Auditorioum_movie_start_hour_txt.setText(rs1.getString(3));
                Auditorioum_movie_end_hour_txt.setText(rs1.getString(4));
            }

        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_Auditorioum_movies_date_plays_ListValueChanged

    private void AuditorioumNamesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AuditorioumNamesListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM auditorioum where aud_name = '"+AuditorioumNamesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);

            while(rs.next()){
                Auditorioum_name_txt.setText(rs.getString(1));
                floor_txt.setText(rs.getString(2));
                num_of_seats_txt.setText(rs.getString(3));
                air_condition_ComboBox.setSelectedItem(rs.getString(4));
            }
            String Query1 = "SELECT * FROM plays where plays_aud_name = '"+AuditorioumNamesList.getSelectedValue()+"' and "
            + "date_plays = '"+Auditorioum_movies_date_plays_List.getSelectedValue()+"' and "
            + "start_hour = '"+Auditorioum_movies_start_hour_List.getSelectedValue()+"'";
            ResultSet rs1 = stmt.executeQuery(Query1);

            while(rs1.next()){
                Auditorioum_movie_playing_txt.setText(rs1.getString(2));
                Auditorioum_movie_start_hour_txt.setText(rs1.getString(3));
                Auditorioum_movie_end_hour_txt.setText(rs1.getString(4));
            }

        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_AuditorioumNamesListValueChanged

    private void edit_ok_customer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ok_customer_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;
        String update_Query = " UPDATE customer SET "
        + "code = ? ,"
        + "card_id = ? ,"
        + "name = ? ,"
        + "age = ? ,"
        + "gender = ? ,"
        + "marital_status = ? "
        + "WHERE name =? ";
        try(Connection con = DriverManager.getConnection(url,username,password)){
            pr_stmt = con.prepareStatement(update_Query);

            pr_stmt.setString(1,code_txt.getText());
            pr_stmt.setString(2,cardID_txt.getText());
            pr_stmt.setString(3,customer_name_txt.getText());
            pr_stmt.setString(4,age_txt.getText());
            pr_stmt.setObject(5,Gender_ComboBox.getSelectedItem());
            pr_stmt.setObject(6,marital_status_ComboBox.getSelectedItem());
            pr_stmt.setString(7,CustomersList.getSelectedValue());

            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The customer updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_edit_ok_customer_ButtonActionPerformed

    private void CustomersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CustomersListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM customer where name = '"+CustomersList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);

            while(rs.next()){
                code_txt.setText(rs.getString(1));
                cardID_txt.setText(rs.getString(2));
                customer_name_txt.setText(rs.getString(3));
                age_txt.setText(rs.getString(4));
                Gender_ComboBox.setSelectedItem(rs.getString(5));
                marital_status_ComboBox.setSelectedItem(rs.getString(6));
            }
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_CustomersListValueChanged

    private void Check_ticket_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_ticket_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        System.out.println("Connecting database...");

        try(Connection con = DriverManager.getConnection(url,username,password)){
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            String Query = "Insert into ticket values('"+check_ticket_code_txt.getText()+"','"+check_movie_title_txt.getText()+"',"
            + "'"+check_auditorioum_txt.getText()+"','"+check_date_buyed_txt.getText()+"','"+check_price_2D_txt.getText()+"',"
            + "'"+check_price_3D_txt.getText()+"','"+check_member_card_ID_txt.getText()+"')";
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Ticket selled succesfully");
            check_ticket_code_txt.setText(null);
            check_movie_title_txt.setText(null);
            check_auditorioum_txt.setText(null);
            check_date_buyed_txt.setText(null);
            check_price_2D_txt.setText(null);
            check_price_3D_txt.setText(null);
            check_member_card_ID_txt.setText(null);
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_Check_ticket_ButtonActionPerformed


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
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CashierMenu dialog = new CashierMenu(new javax.swing.JFrame(), true);
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
    private javax.swing.JList<String> AuditorioumNamesList;
    private javax.swing.JTextField Auditorioum_movie_end_hour_txt;
    private javax.swing.JTextField Auditorioum_movie_playing_txt;
    private javax.swing.JTextField Auditorioum_movie_start_hour_txt;
    private javax.swing.JList<String> Auditorioum_movies_date_plays_List;
    private javax.swing.JList<String> Auditorioum_movies_start_hour_List;
    private javax.swing.JTextField Auditorioum_name_txt;
    private javax.swing.JButton Check_ticket_Button;
    private javax.swing.JList<String> CustomersList;
    private javax.swing.JComboBox<String> Gender_ComboBox;
    private javax.swing.JTextField age_txt;
    private javax.swing.JComboBox<String> air_condition_ComboBox;
    private javax.swing.JTextField cardID_txt;
    private javax.swing.JTextField check_auditorioum_txt;
    private javax.swing.JTextField check_date_buyed_txt;
    private javax.swing.JTextField check_member_card_ID_txt;
    private javax.swing.JTextField check_movie_title_txt;
    private javax.swing.JTextField check_price_2D_txt;
    private javax.swing.JTextField check_price_3D_txt;
    private javax.swing.JTextField check_ticket_code_txt;
    private javax.swing.JTextField code_txt;
    private javax.swing.JTextField customer_name_txt;
    private javax.swing.JButton edit_ok_customer_Button;
    private javax.swing.JTextField floor_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> marital_status_ComboBox;
    private javax.swing.JTextField num_of_seats_txt;
    // End of variables declaration//GEN-END:variables
}
