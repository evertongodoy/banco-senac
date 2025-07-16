package sp.senac.banco.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sp.senac.banco.controller.request.UsuarioPatchRequest;
import sp.senac.banco.controller.request.UsuarioRequst;
import sp.senac.banco.controller.response.ControllerResponse;
import sp.senac.banco.controller.response.UsuarioResponse;
import sp.senac.banco.controller.response.UsuariosResponse;
import sp.senac.banco.dto.UsuarioDTO;
import sp.senac.banco.mapper.UsuarioMapper;
import sp.senac.banco.usecase.usuario.UsuarioUsecase;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/banco-usuario")
// @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BancoUsuarioController {

    private final UsuarioUsecase usuarioUsecase;

    public BancoUsuarioController(UsuarioUsecase usuarioUsecase) {
        this.usuarioUsecase = usuarioUsecase;
    }

    @PostMapping("/criar-usuario")
    public ResponseEntity<ControllerResponse<UsuarioResponse>> criarUsuario(@Valid @RequestBody UsuarioRequst request) {
        var dto = UsuarioMapper.INSTANCE.toDTO(request);
        var usuarioDto = usuarioUsecase.salvarUsuario(dto);
        var response = UsuarioMapper.INSTANCE.toResponse(usuarioDto);
        return ResponseEntity.ok()
                .body(new ControllerResponse<>("usuario cadastrado com sucesso",
                        List.of(response),
                        LocalDateTime.now().toString()));
    }

    @PutMapping("/alterar-usuario/usuario/{id}")
    public ResponseEntity<ControllerResponse<UsuarioResponse>> alterarAtributosUsuario(@PathVariable Long id,
                                                                   @Valid @RequestBody UsuarioRequst request) {
        var usuarioDTO = UsuarioMapper.INSTANCE.toDTO(request).setId(id);
        var response = UsuarioMapper.INSTANCE.toResponse(usuarioUsecase.salvarUsuario(usuarioDTO));
        return ResponseEntity.ok()
                .body(new ControllerResponse<>("usuario alterado com sucesso",
                        List.of(response),
                        LocalDateTime.now().toString()));
    }

    @PatchMapping("/alterar-usuario/usuario/{id}")
    public ResponseEntity<ControllerResponse<UsuarioResponse>> alterarAtributoUsuario(@PathVariable Long id,
                                                                                      @RequestBody UsuarioPatchRequest request) {
        var usuarioDTO = UsuarioMapper.INSTANCE.toDTO(request).setId(id);
        var response = UsuarioMapper.INSTANCE.toResponse(usuarioUsecase.salvarUsuario(usuarioDTO));
        return ResponseEntity.ok()
                .body(new ControllerResponse<>("usuario alterado com sucesso",
                        List.of(response),
                        LocalDateTime.now().toString()));
    }

    @GetMapping("/buscar-usuario/usuario")
    public ResponseEntity<ControllerResponse<List<UsuarioResponse>>> buscarUsuario(@RequestParam(required = false) Long id) {
        var usuarios = usuarioUsecase.buscarUsuarios(id);
        var response = UsuarioMapper.INSTANCE.toResponseList(usuarios);
        return ResponseEntity.ok()
                .body(new ControllerResponse<>(response.isEmpty() ? "Nenhum usuario encontrado" : "Busca retornou dados",
                        List.of(response),
                        LocalDateTime.now().toString()));
    }

}