package Aula10;

public class Polimorfismo {
    public static void main(String[] args) {
        // Polimorfismo

        /*
         * Polimorfismo e um conceito da POO onde e possivel escrever o mesmo metodo de diversas formas
         */

        // Tipos de polimorfismo
            // Sobrecarga: Mesmo nome e assianturas diferentes

            // Sobrescrita: Mesma assinatura e tipo de parametro, mas cada metodo faz algo diferente
        

            Transporte t = new Transporte();

            Veiculo v = new Veiculo();

            Carro c = new Carro();

            // Polimorfismo
            t.andar();
            v.andar();
            c.andar();

            // Sobrescrita
            v.andar(120);

            // Sobrecarga
            v.andar(120, 5);
        }   
} 
