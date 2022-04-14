public class Grade {
    private String name;
    private String assignment;
    private Double grade;

    public Grade(String n, String a, Double g) {
        this.name = n;
        this.assignment = a;
        this.grade = g;
    }

    public String getName() {
        return this.name;
    }
    public String getAssignmentName() {
        return this.assignment;
    }
    public Double getAssignmentGrade() {
        return this.grade;
    }
}
