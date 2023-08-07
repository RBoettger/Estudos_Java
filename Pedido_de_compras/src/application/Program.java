package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemDoPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		
		
		System.out.println("Insira os dados do cliente:");
		
		System.out.println("Nome completo: ");
		String nome = sc.nextLine();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Data de nascimento (DD/MM/YYYY): ");
		Date dataDeNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataDeNascimento);
		
		System.out.println("Insira os dados do pedido:");
		System.out.println("Status:");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(cliente, new Date(), status);
		
		System.out.println("Quantos itens cabem neste pedido?");
		Integer qtdPedido = sc.nextInt();
		
		for(int i = 1; i<=qtdPedido; i++) {
			System.out.printf("Digite os dados do item nº %d%n", qtdPedido);
			System.out.println("Nome do produto:");
			String nomeProduto = sc.next();
			System.out.println("Preco:");
			Double preco = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, preco);
			
			System.out.println("Quantidade do produto:");
			Integer qtdProduto = sc.nextInt();
			
			ItemDoPedido itemDoPedido = new ItemDoPedido(produto, qtdProduto, preco);
			
			pedido.addItemsDoPedido(itemDoPedido);
			
		}
		
		System.out.println();
		System.out.println("Resumo do pedido:");
		System.out.println(pedido);
		
		sc.close();
	}

}
