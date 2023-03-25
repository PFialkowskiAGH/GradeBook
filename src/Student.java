public class Student implements Comparable{
    String firstName;
    String lastName;
    StudentCondition studentCondition;
    int birthYear;
    double numberOfPoint;
    String studentAdress;

    public Student (String firstName, String lastName, StudentCondition studentCondition, int birthYear, double numberOfPoint, String studentAdress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCondition = studentCondition;
        this.birthYear = birthYear;
        this.numberOfPoint = numberOfPoint;
        this.studentAdress = studentAdress;
    }

    @Override
    public String toString()
    {
        return "Student:\n Imie: %s\n Nazwisko: %s\n Status: %s\n Rok urodzenia: %d\n Adres: %s\n".formatted(firstName, lastName, studentCondition.toString(), birthYear, numberOfPoint, studentAdress);
    }

    void print()
    {
        System.out.println(this);
    }

    @Override
    public void compare(Student comparedStudent) {
        if (this.lastName == comparedStudent.lastName) System.out.printf("%s \ni porównywany\n %s \nmają takie samo nazwisko\n".formatted(this.toString(), comparedStudent.toString()));
        else System.out.printf("%s \ni porównywany\n %s \nnie mają takiego samego nazwiska\n".formatted(this.toString(), comparedStudent.toString()));
    }
}
