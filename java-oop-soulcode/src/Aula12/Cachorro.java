package Aula12;

public class Cachorro extends Animal {   
    @Override
    public void comer() {
        System.out.println("Comendo racao");
    }

    @Override
    public void andar() {
        System.out.println("Cachorro andando");
    }
    
}
