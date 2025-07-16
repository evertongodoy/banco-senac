package sp.senac.banco.dto;

import java.util.List;

public class UsuariosDTO {

    private List<UsuarioDTO> usuarios;

    public List<UsuarioDTO> getUsuarios() {
        return usuarios;
    }

    public UsuariosDTO setUsuarios(List<UsuarioDTO> usuarios) {
        this.usuarios = usuarios;
        return this;
    }

}