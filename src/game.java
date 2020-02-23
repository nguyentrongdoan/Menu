//import com.sun.xml.internal.ws.api.model.wsdl.WSDLExtensible;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your width: ");
        int width = input.nextInt();

        System.out.println("Enter your height: ");
        int height = input.nextInt();

        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        System.out.println("Menu:");
        System.out.println("1. Draw the triangle.");
        System.out.println("2. Draw the square.");
        System.out.println("3. Draw the rectangle.");
        System.out.println("4. Draw the heart.");
        System.out.println("0. Exit");


        switch (choice){
            case 1:
                System.out.println("Draw the triangle.");
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                break;
            case 2:
            case 3:
                System.out.println("Draw the square:");
                for (int i = 0; i < width; i++){
                    for (int j = 0; j < height; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                break;
            case 4:
                System.out.println("Draw the heart");
                for (int i = 0; i < 6; i++){
                    for (int j = 0; j < 7; j++){
                        if (i == 0 && j % 3 != 0 ||  i == 1 && j %3 == 0 || i - j == 2 || i + j == 8){
                            System.out.print(" * ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("Draw the rectangle:");
                for (int i = 0; i <= height; i++){
                    for (int j = 1; j <= width; j++){
                        if (i == 0 || j == 1 || i == height || j == width){
                            System.out.print(" * ");
                        }else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("もう一回");
        }
    }
}
