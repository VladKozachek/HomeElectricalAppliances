package view;

import model.ElectricalAppliance;

import java.util.ArrayList;

public class View {

    public void showElectrikalAppliance(ArrayList <ElectricalAppliance> listElectricalApplianceAtHome  ){
        for (ElectricalAppliance item:listElectricalApplianceAtHome ){
            System.out.println("__________________________________________");
            System.out.println("Name appliance - "+item.getName());
            System.out.println("Weight - "+item.getWeight());
            System.out.println("State - "+ item.isState());
            System.out.println("Power consumed - "+item.getPowerConsumed());
        }
    }
    public void showPowerConsumption(int powerConsumption){
        System.out.println("__________________________________________");
        System.out.println("Power Consumption "+powerConsumption);
    }

    public void showSearch(ArrayList<ElectricalAppliance> search){
        System.out.println("__________________________________________");
        for(ElectricalAppliance item:search){
            System.out.println("Found devices :" +item.getName() + " - "+item.getPowerConsumed());
        }
    }

}
