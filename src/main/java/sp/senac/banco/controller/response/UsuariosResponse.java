package sp.senac.banco.controller.response;

import java.util.List;

public class UsuariosResponse {

    private List<UsuarioResponse> usuarios;

    public List<UsuarioResponse> getUsuarios() {
        return usuarios;
    }

    public UsuariosResponse setUsuarios(List<UsuarioResponse> usuarios) {
        this.usuarios = usuarios;
        return this;
    }

}