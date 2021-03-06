package org.serratec.backand.finalWork.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CategoriaEntity {

	@Id // gerando id e passando sua criação automaticamente pelo BDD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(mappedBy = "categoriaId")
	private Long Id;

	private String nome;
	
	private String descricao;
	
	
//	GET AND SETS
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

	
}
