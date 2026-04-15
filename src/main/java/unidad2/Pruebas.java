package unidad2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            if(usuario.equals("admin")) {
                if(pass.equals("pass123")) {
                    System.out.println("Autenticación exitosa");
                    break;
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            } else {
                System.out.println("Usuario no encontrado");
            }

            if(i == 3) {
                System.out.println("Acceso bloqueado. Numero máximo de intentos alcanzados.");
            }
        }
    }
}
