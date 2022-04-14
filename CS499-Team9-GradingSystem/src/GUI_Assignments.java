/**
 * File: GUI_Assignments.java
 * Author(s): Jose Garcia Becerra
 */
public class GUI_Assignments extends javax.swing.JPanel {
    // Initialize variables

    /**
     * Class constructor
    */
    public GUI_Assignments() {
        initComponents();
    }

    // General class functions

    /**
     * Create the componenets for the ui
    */
    private void initComponents() {

        catagoriesPanel = new javax.swing.JPanel();
        catagoriesScrollPane = new javax.swing.JScrollPane();
        deleteAssignmentButton = new javax.swing.JButton();
        addAssignmentButton = new javax.swing.JButton();
        sampleLabel1 = new javax.swing.JLabel();
        sampleWeight1 = new javax.swing.JLabel();
        sampleLabel2 = new javax.swing.JLabel();
        sampleWeight2 = new javax.swing.JLabel();

        // Label Setup
        // TODO: This needs to be made dynamic somehow
        sampleLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleLabel1.setText("Tests:");

        sampleWeight1.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleWeight1.setText("40%");

        sampleLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleLabel2.setText("Homework:");

        sampleWeight2.setFont(new java.awt.Font("Tahoma", 0, 12));
        sampleWeight2.setText("40%");

        // Button setup
        deleteAssignmentButton.setText("Add");
        addAssignmentButton.setText("Delete");
        // Listener Setup
        deleteAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAssignmentButtonActionPerformed(evt);
            }
        });

        addAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAssignmentButtonActionPerformed(evt);
            }
        });



        // Arranging Layouts
        javax.swing.GroupLayout categoriesPanelLayout = new javax.swing.GroupLayout(catagoriesPanel);
        catagoriesPanel.setLayout(categoriesPanelLayout);
        categoriesPanelLayout.setHorizontalGroup(
            categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoriesPanelLayout.createSequentialGroup()
                        .addComponent(sampleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sampleWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(categoriesPanelLayout.createSequentialGroup()
                        .addComponent(sampleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sampleWeight2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        categoriesPanelLayout.setVerticalGroup(
            categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampleWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(categoriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sampleWeight2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );


        // Arranging main Frame layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(catagoriesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(catagoriesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAssignmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(catagoriesScrollPane)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(catagoriesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );
    }                    


    /**
     * Functions to update from event actions
    */
    private void deleteAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for deleting assignnment
    }                                        

    private void addAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO Add code for adding assignnment
    }                                        


    // Initialize UI variables               
    private javax.swing.JPanel catagoriesPanel;
    private javax.swing.JScrollPane catagoriesScrollPane;
    private javax.swing.JButton deleteAssignmentButton;
    private javax.swing.JButton addAssignmentButton;
    private javax.swing.JLabel sampleLabel1;
    private javax.swing.JLabel sampleWeight1;
    private javax.swing.JLabel sampleLabel2;
    private javax.swing.JLabel sampleWeight2;
}