package sp.senac.banco.controller.response;

import java.util.List;

public class FluxesResponse {

    private List<FluxResponse> fluxes;

    public List<FluxResponse> getFluxes() {
        return fluxes;
    }

    public void setFluxes(List<FluxResponse> fluxes) {
        this.fluxes = fluxes;
    }

}