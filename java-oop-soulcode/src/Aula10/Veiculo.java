package Aula10;

public class Veiculo extends Transporte {
    public void andar() {
        System.out.println("Veiculo andando...");
    }

    public void andar(int km) {
        System.out.println("Veiculo andando a " + km + "km/h");
    }

    public void andar(int km, int l) {
        System.out.println("Veiculo andando a " + km + "km/h e consumindo " + l + "litros por km");
    }
}
