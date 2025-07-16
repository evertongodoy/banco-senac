package sp.senac.banco.controller.response;

import java.util.List;

public class CarteirasResponse {

    private List<CarteiraResponse> carteiras;

    public List<CarteiraResponse> getCarteiras() {
        return carteiras;
    }

    public CarteirasResponse setCarteiras(List<CarteiraResponse> carteiras) {
        this.carteiras = carteiras;
        return this;
    }

}