import java.util.ArrayList;

public class VotingSystem {

    private ArrayList<Voting> votingList;

    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    public void createVoting(String question, int type) {
        votingList.add(new Voting(type, question));
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public String getVoting(int num) {
        if (num >= 0 && num < votingList.size()) {
            return votingList.get(num).getQuestion() + " :\n" + votingList.get(num).getChoices().toString();
        } else {
            return "";
        }
    }

    public void vote(int pollNumber, Person voter, ArrayList<String> votes) {
        votingList.get(pollNumber).vote(voter, votes);
    }

    public String getResult(int pollNumber) {
        return votingList.get(pollNumber).printVotes();
    }
}
