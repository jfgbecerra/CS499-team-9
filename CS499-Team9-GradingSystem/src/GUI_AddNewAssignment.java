import java.util.LinkedList;

public class GUI_AddNewAssignment extends javax.swing.JFrame {
    private String filename;
	AssignmentTable assignmentList;
	AssignmentWeightTable categoryList;
	Gradebook gradebook;
	StudentTable studentTable;

    public GUI_AddNewAssignment(AssignmentTable assignmentList, AssignmentWeightTable categoryList, Gradebook gradebook, StudentTable studentTable, String file) {
        this.filename = file;
        this.assignmentList = assignmentList;
        this.categoryList = categoryList;
        this.gradebook = gradebook;
        this.studentTable = studentTable;
    	initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        
        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        // Label Setup
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Add New Assignment");
        
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Assignment Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Category:");

        // Combo Box setup
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>());
        for(int i = 0; i < categoryList.getSize(); i++)
        {
        	jComboBox1.addItem(categoryList.getCategory(i).getName());
        }

        // Button Setup
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Listener Setup
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String category = (String) jComboBox1.getSelectedItem();
    	String name = jTextField1.getText();
        
        AssignmentCategory cat = categoryList.getCategory(category);
        
        Assignment assignment = new Assignment(name, cat);
               
        assignmentList.addAssignment(assignment);
        
        LinkedList<Student> studentList = studentTable.getList();
        
        for(int i = 0; i < studentList.size(); i++)
        {
        	Student student = studentList.get(i);
        	gradebook.addEntry(student, assignment, 0.0);
        }
        
        Database.addAssignment(filename, name, category);
        assignmentList.fireTableDataChanged();
        
        dispose();
    }    

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
}