import java.util.ArrayList;

public class ChangeHistory{
private ArrayList<Double> object;
    public ChangeHistory(){;
        object = new ArrayList<>();
    }

    public void add(double status){
        object.add(status);
    }
    public void clear(){
        object.clear();
    }
    public String toString(){
        return object.toString();
    }
    public double maxValue(){
        if (object.isEmpty()){
            return 0.0;
        }
        double max = object.get(0);
        for (int i = 0; i < object.size(); i++){
            double a = object.get(i);
            if (a > max){
                max = a;
            }
        }
        return max;
    }
    public double minValue(){
        if (object.isEmpty()){
            return 0.0;
        }
        double min = object.get(0);
        for (int i = 0; i < object.size(); i++){
            double a = object.get(i);
            if (a < min){
                min = a;
            }
        }
        return min;
    }
    public double average(){
        if (object.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i<object.size();i++){
            sum += object.get(i);
        }
        return sum/object.size();
    }
}
