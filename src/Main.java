import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Student firstStudent = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        firstStudent.print();
        Student secondStudent = new Student("Michał", "Ogórek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        Student thirdStudent = new Student("Józef", "Obojo", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        System.out.println("Test compare");
        if(firstStudent.compare(secondStudent)) System.out.printf("Studenci mają takie samo nazwisko");
        else System.out.printf("Studenci nie mają takiego samego nazwiska");
        if(firstStudent.compare(thirdStudent)) System.out.printf("Studenci mają takie samo nazwisko");
        else System.out.printf("Studenci nie mają takiego samego nazwiska");

        System.out.println("\nTest dodawania do klasy");
        List studentsList = new ArrayList<Student>();
        studentsList.add(firstStudent);
        studentsList.add(secondStudent);
        studentsList.add(thirdStudent);
        ClassOfStudent firstClass = new ClassOfStudent("Klasa 1a", studentsList, 4);
        firstClass.addStudent(firstStudent);
        Student fourthStudent = new Student("Tomek", "Ogryzek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        firstClass.addStudent(fourthStudent);
        //firstClass.addStudent(fourthStudent);
        System.out.println("\nTest dodawania punktów uczniowi");
        firstClass.addPoints(firstStudent, 1.6);
        firstStudent.print();
        firstClass.getStudent(secondStudent);
        firstClass.getStudent(secondStudent);
        firstClass.getStudent(secondStudent);
        firstClass.changeCondition(firstStudent, StudentCondition.Obecny);
        firstClass.removePoints(thirdStudent, 2.5);
        thirdStudent.print();
        System.out.println("Szukanie studenta");
        Student searchedStudent = firstClass.search("Ogonek");
        Student searchedStudent2 = firstClass.search("Borek");
    }
}