import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    public static void main(String[] args) { PApplet.main("Main");
    }
    DNA dna = new DNA(this);


    @Override
    public void settings() {
        super.settings();
    }

    @Override
    public void setup() {



    }

    @Override
    public void draw() {
        dna.findHighest();
        dna.findParrentPool();
        dna.makeChild();
        dna.mutate();
    }
}
