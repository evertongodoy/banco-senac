package sp.senac.banco.controller.response;

import java.util.List;

public class ContasResponse {

    private List<ContaResponse> contas;

    public List<ContaResponse> getContas() {
        return contas;
    }

    public ContasResponse setContas(List<ContaResponse> contas) {
        this.contas = contas;
        return this;
    }

}