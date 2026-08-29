package controlflow.assigment_problems;

public class VotingEligibilityChecker {

    public static void main(String[] args) {

        int age = 20;

        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}