package br.org.serratec.backend.ecommerce.service.mapper;

import br.org.serratec.backend.ecommerce.model.Cliente;
import br.org.serratec.backend.ecommerce.model.dto.ClienteDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring"/*, uses = EnderecoMapper.class */)
@Component
public interface ClienteMapper {
  ClienteDTO toDTO(Cliente cliente);
  Cliente toEntity(ClienteDTO clienteDTO);
}
