package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private Date data;
	private StatusPedido status;
	private List<ItemDoPedido> itemsDoPedido = new ArrayList<>();
	
	public Pedido() {
		
	}
	
	public Pedido(Date data, StatusPedido status) {
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
	
	public List<ItemDoPedido> getItemsDoPedido(){
		return itemsDoPedido;
	}
	
	public void addItemsDoPedido(ItemDoPedido items) {
		itemsDoPedido.add(items);
	}
	
	public void removeItemsDoPedido(ItemDoPedido items) {
		itemsDoPedido.remove(items);
	}
	
	
	
}
