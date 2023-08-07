package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	
	private Date data;
	private StatusPedido status;
	private List<ItemDoPedido> itemsDoPedido = new ArrayList<>();
	private Cliente cliente;
	
	public Pedido() {
		
	}
	
	public Pedido(Cliente cliente, Date data, StatusPedido status) {
		this.cliente = cliente;
		this.data = data;
		this.status = status;		
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemDoPedido> getItemsDoPedido(){
		return itemsDoPedido;
	}
	
	public void addItemsDoPedido(ItemDoPedido items) {
		itemsDoPedido.add(items);
	}
	
	public void removeItemsDoPedido(ItemDoPedido items) {
		itemsDoPedido.remove(items);
	}
	
	public Double total() {
		double sum = 0;
		for(ItemDoPedido pedido : itemsDoPedido) {
			sum += pedido.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(data) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Items do pedido:\n");
		for (ItemDoPedido item : itemsDoPedido) {
			sb.append(item + "\n");
		}
		sb.append("Valor total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

	
}
