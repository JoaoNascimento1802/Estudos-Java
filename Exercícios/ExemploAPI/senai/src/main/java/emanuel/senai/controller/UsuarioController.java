package emanuel.senai.controller;

import emanuel.senai.Model.UsuarioModel;
import emanuel.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")

public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    public List<UsuarioModel> listarUsuarios() {
        List<UsuarioModel> lista = usuarioRepository.findAll();
        return lista;
    }

    @PostMapping
    public void salvarUsuario(@RequestBody UsuarioDTO dados) {
        UsuarioModel userdata = new UsuarioModel(dados);
        usuarioRepository.save(userdata);
    }
}