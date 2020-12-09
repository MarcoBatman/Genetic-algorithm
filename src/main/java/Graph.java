import processing.core.PApplet;

import java.util.ArrayList;

public class Graph {
    ArrayList<Integer> highesttList = new ArrayList<Integer>();
  int j;
    PApplet p;
    Graph(PApplet p){
        this.p=p;
    }
    public void display(){
        for (int i = 0; i < highesttList.size() ; i++) {
            p.fill(0);
            if (highesttList.get(highesttList.size()-1-i)==1130){
                p.fill(255,0,0);
            }
            p.textSize(15);
            p.pushMatrix();
            p.rotate((float)1.57079633*3);
            int generaton = j-i;
            p.text("Generation " + generaton + ": " + highesttList.get(highesttList.size()-1-i), -1130/5-175+highesttList.get(highesttList.size()-1-i)/5,15+15*i);
            p.popMatrix();
            p.rect(5+i*15,p.height,10,-highesttList.get(highesttList.size()-1-i)/5);
            if(5+i*15>p.width)
                highesttList.remove(0);

        }
    }
    public void getHighest(int highest){
    highesttList.add(highest);
    j++;
    }

}

