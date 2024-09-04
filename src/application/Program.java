package application;

import java.util.Scanner;

import entities.Pedido;
import entities.Produto;

public class Program {

	private static int escolha;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido = new Pedido();
		
		
		do {
		
		System.out.println("Bem-Vindo ao Sistema de Gerenciamento de Pedidos");
		System.out.println();
		System.out.println("1. Adicionar Produto");
		System.out.println("2. Remover Produto");
		System.out.println("3. Exibir Produtos no Pedido");
		System.out.println("4. Exibir Total do Pedido");
		System.out.println("5. Finalizar Pedido");
		System.out.println("6. Sair");
		
		int escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			escolha = 1;
			break;
		case 2:
			escolha = 2;
			break;
		case 3:
			escolha = 3;
			break;
		case 4:
			escolha = 4;
			break;
		case 6:
			escolha = 6;
			break;
		default:
			System.out.println("Opção invalida!");
			return;
		}
		
		if(escolha == 1) {
			System.out.println("Nome do Produto: ");
			String N = sc.next();
			System.out.println("Preço do Produto: ");
			double P = sc.nextDouble();
			
			Produto novoProdutos = new Produto(N, P);
			
			pedido.adicionarProduto(novoProdutos);
		}
		
		else if(escolha == 2) {
			System.out.println("Qual Produto Irá remover? ");
			String remo = sc.next();
			pedido.removerProdutos(remo);
		}
		
		else if(escolha == 3) {
			for(Produto lista : produtos) {
				System.out.println("Lista de Produtos: "+lista);
			}
		}
		
		}while(escolha != 5);
		
		
		/*
		pedido.adicionarProduto(produto1); ---------x
		pedido.adicionarProduto(produto2);
		
		pedido.exibirProduto();
		pedido.finalizarPedido();
		*/

		sc.close();
	}

}
