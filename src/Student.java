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

    public Student(String lastname)
    {
        this.lastName = lastname;
    }

    @Override
    public String toString()
    {
        return "Student:\n Imie: %s\n Nazwisko: %s\n Status: %s\n Rok urodzenia: %d\n Punkty: %.2f\n Adres: %s\n".formatted(firstName, lastName, studentCondition.toString(), birthYear, numberOfPoint, studentAdress);
    }

    void print()
    {
        System.out.println(this);
    }

    @Override
    public boolean compare(Student comparedStudent) {
        if (this.lastName == comparedStudent.lastName) return true;
        else return false;
    }
}
