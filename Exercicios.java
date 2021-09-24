import java.util.Scanner;

public class Exercicios{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite o número conforme a descrição abaixo:");
        System.out.println("1 para somar");
        System.out.println("2 para dividir");
        System.out.println("3 para verificar triangulo");
        System.out.println("4 para verificar idade");
        System.out.println("5 para sinaleira");
        System.out.println("6 para acha maior");
    
        int option = read.nextInt();
        
        
        switch(option){
            case 1:
                System.out.println("Digite um número: ");
                int sum1 = read.nextInt();
                System.out.println("Digite outro número: ");
                int sum2 = read.nextInt();
                int res = sum1 + sum2;
                if(res > 0)
                    System.out.printf("%d + %d é igual a %d %n", sum1, sum2, res);
                else 
                    System.out.println("ERRO");
                break;
            case 2:
                System.out.println("Digite um número: ");
                int div1 = read.nextInt();
                System.out.println("Digite outro número: ");
                int div2 = read.nextInt();
                if(div2 != 0){
                    double resDiv = div1 / div2;
                    System.out.printf("A divisão de %d por %d é igual à %.2f %n", div1, div2, resDiv);
                } else System.out.println("ERRO");
                break;
            case 3:
                System.out.println("Digite um número: ");
                int tri1 = read.nextInt();
                System.out.println("Digite outro número: ");
                int tri2 = read.nextInt();
                System.out.println("Digite outro número: ");
                int tri3 = read.nextInt();
                if (tri1 == tri2 && tri1 == tri3 && tri2 == tri3)
                    System.out.println("O triângulo é equilatero");
                else if (tri1 == tri2 || tri1 == tri3 || tri2 == tri3)
                    System.out.println("O triângulo é isósceles");
                else
                    System.out.println("O triângulo é escaleno");
                break;
            case 4:
                System.out.println("Digite a sua idade: ");
                int age = read.nextInt();
                if (age < 0)
                    System.out.println("ERRO");
                else if (age >= 0 && age <= 12)
                    System.out.println("Criança");
                else if (age <= 18)
                    System.out.println("Adolescente");
                else if (age <= 120)
                    System.out.println("Adulto");
                else System.out.println("ERRO");
                break;
            case 5:
                System.out.println("Digite a cor da sinaleira: ");
                read.nextLine();
                String color = read.nextLine();
                color = color.toLowerCase();
                if(color.equals("verde"))
                    System.out.println("Aberta");
                else if(color.equals("amarelo"))
                    System.out.println("Atenção");
                else if(color.equals("vermelho"))
                    System.out.println("fechado");
                else System.out.println("ERRO");
                break;
            case 6:
                System.out.println("Digite um número: ");
                int n1 = read.nextInt();
                System.out.println("Digite outro número: ");
                int n2 = read.nextInt();
                System.out.println("Digite outro número: ");
                int n3 = read.nextInt();
                if(n1 > n2 && n1 > n3)
                    System.out.println(n1);
                else if(n2 > n1 && n2 > n3)
                    System.out.println(n2);
                else if(n3 > n2 && n3 > n1)
                    System.out.println(n3);
                else System.out.println("Tem dois numeros de mesmo valor");
                break;
            default:
                System.out.println("[ERRO] Digite um numero de 1 a 6");
                break;     
        }
    }
}