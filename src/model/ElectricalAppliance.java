package model;

public abstract class ElectricalAppliance {
    private String name;
    private  double weight;
    private boolean state;
    private int powerConsumed;

    public ElectricalAppliance(String name, double weight, boolean state, int powerConsumed) {
        this.name = name;
        this.weight = weight;
        this.state = state;
        this.powerConsumed = powerConsumed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isState() {
        return state;
    }

    public int getPowerConsumed() {
        return powerConsumed;
    }
}
