package flamingo.apredendo.MiniProjeto.dominio;
public class Produto {

    // Atributos privados
    private String nome;
    private double preco;
    private int quantidade;

    // Setter do nome
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: nome inválido!");
        }
    }

    // Setter do preço
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: preço não pode ser negativo!");
        }
    }

    // Setter da quantidade
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: quantidade não pode ser negativa!");
        }
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // Calcula o valor total do estoque
    public double calcularValorEstoque() {
        return this.preco * this.quantidade;
    }

    // Desafio extra: adicionar estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Erro: informe uma quantidade positiva!");
        }
    }
}

