package sp.senac.banco.controller.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExtratoResponse {

    private Long id;
    private Long idConta;
    private BigDecimal valor;
    private LocalDate dataLancamento;

    public Long getId() {
        return id;
    }

    public ExtratoResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdConta() {
        return idConta;
    }

    public ExtratoResponse setIdConta(Long idConta) {
        this.idConta = idConta;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public ExtratoResponse setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public ExtratoResponse setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

}