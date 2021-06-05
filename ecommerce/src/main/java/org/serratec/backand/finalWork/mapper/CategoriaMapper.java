package org.serratec.backand.finalWork.mapper;

import org.serratec.backand.finalWork.DTO.CategoriaDto;
import org.serratec.backand.finalWork.models.CategoriaEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapper {

	public CategoriaEntity toEntity(CategoriaDto dto) {
		CategoriaEntity entity = new CategoriaEntity();
		entity.setNome(dto.getNome());
		entity.setDescricao(dto.getDescricao());
		return entity;
	}
	
	public CategoriaDto toDto(CategoriaEntity categoria) {
		CategoriaDto dto = new CategoriaDto();
		dto.setNome(categoria.getNome());
		dto.setDescricao(categoria.getDescricao());
		return dto;
	}

}
