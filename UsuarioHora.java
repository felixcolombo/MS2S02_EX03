package M2S02_EX03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UsuarioHora {
    void olaUsuario() {

        String nome;
        String sobrenome;
        String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite seu Sobrenome: ");
        sobrenome = keyboard.nextLine();

        System.out.println("Digite seu Nome: ");
        nome = keyboard.nextLine();

        System.out.println(
                "Seu nome completo: " + nome + " " + sobrenome + "! No momento são: " + hora + "!");
    }
}
