import java.math.BigDecimal;
import java.util.Date;

public class Expense {

    private Long id;
    private String name;
    private Date datetime;
    private Person from;
    private Person to;
    private BigDecimal amount;

    public Expense(Long id, String name, Date datetime, Person from, Person to, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.datetime = datetime;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Date getDatetime() {
        return datetime;
    }

    public Person getTo() {
        return to;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Person getFrom() {
        return from;
    }

    public Long getId() {
        return id;
    }

    // String uuid = UUID.randomUUID().toString(); - генерация String id

}

