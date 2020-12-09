import processing.core.PApplet;

import java.util.ArrayList;

public class Graph {

    ArrayList<Integer> highesttList = new ArrayList<Integer>();

    PApplet p;
    Graph(PApplet p){
        this.p=p;
    }
    public void display(){
        for (int i = 0; i < highesttList.size() ; i++) {
            p.fill(0);
            if (highesttList.get(i)==1130){
                p.fill(255,0,0);
            }
            p.textSize(5);
            p.textAlign(p.CENTER);
            p.pushMatrix();
            p.rotate((float)1.57079633*3);
            p.text(highesttList.get(i), -300+highesttList.get(i)/3,15+15*i);
            p.popMatrix();
           // p.rect(10+i*15,p.height,10,-highesttList.get(i)/3);
        }


    }
    public void getHighest(int highest){
    highesttList.add(highest);

    }

}

