package cinema.project;

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class AdminShowMenu extends javax.swing.JDialog {

    final void Fill_all_Lists(){
       //edw gemisw oles tis DLM(Default List Model) me ta dedomena poy pairnw
       //apo ti vasi dedomenwn cinema
       
       String url = "jdbc:mysql://localhost:3306/cinema";
       String username = "user";
       String password = "user";
            
       System.out.println("Connecting database...");
            
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            
            String Query1 = "SELECT * FROM cinema.employee";
            String Query2 = "SELECT * from cashier";
            String Query3 = "SELECT * from cleaner";
            String Query4 = "SELECT * from usher";
            String Query5 = "SELECT * from supervisor";
            String Query6 = "SELECT DISTINCT shift_emp_name from shifts";
            String Query10 = "SELECT DISTINCT shift_date from shifts";
            String Query7 = "SELECT * from movie";
            String Query8 = "SELECT * from award";
            String Query11 = "SELECT movie_title from award";
            String Query9 = "SELECT * from customer";
                        
            
            
            DefaultListModel DLM1 = new DefaultListModel(); //emp
            DefaultListModel DLM2 = new DefaultListModel(); //cashiers
            DefaultListModel DLM3 = new DefaultListModel(); //cleaners
            DefaultListModel DLM4 = new DefaultListModel(); //ushers
            DefaultListModel DLM5 = new DefaultListModel(); //supervisors
            DefaultListModel DLM6 = new DefaultListModel(); //shifts_employee_names_1stList
            DefaultListModel DLM10 = new DefaultListModel(); //shifts_hours_2ndList
            DefaultListModel DLM7 = new DefaultListModel(); //movies
            DefaultListModel DLM8 = new DefaultListModel(); //awards_title_1stList
            DefaultListModel DLM11 = new DefaultListModel(); //awards_movie_title_2ndList
            DefaultListModel DLM9 = new DefaultListModel(); //customers

            
            ResultSet rs1 = stmt.executeQuery(Query1);
            while(rs1.next()){
                DLM1.addElement(rs1.getString(1));
            }
            EmployeeList.setModel(DLM1);
            rs1.close();

            rs1 = stmt.executeQuery(Query2);            
            while(rs1.next()){
                DLM2.addElement(rs1.getString(1));
            }
            CashiersList.setModel(DLM2);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query3);
            while(rs1.next()){
                DLM3.addElement(rs1.getString(1));
            }
            CleanersList.setModel(DLM3);
            rs1.close();

            rs1 = stmt.executeQuery(Query4);            
            while(rs1.next()){
                DLM4.addElement(rs1.getString(1));
            }
            UshersList.setModel(DLM4);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query5);            
            while(rs1.next()){
                DLM5.addElement(rs1.getString(1));
            }
            SupervisorsList.setModel(DLM5);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query6);            
            while(rs1.next()){
                DLM6.addElement(rs1.getString(1));
            }
            ShiftsList.setModel(DLM6);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query10);            
            while(rs1.next()){
                DLM10.addElement(rs1.getString(1));
            }
            ShiftsHoursList.setModel(DLM10);
            rs1.close();

            rs1 = stmt.executeQuery(Query7);            
            while(rs1.next()){
                DLM7.addElement(rs1.getString(1));
            }
            MovieList.setModel(DLM7);
            rs1.close();
            
            rs1 = stmt.executeQuery(Query8);            
            while(rs1.next()){
                DLM8.addElement(rs1.getString(1));
            }
            AwardsList.setModel(DLM8);
            rs1.close();

            rs1 = stmt.executeQuery(Query11);            
            while(rs1.next()){
                DLM11.addElement(rs1.getString(1));
            }
            Awards_moviesList.setModel(DLM11);
            rs1.close();            
            
            rs1 = stmt.executeQuery(Query9);            
            while(rs1.next()){
                DLM9.addElement(rs1.getString(3));
            }
            CustomersList.setModel(DLM9);
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
    

    public AdminShowMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        Fill_all_Lists();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Shows_Tabbed_Panel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EmpNametxt = new javax.swing.JTextField();
        Resumetxt = new javax.swing.JTextField();
        Experiencetxt = new javax.swing.JTextField();
        Hiredtxt = new javax.swing.JTextField();
        Degreetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeList = new javax.swing.JList<>();
        FaceIcon = new javax.swing.JLabel();
        edit_ok__employee_Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Directorstxt = new javax.swing.JTextField();
        Urltxt = new javax.swing.JTextField();
        MovieTitletxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MovieList = new javax.swing.JList<>();
        Starringtxt = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Genre_ComboBox = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        Reviewtxt = new javax.swing.JTextArea();
        edit_ok__movie_Button = new javax.swing.JButton();
        Production_Date_ComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        biography_txt = new javax.swing.JTextField();
        face_url_txt = new javax.swing.JTextField();
        movie_title_txt = new javax.swing.JTextField();
        Contr_name_txt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ContributorsList = new javax.swing.JList<>();
        edit_ok_contributor_Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        description_txt = new javax.swing.JTextField();
        award_name_txt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        AwardsList = new javax.swing.JList<>();
        edit_ok_award_Button = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        Awards_moviesList = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        award_movie_title_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Nomination_ComboBox = new javax.swing.JComboBox<>();
        Award_year_ComboBox = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        award_contr_name_txt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        age_txt = new javax.swing.JTextField();
        customer_name_txt = new javax.swing.JTextField();
        cardID_txt = new javax.swing.JTextField();
        code_txt = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        CustomersList = new javax.swing.JList<>();
        jLabel54 = new javax.swing.JLabel();
        Gender_ComboBox = new javax.swing.JComboBox<>();
        marital_status_ComboBox = new javax.swing.JComboBox<>();
        edit_ok_customer_Button = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Cashier_hired_date_txt = new javax.swing.JTextField();
        Cashier_exp_txt = new javax.swing.JTextField();
        Cashier_resume_txt = new javax.swing.JTextField();
        Cashier_degree_txt = new javax.swing.JTextField();
        Cashier_Employee_Name_txt = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        CashiersList = new javax.swing.JList<>();
        FaceIcon_Cashier = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Cleaner_hired_date_txt = new javax.swing.JTextField();
        Cleaner_exp_txt = new javax.swing.JTextField();
        Cleaner_resume_txt = new javax.swing.JTextField();
        Cleaner_degree_txt = new javax.swing.JTextField();
        Cleaner_emp_name_txt = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        CleanersList = new javax.swing.JList<>();
        FaceIcon_Cleaner = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Usher_hired_date_txt = new javax.swing.JTextField();
        Usher_exp_txt = new javax.swing.JTextField();
        Usher_resume_txt = new javax.swing.JTextField();
        Usher_degree_txt = new javax.swing.JTextField();
        Usher_emp_name_txt = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        UshersList = new javax.swing.JList<>();
        FaceIcon_Ushers = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Supervisor_hired_date_txt = new javax.swing.JTextField();
        Supervisor_exp_txt = new javax.swing.JTextField();
        Supervisor_resume_txt = new javax.swing.JTextField();
        Supervisor_degree_txt = new javax.swing.JTextField();
        Supervisor_emp_name_txt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        SupervisorsList = new javax.swing.JList<>();
        FaceIcon_Supervisors = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        end_txt = new javax.swing.JTextField();
        start_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        Shifts_emp_name_txt = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        ShiftsList = new javax.swing.JList<>();
        period_ComboBox = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        ShiftsHoursList = new javax.swing.JList<>();
        edit_ok_shift_Button = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        posts_cleaners_txt = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        posts_cashiers_txt = new javax.swing.JTextField();
        posts_ushers_txt = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        posts_supervisors_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        posts_shift_period_ComboBox = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        posts_shift_date_ComboBox = new javax.swing.JComboBox<>();
        QueryFLabel = new javax.swing.JLabel();
        QueryDLabel = new javax.swing.JLabel();
        QueryELabel = new javax.swing.JLabel();
        QueryCLabel = new javax.swing.JLabel();
        QueryALabel = new javax.swing.JLabel();
        QueryBLabel = new javax.swing.JLabel();
        extraQueryALabel = new javax.swing.JLabel();
        extraQueryBLabel = new javax.swing.JLabel();
        extraQueryCLabel = new javax.swing.JLabel();
        extraQueryDLabel = new javax.swing.JLabel();
        QueryA_Button = new javax.swing.JButton();
        QueryB_Button = new javax.swing.JButton();
        QueryC_Button = new javax.swing.JButton();
        QueryD_Button = new javax.swing.JButton();
        QueryE_Button = new javax.swing.JButton();
        QueryF_Button = new javax.swing.JButton();
        extra_QueryA_Button = new javax.swing.JButton();
        extra_QueryB_Button = new javax.swing.JButton();
        extra_QueryC_Button = new javax.swing.JButton();
        extra_QueryD_Button = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        Ok_count_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Show Menu");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 500));

        Shows_Tabbed_Panel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Shows_Tabbed_PanelStateChanged(evt);
            }
        });

        jLabel1.setText("Employee Name");

        jLabel2.setText("Experience");

        jLabel3.setText("Degree");

        jLabel4.setText("Resume");

        jLabel5.setText("Hired Date");

        EmployeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                EmployeeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeList);

        edit_ok__employee_Button.setText("EDIT OK");
        edit_ok__employee_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok__employee_ButtonActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Experiencetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EmpNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Degreetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resumetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hiredtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FaceIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(edit_ok__employee_Button)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Degreetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resumetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Experiencetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hiredtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(FaceIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_ok__employee_Button)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Shows_Tabbed_Panel.addTab("Employees ( FULL DATA )", jPanel1);

        jLabel6.setText("Title");

        jLabel7.setText("Review");

        jLabel8.setText("Url");

        jLabel9.setText("Production Date");

        jLabel10.setText("Directors");

        MovieList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                MovieListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(MovieList);

        jLabel52.setText("Genre");

        jLabel53.setText("Starring");

        Genre_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "action", "adventure", "animation", "biography", "comedy", "crime", "documentary", "drama", "family", "fantasy", "film-noir", "history", "horror", "music", "musical", "mystery", "romance", "sci-fi", "sport", "thriller", "war", "western" }));

        Reviewtxt.setColumns(20);
        Reviewtxt.setRows(5);
        jScrollPane11.setViewportView(Reviewtxt);

        edit_ok__movie_Button.setText("EDIT OK");
        edit_ok__movie_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok__movie_ButtonActionPerformed(evt);
            }
        });

        Production_Date_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1870", "1871", "1872", "1873", "1874", "1875", "1876", "1877", "1878", "1879", "1880", "1881", "1882", "1883", "1884", "1885", "1886", "1887", "1888", "1889", "1890", "1891", "1892", "1893", "1894", "1895", "1896", "1897", "1898", "1899", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Directorstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MovieTitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Starringtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Genre_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Production_Date_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Urltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(edit_ok__movie_Button)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_ok__movie_Button)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MovieTitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Urltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Production_Date_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Directorstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Starringtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Genre_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        Shows_Tabbed_Panel.addTab("Movies", jPanel2);

        jLabel11.setText("Contributor Name");

        jLabel12.setText("Movie Title");

        jLabel13.setText("Face Url");

        jLabel14.setText("Biography");

        ContributorsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ContributorsListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ContributorsList);

        edit_ok_contributor_Button.setText("EDIT OK");
        edit_ok_contributor_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok_contributor_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contr_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(movie_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(biography_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(face_url_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(edit_ok_contributor_Button)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_ok_contributor_Button)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contr_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movie_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(face_url_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(biography_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        Shows_Tabbed_Panel.addTab("Contributors", jPanel3);

        jLabel16.setText("Award Name");

        jLabel17.setText("Year");

        jLabel18.setText("Description");

        AwardsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AwardsListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(AwardsList);

        edit_ok_award_Button.setText("EDIT OK");
        edit_ok_award_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok_award_ButtonActionPerformed(evt);
            }
        });

        Awards_moviesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Awards_moviesListValueChanged(evt);
            }
        });
        jScrollPane13.setViewportView(Awards_moviesList);

        jLabel19.setText("Nomination");

        jLabel20.setText("Movie Title");

        Nomination_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "won", "nominated" }));

        Award_year_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));

        jLabel51.setText("Contributor Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(award_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Award_year_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(description_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(award_movie_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nomination_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(award_contr_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(edit_ok_award_Button)
                .addGap(83, 83, 83))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_ok_award_Button)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(award_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Award_year_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(award_movie_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nomination_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(award_contr_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        Shows_Tabbed_Panel.addTab("Awards", jPanel4);

        jLabel21.setText("Code");

        jLabel22.setText("Card ID");

        jLabel23.setText("Customer Name");

        jLabel24.setText("Age");

        jLabel25.setText("Gender");

        CustomersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CustomersListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(CustomersList);

        jLabel54.setText("Marital Status");

        Gender_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        marital_status_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "single", "married" }));

        edit_ok_customer_Button.setText("EDIT OK");
        edit_ok_customer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok_customer_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Gender_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customer_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marital_status_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(edit_ok_customer_Button)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_ok_customer_Button)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gender_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marital_status_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        Shows_Tabbed_Panel.addTab("Customers", jPanel5);

        jLabel26.setText("Employee Name");

        jLabel27.setText("Degree");

        jLabel28.setText("Resume");

        jLabel29.setText("Experience");

        jLabel30.setText("Hired Date");

        CashiersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CashiersListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(CashiersList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cashier_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cashier_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cashier_Employee_Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cashier_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cashier_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FaceIcon_Cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(615, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cashier_Employee_Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cashier_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cashier_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Cashier_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cashier_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FaceIcon_Cashier, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        Shows_Tabbed_Panel.addTab("Cashiers", jPanel6);

        jLabel31.setText("Employee Name");

        jLabel32.setText("Degree");

        jLabel33.setText("Resume");

        jLabel34.setText("Experience");

        jLabel35.setText("Hired Date");

        CleanersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CleanersListValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(CleanersList);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cleaner_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cleaner_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cleaner_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cleaner_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cleaner_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FaceIcon_Cleaner, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(615, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cleaner_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cleaner_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cleaner_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Cleaner_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cleaner_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FaceIcon_Cleaner, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        Shows_Tabbed_Panel.addTab("Cleaners", jPanel7);

        jLabel36.setText("Employee Name");

        jLabel37.setText("Degree");

        jLabel38.setText("Resume");

        jLabel39.setText("Experience");

        jLabel40.setText("Hired Date");

        UshersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                UshersListValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(UshersList);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usher_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usher_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usher_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usher_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usher_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FaceIcon_Ushers, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(615, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usher_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usher_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usher_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Usher_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Usher_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FaceIcon_Ushers, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        Shows_Tabbed_Panel.addTab("Ushers", jPanel8);

        jLabel41.setText("Employee Name");

        jLabel42.setText("Degree");

        jLabel43.setText("Resume");

        jLabel44.setText("Experience");

        jLabel45.setText("Hired Date");

        SupervisorsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                SupervisorsListValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(SupervisorsList);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Supervisor_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Supervisor_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Supervisor_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Supervisor_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Supervisor_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FaceIcon_Supervisors, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(615, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Supervisor_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Supervisor_degree_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Supervisor_resume_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Supervisor_exp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Supervisor_hired_date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FaceIcon_Supervisors, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        Shows_Tabbed_Panel.addTab("Supervisors", jPanel9);

        jLabel46.setText("Employee Name");

        jLabel47.setText("Shift Date");

        jLabel48.setText("Start Hour of Shift");

        jLabel49.setText("End Hour of Shift");

        jLabel50.setText("Shift Period");

        ShiftsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ShiftsListValueChanged(evt);
            }
        });
        jScrollPane10.setViewportView(ShiftsList);

        period_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "morning", "night" }));

        ShiftsHoursList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ShiftsHoursListValueChanged(evt);
            }
        });
        jScrollPane12.setViewportView(ShiftsHoursList);

        edit_ok_shift_Button.setText("EDIT OK");
        edit_ok_shift_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ok_shift_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(end_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(period_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Shifts_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(start_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(edit_ok_shift_Button)
                .addGap(65, 65, 65))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_ok_shift_Button)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Shifts_emp_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(end_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(period_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        Shows_Tabbed_Panel.addTab("Shifts", jPanel10);

        jLabel55.setText("Cleaners");

        jLabel56.setText("Cashiers");

        jLabel57.setText("Ushers");

        jLabel58.setText("Supervisors");

        jLabel15.setText("Choose the shift day period");

        posts_shift_period_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "morning", "night", " " }));

        jLabel60.setText("Choose the shift date");

        posts_shift_date_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016-1-1", "2016-1-2", "2016-1-3", "2016-1-4", "2016-1-5", "2016-1-6", "2016-1-7", "2016-1-8", "2016-1-9", "2016-1-10", "2016-1-11", "2016-1-12", "2016-1-13", "2016-1-14", "2016-1-15", "2016-1-16", "2016-1-17", "2016-1-18", "2016-1-19", "2016-1-20", "2016-1-21", "2016-1-22", "2016-1-23", "2016-1-24", "2016-1-25", "2016-1-26", "2016-1-27", "2016-1-28", "2016-1-29", "2016-1-30", "2016-2-1", "2016-2-2", "2016-2-3", "2016-2-4", "2016-2-5", "2016-2-6", "2016-2-7", "2016-2-8", "2016-2-9", "2016-2-10", "2016-2-11", "2016-2-12", "2016-2-13", "2016-2-14", "2016-2-15", "2016-2-16", "2016-2-17", "2016-2-18", "2016-2-19", "2016-2-20", "2016-2-21", "2016-2-22", "2016-2-23", "2016-2-24", "2016-2-25", "2016-2-26", "2016-2-27", "2016-2-28", "2016-2-29", "2016-2-30", "2016-3-1", "2016-3-2", "2016-3-3", "2016-3-4", "2016-3-5", "2016-3-6", "2016-3-7", "2016-3-8", "2016-3-9", "2016-3-10", "2016-3-11", "2016-3-12", "2016-3-13", "2016-3-14", "2016-3-15", "2016-3-16", "2016-3-17", "2016-3-18", "2016-3-19", "2016-3-20", "2016-3-21", "2016-3-22", "2016-3-23", "2016-3-24", "2016-3-25", "2016-3-26", "2016-3-27", "2016-3-28", "2016-3-29", "2016-3-30", "2016-4-1", "2016-4-2", "2016-4-3", "2016-4-4", "2016-4-5", "2016-4-6", "2016-4-7", "2016-4-8", "2016-4-9", "2016-4-10", "2016-4-11", "2016-4-12", "2016-4-13", "2016-4-14", "2016-4-15", "2016-4-16", "2016-4-17", "2016-4-18", "2016-4-19", "2016-4-20", "2016-4-21", "2016-4-22", "2016-4-23", "2016-4-24", "2016-4-25", "2016-4-26", "2016-4-27", "2016-4-28", "2016-4-29", "2016-4-30", "2016-5-1", "2016-5-2", "2016-5-3", "2016-5-4", "2016-5-5", "2016-5-6", "2016-5-7", "2016-5-8", "2016-5-9", "2016-5-10", "2016-5-11", "2016-5-12", "2016-5-13", "2016-5-14", "2016-5-15", "2016-5-16", "2016-5-17", "2016-5-18", "2016-5-19", "2016-5-20", "2016-5-21", "2016-5-22", "2016-5-23", "2016-5-24", "2016-5-25", "2016-5-26", "2016-5-27", "2016-5-28", "2016-5-29", "2016-5-30", "2016-6-1", "2016-6-2", "2016-6-3", "2016-6-4", "2016-6-5", "2016-6-6", "2016-6-7", "2016-6-8", "2016-6-9", "2016-6-10", "2016-6-11", "2016-6-12", "2016-6-13", "2016-6-14", "2016-6-15", "2016-6-16", "2016-6-17", "2016-6-18", "2016-6-19", "2016-6-20", "2016-6-21", "2016-6-22", "2016-6-23", "2016-6-24", "2016-6-25", "2016-6-26", "2016-6-27", "2016-6-28", "2016-6-29", "2016-6-30", "2016-7-1", "2016-7-2", "2016-7-3", "2016-7-4", "2016-7-5", "2016-7-6", "2016-7-7", "2016-7-8", "2016-7-9", "2016-7-10", "2016-7-11", "2016-7-12", "2016-7-13", "2016-7-14", "2016-7-15", "2016-7-16", "2016-7-17", "2016-7-18", "2016-7-19", "2016-7-20", "2016-7-21", "2016-7-22", "2016-7-23", "2016-7-24", "2016-7-25", "2016-7-26", "2016-7-27", "2016-7-28", "2016-7-29", "2016-7-30", "2016-8-1", "2016-8-2", "2016-8-3", "2016-8-4", "2016-8-5", "2016-8-6", "2016-8-7", "2016-8-8", "2016-8-9", "2016-8-10", "2016-8-11", "2016-8-12", "2016-8-13", "2016-8-14", "2016-8-15", "2016-8-16", "2016-8-17", "2016-8-18", "2016-8-19", "2016-8-20", "2016-8-21", "2016-8-22", "2016-8-23", "2016-8-24", "2016-8-25", "2016-8-26", "2016-8-27", "2016-8-28", "2016-8-29", "2016-8-30", "2016-9-1", "2016-9-2", "2016-9-3", "2016-9-4", "2016-9-5", "2016-9-6", "2016-9-7", "2016-9-8", "2016-9-9", "2016-9-10", "2016-9-11", "2016-9-12", "2016-9-13", "2016-9-14", "2016-9-15", "2016-9-16", "2016-9-17", "2016-9-18", "2016-9-19", "2016-9-20", "2016-9-21", "2016-9-22", "2016-9-23", "2016-9-24", "2016-9-25", "2016-9-26", "2016-9-27", "2016-9-28", "2016-9-29", "2016-9-30", "2016-10-1", "2016-10-2", "2016-10-3", "2016-10-4", "2016-10-5", "2016-10-6", "2016-10-7", "2016-10-8", "2016-10-9", "2016-10-10", "2016-10-11", "2016-10-12", "2016-10-13", "2016-10-14", "2016-10-15", "2016-10-16", "2016-10-17", "2016-10-18", "2016-10-19", "2016-10-20", "2016-10-21", "2016-10-22", "2016-10-23", "2016-10-24", "2016-10-25", "2016-10-26", "2016-10-27", "2016-10-28", "2016-10-29", "2016-10-30", "2016-11-1", "2016-11-2", "2016-11-3", "2016-11-4", "2016-11-5", "2016-11-6", "2016-11-7", "2016-11-8", "2016-11-9", "2016-11-10", "2016-11-11", "2016-11-12", "2016-11-13", "2016-11-14", "2016-11-15", "2016-11-16", "2016-11-17", "2016-11-18", "2016-11-19", "2016-11-20", "2016-11-21", "2016-11-22", "2016-11-23", "2016-11-24", "2016-11-25", "2016-11-26", "2016-11-27", "2016-11-28", "2016-11-29", "2016-11-30", "2016-12-1", "2016-12-2", "2016-12-3", "2016-12-4", "2016-12-5", "2016-12-6", "2016-12-7", "2016-12-8", "2016-12-9", "2016-12-10", "2016-12-11", "2016-12-12", "2016-12-13", "2016-12-14", "2016-12-15", "2016-12-16", "2016-12-17", "2016-12-18", "2016-12-19", "2016-12-20", "2016-12-21", "2016-12-22", "2016-12-23", "2016-12-24", "2016-12-25", "2016-12-26", "2016-12-27", "2016-12-28", "2016-12-29", "2016-12-30" }));

        QueryFLabel.setText("QUERY F");
        QueryFLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QueryFLabelMouseEntered(evt);
            }
        });

        QueryDLabel.setText("QUERY D");
        QueryDLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QueryDLabelMouseEntered(evt);
            }
        });

        QueryELabel.setText("QUERY E");
        QueryELabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QueryELabelMouseEntered(evt);
            }
        });

        QueryCLabel.setText("QUERY C");
        QueryCLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QueryCLabelMouseEntered(evt);
            }
        });

        QueryALabel.setText("QUERY A");
        QueryALabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QueryALabelMouseEntered(evt);
            }
        });

        QueryBLabel.setText("QUERY B");
        QueryBLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QueryBLabelMouseEntered(evt);
            }
        });

        extraQueryALabel.setText("extra QUERY A");
        extraQueryALabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extraQueryALabelMouseEntered(evt);
            }
        });

        extraQueryBLabel.setText("extra QUERY B");
        extraQueryBLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extraQueryBLabelMouseEntered(evt);
            }
        });

        extraQueryCLabel.setText("extra QUERY C");
        extraQueryCLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extraQueryCLabelMouseEntered(evt);
            }
        });

        extraQueryDLabel.setText("extra QUERY D");
        extraQueryDLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extraQueryDLabelMouseEntered(evt);
            }
        });

        QueryA_Button.setText("Press");
        QueryA_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryA_ButtonActionPerformed(evt);
            }
        });

        QueryB_Button.setText("Press");
        QueryB_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryB_ButtonActionPerformed(evt);
            }
        });

        QueryC_Button.setText("Press");
        QueryC_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryC_ButtonActionPerformed(evt);
            }
        });

        QueryD_Button.setText("Press");
        QueryD_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryD_ButtonActionPerformed(evt);
            }
        });

        QueryE_Button.setText("Press");
        QueryE_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryE_ButtonActionPerformed(evt);
            }
        });

        QueryF_Button.setText("Press");
        QueryF_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryF_ButtonActionPerformed(evt);
            }
        });

        extra_QueryA_Button.setText("Press");
        extra_QueryA_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extra_QueryA_ButtonActionPerformed(evt);
            }
        });

        extra_QueryB_Button.setText("Press");
        extra_QueryB_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extra_QueryB_ButtonActionPerformed(evt);
            }
        });

        extra_QueryC_Button.setText("Press");
        extra_QueryC_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extra_QueryC_ButtonActionPerformed(evt);
            }
        });

        extra_QueryD_Button.setText("Press");
        extra_QueryD_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extra_QueryD_ButtonActionPerformed(evt);
            }
        });

        jLabel71.setText("Let the mouse over to see what each query does!");

        Ok_count_Button.setText("Ok Count !!!");
        Ok_count_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_count_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(posts_cleaners_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(posts_cashiers_txt)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(posts_supervisors_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(posts_ushers_txt)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel71)))
                .addGap(90, 90, 90)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(QueryCLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(QueryBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(QueryALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(QueryA_Button, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(QueryB_Button, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(QueryC_Button, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(QueryFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QueryD_Button, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(QueryE_Button, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(QueryF_Button, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(extraQueryDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extra_QueryD_Button))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(extraQueryCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extra_QueryC_Button))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(extraQueryBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extra_QueryB_Button))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(extraQueryALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extra_QueryA_Button))))
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posts_shift_date_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(posts_shift_period_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ok_count_Button))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posts_cleaners_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posts_cashiers_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(posts_ushers_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(posts_shift_date_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(posts_shift_period_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posts_supervisors_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Ok_count_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QueryALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(QueryA_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QueryBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryB_Button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QueryCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryC_Button))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QueryD_Button)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(QueryDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(QueryELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(QueryE_Button))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QueryFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryF_Button)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(extraQueryALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(extra_QueryA_Button))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(extraQueryBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(extra_QueryB_Button))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(extraQueryCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(extra_QueryC_Button))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(extraQueryDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(extra_QueryD_Button)))))))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Shows_Tabbed_Panel.addTab("New Line Cinema Posts", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Shows_Tabbed_Panel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shows_Tabbed_Panel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_EmployeeListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
 
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM employee where emp_name = '"+EmployeeList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
            
             
            while(rs.next()){
                EmpNametxt.setText(rs.getString(1));
                Degreetxt.setText(rs.getString(2));
                Resumetxt.setText(rs.getString(3));
                Experiencetxt.setText(rs.getString(4));
                Hiredtxt.setText(rs.getString(5));
                String string_name = rs.getString(1);
                String[] parts = string_name.split(" ");
                String part1 = parts[0]; // Efthimis
                String part2 = parts[1]; // Kostis
                String final_name = part1+part2; //EfthimisKostis
                FaceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+final_name+".png")));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_EmployeeListValueChanged

    private void MovieListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_MovieListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
     
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM movie where title = '"+MovieList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
             
            while(rs.next()){
                MovieTitletxt.setText(rs.getString(1));
                Reviewtxt.setText(rs.getString(2));
                Urltxt.setText(rs.getString(3));
                Production_Date_ComboBox.setSelectedItem(rs.getString(4));
                Directorstxt.setText(rs.getString(5));
                Starringtxt.setText(rs.getString(6));
                Genre_ComboBox.setSelectedItem(rs.getString(7));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_MovieListValueChanged

    private void ContributorsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ContributorsListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
            
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM contributor where name = '"+ContributorsList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
             
            while(rs.next()){
                Contr_name_txt.setText(rs.getString(1));
                movie_title_txt.setText(rs.getString(2));
                face_url_txt.setText(rs.getString(3));
                biography_txt.setText(rs.getString(4));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_ContributorsListValueChanged

    private void AwardsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AwardsListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
            
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM award where name = '"+AwardsList.getSelectedValue()+"' and movie_title = '"+Awards_moviesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);

             
            while(rs.next()){
                award_name_txt.setText(rs.getString(1));
                Award_year_ComboBox.setSelectedItem(rs.getString(2));
                description_txt.setText(rs.getString(3));
                Nomination_ComboBox.setSelectedItem(rs.getString(4));
                award_movie_title_txt.setText(rs.getString(5));
                award_contr_name_txt.setText(rs.getString(6));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_AwardsListValueChanged

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

    private void Shows_Tabbed_PanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Shows_Tabbed_PanelStateChanged
        // axreiasto
    }//GEN-LAST:event_Shows_Tabbed_PanelStateChanged

    private void UshersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_UshersListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
                
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM employee where emp_name = '"+UshersList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
                         
            while(rs.next()){
                Usher_emp_name_txt.setText(rs.getString(1));
                Usher_degree_txt.setText(rs.getString(2));
                Usher_resume_txt.setText(rs.getString(3));
                Usher_exp_txt.setText(rs.getString(4));
                Usher_hired_date_txt.setText(rs.getString(5));
                String string_name = rs.getString(1);
                String[] parts = string_name.split(" ");
                String part1 = parts[0]; // Efthimis
                String part2 = parts[1]; // Kostis
                String final_name = part1+part2; //EfthimisKostis
                FaceIcon_Ushers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+final_name+".png")));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_UshersListValueChanged

    private void SupervisorsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_SupervisorsListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
    
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM employee where emp_name = '"+SupervisorsList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
                         
            while(rs.next()){
                Supervisor_emp_name_txt.setText(rs.getString(1));
                Supervisor_degree_txt.setText(rs.getString(2));
                Supervisor_resume_txt.setText(rs.getString(3));
                Supervisor_exp_txt.setText(rs.getString(4));
                Supervisor_hired_date_txt.setText(rs.getString(5));
                String string_name = rs.getString(1);
                String[] parts = string_name.split(" ");
                String part1 = parts[0]; // Efthimis
                String part2 = parts[1]; // Kostis
                String final_name = part1+part2; //EfthimisKostis
                FaceIcon_Supervisors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+final_name+".png")));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_SupervisorsListValueChanged

    private void ShiftsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ShiftsListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
                
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM shifts where shift_emp_name = '"+ShiftsList.getSelectedValue()+"'"
                    + "  and shift_date = '"+ShiftsHoursList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
                         
            while(rs.next()){
                Shifts_emp_name_txt.setText(rs.getString(1));
                date_txt.setText(rs.getString(2));
                start_txt.setText(rs.getString(3));
                end_txt.setText(rs.getString(4));
                period_ComboBox.setSelectedItem(rs.getString(5));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_ShiftsListValueChanged

    private void ShiftsHoursListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ShiftsHoursListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
                
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM shifts where shift_emp_name = '"+ShiftsList.getSelectedValue()+"'"
                    + "  and shift_date = '"+ShiftsHoursList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
                         
            while(rs.next()){
                Shifts_emp_name_txt.setText(rs.getString(1));
                date_txt.setText(rs.getString(2));
                start_txt.setText(rs.getString(3));
                end_txt.setText(rs.getString(4));
                period_ComboBox.setSelectedItem(rs.getString(5));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_ShiftsHoursListValueChanged

    private void CleanersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CleanersListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
    
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM employee where emp_name = '"+CleanersList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);
            
             
            while(rs.next()){
                Cleaner_emp_name_txt.setText(rs.getString(1));
                Cleaner_degree_txt.setText(rs.getString(2));
                Cleaner_resume_txt.setText(rs.getString(3));
                Cleaner_exp_txt.setText(rs.getString(4));
                Cleaner_hired_date_txt.setText(rs.getString(5));
                String string_name = rs.getString(1);
                String[] parts = string_name.split(" ");
                String part1 = parts[0]; // Efthimis
                String part2 = parts[1]; // Kostis
                String final_name = part1+part2; //EfthimisKostis
                FaceIcon_Cleaner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+final_name+".png")));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_CleanersListValueChanged

    private void CashiersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CashiersListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";

        try(Connection con = DriverManager.getConnection(url,username,password)){
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM employee where emp_name = '"+CashiersList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);


            while(rs.next()){
                Cashier_Employee_Name_txt.setText(rs.getString(1));
                Cashier_degree_txt.setText(rs.getString(2));
                Cashier_resume_txt.setText(rs.getString(3));
                Cashier_exp_txt.setText(rs.getString(4));
                Cashier_hired_date_txt.setText(rs.getString(5));
                String string_name = rs.getString(1);
                String[] parts = string_name.split(" ");
                String part1 = parts[0]; // Efthimis
                String part2 = parts[1]; // Kostis
                String final_name = part1+part2; //EfthimisKostis
                FaceIcon_Cashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+final_name+".png")));
            }
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
            //JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_CashiersListValueChanged

    private void edit_ok__employee_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ok__employee_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;    
        String update_Query = " UPDATE employee SET "
                    + "degree = ?, "
                    + "resume = ?, "
                    + "experience = ?, "
                    + "hired = ? " 
                    + "WHERE emp_name=?";
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            pr_stmt = con.prepareStatement(update_Query);
 
            pr_stmt.setString(1,Degreetxt.getText());
            pr_stmt.setString(2,Resumetxt.getText());
            pr_stmt.setString(3,Experiencetxt.getText());
            pr_stmt.setString(4,Hiredtxt.getText());
            pr_stmt.setString(5,EmployeeList.getSelectedValue());
            
            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The employee updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }   
    }//GEN-LAST:event_edit_ok__employee_ButtonActionPerformed

    private void edit_ok__movie_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ok__movie_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;
        
        String update_Query = " UPDATE movie SET "
                    + "review = ?,"
                    + "url = ?,"
                    + "date_produced = ?,"
                    + "directors = ?,"
                    + "starring = ?,"
                    + "genre = ?"
                    + "WHERE title = ?";
                
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            pr_stmt = con.prepareStatement(update_Query);
 
            pr_stmt.setString(1,Reviewtxt.getText());
            pr_stmt.setString(2,Urltxt.getText());
            pr_stmt.setObject(3,Production_Date_ComboBox.getSelectedItem());         
            pr_stmt.setString(4,Directorstxt.getText());
            pr_stmt.setString(5,Starringtxt.getText());
            pr_stmt.setObject(6,Genre_ComboBox.getSelectedItem());
            pr_stmt.setString(7,MovieList.getSelectedValue());
            
            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The movie updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_edit_ok__movie_ButtonActionPerformed

    private void edit_ok_contributor_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ok_contributor_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;    
        String update_Query = " UPDATE contribuotr SET "
                    + "name = ?, "
                    + "title_movie = ?, "
                    + "face_url = ?, "
                    + "biography = ? " 
                    + "WHERE name=?";
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            pr_stmt = con.prepareStatement(update_Query);
 
            pr_stmt.setString(1,Contr_name_txt.getText());
            pr_stmt.setString(2,movie_title_txt.getText());
            pr_stmt.setString(3,face_url_txt.getText());
            pr_stmt.setString(4,biography_txt.getText());
            pr_stmt.setString(5,ContributorsList.getSelectedValue());
            
            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The contributor updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        } 
    }//GEN-LAST:event_edit_ok_contributor_ButtonActionPerformed

    private void edit_ok_award_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ok_award_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;
        
        String update_Query = " UPDATE award SET "
                    + "name = ?,"
                    + "year = ?,"
                    + "description = ?,"
                    + "nomination = ?,"
                    + "movie_title = ?,"
                    + "contributor_name = ?"
                    + "WHERE name = ?";
                
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            pr_stmt = con.prepareStatement(update_Query);
 
            pr_stmt.setString(1,award_name_txt.getText());
            pr_stmt.setObject(2,Award_year_ComboBox.getSelectedItem());
            pr_stmt.setString(3,description_txt.getText());             
            pr_stmt.setObject(4,Nomination_ComboBox.getSelectedItem());
            pr_stmt.setString(5,award_movie_title_txt.getText());
            pr_stmt.setString(6,award_contr_name_txt.getText());
            pr_stmt.setString(7,AwardsList.getSelectedValue());
            
            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The award updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_edit_ok_award_ButtonActionPerformed

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

    private void edit_ok_shift_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ok_shift_ButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
        PreparedStatement pr_stmt;    
        String update_Query = " UPDATE shifts SET "
                    + "shift_emp_name = ? ,"
                    + "shift_date = ? ,"
                    + "start_shift_hour = ? ,"
                    + "end_shift_hour = ? ,"
                    + "shift_inside_the_day = ? ,"
                    + "WHERE shift_emp_name = ? and shift_date = ?";
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            pr_stmt = con.prepareStatement(update_Query);
            
            pr_stmt.setString(1,Shifts_emp_name_txt.getText());
            pr_stmt.setString(2,ShiftsHoursList.getSelectedValue());
            pr_stmt.setString(3,start_txt.getText());
            pr_stmt.setString(4,end_txt.getText());
            pr_stmt.setObject(5,period_ComboBox.getSelectedItem());
            pr_stmt.setString(6,ShiftsList.getSelectedValue());
            pr_stmt.setString(7,ShiftsHoursList.getSelectedValue());
            
            pr_stmt.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"The shift updated correctly.");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_edit_ok_shift_ButtonActionPerformed

    private void Awards_moviesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Awards_moviesListValueChanged
        String url = "jdbc:mysql://localhost:3306/cinema";
        String username = "user";
        String password = "user";
            
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            Statement stmt = con.createStatement();            
            String Query = "SELECT * FROM award where name = '"+AwardsList.getSelectedValue()+"' and movie_title = '"+Awards_moviesList.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(Query);

             
            while(rs.next()){
                award_name_txt.setText(rs.getString(1));
                Award_year_ComboBox.setSelectedItem(rs.getString(2));
                description_txt.setText(rs.getString(3));
                Nomination_ComboBox.setSelectedItem(rs.getString(4));
                award_movie_title_txt.setText(rs.getString(5));
                award_contr_name_txt.setText(rs.getString(6));
            }        
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }
    }//GEN-LAST:event_Awards_moviesListValueChanged

    private void QueryE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryE_ButtonActionPerformed
        ProjectQueriesMenu menu1 = new ProjectQueriesMenu(null,true);
        menu1.setVisible(true);
    }//GEN-LAST:event_QueryE_ButtonActionPerformed

    private void QueryALabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueryALabelMouseEntered
        JOptionPane.showMessageDialog(null,"Poies tainies parakolouthisan oi adres pelates mesa se enan "
                + "sygekrimeno xroniko diastima kai tis vathmologisan me 4 i 5 kai poio itan to eidos twn "
                + "tainiwn aytwn?","Query A",1);
    }//GEN-LAST:event_QueryALabelMouseEntered

    private void QueryBLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueryBLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Poia einai i poies einai oi tainies me ta perissotera eisitiria "
                + "se ena sugekrimeno xroniko diastima?","Query B",1);
    }//GEN-LAST:event_QueryBLabelMouseEntered

    private void QueryCLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueryCLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Poios pelatis parakolouthise tis perissoteres tainies tupoy 3D mesa se "
                + "ena sugekrimeno xroniko diastima?","Query C",1);
    }//GEN-LAST:event_QueryCLabelMouseEntered

    private void QueryDLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueryDLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Ti eidous tainies epilegoun na doun oi gynaikes pelates me ilikia 20-30 etwn (DESC) ?","Query D",1);
    }//GEN-LAST:event_QueryDLabelMouseEntered

    private void QueryELabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueryELabelMouseEntered
        JOptionPane.showMessageDialog(null,"Poies kartes pelati(kai poses fores) kerdisan ta dwrean eisitiria, mesa se ena "
                + "sugekrimeno xroniko diastima kai an ta exoyn eksargyrwsei?","Query E",1);
    }//GEN-LAST:event_QueryELabelMouseEntered

    private void QueryFLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueryFLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Poses wres ergastike kathe ergazomenos se ena sugekrimeno xroniko diastima kai poso"
                + " kostise stin epixeirisi?","Query F",1);
    }//GEN-LAST:event_QueryFLabelMouseEntered

    private void extraQueryALabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraQueryALabelMouseEntered
        JOptionPane.showMessageDialog(null,"Emfanise to titlo tis tainias kai to onoma toy vraveioy gia tis tainies poy eite "
                + "exoyn kerdisei to vraveio eite itan apla upopsifies gia ayto.","Extra Query A",1);
    }//GEN-LAST:event_extraQueryALabelMouseEntered

    private void extraQueryBLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraQueryBLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Emfanise tous sudelestes, to eidos, ti perilipsi kathws kai to etos paragwgis mias tainias."
        ,"Extra Query B",1);
    }//GEN-LAST:event_extraQueryBLabelMouseEntered

    private void extraQueryCLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraQueryCLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Emfanise ta xaraktiristika mias thesis kathws kai ta xaraktiristika toy amfitheatroy"
                + " sto opoio vrisketai.","Extra Query C",1);
    }//GEN-LAST:event_extraQueryCLabelMouseEntered

    private void extraQueryDLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraQueryDLabelMouseEntered
        JOptionPane.showMessageDialog(null,"Emfanise ta stoixeia enos upallilou.","Extra Query D",1);
    }//GEN-LAST:event_extraQueryDLabelMouseEntered

    private void QueryA_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryA_ButtonActionPerformed
        ProjectQueriesMenu menu1 = new ProjectQueriesMenu(null,true);
        menu1.setVisible(true);
    }//GEN-LAST:event_QueryA_ButtonActionPerformed

    private void QueryB_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryB_ButtonActionPerformed
        ProjectQueriesMenu menu1 = new ProjectQueriesMenu(null,true);
        menu1.setVisible(true);
    }//GEN-LAST:event_QueryB_ButtonActionPerformed

    private void QueryC_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryC_ButtonActionPerformed
        ProjectQueriesMenu menu1 = new ProjectQueriesMenu(null,true);
        menu1.setVisible(true);
    }//GEN-LAST:event_QueryC_ButtonActionPerformed

    private void QueryD_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryD_ButtonActionPerformed
        ProjectQueriesMenu menu1 = new ProjectQueriesMenu(null,true);
        menu1.setVisible(true);
    }//GEN-LAST:event_QueryD_ButtonActionPerformed

    private void QueryF_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryF_ButtonActionPerformed
        ProjectQueriesMenu menu1 = new ProjectQueriesMenu(null,true);
        menu1.setVisible(true);
    }//GEN-LAST:event_QueryF_ButtonActionPerformed

    private void extra_QueryA_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extra_QueryA_ButtonActionPerformed
        ExtraQueriesMenu menu = new ExtraQueriesMenu(null,true);
        menu.setVisible(true);
    }//GEN-LAST:event_extra_QueryA_ButtonActionPerformed

    private void extra_QueryB_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extra_QueryB_ButtonActionPerformed
        ExtraQueriesMenu menu = new ExtraQueriesMenu(null,true);
        menu.setVisible(true);
    }//GEN-LAST:event_extra_QueryB_ButtonActionPerformed

    private void extra_QueryC_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extra_QueryC_ButtonActionPerformed
        ExtraQueriesMenu menu = new ExtraQueriesMenu(null,true);
        menu.setVisible(true);
    }//GEN-LAST:event_extra_QueryC_ButtonActionPerformed

    private void extra_QueryD_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extra_QueryD_ButtonActionPerformed
        ExtraQueriesMenu menu = new ExtraQueriesMenu(null,true);
        menu.setVisible(true);
    }//GEN-LAST:event_extra_QueryD_ButtonActionPerformed

    private void Ok_count_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_count_ButtonActionPerformed
       String url = "jdbc:mysql://localhost:3306/cinema";
       String username = "user";
       String password = "user";
            
       System.out.println("Connecting database...");
            
        try(Connection con = DriverManager.getConnection(url,username,password)){   
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
                        
                        
            String Query12 = "select count(*) from supervisor,shifts "
                    + "where supervisor.supervisor_name = shifts.shift_emp_name "
                    + "and shifts.shift_date = '"+posts_shift_date_ComboBox.getSelectedItem()+"' "
                    + "and shifts.shift_inside_the_day = '"+posts_shift_period_ComboBox.getSelectedItem()+"';"; // count(supervisors)
            
            String Query13 = "select count(*) from usher,shifts "
                    + "where usher.usher_name = shifts.shift_emp_name "
                    + "and shifts.shift_date = '"+posts_shift_date_ComboBox.getSelectedItem()+"' "
                    + "and shifts.shift_inside_the_day = '"+posts_shift_period_ComboBox.getSelectedItem()+"';"; // count(ushers)
            
            String Query14 = "select count(*) from cashier,shifts "
                    + "where cashier.cashier_name = shifts.shift_emp_name "
                    + "and shifts.shift_date = '"+posts_shift_date_ComboBox.getSelectedItem()+"' "
                    + "and shifts.shift_inside_the_day = '"+posts_shift_period_ComboBox.getSelectedItem()+"';"; // count(cashiers)
            
            String Query15 = "select count(*) from cleaner,shifts "
                    + "where cleaner.cleaner_name = shifts.shift_emp_name "
                    + "and shifts.shift_date = '"+posts_shift_date_ComboBox.getSelectedItem()+"' "
                    + "and shifts.shift_inside_the_day = '"+posts_shift_period_ComboBox.getSelectedItem()+"';"; // count(cleaners)


            
            //supervisors count
            ResultSet rs1 = stmt.executeQuery(Query12);            
            while(rs1.next()){
                posts_supervisors_txt.setText(rs1.getString(1));
            }
            rs1.close();
            
            //ushers count
            rs1 = stmt.executeQuery(Query13);            
            while(rs1.next()){
                posts_ushers_txt.setText(rs1.getString(1));
            }
            rs1.close();            
            
            //cashiers count
            rs1 = stmt.executeQuery(Query14);            
            while(rs1.next()){
                posts_cashiers_txt.setText(rs1.getString(1));
            }
            rs1.close();
            
            //cleaners count
            rs1 = stmt.executeQuery(Query15);            
            while(rs1.next()){
                posts_cleaners_txt.setText(rs1.getString(1));
            }
            rs1.close();
        }
        catch (SQLException ex) {
            throw new IllegalStateException("Cannot connect the database!", ex);
        }

        System.out.println("Loading driver...");
    }//GEN-LAST:event_Ok_count_ButtonActionPerformed


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
            java.util.logging.Logger.getLogger(AdminShowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminShowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminShowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminShowMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminShowMenu dialog = new AdminShowMenu(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> Award_year_ComboBox;
    private javax.swing.JList<String> AwardsList;
    private javax.swing.JList<String> Awards_moviesList;
    private javax.swing.JTextField Cashier_Employee_Name_txt;
    private javax.swing.JTextField Cashier_degree_txt;
    private javax.swing.JTextField Cashier_exp_txt;
    private javax.swing.JTextField Cashier_hired_date_txt;
    private javax.swing.JTextField Cashier_resume_txt;
    private javax.swing.JList<String> CashiersList;
    private javax.swing.JTextField Cleaner_degree_txt;
    private javax.swing.JTextField Cleaner_emp_name_txt;
    private javax.swing.JTextField Cleaner_exp_txt;
    private javax.swing.JTextField Cleaner_hired_date_txt;
    private javax.swing.JTextField Cleaner_resume_txt;
    private javax.swing.JList<String> CleanersList;
    private javax.swing.JTextField Contr_name_txt;
    private javax.swing.JList<String> ContributorsList;
    private javax.swing.JList<String> CustomersList;
    private javax.swing.JTextField Degreetxt;
    private javax.swing.JTextField Directorstxt;
    private javax.swing.JTextField EmpNametxt;
    private javax.swing.JList<String> EmployeeList;
    private javax.swing.JTextField Experiencetxt;
    private javax.swing.JLabel FaceIcon;
    private javax.swing.JLabel FaceIcon_Cashier;
    private javax.swing.JLabel FaceIcon_Cleaner;
    private javax.swing.JLabel FaceIcon_Supervisors;
    private javax.swing.JLabel FaceIcon_Ushers;
    private javax.swing.JComboBox<String> Gender_ComboBox;
    private javax.swing.JComboBox<String> Genre_ComboBox;
    private javax.swing.JTextField Hiredtxt;
    private javax.swing.JList<String> MovieList;
    private javax.swing.JTextField MovieTitletxt;
    private javax.swing.JComboBox<String> Nomination_ComboBox;
    private javax.swing.JButton Ok_count_Button;
    private javax.swing.JComboBox<String> Production_Date_ComboBox;
    private javax.swing.JLabel QueryALabel;
    private javax.swing.JButton QueryA_Button;
    private javax.swing.JLabel QueryBLabel;
    private javax.swing.JButton QueryB_Button;
    private javax.swing.JLabel QueryCLabel;
    private javax.swing.JButton QueryC_Button;
    private javax.swing.JLabel QueryDLabel;
    private javax.swing.JButton QueryD_Button;
    private javax.swing.JLabel QueryELabel;
    private javax.swing.JButton QueryE_Button;
    private javax.swing.JLabel QueryFLabel;
    private javax.swing.JButton QueryF_Button;
    private javax.swing.JTextField Resumetxt;
    private javax.swing.JTextArea Reviewtxt;
    private javax.swing.JList<String> ShiftsHoursList;
    private javax.swing.JList<String> ShiftsList;
    private javax.swing.JTextField Shifts_emp_name_txt;
    private javax.swing.JTabbedPane Shows_Tabbed_Panel;
    private javax.swing.JTextField Starringtxt;
    private javax.swing.JTextField Supervisor_degree_txt;
    private javax.swing.JTextField Supervisor_emp_name_txt;
    private javax.swing.JTextField Supervisor_exp_txt;
    private javax.swing.JTextField Supervisor_hired_date_txt;
    private javax.swing.JTextField Supervisor_resume_txt;
    private javax.swing.JList<String> SupervisorsList;
    private javax.swing.JTextField Urltxt;
    private javax.swing.JTextField Usher_degree_txt;
    private javax.swing.JTextField Usher_emp_name_txt;
    private javax.swing.JTextField Usher_exp_txt;
    private javax.swing.JTextField Usher_hired_date_txt;
    private javax.swing.JTextField Usher_resume_txt;
    private javax.swing.JList<String> UshersList;
    private javax.swing.JTextField age_txt;
    private javax.swing.JTextField award_contr_name_txt;
    private javax.swing.JTextField award_movie_title_txt;
    private javax.swing.JTextField award_name_txt;
    private javax.swing.JTextField biography_txt;
    private javax.swing.JTextField cardID_txt;
    private javax.swing.JTextField code_txt;
    private javax.swing.JTextField customer_name_txt;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField description_txt;
    private javax.swing.JButton edit_ok__employee_Button;
    private javax.swing.JButton edit_ok__movie_Button;
    private javax.swing.JButton edit_ok_award_Button;
    private javax.swing.JButton edit_ok_contributor_Button;
    private javax.swing.JButton edit_ok_customer_Button;
    private javax.swing.JButton edit_ok_shift_Button;
    private javax.swing.JTextField end_txt;
    private javax.swing.JLabel extraQueryALabel;
    private javax.swing.JLabel extraQueryBLabel;
    private javax.swing.JLabel extraQueryCLabel;
    private javax.swing.JLabel extraQueryDLabel;
    private javax.swing.JButton extra_QueryA_Button;
    private javax.swing.JButton extra_QueryB_Button;
    private javax.swing.JButton extra_QueryC_Button;
    private javax.swing.JButton extra_QueryD_Button;
    private javax.swing.JTextField face_url_txt;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JComboBox<String> marital_status_ComboBox;
    private javax.swing.JTextField movie_title_txt;
    private javax.swing.JComboBox<String> period_ComboBox;
    private javax.swing.JTextField posts_cashiers_txt;
    private javax.swing.JTextField posts_cleaners_txt;
    private javax.swing.JComboBox<String> posts_shift_date_ComboBox;
    private javax.swing.JComboBox<String> posts_shift_period_ComboBox;
    private javax.swing.JTextField posts_supervisors_txt;
    private javax.swing.JTextField posts_ushers_txt;
    private javax.swing.JTextField start_txt;
    // End of variables declaration//GEN-END:variables
}
