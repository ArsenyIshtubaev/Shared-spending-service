import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class InMemorySessionManager implements SessionManager {

    static Long id = 0L;
    final Session session = new Session(generateId(), "Сессия 1", new ArrayList<>(), new ArrayList<>());

    @Override
    public void addPerson(Person person) {
        session.getPersons().add(person);
    }

    @Override
    public Long generateId() {
        return id++;
    }

    @Override
    public void createExpense(String nameExpense, Date datetime, Person from, Person to, BigDecimal amount) {
        Expense expense = new Expense(generateId(), nameExpense, datetime, from, to, amount);
        session.getExpenses().add(expense);
    }
}
