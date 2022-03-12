public class Expense {

    private String name;
    private Double expense;
    private Member toMember;
    private Member from;
    private Long id;


    public Expense(String name, Double expense, Member toMember, Member member, Long id) {
        this.name = name;
        this.expense = expense;
        this.toMember = toMember;
        this.from = member;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Expense setName(String name) {
        this.name = name;
        return this;
    }

    public Double getExpense() {
        return expense;
    }

    public Expense setExpense(Double expense) {
        this.expense = expense;
        return this;
    }

    public Member getToMember() {
        return toMember;
    }

    public Expense setToMember(Member toMember) {
        this.toMember = toMember;
        return this;
    }

    public Member getFrom() {
        return from;
    }

    public Expense setFrom(Member from) {
        this.from = from;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Expense setId(Long id) {
        this.id = id;
        return this;
    }
}

