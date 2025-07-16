package sp.senac.banco.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UsuarioRequst {

    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    @NotNull(message = "O nome não pode ser nulo")
    @NotBlank(message = "O nome não pode ser vazio")
    private String nome;
    @Size(min = 11, max = 14, message = "O documento deve ter entre 11 e 14 caracteres")
    @NotNull(message = "O documento não pode ser nulo")
    @NotBlank(message = "O documento não pode ser vazio")
    private String documento;
    @NotNull(message = "A data de nascimento não pode ser nula")
    @Past(message = "A data de nascimento deve ser uma data passada")
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public UsuarioRequst setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public UsuarioRequst setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public UsuarioRequst setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

}