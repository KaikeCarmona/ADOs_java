package livraria_pi;

import java.util.Scanner;

public class login_sistem {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int posicaoUsuario = 0;

        String novoUsuario = "";
        String novaSenha = "";

        String[] usuarios = new String[10];
        String[] senhas = new String[5];

        boolean loop = true;

        int opcao = 0;

        while (loop) {
            System.out.println("\n==============================! MENU PRINCIPAL !===============================\n 1 - LOGIN\n 2 - CADASTRAR\n 3 - SAIR");
            System.out.printf(" ESCOLHA: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:

                    break;
                case 2:
                    System.out.print("\n==========! Cadastro de usuario !==========");

                    System.out.print("\nDigite o nome do usiario: ");
                    novoUsuario = teclado.next();
                    System.out.print("\nDigite a senha do usiario: ");
                    novaSenha = teclado.next();

                    usuarios[posicaoUsuario] = novoUsuario;
                    posicaoUsuario++;

                    for (int i = 0; i < usuarios.length; i++) {
                        if (usuarios[i] != null) {
                            System.out.print(usuarios[i] + " ");
                        }
                    }

                    System.out.print("\nUsuario Cadastrado com sucesso!!!");

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
