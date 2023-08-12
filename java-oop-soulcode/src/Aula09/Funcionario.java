package Aula09;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    public int salario;
    public String departamento;


    public Funcionario(int salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

}
