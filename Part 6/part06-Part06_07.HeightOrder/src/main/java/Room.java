import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public boolean isEmpty(){
        return personList.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return personList;
    }

    public Person shortest(){
        if(isEmpty()) return null;

        Person shortestPerson = personList.get(0);

        for(Person each : personList){
            if(each.getHeight() < shortestPerson.getHeight()){
                shortestPerson = each;
            }
        }
        return shortestPerson;
    }

    public Person take(){
        if(isEmpty()) return null;

        Person shortestP = shortest();
        personList.remove(shortest());

        return shortestP;
    }
}
