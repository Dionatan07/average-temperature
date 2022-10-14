package entities;

public class Month {

    private String month;
    private int temperature;

    public Month(String month, int temperature) {
        this.month = month;
        this.temperature = temperature;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
