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

    public String getName() {
        return name;
    }

    public Session setName(String name) {
        this.name = name;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Session setId(Long id) {
        this.id = id;
        return this;
    }

    public ArrayList<Member> getListMemberSession() {
        return listMemberSession;
    }

    public Session setListMemberSession(ArrayList<Member> listMemberSession) {
        this.listMemberSession = listMemberSession;
        return this;
    }

    public ArrayList<Expense> getListExpenseSession() {
        return listExpenseSession;
    }

    public Session setListExpenseSession(ArrayList<Expense> listExpenseSession) {
        this.listExpenseSession = listExpenseSession;
        return this;
    }
}
