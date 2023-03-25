import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Student firstStudent = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        //firstStudent.print();
        Student secondStudent = new Student("Michał", "Ogórek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        Student thirdStudent = new Student("Józef", "Ogonek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        System.out.println("Test compare");
        firstStudent.compare(secondStudent);
        firstStudent.compare(thirdStudent);

        System.out.println("\nTest dodawania do klasy");
        List studentsList = new ArrayList<Student>();
        studentsList.add(firstStudent);
        studentsList.add(secondStudent);
        studentsList.add(thirdStudent);
        ClassOfStudent firstClass = new ClassOfStudent("Klasa 1a", studentsList, 4);
        firstClass.addStudent(firstStudent);
        Student fourthStudent = new Student("Tomek", "Ogonek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        firstClass.addStudent(fourthStudent);
        firstClass.addStudent(fourthStudent);
        System.out.println("\nTest dodawania punktów uczniowi");
        firstClass.addPoints(firstStudent, 1.6);
        firstStudent.print();
    }
}