/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra, Paul Zorovich
 */
public class GUI_Login extends javax.swing.JFrame{
    // Initialize variables


     /**
      * Class constructor
      */
    public GUI_Login() {
        initComponenets();
    }


    // General class functions


    /**
     * Create Components for UI
     */
    private void initComponenets() {
        // Componenet init
        loginTitle = new javax.swing.JLabel();
        loginSubtitle = new javax.swing.JLabel();
        uSubtitle = new javax.swing.JLabel();
        pSubtitle = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        documentationLink = new javax.swing.JLabel();
        accountLink = new javax.swing.JLabel();
        spacer = new javax.swing.JLabel();


        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        


        // Label setup
        loginTitle.setFont(new java.awt.Font("Tahoma", 0, 24));
        loginTitle.setText("Login");
        loginSubtitle.setText("Enter Username and Password");
        uSubtitle.setText("Username:");
        pSubtitle.setText("Password:");


        // Text field Action Listeners
        // TODO: might need to be removed??
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });


        // Button Setup
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 12));
        loginButton.setText("Login");
        loginButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });



        // Link setup
        documentationLink.setForeground(new java.awt.Color(51, 102, 255));
        documentationLink.setText("Documentation");
        accountLink.setForeground(new java.awt.Color(51, 102, 255));
        accountLink.setText("No Account?");
        spacer.setForeground(new java.awt.Color(51, 102, 255));
        spacer.setText("/");
        // Link Action Listeners
        documentationLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                documentationLinkMouseCLicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                documentationLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                documentationLinkMouseExited(evt);
            }
        });
        accountLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountLinkMouseExited(evt);
            }
        });


        // Arranding layouts
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(documentationLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spacer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountLink))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pSubtitle)
                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addComponent(uSubtitle)
                        .addComponent(loginSubtitle)
                        .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameField)
                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginSubtitle)
                .addGap(18, 18, 18)
                .addComponent(uSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentationLink)
                    .addComponent(accountLink)
                    .addComponent(spacer))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setTitle("Login");
        setLocationRelativeTo(null);
        setVisible(true);
    }


    /**
    * Functions to update from event actions
    */
    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO Not sure we need these might need to handle like a form here and just submit both on login button
    }                                           

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO Not sure we need these might need to handle like a form here and just submit both on login button
    }                                           

    private void documentationLinkMouseCLicked(java.awt.event.MouseEvent evt) {                                     
        // TODO Add code for loading help page when this is clicked
    }                                    

    private void accountLinkMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO Add code for account creation here when needed?
    }                                    

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO This will handle logging in to the application
    }

    private void documentationLinkMouseEntered(java.awt.event.MouseEvent evt) {
        documentationLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        documentationLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void documentationLinkMouseExited(java.awt.event.MouseEvent evt) {
        documentationLink.setFont(new java.awt.Font("Tahoma", 1, 12));                              
        documentationLink.setForeground(new java.awt.Color(51, 102, 255));
    }      

    private void accountLinkMouseEntered(java.awt.event.MouseEvent evt) {
        accountLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        accountLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void accountLinkMouseExited(java.awt.event.MouseEvent evt) {
        accountLink.setFont(new java.awt.Font("Tahoma", 1, 12));
        accountLink.setForeground(new java.awt.Color(51, 102, 255));
    }      


    // Initialize UI variables
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel loginSubtitle;
    private javax.swing.JLabel uSubtitle;
    private javax.swing.JLabel pSubtitle;
    private javax.swing.JLabel documentationLink;
    private javax.swing.JLabel accountLink;
    private javax.swing.JLabel spacer;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField passwordField;
}