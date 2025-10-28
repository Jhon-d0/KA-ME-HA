package com.jhon.cadastro_usuario.controller;


import com.jhon.cadastro_usuario.business.UsuarioService;
import com.jhon.cadastro_usuario.infastructure.entetes.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    public final UsuarioService usuarioService;

    @GetMapping
    public Usuario buscarUsuarioPorEmail(@RequestParam String email){
        return usuarioService.buscarUsuarioPorEmail(email);
    }

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvar(usuario);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuario(@RequestBody Usuario usuario, @RequestParam String email){
        usuarioService.atualizarUsuario(usuario, email);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestParam Integer id){
        usuarioService.deletarUsuario(id);

        return ResponseEntity.ok().build();
    }

}
