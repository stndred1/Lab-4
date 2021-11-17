import java.util.*;
public class Simulator {
    int x, y, z, volume;
    CarS s; 
    CarA a;
    CarC c;
    Scanner sc = new Scanner(System.in);
    public void simi(){
        System.out.println("Bienvenido, Que carro deseas tratar?\n");
        System.out.println("1. Carro clase A\n");
        System.out.println("2. Carro clase C\n");
        System.out.println("3. Carro clase S\n");
        System.out.println("4. salir del programa\n");
        x = sc.nextInt();
        if (x == 1){
            a = new CarA();
            volume = 15;
            System.out.println("Deseas tratar el radio?\n");
            System.out.println("1. Si\n2. No\n");
            y = sc.nextInt();
            if (y == 1){
                System.out.println("Que deseas hacer?");
                System.out.println("1. Radio\n");
                System.out.println("2. Reproduccion\n");
                System.out.println("3. telefono\n");
                System.out.println("4. Productividad\n");
                z = sc.nextInt();
                if (z == 1){
                    a.radio();
                }
                else if (z == 2){
                    a.media();
                }
                else if (z == 3){
                    a.phone();
                }
                else if (z == 4){
                    a.productivity();
                }
            }
            else if (y == 2){
                simi();
            }
        }
        else if (x == 2){
            c = new CarC();
            volume = 15;
            System.out.println("Deseas tratar el radio?\n");
            System.out.println("1. Si\n2. No\n");
            y = sc.nextInt();
            if (y == 1){
                System.out.println("Que deseas hacer?");
                System.out.println("1. Radio\n");
                System.out.println("2. Reproduccion\n");
                System.out.println("3. telefono\n");
                System.out.println("4. Productividad\n");
                z = sc.nextInt();
                if (z == 1){
                    c.radio();
                }
                else if (z == 2){
                    c.media();
                }
                else if (z == 3){
                    c.phone();
                }
                else if (z == 4){
                    c.productivity();
                }
            }
            else if (y == 2){
                simi();
            }
        }
        else if (x == 3){
            s = new CarS();
            volume = 15;
            System.out.println("Deseas tratar el radio?\n");
            System.out.println("1. Si\n2. No\n");
            y = sc.nextInt();
            if (y == 1){
                System.out.println("Que deseas hacer?");
                System.out.println("1. Radio\n");
                System.out.println("2. Reproduccion\n");
                System.out.println("3. telefono\n");
                System.out.println("4. Productividad\n");
                z = sc.nextInt();
                if (z == 1){
                    s.radio();
                }
                else if (z == 2){
                    s.media();
                }
                else if (z == 3){
                    s.phone();
                }
                else if (z == 4){
                    s.productivity();
                }
            }
            else if (y == 2){
                simi();
            }
        }
        else if (x == 4){
            System.out.println("Gracias, nos veremos pronto.\n");
            System.exit(0);
        }
    }
} 
