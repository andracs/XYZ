/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 27-10-2020
 */
package Undervisning13_26_10_2020;


import java.util.Random;

/*
Lav en array med X udvalgte farvenavne (X skal være konstant)
Lav en array med Y tilfældige farver (Y skal være konstant), og farverne skal tages fra det array, som du har lavet i forrige trin
Se om farven Z kan findes i Y (Z skal også være konstant)
Ekstra: løs opgaven på 3 forskellige måder: først skal farvene repræsenteres af Strings, herefter skal de repræsenteres med klassen Colors, til sidst skal de repræsenteres af en enum med navnet Colortypes.  (Hint: se på enums .values() metode, som returnerer en array)
Ekstra: omskriv opgaven, så farvearray med Y elementer bliver til en ArrayList i stedet for en array.
 */

public class Farver {
    //Declaring constants
    static final int x = 5;
    //Declaring random
    static Random rand = new Random();
    //Lav en array med X udvalgte farvenavne (X skal være konstant)
    public final int X  = 3;
    String[] farveNavne = {"Grøn", "Blå", "Red"};
    //Lav en array med Y tilfældige farver (Y skal være konstant)
    static final int Y = 10;
    String[] randomColors = new String[Y];
    //Se om farven Z kan findes i Y (Z skal også være konstant)
    static final String Z = "Blå";

    public void findesFarven(String farve){
        for (String farveiRandom : randomColors) {
            if (farveiRandom.equals(Z)) System.out.println("Blå findes.");
        }
    }

    public void generateRandomColors(){
        for (int i = 0; i < randomColors.length; i++) {
            //farveNavne[0] --> grøn
            //farveNavne[1] --> blå
            randomColors[i] = farveNavne[(int) (Math.random()*X)];
        }
    }

    public void showColors() {
        for (String farvenavn : randomColors) {
            System.out.println(farvenavn);
        }
    }



    //Run
    public static void main(String[] args) {
        Farver farver = new Farver();
        farver.generateRandomColors();
        farver.showColors();
        farver.findesFarven(Z);

    }
    //Method returning random color
    public static int randomColor(String[] array) {
        int theColor = rand.nextInt(array.length);
        return theColor;
    }
    //Method returns if color exists or not.
    public static boolean colorExists(int color, int[] array) {
        boolean exists = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == color)
                exists = true;
        }
        return exists;
    }
}