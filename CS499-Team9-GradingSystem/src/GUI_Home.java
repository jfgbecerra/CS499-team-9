/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra
 */
public class GUI_Home extends javax.swing.JFrame{
    // Initialize variables


     /**
      * Class constructor
      */
    public GUI_Home() {
        initComponenets();
    }


    // General class functions


     /**
      * Create the componenets for the ui
      */
    private void initComponenets() {
        linkPanel = new javax.swing.JPanel();
        courseSelector = new javax.swing.JComboBox<>();
        termLabel = new javax.swing.JLabel();
        homeLink = new javax.swing.JLabel();
        assignmentsLink = new javax.swing.JLabel();
        gradesLink = new javax.swing.JLabel();
        peopleLink = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        seperator = new javax.swing.JSeparator();
        classTextScrollPane = new javax.swing.JScrollPane();
        classInfoEditor = new javax.swing.JEditorPane();
        
        
        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        // Selecter setup
        courseSelector.setFont(new java.awt.Font("Tahoma", 0, 14));
        courseSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        
        
        // Label Setup
        termLabel.setText("Term");
        classLabel.setFont(new java.awt.Font("Tahoma", 0, 20));
        classLabel.setText("Class Name");


        // Link Setup
        homeLink.setFont(new java.awt.Font("Tahoma", 0, 13));
        homeLink.setText("Home");
        assignmentsLink.setFont(new java.awt.Font("Tahoma", 0, 13));
        assignmentsLink.setText("Assignments");
        gradesLink.setFont(new java.awt.Font("Tahoma", 0, 13));
        gradesLink.setText("Grades");
        peopleLink.setFont(new java.awt.Font("Tahoma", 0, 13));
        peopleLink.setText("People");
        // Link action listener setup
        homeLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLinkMouseExited(evt);
            }
        });
        assignmentsLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignmentsLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assignmentsLinkMouseExited(evt);
            }
        });
        gradesLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradesLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gradesLinkMouseExited(evt);
            }
        });
        peopleLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                peopleLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                peopleLinkMouseExited(evt);
            }
        });


        // Button Setup
        Button1.setText("jButton1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("jButton2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setText("jButton3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setText("jButton4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        
        
        // Scrollpane setup
        classTextScrollPane.setViewportView(classInfoEditor);
        
        
        // Arranging Layouts
        javax.swing.GroupLayout linkPanelLayout = new javax.swing.GroupLayout(linkPanel);
        linkPanel.setLayout(linkPanelLayout);
        linkPanelLayout.setHorizontalGroup(
            linkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linkPanelLayout.createSequentialGroup()
                .addComponent(courseSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(linkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(peopleLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradesLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignmentsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(linkPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(termLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homeLink, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        linkPanelLayout.setVerticalGroup(
            linkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linkPanelLayout.createSequentialGroup()
                .addComponent(courseSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(termLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignmentsLink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradesLink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peopleLink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 375, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(linkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(seperator, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classTextScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addComponent(classLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 480, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classTextScrollPane)
                .addContainerGap())
        );

        pack();
        setVisible(true);
    }


    /**
     * Functions to update from event actions
     */
    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for the whatever button action we choose
    }                                        

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for the whatever button action we choose
    }                                        

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for the whatever button action we choose
    }                                        

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for the whatever button action we choose
    }                                        

    private void homeLinkMouseEntered(java.awt.event.MouseEvent evt) {                                     
        homeLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        homeLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void homeLinkMouseExited(java.awt.event.MouseEvent evt) {                                    
        homeLink.setFont(new java.awt.Font("Tahoma", 1, 12));
        homeLink.setForeground(new java.awt.Color(51, 102, 255));
    }                                   

    private void assignmentsLinkMouseEntered(java.awt.event.MouseEvent evt) {                                     
        assignmentsLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        assignmentsLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void assignmentsLinkMouseExited(java.awt.event.MouseEvent evt) {                                    
        assignmentsLink.setFont(new java.awt.Font("Tahoma", 1, 12));
        assignmentsLink.setForeground(new java.awt.Color(51, 102, 255));
    }                                   

    private void gradesLinkMouseEntered(java.awt.event.MouseEvent evt) {                                     
        gradesLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        gradesLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void gradesLinkMouseExited(java.awt.event.MouseEvent evt) {                                    
        gradesLink.setFont(new java.awt.Font("Tahoma", 1, 12));
        gradesLink.setForeground(new java.awt.Color(51, 102, 255));
    }                                   

    private void peopleLinkMouseEntered(java.awt.event.MouseEvent evt) {                                     
        peopleLink.setFont(new java.awt.Font("Tahoma", 2, 12));                              
        peopleLink.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void peopleLinkMouseExited(java.awt.event.MouseEvent evt) {                                    
        peopleLink.setFont(new java.awt.Font("Tahoma", 1, 12));
        peopleLink.setForeground(new java.awt.Color(51, 102, 255));
    }  
    // Initialize UI variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JComboBox<String> courseSelector;
    private javax.swing.JEditorPane classInfoEditor;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel termLabel;
    private javax.swing.JLabel homeLink;
    private javax.swing.JLabel assignmentsLink;
    private javax.swing.JLabel gradesLink;
    private javax.swing.JLabel peopleLink;
    private javax.swing.JPanel linkPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane classTextScrollPane;
    private javax.swing.JSeparator seperator;
}