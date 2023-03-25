import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Student firstStudnet = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        //firstStudnet.print();
        Student secondStudnet = new Student("Michał", "Ogórek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        Student thirdStudnet = new Student("Józef", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        firstStudnet.compare(secondStudnet);
        firstStudnet.compare(thirdStudnet);

        List studentsList = new ArrayList<Student>();
        studentsList.add(firstStudnet);
        studentsList.add(secondStudnet);
        studentsList.add(thirdStudnet);
        ClassOfStudent firstClass = new ClassOfStudent("Klasa 1a", studentsList, 4);
    }
}