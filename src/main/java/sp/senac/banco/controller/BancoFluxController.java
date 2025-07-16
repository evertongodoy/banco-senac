package sp.senac.banco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sp.senac.banco.controller.response.FluxResponse;
import sp.senac.banco.controller.response.FluxesResponse;

@RestController
@RequestMapping("/banco-flux")
public class BancoFluxController {

    @PostMapping("/criar-flux/usuario/{idUsuario}")
    public ResponseEntity<FluxResponse> criarFlux(@PathVariable Long idUsuario) {

        return ResponseEntity.ok().body(new FluxResponse());
    }

    @GetMapping("/buscar-flux/flux/{id}")
    public ResponseEntity<FluxResponse> buscarFlux(@PathVariable Long id) {

        return ResponseEntity.ok().body(new FluxResponse());
    }

    @GetMapping("/listar-flux")
    public ResponseEntity<FluxesResponse> listarFlux() {

        return ResponseEntity.ok().body(new FluxesResponse());
    }

}
