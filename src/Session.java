import java.util.ArrayList;

public class Session {

    private Long id;
    private String name;
    private ArrayList<Person> persons;
    private ArrayList<Expense> expenses;

    public Session(Long id, String name, ArrayList<Person> persons, ArrayList<Expense> expenses) {
        this.id = id;
        this.name = name;
        this.persons = persons;
        this.expenses = expenses;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public Session setPersons(ArrayList<Person> persons) {
        this.persons = persons;
        return this;
    }

    public Session setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
        return this;
    }
}
