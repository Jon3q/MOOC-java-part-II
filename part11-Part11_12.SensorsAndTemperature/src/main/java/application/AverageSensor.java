package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    //private boolean isOn;
    private ArrayList<Sensor> list;
    private List<Integer> readings;

    public AverageSensor(){
        this.list = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : list) {
            if (sensor.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
        for(int i = 0; i<list.size();i++){
            list.get(i).setOn();
        }
    }

    @Override
    public void setOff() {
        for(int i = 0; i<list.size();i++){
            list.get(i).setOff();
        }
    }

    @Override
    public int read() {
        int ave = 0;
        int a;
        for(int i = 0; i<list.size();i++){
            a = list.get(i).read();
            ave += a;
        }
        this.readings.add(ave/list.size());
        return ave/list.size();
    }

    public void addSensor(Sensor toAdd){
        this.list.add(toAdd);
    }
    public List<Integer> readings(){
        return readings;
    }
}
