package sp.senac.banco.usecase.usuario.impl;

import org.springframework.stereotype.Service;
import sp.senac.banco.controller.request.UsuarioRequst;
import sp.senac.banco.database.entities.UsuarioEntity;
import sp.senac.banco.database.repository.UsuarioDBRepository;
import sp.senac.banco.dto.UsuarioDTO;
import sp.senac.banco.dto.UsuariosDTO;
import sp.senac.banco.mapper.UsuarioMapper;
import sp.senac.banco.usecase.usuario.UsuarioUsecase;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsuarioUsecaseImpl implements UsuarioUsecase {

    private final UsuarioDBRepository usuarioDBRepository;

    public UsuarioUsecaseImpl(UsuarioDBRepository usuarioDB) {
        this.usuarioDBRepository = usuarioDB;
    }

    @Override
    public UsuarioDTO salvarUsuario(UsuarioDTO dto) {
        if(Objects.isNull(dto.getId())) {
            dto.setDataCadastro(LocalDate.now());
            var entity = UsuarioMapper.INSTANCE.toEntity(dto);
            return UsuarioMapper.INSTANCE.toDTO(usuarioDBRepository.save(entity));
        }
        var entityOptional = usuarioDBRepository.findById(dto.getId());
        var usuarioEntity = entityOptional.orElseThrow(
                () -> new RuntimeException("Usuário não encontrado com o ID: " + dto.getId()));
        Optional.ofNullable(dto.getNome()).ifPresent(usuarioEntity::setNome);
        Optional.ofNullable(dto.getDataNascimento()).ifPresent(usuarioEntity::setDataNascimento);
        Optional.ofNullable(dto.getDocumento()).ifPresent(usuarioEntity::setDocumento);
        return UsuarioMapper.INSTANCE.toDTO(usuarioDBRepository.save(usuarioEntity));
    }

    @Override
    public List<UsuarioDTO> buscarUsuarios(Long id) {
        if(null == id) {
            List<UsuarioEntity> all = usuarioDBRepository.findAll();
            return UsuarioMapper.INSTANCE.toDTOList(all);
        }
        var usuario = usuarioDBRepository.findById(id);
        return usuario.map(
                usuarioEntity -> List.of(UsuarioMapper.INSTANCE.toDTO(usuarioEntity)))
                .orElse(List.of());
    }

}
