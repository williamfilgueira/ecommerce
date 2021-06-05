package org.serratec.backand.finalWork.DTO;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class CategoriaDto {

	@NotNull
	@Size(min = 5, max = 50)
	private String nome;

	@NotNull
	@Size(min = 5, max = 100)
	private String descricao;

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
