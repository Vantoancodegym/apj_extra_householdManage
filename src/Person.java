public class Person {
    public static final int CURRENT_YEAR = 2020;
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String job;

    public Person(String name, int dayOfBirthday, int monthOfBirthday, int yearOfBirthday, String job) {
        this.name = name;
        this.dayOfBirth = dayOfBirthday;
        this.monthOfBirth = monthOfBirthday;
        this.yearOfBirth = yearOfBirthday;
        this.job = job;
    }
    public int getAge(){
        return CURRENT_YEAR - yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday= " + dayOfBirth + "/ "
                 + monthOfBirth +"/"
                 + yearOfBirth +
                ", job='" + job + '\'' +
                '}';
    }
}
