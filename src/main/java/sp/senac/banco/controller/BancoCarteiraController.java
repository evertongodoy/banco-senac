package sp.senac.banco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sp.senac.banco.controller.response.CarteiraResponse;
import sp.senac.banco.controller.response.CarteirasResponse;

import java.math.BigDecimal;

@RequestMapping("/banco-carteira")
public class BancoCarteiraController {

    @PostMapping("/criar-carteira/conta/{idConta}")
    public ResponseEntity<CarteiraResponse> criarCarteira(@PathVariable Long idConta,
                                                          @RequestParam(required = false) BigDecimal saldo) {

        return ResponseEntity.ok().body(new CarteiraResponse());
    }

    @GetMapping("/buscar-carteira/carteira/{id}")
    public ResponseEntity<CarteiraResponse> buscarCarteira(@PathVariable Long id) {

        return ResponseEntity.ok().body(new CarteiraResponse());
    }

    @GetMapping("/listar-carteiras")
    public ResponseEntity<CarteirasResponse> listarCarteiras() {

        return ResponseEntity.ok().body(new CarteirasResponse());
    }

}