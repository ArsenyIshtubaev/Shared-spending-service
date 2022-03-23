import java.math.BigDecimal;
import java.util.Date;

public class InMemorySessionManager implements SessionManager{

    static Long id = 0L;

    @Override
    public void add(Session session, Person person) {

        session.getPersons().add(person);

    }

    @Override
    public Long generateId() {
        return id++;
    }

    @Override
    public void createExpense(Session session, String nameExpense, Date datetime, Person from, Person to, BigDecimal amount) {

        Expense expense = new Expense(generateId(), nameExpense, datetime, from, to, amount);

        session.getExpenses().add(expense);

    }
}
