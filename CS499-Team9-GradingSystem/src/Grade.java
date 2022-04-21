public class Grade {
    private String name;
    private String assignment;
    private String category;
    private Double grade;

    public Grade(){}
    
    public Grade(String n, String a, String c, Double g) {
        this.name = n;
        this.assignment = a;
        this.category = c;
        this.grade = g;
    }

    public String getName() {
        return this.name;
    }
    public String getAssignmentName() {
        return this.assignment;
    }
    public String getCategory() {
        return this.category;
    }
    public Double getAssignmentGrade() {
        return this.grade;
    }
    public void setAssignmentGrade(double grade) {
    	this.grade = grade;
    }
}