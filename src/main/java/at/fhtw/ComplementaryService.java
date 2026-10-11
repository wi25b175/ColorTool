package at.fhtw;

public class ComplementaryService {
    public String getComplementaryColor(String color) {
        return switch (color) {
            case "red" -> "green";
            case "green" -> "red";
            case "blue" -> "purple";
            case "purple" -> "blue";
            case "yellow" -> "orange";
            case "orange" -> "yellow";
            default -> "Unknown Color";
        };
    }
}




