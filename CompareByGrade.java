import java.util.Comparator;

public class CompareByGrade implements Comparator<Student> {


    private  Student[] Students;
    public CompareByGrade(Student[] Students) {
        this.Students = Students;
        double current = 0;
        for (int i = 0; i< Students.length-1;i++) {
            current = compare(Students[i],Students[i+1]);
            Students[i].setGrade(Students[i].getGrade()+1);
        }
    }
    @Override
    public int compare(Student o1, Student o2) {

        if (o1 ==null ||  o2== null) {
            throw new NullPointerException("One of the arguments is null");
        }
        if (o1.getGrade() == o2.getGrade()) {
            return 0;
        }
        return 0;
    }
}
