// Definção da classe Carro
class Carro {
    String nome;
    String modelo;
    int ano;

    // Construtor para facilitar a criação dos objetos
    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de dois objetos distintos
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Honda", "Civic", 2023);

        // Impressão dos valores dos objetos
        System.out.println("--- Carro 1 ---");
        carro1.exibirInformacoes();

        System.out.println("--- Carro 2 ---");
        carro2.exibirInformacoes();
    }
}
