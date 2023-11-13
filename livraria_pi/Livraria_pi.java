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
                // Verificação se o usuario existe dentro do array USUARIOS
                case 1:

                    System.out.println("Digite o nome do usuario:");

                    loginUsuario = teclado.next();

                    System.out.println("Digite a senha do usuario");

                    loginSenha = teclado.next();

                    // Variavel responsavel por fazer a verificação se o LOGINUSUARIO existe dentro do array USUARIOS
                    int indexUsuario = Arrays.asList(usuarios).indexOf(loginUsuario);

                    // Se o usuario existir dentro do array usuarios e a senha digitada (passo como parametro do array senhas o indexUsuario para poder vincular o usuario a senha do mesmo)
                    //  existir dentro do array loginSenha o sistema efetuara o login do usuario, caso contrario retornara um erro
                    if (indexUsuario != -1 && senhas[indexUsuario].equals(loginSenha)) {
                        System.out.println("Login bem-sucedido!");
                    } else {
                        System.out.println("Usuário ou senha incorretos");
                    }

                    break;

                case 2:
                    // Inserção dos dados senha e usuario nos seus respectivos arrays

                    System.out.print("\n==========! Cadastro de usuario !==========");

                    System.out.print("\nDigite o nome do usiario: ");

                    novoUsuario = teclado.next();

                    System.out.print("\nDigite a senha do usiario: ");

                    novaSenha = teclado.next();

                    // a variavel posicaoUsuario tem a funcao de controlar a posicao dos dados inseridos, toda vez que eu inserir uma senha ou usuario, 
                    //ela recebera ela mesma + 1, dessa maneira os dados não se misturam e cada um recebe uma posicao
                    usuarios[posicaoUsuario] = novoUsuario;
                    senhas[posicaoUsuario] = novaSenha;

                    posicaoUsuario++;

                    System.out.println("Usuario Cadastrado com sucesso!!!");

                    break;

                case 3:
                    // Saida do loop
                    System.out.print("Saindo...");

                    loop = false;

                    break;

                default:
                    // Algum dado invalido foi inserido, então retorno esse erro
                    System.out.print("opcao invalida");

                    break;

            }

        }

    }

}
