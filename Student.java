
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double grade;
    private int id;
    public Student(String firstName, String lastName, double grade, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getGrade() {
        return grade;
    }
    public int getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade + ", id=" + id;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

   /* @Override
    public Student compareTo( Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            if( ((Student) o1).getGrade() < ((Student) o2).getGrade() ) {
                return (Student) o2;
            }

            else if( ((Student) o1).getGrade() > ((Student) o2).getGrade() ) {
                return (Student) o1;
            }
            else {
                return (Student) o1;
            }
        }
        return null;
    }

    */
}
