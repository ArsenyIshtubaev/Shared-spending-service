import java.util.ArrayList;

public class Session {

    private String name;
    private Long id;
    private ArrayList<Member> listMemberSession;
    private ArrayList<Expense> listExpenseSession;

    public Session(String name, Long id, ArrayList<Member> listMemberSession, ArrayList<Expense> listExpenseSession) {
        this.name = name;
        this.id = id;
        this.listMemberSession = listMemberSession;
        this.listExpenseSession = listExpenseSession;
    }

}
