import java.util.ArrayList;
import java.util.List;

public class ClassOfStudent {
    String className;
    List<Student> students;
    int maxNumberOfStudents;

    public ClassOfStudent(String className, List<Student> students, int maxNumberOfStudents)
    {
        this.className = className;
        this.students = students;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    void addStudent(Student student)
    {
        if (maxNumberOfStudents > students.size())
        {
            boolean isExist = false;
            for (Student element : students)
            {
                if(element.firstName == student.firstName) isExist = true;
            }
            if (!isExist) {
                students.add(student);
                System.out.println("Dodano studenta do klasy\n");
            }
            else System.out.println("W tej klasie jest już student o tym imieniu\n");
        }
        else System.err.println("Przekroczono wielkość klasy\n");
    }
    void addPoints(Student student, double point)
    {
        student.numberOfPoint += point;
    }
}
