/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra
 */
public class GUI_User_Settings extends javax.swing.JFrame{
    // Initialize variables


    /**
     * Class constructor
    */
    public GUI_User_Settings() {
        initComponenets();
    }


    // General class functions


    /**
     * Create the componenets for the ui
    */
    private void initComponenets() {
        userName = new javax.swing.JLabel();
        lougout = new javax.swing.JButton();
        seperator = new javax.swing.JSeparator();
        passwordReset = new javax.swing.JLabel();


        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(340, 700));


        // Label setup
        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        userName.setText("{UserName}");
        userName.setPreferredSize(new java.awt.Dimension(80, 18));
        passwordReset.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        passwordReset.setText("Password Reset");
        passwordReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordResetMouseExited(evt);
            }
        });


        // Button Setup
        lougout.setText("Logout");
        lougout.setPreferredSize(new java.awt.Dimension(80, 18));
        lougout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lougout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(passwordReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seperator)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lougout, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passwordReset)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }


    /**
     * Functions to update from event actions
     */
    private void passwordResetMouseEntered(java.awt.event.MouseEvent evt) {                                     
        passwordReset.setFont(new java.awt.Font("Tahoma", 2, 14));                              
        passwordReset.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void passwordResetMouseExited(java.awt.event.MouseEvent evt) {                                    
        passwordReset.setFont(new java.awt.Font("Tahoma", 1, 14));                              
        passwordReset.setForeground(new java.awt.Color(51, 102, 255));
    }   

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for handling a logout here
    } 

    // Initialize UI variables
    private javax.swing.JLabel userName;
    private javax.swing.JLabel passwordReset;
    private javax.swing.JButton lougout;
    private javax.swing.JSeparator seperator;
}