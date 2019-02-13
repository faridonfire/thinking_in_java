class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor (int hue) {
        anIntegerRepresentingColors = hue;
    }

    @Override
    public String toString() {
        return "AllTheColorsOfTheRainbow{" +
                "anIntegerRepresentingColors=" + anIntegerRepresentingColors +
                '}';
    }
}

public class Exericise11 {
    static public void main(String[] args) {
    AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
    System.out.println(allTheColorsOfTheRainbow);
    allTheColorsOfTheRainbow.changeTheHueOfTheColor(22);
    System.out.println(allTheColorsOfTheRainbow);
    }
}
