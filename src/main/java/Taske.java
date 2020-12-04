import processing.core.PApplet;

import java.util.ArrayList;

public class Taske {
    int weight;
    int worth;
    ArrayList<Ting> tingList = new ArrayList<>();
    String[] nameList = {"kort","kompas","vand","sandwitch","sukker","dåsemad","banan","æble","ost","øl","solcreme","kamera","t-shirt","bukser","paraply","vandtætte busker"," vandtæt overtøj","pung","solbriller","håndklæde","sokker","bog","notesbog","telt"};
    int[] worthList = {150,35,200,160,60,45,60,40,30,10,70,30,15,10,40,70,75,80,20,12,50,10,1,150};
    int[] weightList = {90,130,1530,500,150,680,270,390,230,520,110,320,240,480,730,420,430,220,70,180,40,300,900,2000};
    String inventory = "";
    PApplet p;
    Taske(PApplet p){
this.p=p;
        for (int i = 0; i < weightList.length; i++) {
            tingList.add(new Ting(worthList[i],weightList[i],nameList[i]));
        }
    }
    void makeinventory(){
        for(int i =0;i<24;i++){
            inventory += (int) p.random(2)+"";
        }
    }
    void findWorthAndWeight(){
        String[] stringList = inventory.split("");

        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i].equalsIgnoreCase("1")){
                worth+=tingList.get(i).worth;
                weight+=tingList.get(i).weight;
            }
        }
        }
        void getInventory(String s){
        inventory=s;
        }
}

