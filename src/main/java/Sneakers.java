import java.util.Calendar;

public class Sneakers {

    private String Brand;
    private String type;
    private int ReleaseNo;

    public Sneakers(){}
    public Sneakers(String Brand, int ReleaseNo){
        this.Brand = Brand;
        this.ReleaseNo=ReleaseNo;
    }

    public Sneakers(String Brand, int ReleaseNo, String type){
        this.Brand = Brand;
        this.ReleaseNo=ReleaseNo;
        this.type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public String gettype() {
        return type;
    }

    public int getReleaseNo() {
        return ReleaseNo;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void settype(String type) {
        this.type = type;
    }

    public int setReleaseNo(int ReleaseNo) {
        return ReleaseNo;
    }

    public boolean isRetro(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return ReleaseNo - 20 <= year;
    }

    public String getSneakers() {
        if(Brand != null){
            return String.format("%s is a Nike sneaker Number %s. \n Type: \n %s", Brand, ReleaseNo, type);
        }
        return String.format("%s is a Nike sneaker %s.", Brand, ReleaseNo);
    }
    }

