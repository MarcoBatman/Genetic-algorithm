import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    public static void main(String[] args) { PApplet.main("Main");
    }
    DNA dna = new DNA(this);


    @Override
    public void settings() {
        super.settings();
        size(1500,500);
    }

    @Override
    public void setup() {



    }

    @Override
    public void draw() {
        clear();
        background(255);
        dna.findHighest();
        dna.findParrentPool();
        dna.makeChild();
        dna.mutate();
    }
}
