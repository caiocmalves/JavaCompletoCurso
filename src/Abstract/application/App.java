package Abstract.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Abstract.entities.Shape;
import Abstract.entities.circle;
import Abstract.entities.rectangle;
import Abstract.entities.enums.Color;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c) ?");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Witdh: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new rectangle(color, width, height));
            } else {
                System.out.print("radius: ");
                double radius = sc.nextDouble();
                list.add(new circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }


        sc.close();
    }
}
