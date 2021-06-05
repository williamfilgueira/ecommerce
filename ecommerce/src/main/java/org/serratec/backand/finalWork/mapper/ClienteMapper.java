package org.serratec.backand.finalWork.mapper;

import org.serratec.backand.finalWork.DTO.ClienteDto;
import org.serratec.backand.finalWork.models.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

	public ClienteEntity toEntity(ClienteDto dto) {
		ClienteEntity entity = new ClienteEntity();
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setDataNascimento(dto.getDataNascimento());
		entity.setEmail(dto.getEmail());
		entity.setEnderocoId(dto.getEnderecoId());
		entity.setTelefone(dto.getTelefone());
		entity.setSenha(dto.getSenha());
		return entity;
	}
	
	public ClienteDto toDto(ClienteEntity cliente) {
		ClienteDto dto = new ClienteDto();
		dto.setNome(cliente.getNome());
		dto.setCpf(cliente.getCpf());
		dto.setDataNascimento(cliente.getDataNascimento());
		dto.setEmail(cliente.getEmail());
		dto.setEnderecoId(cliente.getEnderocoId());
		dto.setTelefone(cliente.getTelefone());
		dto.setSenha(cliente.getSenha());
		return dto;
	}
	
	
}
