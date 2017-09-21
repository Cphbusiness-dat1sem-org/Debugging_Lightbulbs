package lightbulbs;

import java.util.Objects;

public class Bulb {
    String brand, model, type;
    int brightness, energy, life, warmth;

    public Bulb(String brand, 
                String type, 
                String model, 
                int brightness, 
                int energy, 
                int life, 
                int warmth) {
        this.brand = brand;
        model = this.model;
        this.type = type;
        this.brightness = brightness;
        this.energy = energy;
        this.life = life;
        this.warmth = warmth;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public int getBrightness() { return energy; }
    public int getEnergy() { return energy; }
    public int getLife() { return life; }
    public int getWarmth() { return warmth; }

//    @Override
    public boolean equals(Bulb obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bulb other = (Bulb) obj;
        if (this.brightness != other.brightness) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bulb{" + 
                  "brand=" + brand + ", "
                + "model=" + model + ", "
                + "type=" + type + ", "
                + "brightness=" + brightness + ", "
                + "energy=" + energy + ", "
                + "life=" + life + ", "
                + "warmth=" + life + '}';
    }
}
