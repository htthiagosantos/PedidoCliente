package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoDeItem;
import entidades.Produto;
import enumeracao.StatusDePedidos;

public class Principal {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.println("Insira os dados do cliente:");
		System.out.print("Nome ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataDeNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataDeNascimento);
		
		System.out.println("Digite os dados do pedido:");
		System.out.print("Status: ");
		StatusDePedidos status = StatusDePedidos.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos items o pedido vai ter? ");
		int numero = sc.nextInt();
		for(int i = 1; i <= numero; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			PedidoDeItem it = new PedidoDeItem(quantidade, precoProduto, produto);
			
			pedido.adicionarItems(it);
		}
		System.out.println();
		System.out.println(pedido);
		
		
		
		
		
		
		sc.close();
	}
		
}
	

