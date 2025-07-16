package sp.senac.banco.controller.response;

import java.time.LocalDate;

public class ContaResponse {

    private Long id;
    private Long idUsuario;
    private Long numeroConta;
    private LocalDate dataAbertura;

    public Long getId() {
        return id;
    }

    public ContaResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public ContaResponse setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public ContaResponse setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public ContaResponse setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

}