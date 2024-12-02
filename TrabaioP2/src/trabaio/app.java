package trabaio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<tutor> tutores = new ArrayList<>();
        List<pet> pets = new ArrayList<>();
        List<veterinario> veterinarios = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite os dados do tutor " + (i + 1));

            System.out.print("Nome do tutor: ");
            String nomeTutor = input.nextLine();

            System.out.print("Data de registro do tutor: ");
            String dataRegistroTutor = input.nextLine();

            System.out.print("ID do tutor: ");
            int idTutor = input.nextInt();

            System.out.print("Idade do tutor: ");
            int idadeTutor = input.nextInt();
            input.nextLine();

            System.out.print("Nome do pet do tutor: ");
            String nomePetTutor = input.nextLine();

            System.out.print("Telefone do tutor: ");
            String telefoneTutor = input.nextLine();

            System.out.print("CPF do tutor: ");
            String cpfTutor = input.nextLine();

            System.out.print("Endereço do tutor: ");
            String enderecoTutor = input.nextLine();

            tutor t = new tutor(nomeTutor, dataRegistroTutor, idTutor, idadeTutor, nomePetTutor, telefoneTutor, cpfTutor, enderecoTutor);
            tutores.add(t);

            System.out.println("Digite os dados do pet" + (i + 1));

            System.out.print("Nome do pet: ");
            String nomePet = input.nextLine();

            System.out.print("Data de registro do pet: ");
            String dataRegistroPet = input.nextLine();

            System.out.print("ID do pet: ");
            int idPet = input.nextInt();

            System.out.print("Idade do pet: ");
            int idadePet = input.nextInt();
            input.nextLine();

            System.out.print("Raça do pet: ");
            String racaPet = input.nextLine();

            System.out.print("Sexo do pet: ");
            String sexoPet = input.nextLine();

            System.out.print("Dieta do pet: ");
            String dietaPet = input.nextLine();

            System.out.print("Nome do dono do pet: ");
            String nomeDonoPet = input.nextLine();

            System.out.print("Peso do pet: ");
            float pesoPet = input.nextFloat();

            System.out.print("Altura do pet: ");
            float alturaPet = input.nextFloat();
            input.nextLine();

            pet p = new pet(nomePet, dataRegistroPet, idPet, idadePet, racaPet, sexoPet, dietaPet, nomeDonoPet, pesoPet, alturaPet, t);
            pets.add(p);

            System.out.println("Digite os dados do veterinário" + (i + 1));

            System.out.print("Nome do veterinário: ");
            String nomeVet = input.nextLine();

            System.out.print("Especialidade do veterinário: ");
            String especialidade = input.nextLine();

            System.out.print("Qualificação do veterinário: ");
            String qualificacao = input.nextLine();

            System.out.print("CPF do veterinário: ");
            String cpfVet = input.nextLine();

            veterinario vet = new veterinario(nomeVet, especialidade, qualificacao, cpfVet);
            veterinarios.add(vet);

            vet.atenderPet(p);
        }

        for (tutor t : tutores) {
            System.out.println("\nTutor: " + t.getNome());
            System.out.println("Nome do Pet: " + t.getNomeDoPet());
        }

        for (pet p : pets) {
            p.exibirInformacoes();
        }

        for (veterinario vet : veterinarios) {
            System.out.println("\nVeterinário: " + vet.getNome());
            for (pet p : vet.petsAtendidos) {
                p.exibirInformacoes();
            }
        }

        input.close();
    }
}