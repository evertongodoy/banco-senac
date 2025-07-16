package sp.senac.banco.controller.response;

import java.util.List;

public class ExtratosResponse {

    private List<ExtratoResponse> extratos;

    public List<ExtratoResponse> getExtratos() {
        return extratos;
    }

    public ExtratosResponse setExtratos(List<ExtratoResponse> extratos) {
        this.extratos = extratos;
        return this;
    }

}