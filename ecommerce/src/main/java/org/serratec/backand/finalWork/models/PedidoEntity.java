package org.serratec.backand.finalWork.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoEntity {

	@Id // gerando id e passando sua criação automaticamente pelo BDD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nPedido;
	
	private List<ProdutoEntity> produtosPedido;
	
	private Double valorTotal;
	
	private LocalDate dataPedido;
	
	private String status;
	
	private ClienteEntity clienteId;
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Integer getnPedido() {
		return nPedido;
	}

	public void setnPedido(Integer nPedido) {
		this.nPedido = nPedido;
	}

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
