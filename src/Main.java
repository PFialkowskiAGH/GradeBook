public class Main {
    public static void main(String[] args)
    {
        Student firstStudnet = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        firstStudnet.print();
        Student secondStudnet = new Student("Paweł", "Ogórek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        Student thirdStudnet = new Student("Paweł", "Ogonek", StudentCondition.Chory, 2000, 15.6, "Krakowska 15" );
        firstStudnet.compare(secondStudnet);
        firstStudnet.compare(thirdStudnet);
    }
}