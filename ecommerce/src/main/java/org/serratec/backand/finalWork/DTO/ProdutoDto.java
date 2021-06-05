package org.serratec.backand.finalWork.DTO;

import java.time.LocalDate;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class ProdutoDto {

	@NotNull
	@Size(min = 5, max = 50)
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String descricao;
	
	@NotNull
	private Double preco;
	
	@NotNull
	private Integer qtdEstoque;
	
	@Past
	private LocalDate dateCadastro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public LocalDate getDateCadastro() {
		return dateCadastro;
	}

	public void setDateCadastro(LocalDate dateCadastro) {
		this.dateCadastro = dateCadastro;
	}
	
	
	
}
