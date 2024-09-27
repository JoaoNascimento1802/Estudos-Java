package emanuel.senai.Model;

import emanuel.senai.controller.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import java.util.UUID;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private int cpf;
    private int telefone;

    public UsuarioModel() {
    }

    public UsuarioModel(UsuarioDTO dados) {
    }

    public void UserModel(UUID id, String nome, String email, int cpf , int telefone) {
        this.id = UUID.randomUUID();
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.email=email;
    }

    public void UserModel(UsuarioDTO dados) {
        this.id = UUID.randomUUID();
        this.nome=dados.nome();
        this.cpf= dados.cpf();
        this.telefone=dados.telefone();
        this.email= dados.email();
    }

    public void UsuarioModel(UsuarioDTO dados) {
        this.id=dados.id();
        this.nome=dados.nome();
        this.cpf=dados.cpf();
        this.telefone=dados.telefone();
        this.email=dados.email();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


}

