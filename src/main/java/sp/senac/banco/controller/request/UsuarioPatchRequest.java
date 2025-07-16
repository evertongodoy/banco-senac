package sp.senac.banco.controller.request;

import java.time.LocalDate;

public class UsuarioPatchRequest {

    private String nome;
    private String documento;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public UsuarioPatchRequest setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public UsuarioPatchRequest setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public UsuarioPatchRequest setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

}