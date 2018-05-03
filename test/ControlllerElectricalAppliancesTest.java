import controller.ControlllerElectricalAppliances;
import model.ElectricalAppliance;
import model.Kettle;
import model.TV;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class ControlllerElectricalAppliancesTest {


    @Rule
    Kettle kettle = new Kettle(3, true, 2000);
    TV tv = new TV(4, false, 500);
    ControlllerElectricalAppliances controlllerElectricalAppliances = new ControlllerElectricalAppliances(); //добавляем приборы в квартиру

    @Test
    void addElectricalApplianceTest() { //проверка создался ли объект
        controlllerElectricalAppliances.addElectricalAppliance(kettle);
        assertTrue(controlllerElectricalAppliances != null);
       }

    @Test
    void powerConsumptionTest() { //проверяем правильно ли считает потребляемую мощность
        controlllerElectricalAppliances.addElectricalAppliance(kettle);
        controlllerElectricalAppliances.addElectricalAppliance(tv);
        int n = controlllerElectricalAppliances.powerConsumption();
        assertEquals(2500, n);
    }

    @Test
    void searchTest() {  //проверяем находит ли метод элементы
        controlllerElectricalAppliances.addElectricalAppliance(kettle);
        controlllerElectricalAppliances.addElectricalAppliance(tv);
        ArrayList<ElectricalAppliance> n = controlllerElectricalAppliances.search(100, 800);
        for (ElectricalAppliance item : n) {
            assertEquals(tv, item);
        }
    }

    @Test
    void MetodSearchDiapazonTest() {
        controlllerElectricalAppliances.addElectricalAppliance(kettle);
        controlllerElectricalAppliances.addElectricalAppliance(tv);
        ArrayList<ElectricalAppliance> n =controlllerElectricalAppliances.search(-100,200);
        assertEquals(null,n);
    }
}