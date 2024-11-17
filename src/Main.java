import model.Pessoa;
import produto.Produto;
import produto.ProdutoPerecivel;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anselmo");
        pessoa.setIdade(44);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Orlando");
        pessoa1.setIdade(79);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Bela");
        pessoa2.setIdade(8);

        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
        listaDePessoa.add(pessoa);
        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);

        System.out.println("Minha lista: " + listaDePessoa);
        System.out.println("Uma pessoa da minha lista: " + listaDePessoa.get(2));

        System.out.println(listaDePessoa.remove(pessoa2) + " removido " + " Pessoa:" + pessoa2);

        System.out.println("Uma pessoa da minha lista: " + listaDePessoa.get(0));
        System.out.println("Quantidade de pessoas na minha lista: " + listaDePessoa.size());

        System.out.println("Lista de Pessoas Atualizada");
        for (Pessoa pessoas : listaDePessoa) {
            System.out.println(pessoas);
        }*/

        Produto produto = new Produto("arroz", 7.0, 2);
        Produto produto1 = new Produto("feijao", 7.0, 3);
        Produto produto2 = new Produto("açucar", 8.0, 5);



        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        System.out.println(listaProdutos);

        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(1));

        System.out.println("lista de Produtos");
        for (Produto produtos : listaProdutos) {
            System.out.println(produtos);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("tomate", 5.0, 1);
        produtoPerecivel.setDataValidade("25-11-2024");

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("maracuja", 13.0, 1);
        produtoPerecivel1.setDataValidade("01-12-2024");

    }


}
