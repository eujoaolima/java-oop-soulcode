package Aula13;

public class Interfaces {
    public static void main(String[] args) {
        // Interfaces

        /*
            - Interfaces sao totalmente abstratas
            - Variaveis "static final" sao constantes (como o const do JavaScript)
            - E usada para criar herancas multiplas

                - No java nao existem herancas multiplas, como por exemplo "public class Cachorro extends Animal extends Mamifero"

            Como funciona?
                - Utilizar o "interface" antes de iniciar a classe
                - Utilizar o "implements" para ser chamada em classes filhas
        */

        Cachorro dog = new Cachorro();

        dog.andar();
    }
}
