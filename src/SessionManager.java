import java.math.BigDecimal;
import java.util.Date;

public interface SessionManager {

    void addPerson(Person person);

    void createExpense (String nameExpense, Date datetime, Person from, Person to, BigDecimal amount);

    Long generateId ();
}
