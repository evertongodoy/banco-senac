package sp.senac.banco;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sp.senac.banco.database.entities.UsuarioEntity;
import sp.senac.banco.dto.UsuarioDTO;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioEntity toEntity(UsuarioDTO usuarioDTO);
}
