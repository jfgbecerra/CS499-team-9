/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra
 */
public class GUI_User_Settings extends javax.swing.JFrame{
    // Initialize variables
	TermList termList;
	ClassList classList;

    /**
     * Class constructor
    */
    public GUI_User_Settings(TermList termList, ClassList classList) {
        this.termList = termList;
        this.classList = classList;
    	initComponenets();
    }

    /**
     * Create the componenets for the ui
    */
    private void initComponenets() {
        userName = new javax.swing.JLabel();
        lougout = new javax.swing.JButton();
        seperator = new javax.swing.JSeparator();
        passwordReset = new javax.swing.JButton();
        addTerm = new javax.swing.JButton();
        removeTerm = new javax.swing.JButton();
        addCourse = new javax.swing.JButton();
        removeCourse = new javax.swing.JButton();


        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(340, 700));


        // Label setup
        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        userName.setText("{UserName}");
        userName.setPreferredSize(new java.awt.Dimension(80, 18));


        // Button Setup
        lougout.setText("Logout");
        lougout.setPreferredSize(new java.awt.Dimension(80, 18));
        lougout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        passwordReset.setText("Reset Pasword");
        passwordReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordResetActionPerformed(evt);
            }
        });

        addTerm.setText("Add Term");
        addTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTermActionPerformed(evt);
            }
        });

        removeTerm.setText("Remove Term");
        removeTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTermActionPerformed(evt);
            }
        });

        addCourse.setText("Add Course");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });

        removeCourse.setText("Remove Course");
        removeCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourseActionPerformed(evt);
            }
        });

        // Layout Setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lougout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seperator)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(removeTerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addTerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }


    // Listener Setup
    private void passwordResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void addTermActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_AddNewTerm addterm = new GUI_AddNewTerm(termList);
    }                                        

    private void removeTermActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_RemoveTerm removeterm = new GUI_RemoveTerm(termList);
    }                                        

    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_AddNewCourse addcourse = new GUI_AddNewCourse(termList, classList);
    }                                        

    private void removeCourseActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_RemoveCourse removecourse = new GUI_RemoveCourse(termList, classList);
    }  

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for handling a logout here
    } 

    // Initialize UI variables
    private javax.swing.JLabel userName;
    private javax.swing.JSeparator seperator;
    private javax.swing.JButton passwordReset;
    private javax.swing.JButton addTerm;
    private javax.swing.JButton removeTerm;
    private javax.swing.JButton addCourse;
    private javax.swing.JButton removeCourse;
    private javax.swing.JButton lougout;
}