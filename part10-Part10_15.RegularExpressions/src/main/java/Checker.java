public class Checker {
    public boolean isDayOfWeek(String string){
        if (string.matches("mon") || string.matches("tue")|| string.matches("wed")|| string.matches("thu")
                || string.matches("fri") || string.matches("sat") || string.matches("sun")){
            return true;
        }
        return false;
    }

    public boolean allVowels(String string){
       if (string.matches("[aeiou]+")){
           return true;
       }
       return false;
    }
    public boolean timeOfDay(String string){
        if (string.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]") || string.matches("2[0-3]:[0-5][0-9]:[0-5][0-9]")){
            return true;
        }
        return false;
    }
}