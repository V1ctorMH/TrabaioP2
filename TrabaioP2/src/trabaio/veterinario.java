package trabaio;

import java.util.ArrayList;
import java.util.List;

//classe ligada a pet por associação
//a classe pet se faz participativa na criação da classe veterinario mas não se faz essencial. Pode-se instanciar um veterinario sem um pet 

public class veterinario {
    private String nome;
    private String especialidade;
    private String qualificacao;
    private String cpf;
    List<pet> petsAtendidos;

    public veterinario(String nome, String especialidade, String qualificacao, String cpf){
        this.nome = nome;
        this.especialidade = especialidade;
        this.qualificacao = qualificacao;
        this.cpf = cpf;
        this.petsAtendidos = new ArrayList<>();
    }

    public void atenderPet(pet pet) {
        petsAtendidos.add(pet); 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getQualificacao() {
        return this.qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Veterinário: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CPF: " + cpf);
        System.out.println("Pets atendidos:");
        for (pet pet : petsAtendidos) {
            pet.exibirInformacoes();
        }
        System.out.println();
    }
}