import java.math.BigDecimal;
import java.util.Date;

public interface SessionManager {


    void addPerson(Session session, Person person);

    void createExpense (Session session, String nameExpense, Date datetime, Person from, Person to, BigDecimal amount);

    Long generateId ();

}
