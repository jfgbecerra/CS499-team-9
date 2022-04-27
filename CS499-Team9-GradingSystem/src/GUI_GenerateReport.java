import java.io.IOException;

public class GUI_GenerateReport extends javax.swing.JFrame {
	
	private Gradebook gradebook;
	private GradesTable gradesTable;
	private AssignmentTable assignmentTable;
	private StudentTable studentTable;
	
    public GUI_GenerateReport(Gradebook gradebook, GradesTable gradesTable, AssignmentTable assignmentTable, StudentTable studentTable) {
    	this.gradebook = gradebook;
    	this.gradesTable = gradesTable;
    	this.assignmentTable = assignmentTable;
    	this.studentTable = studentTable;
    	initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        // Window Defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        // Label Setup
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Generate Report");

        // Checkbox Setup
        jCheckBox1.setText("Assignment Averages");
        jCheckBox2.setText("Assignment Medians");
        jCheckBox3.setText("Assignment Modes");
        jCheckBox4.setText("Assignment Standard Deviation");
        jCheckBox5.setText("Final Average");
        jCheckBox6.setText("Final Median");
        jCheckBox7.setText("Final Mode");
        jCheckBox8.setText("Final Standard Deviation");

        // Button Setup
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        // Layout Setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox8))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Listener Setup
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        boolean aa = jCheckBox1.isSelected();
        boolean ame = jCheckBox2.isSelected();
        boolean amo = jCheckBox3.isSelected();
        boolean asd = jCheckBox4.isSelected();
        boolean fa = jCheckBox5.isSelected();
        boolean fme = jCheckBox6.isSelected();
        boolean fmo = jCheckBox7.isSelected();
        boolean fsd = jCheckBox8.isSelected();
        
        ReportGenerator reportgenerator = new ReportGenerator(gradebook, gradesTable, assignmentTable, studentTable, aa, ame, amo, asd, fa, fme, fmo, fsd, false);
    
        dispose();
    }  

    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JButton jButton1;
}