import controller.ControlllerElectricalAppliances;
import model.Kettle;
import model.TV;
import model.VacuumCleaner;
import model.Washer;

public class Main {
    public static void main(String[] args) {
        Kettle kettle=new Kettle(3,true,2000);  //создаем приборы
        TV tv=new TV(4,false,500);
        VacuumCleaner vacuumCleaner=new VacuumCleaner(3,false,1800);
        Washer washer=new Washer(30,true,1900);


        ControlllerElectricalAppliances controlllerElectricalAppliances =new ControlllerElectricalAppliances(); //добавляем приборы в квартиру
        controlllerElectricalAppliances.addElectricalAppliance(kettle);
        controlllerElectricalAppliances.addElectricalAppliance(tv);
        controlllerElectricalAppliances.addElectricalAppliance(washer);
        controlllerElectricalAppliances.addElectricalAppliance(vacuumCleaner);
        controlllerElectricalAppliances.sort();
        controlllerElectricalAppliances.search(100,1900);
        controlllerElectricalAppliances.show();

    }


}

