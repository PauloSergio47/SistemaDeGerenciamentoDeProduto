package entities;

import java.util.ArrayList;

public class Pedido {
	
	ArrayList<Produto> produtos;
	
	public Pedido() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProdutos(String produto) {
		 Produto produtoParaRemover = null;

	        for (Produto produtoR : produtos) {
	            if (produtoR.getNome().equalsIgnoreCase(produto)) {
	                produtoParaRemover = produtoR;
	                break;
	            }
	        }

	        if (produtoParaRemover != null) {
	            produtos.remove(produtoParaRemover);
	            System.out.println(produto + " removido do pedido.");
	        } else {
	            System.out.println("Produto não encontrado.");
	        }
	    }
	
	public double calcularTotal() {
		double total = 0;
		for(Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}
	
	public void exibirProduto() {
		for (Produto produto : produtos) {
			System.out.println("- "+ produto.getNome() + ": R$ "+ produto.getPreco());
		}
	}
	
	public void finalizarPedido() {
		System.out.println("Produtos no pedido: ");
		exibirProduto();
		System.out.println("Total: R$ "+calcularTotal());
		System.out.println("Obrigado por sua compra!");
	}
	
}
