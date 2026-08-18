# Exemplo de Classe em Java: Classe `Carro`

Este projeto é um exemplo simples em **Java** demonstrando conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como criação de classes, atributos, construtores, métodos e instanciação de objetos.

---

## 📌 Descrição do Desafio

O objetivo é criar uma classe chamada `Carro` com os seguintes atributos:
- **Nome** (`String`)
- **Modelo** (`String`)
- **Ano** (`int`)

Em seguida, devem ser criados **dois objetos distintos** dessa classe e seus respectivos valores devem ser exibidos no console.

---

## 🛠️ Estrutura do Código

O código está dividido em duas partes principais dentro da estrutura do projeto:

1. **Classe `Carro`**: Representa o modelo/molde do objeto.
   - **Atributos:** `nome`, `modelo` e `ano`.
   - **Construtor:** Permite inicializar um novo carro diretamente com seus valores.
   - **Método `exibirInformacoes()`:** Imprime os dados do carro formatados no console.

2. **Classe `Main`**: Executa o programa principal.
   - Instancia dois carros com dados diferentes (`carro1` e `carro2`).
   - Chama o método de exibição de dados para cada objeto.

---

## 💻 Código Fonte (`Main.java`)

```java
// Definção da classe Carro
class Carro {
    String nome;
    String modelo;
    int ano;

    // Construtor
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

        // Impressão dos valores no console
        System.out.println("--- Carro 1 ---");
        carro1.exibirInformacoes();

        System.out.println("\n--- Carro 2 ---");
        carro2.exibirInformacoes();
    }
}
```

---

## 🚀 Como Executar

### Pré-requisitos
- Ter o **JDK (Java Development Kit)** instalado em sua máquina (versão 8 ou superior).

### Passos para execução
1. Salve o código acima em um arquivo chamado `Main.java`.
2. Abra o terminal / prompt de comando no diretório onde salvou o arquivo.
3. Compile o código executando:
   ```bash
   javac Main.java
   ```
4. Execute o programa com o comando:
   ```bash
   java Main
   ```

---

## 📊 Saída Esperada no Console

Ao executar o programa, a saída impressa no terminal será:

```text
--- Carro 1 ---
Nome: Toyota | Modelo: Corolla | Ano: 2022

--- Carro 2 ---
Nome: Honda | Modelo: Civic | Ano: 2023
```
