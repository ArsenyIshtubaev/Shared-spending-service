import java.util.ArrayList;

public class Expense {

    private String name;
    private Double expense;
    private ArrayList<Member> listMember;
    private Member payer;

    public Expense(String name, Double expense, ArrayList<Member> listMember, Member member) {
        this.name = name;
        this.expense = expense;
        this.listMember = listMember;
        this.payer = member;
    }

}

