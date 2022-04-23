/**
 * File: GUI_Course_Card.java
 * Author(s): Jose Garcia Becerra
 */
import javax.swing.JPanel;
public class GUI_Course_Card extends javax.swing.JPanel{
    // Initialize variables
    private StudentTable studentList;
        private AssignmentTable assignmentTableData;
        private AssignmentWeightTable AssignmentWeightTableData;
        private GradesTable gradedTableData;
        private Gradebook gradebook;
        private TermList termList;
        private ClassList classList;
        private JPanel coursesLayoutPanel;

     /**
      * Class constructor
      */
    public GUI_Course_Card(String courseName, String shortName, String term, String link, int [] rgbColor, StudentTable studentList, AssignmentTable assignments, AssignmentWeightTable weights, GradesTable grades, Gradebook gradebook, TermList termList, ClassList classList, JPanel coursePanel) {
        this.studentList = studentList;
        this.assignmentTableData = assignments;
        this.AssignmentWeightTableData = weights;
        this.gradedTableData = grades;
        this.gradebook = gradebook;
        this.termList = termList;
        this.classList = classList;
        this.coursesLayoutPanel = coursePanel;
        initComponenets(courseName, shortName, term, link, rgbColor);
    }


    // General class functions


     /**
      * Create the componenets for the ui
      */
    private void initComponenets(String courseName, String shortName, String term, String link, int [] rgbColor) {
        // Componenet init
        infoPanel = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        abbrevLabel = new javax.swing.JLabel();
        termLabel = new javax.swing.JLabel();


        // Window Defaults

        setMaximumSize(new java.awt.Dimension(225, 213));
        setMinimumSize(new java.awt.Dimension(225, 213));



        // Panel Setup
        colorPanel.setForeground(new java.awt.Color(rgbColor[0], rgbColor[1], rgbColor[2]));
        colorPanel.setBackground(new java.awt.Color(rgbColor[0], rgbColor[1], rgbColor[2]));


        // Label Setup
        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
        nameLabel.setText(courseName);

        abbrevLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        abbrevLabel.setForeground(new java.awt.Color(51, 102, 255));
        abbrevLabel.setText(shortName);

        termLabel.setText(term);
        // Label Event Listeneners
        abbrevLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abbrevLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abbrevLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abbevLabelMouseExited(evt);
            }
        });


        // Arranging Layouts
        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(abbrevLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(termLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abbrevLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(termLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        // Arranging main Frame layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );


        setVisible(true);
    }


    /**
     * Functions to update from event actions
     */
    private void abbrevLabelMouseClicked(java.awt.event.MouseEvent evt) {                                     
        GUI_compiled mainClass = new GUI_compiled(studentList, assignmentTableData, AssignmentWeightTableData, gradedTableData , gradebook, termList, classList, coursesLayoutPanel);
    }                                    

    private void abbrevLabelMouseEntered(java.awt.event.MouseEvent evt) {                                     
        abbrevLabel.setFont(new java.awt.Font("Tahoma", 2, 12));   
        abbrevLabel.setForeground(new java.awt.Color(187, 122, 42));
    }                                    

    private void abbevLabelMouseExited(java.awt.event.MouseEvent evt) {                                    
        abbrevLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        abbrevLabel.setForeground(new java.awt.Color(51, 102, 255));
    } 

    // Initialize UI variables
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel abbrevLabel;
    private javax.swing.JLabel termLabel;
}