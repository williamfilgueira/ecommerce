package org.serratec.backand.finalWork.DTO;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.serratec.backand.finalWork.models.EnderecoEntity;

import com.sun.istack.NotNull;

public class FuncionarioDto {

	
	@NotNull
	@Size(min = 10, max = 150)
	private String nome;

	@NotNull
	@Size(min = 10, max = 150)
	private LocalDate dataNascimento;

	@NotNull
	@Size(min = 10, max = 150)
	private String email;

	@NotNull
	@Size(min = 10, max = 150)
	private String username;

	@NotNull
	@Size(min = 10, max = 150)
	private String senha;

	@NotNull
	@Size(min = 10, max = 150)
	private String cpf;

	@NotNull
	@Size(min = 11, max = 15)
	private String telefone;


	@NotNull
	@Size(min = 10, max = 150)
	private EnderecoEntity enderocoId;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EnderecoEntity getEnderocoId() {
		return enderocoId;
	}

	public void setEnderocoId(EnderecoEntity enderocoId) {
		this.enderocoId = enderocoId;
	}
	
	
	
}
