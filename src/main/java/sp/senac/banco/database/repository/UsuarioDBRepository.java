package sp.senac.banco.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.senac.banco.database.entities.UsuarioEntity;

public interface UsuarioDBRepository extends JpaRepository<UsuarioEntity, Long> {

}
