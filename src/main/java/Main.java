import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    public static void main(String[] args) { PApplet.main("Main");
    }
    DNA dna = new DNA(this);
    Graph graf = new Graph(this);

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
        textSize(32);
        fill(0);
        textAlign(CENTER);
        text("Klik på musen for at lave en ny generation!\nDe generationer der er røde har den optimale løsning", width/2,25);
        graf.display();


    }
    public void mouseClicked(){
        dna.findHighest(graf);
        dna.findParrentPool();
        dna.makeChild();
        dna.mutate();

    }
}
