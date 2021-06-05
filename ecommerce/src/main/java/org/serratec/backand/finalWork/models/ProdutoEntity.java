package org.serratec.backand.finalWork.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class ProdutoEntity {

	@Id // gerando id e passando sua criação automaticamente pelo BDD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private String nome;

	private String descricao;

	private Double preco;

	private Integer qtdEstoque;

	private LocalDate dateCadastro;

//	private Byte imagem;

//	@ManyToOne
//@JoinColumn(name = "categoria_id", referencedColumnName = "id")
	private CategoriaEntity categoriaId;
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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

	public Integer getQtd_estoque() {
		return qtdEstoque;
	}

	public void setQtd_estoque(Integer qtd_estoque) {
		this.qtdEstoque = qtd_estoque;
	}

	public LocalDate getDate() {
		return dateCadastro;
	}

	public void setDate(LocalDate date) {
		this.dateCadastro = date;
	}

//	public Byte getImagem() {
//		return imagem;
//	}
//
//	public void setImagem(Byte imagem) {
//		this.imagem = imagem;
//	}

	public CategoriaEntity getCategoria() {
		return categoriaId;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoriaId = categoria;
	}

}
