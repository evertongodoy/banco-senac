package sp.senac.banco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sp.senac.banco.controller.response.ContaResponse;
import sp.senac.banco.controller.response.ContasResponse;

@RequestMapping("/banco-conta")
public class BancoContaController {

    @PostMapping("/criar-conta/usuario/{idUsuario}")
    public ResponseEntity<ContaResponse> criarConta(@PathVariable Long idUsuario) {

        return ResponseEntity.ok().body(new ContaResponse());
    }

    @GetMapping("/buscar-conta/conta/{id}")
    public ResponseEntity<ContaResponse> buscarConta(@PathVariable Long id) {

        return ResponseEntity.ok().body(new ContaResponse());
    }

    @GetMapping("/listar-contas")
    public ResponseEntity<ContasResponse> listarContas() {

        return ResponseEntity.ok().body(new ContasResponse());
    }

}
