package trabaio;

//classe ligada a pet por composição
//a classe pet necessita que exista uma variavel tutor instanciada para que o pet seja instanciado

public class tutor extends mae {
    private String nome_do_pet; 
    private String telefone;    
    private String cpf;         
    private String endereco; 

    public tutor(String nome, String data_registro, Integer id, Integer idade, String nome_do_pet, String telefone, String cpf, String endereco) {
        super(nome, data_registro, id, idade);
        this.nome_do_pet = nome_do_pet;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public void exibirInformacoesTutor() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Registro: " + getData());
        System.out.println("ID: " + getId());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nome do Pet: " + nome_do_pet);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println();
    }

    public String getNomeDoPet() {
        return nome_do_pet;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNomeDoPet(String nome_do_pet) {
        this.nome_do_pet = nome_do_pet;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}