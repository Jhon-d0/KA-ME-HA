package com.jhon.cadastro_usuario.infastructure.repository;


import com.jhon.cadastro_usuario.infastructure.entetes.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    Optional<Usuario> findByemail(String email);
}
