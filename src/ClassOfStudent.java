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
                if(element.compare(student)) isExist = true;
            }
            if (!isExist) {
                students.add(student);
                System.out.println("Dodano studenta do klasy\n");
            }
            else System.out.println("W tej klasie jest już student o tym nazwisku\n");
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
    Student search(String lastName)
    {
        Student searchedStudent = new Student(lastName);
        for(Student currentStudent : students)
        {
            if (searchedStudent.compare(currentStudent))
            {
                System.out.println("Znaleniono w klasie %s studenta %s\n".formatted(className, currentStudent));
                return currentStudent;
            }
        }
        System.out.println("Nie znaleziono w klasie %s studenta o nazwisku %s\n".formatted(className,lastName));
        return searchedStudent;
    }

    List<Student> searchPartial(String partOfName)
    {
        List<Student> searchedStudents = new ArrayList<>();
        for(Student currentStudent : students)
        {
            if (currentStudent.firstName.contains(partOfName) || currentStudent.lastName.contains(partOfName)) searchedStudents.add(currentStudent);
        }
        System.out.println("Wyszukani studenci w klasie %s z %s w imieniu lub nazwisku:\n".formatted(className,partOfName));
        if (searchedStudents.size() == 0) System.out.println("Brak wyników\n");
        else
        {
            for(Student currentStudent : searchedStudents)
            {
                currentStudent.print();
            }
        }
        return searchedStudents;
    }
    int countByCondition(StudentCondition searchedCondition)
    {
        int numberOfStudents = 0;
        for(Student currentStudent : students)
        {
            if (currentStudent.studentCondition == searchedCondition) numberOfStudents++;
        }
        return numberOfStudents;
    }

    void summary()
    {
        for(Student currentStudent : students)
        {
            currentStudent.print();
        }
    };

}
