package org.serratec.backand.finalWork.DTO;

import java.time.LocalDate;
import java.util.List;

import org.serratec.backand.finalWork.models.ClienteEntity;
import org.serratec.backand.finalWork.models.ProdutoEntity;

import com.sun.istack.NotNull;

public class PedidoDto {

	
	private List<ProdutoEntity> produtosPedido;
	
	@NotNull
	private Double valorTotal;
	
	@NotNull
	private LocalDate dataPedido;
	
	@NotNull
	private String status;
	
	@NotNull
	private ClienteEntity clienteId;
	
	
	public List<ProdutoEntity> getProdutosPedido() {
		return produtosPedido;
	}
	public void setProdutosPedido(List<ProdutoEntity> produtosPedido) {
		this.produtosPedido = produtosPedido;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ClienteEntity getClienteId() {
		return clienteId;
	}
	public void setClienteId(ClienteEntity clienteId) {
		this.clienteId = clienteId;
	}
	
	
	
	
}
