package sp.senac.banco.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sp.senac.banco.controller.request.UsuarioPatchRequest;
import sp.senac.banco.controller.request.UsuarioRequst;
import sp.senac.banco.controller.response.UsuarioResponse;
import sp.senac.banco.controller.response.UsuariosResponse;
import sp.senac.banco.database.entities.UsuarioEntity;
import sp.senac.banco.dto.UsuarioDTO;
import sp.senac.banco.dto.UsuariosDTO;

import java.util.List;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toDTO(UsuarioRequst request);
    UsuarioDTO toDTO(UsuarioPatchRequest request);
    UsuarioEntity toEntity(UsuarioDTO usuarioDTO);
    UsuarioDTO toDTO(UsuarioEntity usuarioEntity);
    UsuarioResponse toResponse(UsuarioDTO dto);
    List<UsuarioDTO> toDTOList(List<UsuarioEntity> entities);
    List<UsuarioResponse> toResponseList(List<UsuarioDTO> dtos);

//
//    List<UsuarioDTO> toListDTO(List<UsuarioEntity> entities);



}
