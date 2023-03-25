import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Student firstStudnet = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        //firstStudent.print();
        Student secondStudent = new Student("Michał", "Ogórek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        Student thirdStudent = new Student("Józef", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        firstStudnet.compare(secondStudent);
        firstStudnet.compare(thirdStudent);

        List studentsList = new ArrayList<Student>();
        studentsList.add(firstStudnet);
        studentsList.add(secondStudent);
        studentsList.add(thirdStudent);
        ClassOfStudent firstClass = new ClassOfStudent("Klasa 1a", studentsList, 4);
        System.out.println("Wynik dodania studenta: %s\n".formatted(firstClass.addStudent(firstStudnet)));
        Student fourthStudent = new Student("Tomek", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        System.out.println("Wynik dodania studenta: %s\n".formatted(firstClass.addStudent(fourthStudent)));
        System.out.println("Wynik dodania studenta: %s\n".formatted(firstClass.addStudent(fourthStudent)));
    }
}