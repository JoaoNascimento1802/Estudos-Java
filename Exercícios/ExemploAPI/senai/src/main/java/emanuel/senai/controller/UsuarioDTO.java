package emanuel.senai.controller;

import emanuel.senai.Model.UsuarioModel;

import java.util.UUID;

public record UsuarioDTO(UUID id, String nome, String email, int cpf , int telefone) {

    public UsuarioDTO(UsuarioModel usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getCpf(), usuario.getTelefone());
    }
    }


