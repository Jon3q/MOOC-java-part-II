public class Country implements Comparable<Country>{
    private String theme;
    private String age;
    private String gender;
    private String country;
    private String year;
    private double literacypercent;

    public Country(String theme, String age, String gender, String country, String year, double literacypercent){
        this.theme = theme;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacypercent = literacypercent;
    }
    public String getCountry() {
        return this.country;
    }
    public String getYear() {
        return this.year;
    }
    public String getGender() {
        return this.gender.replace("(%)", "").trim();
    }
    public double getLiteracypercent(){
        return this.literacypercent;
    }

    public String toString(){
        return getCountry() +  " (" + getYear() + "), " + getGender() + ", " + getLiteracypercent();
    }
    @Override
    public int compareTo(Country country){
        if (this.literacypercent == country.getLiteracypercent()){
            return 0;
        } else if (this.literacypercent > country.getLiteracypercent()){
            return 1;
        } else {
            return -1;
        }
    }
}
