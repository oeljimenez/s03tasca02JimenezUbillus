package it.academy.java.sprint3.tasca2.n1exercisi1;

public class AgenciesBorsa implements  Observers{

    public AgenciesBorsa (){};

    @Override
    public void actualitzar(){
        System.out.println("Aplicar el nou preu del euro");
    }

}
