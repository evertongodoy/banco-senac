package sp.senac.banco.controller.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CarteiraResponse {

    private Long id;
    private Long idConta;
    private BigDecimal saldo;
    private LocalDate ultimoLancamento;

    public Long getId() {
        return id;
    }

    public CarteiraResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getIdConta() {
        return idConta;
    }

    public CarteiraResponse setIdConta(Long idConta) {
        this.idConta = idConta;
        return this;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public CarteiraResponse setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
        return this;
    }

    public LocalDate getUltimoLancamento() {
        return ultimoLancamento;
    }

    public CarteiraResponse setUltimoLancamento(LocalDate ultimoLancamento) {
        this.ultimoLancamento = ultimoLancamento;
        return this;
    }
}
