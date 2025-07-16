package sp.senac.banco.controller.response;

import java.util.List;

public class Usuarios {

    private List<UsuarioResponse> usuarios;

    public List<UsuarioResponse> getUsuarios() {
        return usuarios;
    }

    public Usuarios setUsuarios(List<UsuarioResponse> usuarios) {
        this.usuarios = usuarios;
        return this;
    }

}