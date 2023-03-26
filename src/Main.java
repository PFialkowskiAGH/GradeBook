import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("-----------------------Wypisanie studenta:-----------------------\n");
        Student firstStudent = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        firstStudent.print();

        System.out.println("-----------------------Test compare-----------------------\n");
        Student secondStudent = new Student("Michał", "Ogórek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        Student thirdStudent = new Student("Józef", "Ogonek", StudentCondition.Chory, 2000, 3.0, "Krakowska 15" );
        if(firstStudent.compare(secondStudent)) System.out.printf("Studenci mają takie samo nazwisko\n");
        else System.out.printf("Studenci nie mają takiego samego nazwiska\n");
        if(firstStudent.compare(thirdStudent)) System.out.printf("Studenci mają takie samo nazwisko\n");
        else System.out.printf("Studenci nie mają takiego samego nazwiska\n");

        System.out.println("\n-----------------------Test dodawania do klasy-----------------------\n");
        List studentsList = new ArrayList<Student>();
        studentsList.add(firstStudent);
        studentsList.add(secondStudent);
        studentsList.add(thirdStudent);
        ClassOfStudent firstClass = new ClassOfStudent("Klasa 1a", studentsList, 4);
        firstClass.addStudent(firstStudent);
        Student fourthStudent = new Student("Ogier", "Czmiech", StudentCondition.Obecny, 2000, 3.0, "Krakowska 15" );
        firstClass.addStudent(fourthStudent);
        //firstClass.addStudent(fourthStudent);

        System.out.println("-----------------------Test dodawania punktów uczniowi-----------------------\n");
        firstClass.addPoints(firstStudent, 1.6);

        System.out.println("-----------------------Test usuwania punktów uczniowi-----------------------\n");
        firstClass.getStudent(secondStudent);
        firstClass.getStudent(secondStudent);
        firstClass.getStudent(secondStudent);

        System.out.println("-----------------------Test zmiany statusu-----------------------\n");
        firstClass.changeCondition(firstStudent, StudentCondition.Obecny);

        System.out.println("-----------------------Test usuwania punktów uczniowi (więcej niż 1)-----------------------\n");
        firstClass.removePoints(thirdStudent, 2.5);

        System.out.println("-----------------------Szukanie studenta-----------------------\n");
        Student searchedStudent = firstClass.search("Ogonek");
        Student searchedStudent2 = firstClass.search("Borek");

        System.out.println("-----------------------Szukanie po fragmencie-----------------------\n");
        List<Student>searchedStudents = firstClass.searchPartial("Og");
        List<Student>searchedStudents2 = firstClass.searchPartial("Cu");

        System.out.println("-----------------------Liczba studentów z danym Condition-----------------------\n");
        System.out.println("Ilość studentów z: %s w klasie %s to: %d\n".formatted(StudentCondition.Obecny.toString(), firstClass.className, firstClass.countByCondition(StudentCondition.Obecny)));

        System.out.println("-----------------------Summary klasy-----------------------\n");
        System.out.println("Wszystkie osoby w klasie %s:\n".formatted(firstClass.className));
        firstClass.summary();

        System.out.println("-----------------------Posortowana klasa po nazwisku-----------------------\n");
        firstClass.sortByLastName();
        firstClass.summary();

        System.out.println("-----------------------Posortowana klasa po punktach-----------------------\n");
        firstClass.sortByPoints();
        firstClass.summary();
    }
}