package controller;

import model.ElectricalAppliance;
import view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ControlllerElectricalAppliances {
    private ElectricalAppliance electricalAppliance;
    private View view = new View();
    private int min;
    private int max;

    ArrayList<ElectricalAppliance> listElectricalApplianceAtHome = new ArrayList<>();

    public void addElectricalAppliance(ElectricalAppliance electricalAppliance) {  //добавляем приборы в квартиру
        listElectricalApplianceAtHome.add(electricalAppliance);
    }

    public int powerConsumption() {  //считаем потребляемую мощность
        int summPower = 0;
        for (ElectricalAppliance item : listElectricalApplianceAtHome) {
            summPower = summPower + item.getPowerConsumed();
        }
        return summPower;
    }

    public void sort() {   //сортировка по мощности
        Collections.sort(listElectricalApplianceAtHome, new Comparator<ElectricalAppliance>() {
            @Override
            public int compare(ElectricalAppliance o1, ElectricalAppliance o2) {
                return Integer.compare(o1.getPowerConsumed(), o2.getPowerConsumed());
            }
        });
    }

    public ArrayList<ElectricalAppliance> search(int min, int max) { //поиск прибора в квартире, соответствующий заданному диапазону параметров
        this.min = min;
        this.max = max;
        ArrayList<ElectricalAppliance> tempList = new ArrayList<>();
        if (min < 0) {
            tempList = null;
        } else {
            for (ElectricalAppliance item : listElectricalApplianceAtHome) {
                if (item.getPowerConsumed() >= min && item.getPowerConsumed() <= max) {
                    tempList.add(item);
                }
            }

        }
        return tempList;
    }

    public void show() {
        view.showElectrikalAppliance(listElectricalApplianceAtHome);
        view.showPowerConsumption(powerConsumption());
        view.showSearch(search(min, max));
    }


}





