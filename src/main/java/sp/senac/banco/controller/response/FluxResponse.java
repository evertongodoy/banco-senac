package sp.senac.banco.controller.response;

import java.time.LocalDate;

public class FluxResponse {

    private Long id;
    private Long idUsuario;
    private String chaveFlux;
    private LocalDate dataCadastro;

    public Long getId() {
        return id;
    }

    public FluxResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public FluxResponse setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getChaveFlux() {
        return chaveFlux;
    }

    public FluxResponse setChaveFlux(String chaveFlux) {
        this.chaveFlux = chaveFlux;
        return this;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public FluxResponse setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

}