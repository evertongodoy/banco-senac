package sp.senac.banco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sp.senac.banco.controller.response.ExtratoResponse;
import sp.senac.banco.controller.response.ExtratosResponse;

@RestController
@RequestMapping("/banco-extrato")
public class BancoExtratoController {

    @GetMapping("/listar-extratos/extrato/{idExtrato}")
    public ResponseEntity<ExtratoResponse> listarExtratos() {
        // Implementar a lógica para listar extratos
        return ResponseEntity.ok().body(new ExtratoResponse());
    }

    @GetMapping("/buscar-extratos")
    public ResponseEntity<ExtratosResponse> buscarExtratos() {
        return ResponseEntity.ok().body(new ExtratosResponse());
    }

}
