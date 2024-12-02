package trabaio;
//classe ligada a veterinario por associação 
//a classe pet se faz participativa na criação da classe veterinario mas não se faz essencial. Pode-se instanciar um veterinario sem um pet 
//classe ligada a tutor por composição
//a classe pet necessita que exista uma variavel tutor instanciada para que o pet seja instanciado
public class pet extends mae {
    private String sexo;
    private String dieta;
    private String nome_dono;
    private float peso;
    private float altura;
    private String raca;
    private tutor tutor;

    public pet(String nome, String data_registro, Integer id, Integer idade, String raca, String sexo, String dieta, String nome_dono, float peso, float altura, tutor tutor) {
        super(nome, data_registro, id, idade); 
        this.raca = raca;
        this.sexo = sexo;
        this.dieta = dieta;
        this.nome_dono = nome_dono;
        this.peso = peso;
        this.altura = altura;
        this.tutor = tutor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Registro: " + getData()); 
        System.out.println("ID: " + getId()); 
        System.out.println("Idade: " + getIdade()); 
        System.out.println("Raça: " + raca);
        System.out.println("Sexo: " + sexo);
        System.out.println("Dieta: " + dieta);
        System.out.println("Nome do Dono: " + nome_dono);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
        System.out.println();

        if (tutor != null) {
            System.out.println("Informações do Tutor:");
            tutor.exibirInformacoesTutor();
        }

        System.out.println();
    }
}