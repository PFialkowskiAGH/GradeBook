import java.util.ArrayList;
import java.util.Collections;
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
                if(element.compare(student)) isExist = true;
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
        System.out.println(student);
        System.out.println("Uzyskał %.2f punktów\n".formatted(point));
    }
    void getStudent(Student student)
    {
        if (student.numberOfPoint > 1)
        {
            student.numberOfPoint -= 1;
            System.out.println(student);
            System.out.println("Stracił punkty\n");
        }
        else
        {
            System.out.println(student);
            System.out.println("Zostaje usunięty\n");
            this.students.remove(student);
        }
    }
    void changeCondition(Student student, StudentCondition studentCondition)
    {
        student.studentCondition = studentCondition;
        System.out.println(student);
        System.out.println("Zmienił status\n");
    }
    void removePoints(Student student, double point)
    {
        student.numberOfPoint -= point-1;
        this.getStudent(student);
    }
    void search(String lastName)
    {
        Collections.sort(students);
    }
}
