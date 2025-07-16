package sp.senac.banco.dto;

import java.time.LocalDate;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;

    public Long getId() {
        return id;
    }

    public UsuarioDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public UsuarioDTO setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public UsuarioDTO setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public UsuarioDTO setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public UsuarioDTO setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

}
