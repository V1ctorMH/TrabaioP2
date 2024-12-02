package trabaio;

public class mae {
    private String nome;
    private String data_registro;
    private Integer id;
    private Integer idade;

    public mae(String nome, String data_registro, Integer id, Integer idade) {
        this.nome = nome;
        this.data_registro = data_registro;
        this.id = id;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data_registro;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data_registro) {
        this.data_registro = data_registro;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}