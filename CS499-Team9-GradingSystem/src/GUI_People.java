/**
 * File: GUI_Login.java
 * Author(s): Jose Garcia Becerra
 */
public class GUI_People extends javax.swing.JFrame{
    // Initialize variables
    private StudentTable studentList;


     /**
      * Class constructor
      */
    public GUI_People(StudentTable studentList) {
        this.studentList = studentList;
        initComponenets();
    }


    // General class functions
     /** 
      * Create the componenets for the ui
      */
    private void initComponenets() {  
        tableScrollBox = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable(this.studentList);
        studentReportButton = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        removeStudent = new javax.swing.JButton();
        CheckBox1 = new javax.swing.JCheckBox();
        CheckBox2 = new javax.swing.JCheckBox();
        CheckBox3 = new javax.swing.JCheckBox();
        CheckBox4 = new javax.swing.JCheckBox();


        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 900));


        // Setting up the scroll box and table
        tableScrollBox.setPreferredSize(new java.awt.Dimension(1040, 800));
        tableList.setAutoCreateColumnsFromModel(true);
        tableScrollBox.setViewportView(tableList);


        // Button Setup
        studentReportButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        studentReportButton.setText("Print Student Report");
        studentReportButton.setPreferredSize(new java.awt.Dimension(135, 35));
        addStudent.setFont(new java.awt.Font("Tahoma", 0, 12));
        addStudent.setText("Add Student");
        addStudent.setPreferredSize(new java.awt.Dimension(120, 35));
        removeStudent.setFont(new java.awt.Font("Tahoma", 0, 12));
        removeStudent.setText("Remove Student");
        removeStudent.setPreferredSize(new java.awt.Dimension(120, 35));
        // Button action listener setup
        studentReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentReportButtonActionPerformed(evt);
            }
        });
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        removeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentActionPerformed(evt);
            }
        });


        // Checkbox Setup
        CheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12));
        CheckBox1.setText("Grade");
        CheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12));
        CheckBox2.setText("Option2");
        CheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12));
        CheckBox3.setText("Option3");
        CheckBox4.setFont(new java.awt.Font("Tahoma", 0, 12));
        CheckBox4.setText("Option4");
        // Check box action listener setup
        CheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox1StateChanged(evt);
            }
        });
        CheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox2StateChanged(evt);
            }
        });
        CheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox3StateChanged(evt);
            }
        });
        CheckBox4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox4StateChanged(evt);
            }
        });


        // Arranging Layouts
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableScrollBox, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBox1)
                    .addComponent(CheckBox2)
                    .addComponent(CheckBox3)
                    .addComponent(CheckBox4))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBox4))
                    .addComponent(tableScrollBox, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
        setVisible(true);
    }


    /**
     * Functions to update from event actions
     */
    private void studentReportButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for handling creating a report here
    }                                        

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for handling adding a student here
    }                                        

    private void removeStudentActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for handling removing a student here
    }                                        

    private void CheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {                                        
        // TODO Add code for handling this checkbox field to be added to table
    }                                       

    private void CheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {                                        
        // TODO Add code for handling this checkbox field to be added to table
    }                                       

    private void CheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {                                        
        // TODO Add code for handling this checkbox field to be added to table
    }                                       

    private void CheckBox4StateChanged(javax.swing.event.ChangeEvent evt) {                                        
        // TODO Add code for handling this checkbox field to be added to table
    }  


    // Initialize UI variables
    private javax.swing.JButton studentReportButton;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton removeStudent;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBox4;
    private javax.swing.JScrollPane tableScrollBox;
    private javax.swing.JTable tableList;

}