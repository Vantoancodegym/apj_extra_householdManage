import java.util.ArrayList;

public class Town {
    private ArrayList<Household> householdList=new ArrayList<>();
    public void addNewHousehlod(Household household){
        householdList.add(household);
    }
    public void displayHouseholdHasLongityPerson(){
        for (int i = 0; i < householdList.size(); i++) {
            Household household=householdList.get(i);
            boolean resultOfChecking=household.CheckConditionOfAge();
            if (resultOfChecking){
                System.out.println(household.toString());
            }
        }
    }
}
