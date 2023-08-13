package Aula12;

public class Abstracoes {
    public static void main(String[] args) {
        // Abstracoes

        /*
            - Classes abstratas servem para criar modelos para classes filhas.
            - Classes abstratas nao podem ser instanciadas diretamente.

            Como funciona?
                - Utilizar o "abstract" antes de iniciar a classe
                - Crie metodos para ser implementado nas classes filhas.

        */

        Cachorro doguinho = new Cachorro();

        doguinho.setNome("Bob, o bobo");
        doguinho.setIdade(10);

        System.out.println(doguinho.toString());

        doguinho.comer();
        doguinho.andar();
    }
}
