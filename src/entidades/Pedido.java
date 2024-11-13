package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeracao.StatusDePedidos;

public class Pedido {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private StatusDePedidos status;
	
	private Cliente cliente;
	
	private List<PedidoDeItem> items = new ArrayList<PedidoDeItem>();
	
	
	public Pedido() {
		
	}


	public Pedido(Date momento, StatusDePedidos status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public StatusDePedidos getStatus() {
		return status;
	}


	public void setStatus(StatusDePedidos status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<PedidoDeItem> getItems() {
		return items;
	}
	
	public void adicionarItems(PedidoDeItem item) {
		items.add(item);
	}
	
	public void removerItems(PedidoDeItem item) {
		items.add(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(PedidoDeItem it : items) {
			soma = soma + it.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (PedidoDeItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
