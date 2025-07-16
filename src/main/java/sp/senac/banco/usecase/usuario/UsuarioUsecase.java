package sp.senac.banco.usecase.usuario;

import sp.senac.banco.controller.request.UsuarioRequst;
import sp.senac.banco.dto.UsuarioDTO;
import sp.senac.banco.dto.UsuariosDTO;

import java.util.List;

public interface UsuarioUsecase {

    UsuarioDTO salvarUsuario(UsuarioDTO usuario);
    List<UsuarioDTO> buscarUsuarios(Long id);


}
