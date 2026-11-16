package flamingo.apredendo.MiniProjeto.test;

import flamingo.apredendo.MiniProjeto.dominio.Produto;
public class ProdutoTest01 {

    public static void main(String[] args) {

        // Criando os objetos
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();

        // Cadastrando o produto 01
        produto01.setNome("Teclado");
        produto01.setPreco(150.00);
        produto01.setQuantidade(5);

        // Cadastrando o produto 02
        produto02.setNome("Mouse");
        produto02.setPreco(80.00);
        produto02.setQuantidade(10);

        // Exibindo produto 01
        System.out.println("========== PRODUTO 01 ==========");
        System.out.println("Nome: " + produto01.getNome());
        System.out.println("Preço: R$ " + produto01.getPreco());
        System.out.println("Quantidade: " + produto01.getQuantidade());
        System.out.println("Valor do estoque: R$ "
                + produto01.calcularValorEstoque());

        // Exibindo produto 02
        System.out.println("\n========== PRODUTO 02 ==========");
        System.out.println("Nome: " + produto02.getNome());
        System.out.println("Preço: R$ " + produto02.getPreco());
        System.out.println("Quantidade: " + produto02.getQuantidade());
        System.out.println("Valor do estoque: R$ "
                + produto02.calcularValorEstoque());

        // Testando as validações
        System.out.println("\n========== TESTANDO VALIDAÇÕES ==========");

        produto01.setPreco(-500);
        produto02.setQuantidade(-10);

        // Verificando se os valores foram mantidos
        System.out.println("Preço do teclado: R$ "
                + produto01.getPreco());

        System.out.println("Quantidade do mouse: "
                + produto02.getQuantidade());

        // Desafio extra
        System.out.println("\n========== ADICIONANDO ESTOQUE ==========");

        produto01.adicionarEstoque(3);

        System.out.println("Nova quantidade do teclado: "
                + produto01.getQuantidade());

        System.out.println("Novo valor do estoque: R$ "
                + produto01.calcularValorEstoque());
    }
}
