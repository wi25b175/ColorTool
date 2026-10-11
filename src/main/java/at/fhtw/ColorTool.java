package at.fhtw;

import java.util.Scanner;

public class ColorTool {
    public void start() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Input color: ");
         String color = scanner.nextLine();
         ComplementaryService complementaryService = new ComplementaryService();
         String complementaryColor = complementaryService.getComplementaryColor(color);
         System.out.println("Complementary color: " + complementaryColor);
         RgbService rgbService = new RgbService();
         String rgbColor = rgbService.getRgbValue(color);
         String rgbComplementary = rgbService.getRgbValue(complementaryColor);
         System.out.println("RGB values: " + color + " " + rgbColor + ", " + complementaryColor + " " + rgbComplementary);

    }
}
