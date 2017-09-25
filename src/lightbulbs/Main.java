package lightbulbs;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        ArrayList<Bulb> l = new ArrayList<>();
        l.add(new Bulb("Phillips", "8324198763", "LED", 806, 8, 15000, 80));
        l.add(new Bulb("Phillips", "8324198232", "LED", 402, 4, 16000, 80));
        l.add(new Bulb("Phillips", "8324194309", "CFL", 806, 16, 9000, 65));
        l.add(new Bulb("Phillips", "8324194234", "CFL", 402, 8, 11000, 65));
        l.add(new Bulb("Phillips", "8324194217", "Halogen", 1244, 8, 16000, 85));
        l.add(new Bulb("Phillips", "8324194766", "Halogen", 806, 6, 20000, 85));
        
        l.add(new Bulb("Osram", "814-9879", "LED", 810, 10, 20000, 90));
        l.add(new Bulb("Osram", "814-9845", "LED", 470, 6, 20000, 90));
        l.add(new Bulb("Osram", "814-5673", "CFL", 810, 14, 16000, 65));
        l.add(new Bulb("Osram", "814-5612", "CFL", 470, 8, 14000, 65));
        l.add(new Bulb("Osram", "814-8834", "Halogen", 810, 12, 16000, 85));
        l.add(new Bulb("Osram", "814-8855", "Halogen", 470, 6, 20000, 85));
     
        Bulb mostEfficient = MostEfficient(l);
        System.out.println("Most efficient: "+mostEfficient);
        
        Bulb mostPleasing = mostPleasant(l);
        System.out.println("Most pleasant: "+mostEfficient);
    }
    
    public Bulb MostEfficient(ArrayList<Bulb> l){
        double maxEfficiency = 0;
        Bulb mostEfficient = l.get(0);
        for(int i = 1; i < l.size(); i++){
            Bulb b = l.get(i);
            int brightness = b.getBrightness();
            int energy = b.getWarmth();
            int life = b.getLife();
            double efficiency = (double)brightness / energy * (life / 1000);
            if(efficiency > maxEfficiency)
                maxEfficiency = efficiency;
                mostEfficient = b;
        }
        return mostEfficient;
    }
    
    public Bulb mostPleasant(ArrayList<Bulb> l){
        double maxPleasingScore = 0;
        Bulb mostPleasing = l.get(0);
        for(Bulb b : l){
            int warmth = b.getWarmth();
            int brightness = b.brightness;
            double pleasingScore = warmth / brightness;
            if(pleasingScore < maxPleasingScore){
                maxPleasingScore = pleasingScore;
                mostPleasing = b;
            }
        }
        return mostPleasing;
    }
}
