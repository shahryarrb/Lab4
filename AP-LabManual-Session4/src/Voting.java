import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {

    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;

    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public ArrayList<String > getChoices() {
        return new ArrayList<>(choices.keySet());
    }

    public void vote(Person person, ArrayList<String> votes) {
        if (!voters.contains(person)) {
            voters.add(person);
            for (String vote : votes) {
                choices.get(vote).add(new Vote(person, new JalaliCalendar(new GregorianCalendar(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth())).toString()));
            }
        }
    }

    public String printVotes() {
        StringBuilder result = new StringBuilder();
        result.append(question).append("\n");
        for (String choice : choices.keySet()) {
            result.append(choice).append(" : ").append("\n");
            for (Vote vote : choices.get(choice)) {
                result.append(vote.toString()).append("\n");
            }
        }
        return result.toString();
    }

    public void createChoice(String choice) {
        choices.put(choice, new HashSet<>());
    }
}
