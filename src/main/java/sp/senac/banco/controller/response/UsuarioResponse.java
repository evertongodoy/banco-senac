package sp.senac.banco.controller.response;

public class UsuarioResponse {

    private Long id;
    private String nome;
    private String documento;
    private String dataNascimento;
    private String dataCadastro;

    public Long getId() {
        return id;
    }

    public UsuarioResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public UsuarioResponse setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public UsuarioResponse setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public UsuarioResponse setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public UsuarioResponse setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

}