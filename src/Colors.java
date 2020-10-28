import java.awt.*;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 28/10/2020
 */

public class Colors {
    public final String RED = "Red";
    public final String BLUE = "Blue";
    public final String[] colors = {"Red", "Blue"};
    public ColorsENUM minPalette;


    public static void main(String[] args) {
        Colors color = new Colors();
        String farve = color.RED;
        farve = color.BLUE;
        farve = color.colors[0];
        ColorsENUM[] tilgængeligeFarver = ColorsENUM.values();
        System.out.println(farve);
    }


}
