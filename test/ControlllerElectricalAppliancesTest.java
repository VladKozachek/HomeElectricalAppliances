import controller.ControlllerElectricalAppliances;
import model.Kettle;
import model.TV;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import view.View;

class ControlllerElectricalAppliancesTest {

    @Test
    void addElectricalApplianceTest(){ //проверка создался ли объект
        Kettle kettle=new Kettle(3,true,2000);
        ControlllerElectricalAppliances controlllerElectricalAppliances =new ControlllerElectricalAppliances(); //добавляем приборы в квартиру
        controlllerElectricalAppliances.addElectricalAppliance(kettle);
        assertTrue(controlllerElectricalAppliances!=null);
    }

    @Test
    void powerConsumptionTest() { //проверяем правильно ли считает потребляемую мощность
         Kettle kettle=new Kettle(3,true,2000);  //создаем приборы
         TV tv=new TV(4,false,500);
         ControlllerElectricalAppliances controlllerElectricalAppliances =new ControlllerElectricalAppliances();
         controlllerElectricalAppliances.addElectricalAppliance(kettle);
         controlllerElectricalAppliances.addElectricalAppliance(tv);
         int n=controlllerElectricalAppliances.powerConsumption();
         assertEquals(2500,n);
    }

    @Test
    void sort() {

    }

    @Test
    void search() {
    }

    @Test
    void show() {
    }

}