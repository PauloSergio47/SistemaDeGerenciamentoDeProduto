package application;

import java.util.Scanner;

import entities.Pedido;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido = new Pedido();
		
		int escolha = 0;
		
		do {
		
		System.out.println("Bem-Vindo ao Sistema de Gerenciamento de Pedidos");
		System.out.println();
		System.out.println("1. Adicionar Produto");
		System.out.println("2. Remover Produto");
		System.out.println("3. Exibir Produtos no Pedido");
		System.out.println("4. Exibir Total do Pedido");
		System.out.println("5. Finalizar Pedido");
		System.out.println("6. Sair");
		
		escolha = sc.nextInt();
		
		MenuDeEscolha.processarEscolha(escolha);
		
		if(escolha == 1) {
			System.out.println("Nome do Produto: ");
			String N = sc.next();
			System.out.println("Preço do Produto: ");
			double P = sc.nextDouble();
			
			if(P > 0) {
			
			Produto novoProdutos = new Produto(N, P);
			
			pedido.adicionarProduto(novoProdutos);
			}else {
				System.out.println("Preço invalido!");
			}
		}
		
		else if(escolha == 2) {
			System.out.println("Qual Produto Irá remover? ");
			String remo = sc.next();
			pedido.removerProdutos(remo);
		}
		
		else if(escolha == 3) {
				System.out.println("Lista de Produtos: ");
				pedido.exibirProduto();
				System.out.println();
		}
		
		else if (escolha == 4) {
			double total = pedido.calcularTotal();
			System.out.printf("Total dos Pedidos: R$ %.2f%n", total);
			System.out.println();
		}
		
		else if (escolha == 5) {
			pedido.finalizarPedido();
			System.out.println();
		}
		
		}while(escolha != 6);

		sc.close();
	}

}
