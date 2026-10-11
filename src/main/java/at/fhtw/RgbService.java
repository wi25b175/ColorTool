package at.fhtw;

public class RgbService {

    public String getRgbValue(String color) {
        return switch (color) {
            case "red" -> "RGB(255,0,0)";
            case "green" -> "RGB(0,255,0)";
            case "blue" -> "RGB(0,0,255)";
            case "purple" -> "RGB(128,0,128)";
            case "yellow" -> "RGB(255,255,0)";
            case "orange" -> "RGB(225,165,0)";
            default -> "Unknown color";
        };
    }
}
