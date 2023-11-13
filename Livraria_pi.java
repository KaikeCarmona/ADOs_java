package livraria_pi;

import java.util.Scanner;

import java.util.Arrays;

public class Livraria_pi {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int posicaoUsuario = 0;

        String loginUsuario = "";
        String loginSenha = "";

        String novoUsuario = "";
        String novaSenha = "";

        String[] usuarios = new String[8000];
        String[] senhas = new String[8000];

        boolean loop = true;
        int opcao = 0;

        while (loop) {

            System.out.println(
                    "\n==============================! MENU PRINCIPAL !===============================\n 1 - LOGIN\n 2 - CADASTRAR\n 3 - SAIR");

            System.out.printf(" ESCOLHA: ");
            try {
                opcao = teclado.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Opção inválida. Digite um número inteiro.");
                teclado.next(); // Limpar o buffer do scanner
                continue; // Volta ao início do loop
            }

            switch (opcao) {

                case 1:

                    System.out.println("Digite o nome do usuario:");

                    loginUsuario = teclado.next();

                    System.out.println("Digite a senha do usuario");

                    loginSenha = teclado.next();

                    int indexUsuario = Arrays.asList(usuarios).indexOf(loginUsuario);

                    if (indexUsuario != -1 && senhas[indexUsuario].equals(loginSenha)) {
                        System.out.println("Login bem-sucedido!");
                        System.out.println("usuario: " + indexUsuario);

                    } else {
                        System.out.println("Usuário ou senha incorretos");
                    }

                    break;

                case 2:

                    System.out.print("\n==========! Cadastro de usuario !==========");

                    System.out.print("\nDigite o nome do usiario: ");

                    novoUsuario = teclado.next();

                    System.out.print("\nDigite a senha do usiario: ");

                    novaSenha = teclado.next();

                    usuarios[posicaoUsuario] = novoUsuario;
                    senhas[posicaoUsuario] = novaSenha;

                    posicaoUsuario++;

                    System.out.println("Usuario Cadastrado com sucesso!!!");

                    break;

                case 3:

                    System.out.print("Saindo...");

                    loop = false;

                    break;

                default:

                    System.out.print("opcao invalida");

                    break;

            }

        }

    }

}
