package sp.senac.banco.controller.response;

import java.util.List;

public class Contas {

    private List<ContaResponse> contas;

    public List<ContaResponse> getContas() {
        return contas;
    }

    public Contas setContas(List<ContaResponse> contas) {
        this.contas = contas;
        return this;
    }

}