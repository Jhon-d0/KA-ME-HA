package com.jhon.cadastro_usuario.business;


import com.jhon.cadastro_usuario.infastructure.entetes.Usuario;
import com.jhon.cadastro_usuario.infastructure.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorEmail(String email){
        return usuarioRepository.findByemail(email).orElseThrow(() -> {
            throw new RuntimeException("Usuario não encontrado");
        });
    }

    public Usuario salvar(Usuario usuario){
        if (usuarioRepository.findByemail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Usuario Já Cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario, String email){
        Usuario usuarioEntety = buscarUsuarioPorEmail(email);
        Usuario usuarioAtualizado = Usuario.builder()
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntety.getNome())
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntety.getEmail())
                .id(usuarioEntety.getId())
                .build();


        return usuarioRepository.save(usuarioAtualizado);
    }

    public void deletarUsuario(Integer id){
        if (!usuarioRepository.findById(id).isPresent()){
            throw new RuntimeException("Usuario ja não existia");
        }

        usuarioRepository.deleteById(id);
    }

}
