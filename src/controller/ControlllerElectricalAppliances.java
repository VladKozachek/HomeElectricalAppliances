package controller;

import model.ElectricalAppliance;
import view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ControlllerElectricalAppliances {
    private ElectricalAppliance electricalAppliance;
    private View view = new View();
    ArrayList<ElectricalAppliance> listElectricalApplianceAtHome =new ArrayList<>();

    public void addElectricalAppliance (ElectricalAppliance electricalAppliance){  //добавляем приборы в квартиру
        listElectricalApplianceAtHome.add(electricalAppliance);
    }
    public int powerConsumption (){  //считаем потребляемую мощность
        int summPower = 0;
        for (ElectricalAppliance item:listElectricalApplianceAtHome){
            summPower=summPower+item.getPowerConsumed();
        }
        return summPower;
    }
    public void sort(){   //сортировка по мощности
        Collections.sort(listElectricalApplianceAtHome, new Comparator<ElectricalAppliance>() {
            @Override
            public int compare(ElectricalAppliance o1, ElectricalAppliance o2) {
                return Integer.compare(o1.getPowerConsumed(),o2.getPowerConsumed());
            }
        });
    }

    public void show() {
        view.showElectrikalAppliance(listElectricalApplianceAtHome);
    }
}





