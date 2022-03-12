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

    public Double getExpense() {
        return expense;
    }

    public Member getToMember() {
        return toMember;
    }

    public Member getFrom() {
        return from;
    }

    public Long getId() {
        return id;
    }
}

