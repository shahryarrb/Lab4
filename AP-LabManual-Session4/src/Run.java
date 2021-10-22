import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.createVoting("Which animal do you love ?", 1);
        votingSystem.getVotingList().get(0).createChoice("Dog");
        votingSystem.getVotingList().get(0).createChoice("Cat");

        Person person = new Person("Shahryar", "Raeisi");
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Dog");
        votes.add("Cat");

        votingSystem.vote(0, person, votes);

        /* VotingSystem v2 = new VotingSystem();
        v2.createVoting("which car do you love?", 0);
        votingSystem.getVotingList().get(1).createChoice("Benz");
        votingSystem.getVotingList().get(1).createChoice("BMW");

        Person p2 = new Person("ali", "alavi");
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Benz");
        votes.add("BMW");
        v2.vote(1, p2, votes);
        System.out.println(v2.getResult(1)); */
        System.out.println(votingSystem.getResult(0));
    }
}
