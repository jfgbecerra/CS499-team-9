/**
 * File: Assignments_Table.java
 * Author(s): Jose Garcia Becerra
 */
public class Assignments_Table extends javax.swing.JPanel {
    // Initialize variables

    /**
     * Class constructor
    */
    public Assignments_Table() {
        initComponents();
    }

    // General class functions


     /**
      * Create the componenets for the ui
      */
    private void initComponents() {
        // Componenet init
        assignmentsScrollPane = new javax.swing.JScrollPane();
        assignmentList = new javax.swing.JList<>();
        listLabel = new javax.swing.JLabel();

        // Window Defaults
        // setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // List Setup
        assignmentList.setFont(new java.awt.Font("Tahoma", 0, 12));
        assignmentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        assignmentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        assignmentsScrollPane.setViewportView(assignmentList);

        // Label Setup
        listLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        listLabel.setText("Category");


        // Arranging main Frame layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignmentsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignmentsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }                  

    /**
     * Functions to update from event actions
     */

    // Initialize UI variables              
    private javax.swing.JScrollPane assignmentsScrollPane;               
    private javax.swing.JList<String> assignmentList;
    private javax.swing.JLabel listLabel;
}
