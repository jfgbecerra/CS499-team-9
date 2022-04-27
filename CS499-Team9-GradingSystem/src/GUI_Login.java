import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.xml.crypto.Data;
/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra, Paul Zorovich
 */
public class GUI_Login extends javax.swing.JFrame{
     /**
      * Class constructor
      */
    public GUI_Login() {
        initComponenets();
    }

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
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        accountLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
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

    // Listener Setup
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        String currentPath = System.getProperty("user.dir");
        java.io.File htmlFile = new java.io.File(currentPath + "\\src\\index-3.html");
        try {
            java.awt.Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }                                    

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO Add code for account creation here when needed?
    }                                    

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {   
        String user = usernameField.getText();
        String pass = passwordField.getText();

        boolean loginCheck;
        try {
            loginCheck = Database.login(user, pass);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
            loginCheck = false;
        }

        if (loginCheck) {
            org.json.JSONArray coursesInfo = Database.getAllCoursesInfo();
            GUI_Dashboard mainDashboard = new GUI_Dashboard(coursesInfo);
            dispose();
        }
        else {
            GUI_Login loginRetry = new GUI_Login();
            dispose();
        }
    }

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {
        documentationLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        documentationLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {
        documentationLink.setFont(new java.awt.Font("Tahoma", 1, 12));                              
        documentationLink.setForeground(new java.awt.Color(51, 102, 255));
    }      

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {
        accountLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        accountLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {
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