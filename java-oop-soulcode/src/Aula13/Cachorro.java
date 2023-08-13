package Aula13;

public class Cachorro extends Animal implements Mamifero {   
    @Override
    public void comer() {
        System.out.println("Comendo racao");
    }

    @Override
    public void andar() {
        System.out.println("Andando " + passos + " metros");
    }    
}
