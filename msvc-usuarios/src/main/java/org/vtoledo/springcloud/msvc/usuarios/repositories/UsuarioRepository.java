package org.vtoledo.springcloud.msvc.usuarios.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vtoledo.springcloud.msvc.usuarios.models.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
}
