import java.io.IOException;

public class GUI_compiled extends javax.swing.JFrame {
    // Init variables
    private String filename;
	private String courseName;
	private String courseCode;
	private String termName;
    private StudentTable studentList;
    private AssignmentTable assignmentTableData;
    private AssignmentWeightTable AssignmentWeightTableData;
    private GradesTable gradedTableData;
    private Gradebook gradebook;
    private TermList termList;
    private ClassList classList;
    
    /**
     * Creates new form GUI_compiled
     */
    public GUI_compiled(String courseName, String courseCode, String termName, StudentTable studentList, AssignmentTable assignments, AssignmentWeightTable weights, GradesTable grades, Gradebook gradebook, TermList termList, ClassList classList) {
        this.filename = courseName + termName + ".json";
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.termName = termName;
    	this.studentList = studentList;
        this.assignmentTableData = assignments;
        this.AssignmentWeightTableData = weights;
        this.gradedTableData = grades;
        this.gradebook = gradebook;
        this.termList = termList;
        this.classList = classList;
        initComponents();
    }

    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        assignmentWeightScrollPane = new javax.swing.JScrollPane();
        assignmentWeightScrollPane2 = new javax.swing.JScrollPane();
        AssignmentScrollPane = new javax.swing.JScrollPane();
        gradesScrollPane = new javax.swing.JScrollPane();
        studentScrollPane = new javax.swing.JScrollPane();
        homePanel = new javax.swing.JPanel();
        assignmentsPanel = new javax.swing.JPanel();
        gradesPanel = new javax.swing.JPanel();
        peoplePanel = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        classNameLabel = new javax.swing.JLabel();
        classTermLabel = new javax.swing.JLabel();
        assignmentsPageLabel = new javax.swing.JLabel();
        gradesPageCourseCodeLabel = new javax.swing.JLabel();
        gradesPageTermLabel = new javax.swing.JLabel();
        studentsPageLabel = new javax.swing.JLabel();
        AssignmentWeightTable = new javax.swing.JTable(this.AssignmentWeightTableData);
        assignmentWeightTable2 = new javax.swing.JTable(this.AssignmentWeightTableData);
        AssignmentTable = new javax.swing.JTable(this.assignmentTableData);
        gradesTable = new javax.swing.JTable(this.gradedTableData);
        studentsTable = new javax.swing.JTable(this.studentList);
        importGradingScaleButton = new javax.swing.JButton();
        removeCategoryButton = new javax.swing.JButton();
        addCategoryButton = new javax.swing.JButton();
        generateGradesReportButton = new javax.swing.JButton();
        generateStudentReportButton = new javax.swing.JButton();
        removeStudentButton = new javax.swing.JButton();
        addStudentButton = new javax.swing.JButton();
        removeAssignmentButton = new javax.swing.JButton();
        addAssignmentButton = new javax.swing.JButton();
        editGradeButton = new javax.swing.JButton();


        // Window defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        // Tabbed setup
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14));

        // -----------------------------------------------------------------------------------
        // Home Panel Setup
        // -----------------------------------------------------------------------------------
        // Label setup
        classNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        String classString = String.format("Class: %s (%s)", courseName, courseCode);
        classNameLabel.setText(classString);

        classTermLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        String termString = String.format("Term: %s", termName);
        classTermLabel.setText(termString);

        // Button setup
        importGradingScaleButton.setText("Import Grading Scale");
        importGradingScaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        // Layout Setup
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(importGradingScaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(classTermLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(classNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classTermLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(importGradingScaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(1356, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", homePanel);
        
        // -----------------------------------------------------------------------------------
        // Assignments Panel Setup
        // -----------------------------------------------------------------------------------
        // Label Setup
        assignmentsPageLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        assignmentsPageLabel.setText("Assignments");

        // Table Setup
        AssignmentWeightTable.setAutoCreateColumnsFromModel(true);
        assignmentWeightScrollPane.setViewportView(AssignmentWeightTable);

        AssignmentTable.setAutoCreateColumnsFromModel(true);
        AssignmentScrollPane.setViewportView(AssignmentTable);

        // Button Setup
        removeCategoryButton.setText("Remove Category");
        removeCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        addCategoryButton.setText("Add Category");
        addCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        removeAssignmentButton.setText("Remove Assignment");
        removeAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        addAssignmentButton.setText("Add Assignment");
        addAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        // Layout Setup
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(assignmentsPanel);
        assignmentsPanel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(assignmentsPageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AssignmentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignmentWeightScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignmentWeightScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(assignmentsPageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeAssignmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAssignmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AssignmentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(444, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Assignments", assignmentsPanel);

        // -----------------------------------------------------------------------------------
        // Grades Panel Setup
        // -----------------------------------------------------------------------------------
        // Label Setup
        gradesPageCourseCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        classString = String.format("Class: %s", courseCode);
        gradesPageCourseCodeLabel.setText(classString);

        gradesPageTermLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        gradesPageTermLabel.setText(termString);

        // Table Setup
        assignmentWeightTable2.setAutoCreateColumnsFromModel(true);
        assignmentWeightScrollPane2.setViewportView(assignmentWeightTable2);

        gradesTable.setAutoCreateColumnsFromModel(true);
        gradesScrollPane.setViewportView(gradesTable);

        // Button Setup
        generateGradesReportButton.setText("Report");
        generateGradesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        editGradeButton.setText("Edit Grade");
        editGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        // Layout Setup
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(gradesPanel);
        gradesPanel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gradesPageCourseCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gradesPageTermLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(editGradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generateGradesReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gradesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignmentWeightScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignmentWeightScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editGradeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generateGradesReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gradesPageCourseCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(gradesPageTermLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(398, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grades", gradesPanel);


        // -----------------------------------------------------------------------------------
        // People Panel Setup
        // -----------------------------------------------------------------------------------
        // Label Setup
        studentsPageLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        studentsPageLabel.setText("Students");

        // Table Setup
        studentsTable.setAutoCreateColumnsFromModel(true);
        studentScrollPane.setViewportView(studentsTable);

        // Button Setup
        generateStudentReportButton.setText("Report");
        generateStudentReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton8ActionPerformed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        removeStudentButton.setText("Remove Student");
        removeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        // Layout Setup
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(peoplePanel);
        peoplePanel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(studentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(studentsPageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generateStudentReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(studentsPageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(generateStudentReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(964, 964, 964))
        );

        jTabbedPane1.addTab("People", peoplePanel);

        // Main Layout Setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	GUI_ImportGradingScale importscale = new GUI_ImportGradingScale(termList, classList);
    }                                                                            

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_RemoveCategory removeCategory = new GUI_RemoveCategory(AssignmentWeightTableData, filename);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_AddNewCategory addcategory = new GUI_AddNewCategory(AssignmentWeightTableData, filename);
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_GenerateReport generatereport = new GUI_GenerateReport(gradebook, gradedTableData, assignmentTableData, studentList);
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        ReportGenerator reportgenerator = new ReportGenerator(gradebook, gradedTableData, assignmentTableData, studentList, false, false, false, false, false, false, false, false, true);
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        GUI_RemoveStudent removeStudent = new GUI_RemoveStudent(gradedTableData, gradebook, assignmentTableData, studentList, filename);
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        GUI_AddNewStudent addStudent = new GUI_AddNewStudent(gradebook, assignmentTableData, studentList, filename);
    }                                           
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        GUI_RemoveAssignment removeassignment = new GUI_RemoveAssignment(gradedTableData, assignmentTableData, gradebook, studentList, filename);
    }  

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        GUI_AddNewAssignment addassignment = new GUI_AddNewAssignment(assignmentTableData, AssignmentWeightTableData, gradebook, studentList, filename);
    }     

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        GUI_EditGrade editgrade = new GUI_EditGrade(studentList, assignmentTableData, gradedTableData, gradebook, filename);
    }   

    // Variables declaration - do not modify                     
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane assignmentWeightScrollPane;
    private javax.swing.JScrollPane assignmentWeightScrollPane2;
    private javax.swing.JScrollPane AssignmentScrollPane;
    private javax.swing.JScrollPane gradesScrollPane;
    private javax.swing.JScrollPane studentScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JLabel classTermLabel;
    private javax.swing.JLabel assignmentsPageLabel;
    private javax.swing.JLabel gradesPageCourseCodeLabel;
    private javax.swing.JLabel gradesPageTermLabel;
    private javax.swing.JLabel studentsPageLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel assignmentsPanel;
    private javax.swing.JPanel gradesPanel;
    private javax.swing.JPanel peoplePanel;
    private javax.swing.JTable AssignmentTable;
    private javax.swing.JTable AssignmentWeightTable;
    private javax.swing.JTable assignmentWeightTable2;
    private javax.swing.JTable gradesTable;
    private javax.swing.JTable studentsTable;
    private javax.swing.JButton importGradingScaleButton;
    private javax.swing.JButton removeCategoryButton;
    private javax.swing.JButton addCategoryButton;
    private javax.swing.JButton generateGradesReportButton;
    private javax.swing.JButton generateStudentReportButton;
    private javax.swing.JButton removeStudentButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton removeAssignmentButton;
    private javax.swing.JButton addAssignmentButton;
    private javax.swing.JButton editGradeButton;
    // End of variables declaration                   
}