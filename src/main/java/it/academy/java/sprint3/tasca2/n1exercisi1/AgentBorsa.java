package it.academy.java.sprint3.tasca2.n1exercisi1;

import java.util.ArrayList;

public class AgentBorsa implements Observable {

    private final ArrayList<Observers> observers;

    public AgentBorsa() {
        observers = new ArrayList<Observers>();
    }

    public void pujadaPreu(){
        System.out.println("el preu del euro ha pujat");
        notificar();
    }

    public void linkObservers(Observers o) {
        observers.add(o);
    }

    @Override
    public void notificar() {
        for (Observers o: observers){
            o.actualitzar();
        }
    }
}
