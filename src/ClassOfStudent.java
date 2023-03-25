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

    String addStudent(Student student)
    {
        if (maxNumberOfStudents > students.size())
        {
            for (Student element : students)
            {
                if(element.firstName == student.firstName) return "W tej klasie jest już student o tym imieniu\n";
            }
            students.add(student);
            return "Dodano studenta do klasy";
        }
        else System.err.println("Przekroczono wielkość klasy");
        //maybe change return object
        return null;
    }
}
