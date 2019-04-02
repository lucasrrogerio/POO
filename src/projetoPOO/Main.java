package projetoPOO;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao;
        int registrados = 0;
        Scanner teclado = new Scanner(System.in);
        Produto[] produto = new Produto[50];
        boolean cont = true;

        while (cont) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Bem vindo a loja do Rogerinho!");
            System.out.println("Digite 1 para cadastrar novos produtos.");
            System.out.println("Digite 2 para mostrar os produtos cadastrados.");
            System.out.print("Digite a opcao: ");

            opcao = teclado.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            switch (opcao) {
                case 1:
                    Produto p = new Produto();
                    System.out.print("Digite o nome do produto: ");
                    String nome = teclado.next();
                    p.setNome(nome);
                    System.out.print("Digite o valor do produto: ");
                    float valor = teclado.nextFloat();
                    p.setValor(valor);
                    produto[registrados] = new Produto();
                    produto[registrados] = p;
                    registrados++;
                    break;
                case 2:
                    if (produto[0] == null) System.out.println("Não existem produtos cadastrados.");
                    else {
                        for (Produto a : produto) {
                            if (a == null) break;
                            System.out.printf("%s: R$%.2f\n",a.getNome(),a.getValor());
                        }
                    }
                    break;
            }
            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            opcao = teclado.nextInt();
            if (opcao == 0) cont = false;
        }
    }
}
