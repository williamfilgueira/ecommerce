package org.serratec.backand.finalWork.mapper;

import org.serratec.backand.finalWork.DTO.ProdutoDto;
import org.serratec.backand.finalWork.models.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

	public ProdutoEntity toEntity(ProdutoDto dto) {
		ProdutoEntity entity = new ProdutoEntity();
		entity.setNome(dto.getNome());
		entity.setPreco(dto.getPreco());
		entity.setDescricao(dto.getDescricao());
		entity.setDate(dto.getDateCadastro());
		return entity;
	}
	
	public ProdutoDto toDto(ProdutoEntity produto) {
		ProdutoDto dto = new ProdutoDto();
		dto.setNome(produto.getNome());
		dto.setPreco(dto.getPreco());
		dto.setDescricao(produto.getDescricao());
		dto.setDateCadastro(dto.getDateCadastro());
		return dto;
	}
	
}
