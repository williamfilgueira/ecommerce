package org.serratec.backand.finalWork.DTO;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class EnderecoDto {

	@NotNull
	@Size(min=8)
	private String cep;

	@NotNull
	private String bairro;
	
	@NotNull
	private String rua;
	
	@NotNull
	private String cidade;
	
	@NotNull
	private Integer numero;
	
	@NotNull
	private String complemento;
	
	@NotNull
	private String estado;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}





}
