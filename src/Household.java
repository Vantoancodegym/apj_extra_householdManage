import java.util.ArrayList;

public class Household {
    public static final int CHECKING_VALUE = 80;
    private ArrayList<Person> personList=new ArrayList<>();
    private int numberOfPerson;
    private int houseNumber;
    public Household(int numberOfPerson, int houseNumber) {
        this.numberOfPerson = numberOfPerson;
        this.houseNumber = houseNumber;
    }
    public void addNewPerson(Person person){
        personList.add(person);
    }
    public boolean CheckConditionOfAge(){
        for (int i = 0; i < personList.size(); i++) {
            int age=personList.get(i).getAge();
            if (age>= CHECKING_VALUE) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result="";
        for (int i = 0; i < personList.size(); i++) {
            result+= personList.get(i);
        }
        return "Household{" +
                "personList=" + result +
                ", numberOfPerson=" + numberOfPerson +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
