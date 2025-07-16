package sp.senac.banco.database.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String documento;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    public Long getId() {
        return id;
    }

    public UsuarioEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public UsuarioEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public UsuarioEntity setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public UsuarioEntity setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public UsuarioEntity setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

}