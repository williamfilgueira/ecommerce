package org.serratec.backand.finalWork.mapper;

import org.serratec.backand.finalWork.DTO.FuncionarioDto;
import org.serratec.backand.finalWork.models.FuncionarioEntity;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioMapper {

	
	public FuncionarioEntity toEntity(FuncionarioDto dto) {
		FuncionarioEntity entity = new FuncionarioEntity();
		entity.setEmail(dto.getEmail());
		entity.setUsername(dto.getUsername());
		entity.setSenha(dto.getSenha());
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setTelefone(dto.getTelefone());
		entity.setEnderocoId(dto.getEnderocoId());
		entity.setDataNascimento(dto.getDataNascimento());
		return entity;
	}
	
	public FuncionarioDto toDto(FuncionarioEntity cliente) {
		FuncionarioDto dto = new FuncionarioDto();
		dto.setNome(cliente.getNome());
		dto.setUsername(cliente.getUsername());
		dto.setDataNascimento(cliente.getDataNascimento());
		dto.setEmail(cliente.getEmail());
		dto.setEnderocoId(cliente.getEnderocoId());
		dto.setSenha(cliente.getSenha());
		dto.setTelefone(cliente.getTelefone());
		dto.setCpf(cliente.getCpf());
		return dto;
	}
	
	
}
