package it.academy.java.sprint3.tasca2.n1exercisi1;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 02. Testing (Spring3), Nivell 1, Exercisi 1");

        AgenciesBorsa agenciesBorsa = new AgenciesBorsa();

        AgentBorsa agentBorsa = new AgentBorsa();

        agentBorsa.linkObservers(agenciesBorsa);
        agentBorsa.pujadaPreu();

    }
}
