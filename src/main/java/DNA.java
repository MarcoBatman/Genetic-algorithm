import processing.core.PApplet;

import java.util.ArrayList;

public class DNA {
PApplet p;
int highest;
int sum;
    ArrayList<Taske> taskeList = new ArrayList<>();
    ArrayList<Taske> parrentPool = new ArrayList<>();


    DNA(PApplet p){
    this.p=p;
    for (int i = 0; i < 10000; i++) {
        taskeList.add(new Taske(p));}
        for (int i = 0; i < taskeList.size(); i++) {
            taskeList.get(i).makeinventory();
        }
}
void findHighest(){
    for (int i = 0; i < taskeList.size(); i++) {
        taskeList.get(i).findWorthAndWeight();
        if(taskeList.get(i).worth>highest&&taskeList.get(i).weight<5000){
            highest=taskeList.get(i).worth;
        }

        p.println(highest);
    }
}
void findParrentPool(){
    for (int i = 0; i < taskeList.size(); i++) {
    if(taskeList.get(i).weight<5000){
    parrentPool.add(taskeList.get(i));
    }
    }
    for (int i = 0; i < parrentPool.size() ; i++) {
        sum += parrentPool.get(i).worth;
    }
    taskeList.clear();
    }
void makeChild(){
        int j=0;
    while(taskeList.size()<10001){

        ArrayList<Taske> parrents = new ArrayList<>();
        while(parrents.size()<3)
        for (int i = 0; i < parrentPool.size(); i++) {
            if((int)p.random(sum)<parrentPool.get(i).worth&&parrents.size()<3){
                parrents.add(parrentPool.get(i));
            }
        }
        taskeList.add(new Taske(p));
        taskeList.get(j).getInventory(parrents.get(0).inventory.substring(0,13)+parrents.get(1).inventory.substring(13,24));
        j++;
    }
    parrentPool.clear();
    sum=0;
}
void mutate(){

    for (int i = 0; i < taskeList.size() ; i++) {
        String[] heya = taskeList.get(i).inventory.split("");
        String coolieos = "";
        for (int j = 0; j < heya.length; j++) {
            if(p.random(1)<0.1){
                if(heya[j].equalsIgnoreCase("1")){
                    heya[j]="0";
                }else{
                    heya[j]="1";
                }
            }
            coolieos += heya[j];
        }
        taskeList.get(i).inventory=coolieos;
    }

}
}
