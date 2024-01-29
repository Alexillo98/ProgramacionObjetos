public class AirConditioning {
    private String name;

    private int temp;
    private int tempMin;
    private int tempMax;

    public AirConditioning(String name, int temp, int tempMin, int tempMax) {
        this.name = name;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void aumentar(){
        if(this.temp >= tempMax){
            this.temp = tempMax;
        }else{
            ++this.temp;
        }
    }

    public void dismuir(){
        if(this.temp <= tempMin){
            this.temp = tempMin;
        }else{
            --this.temp;
        }
    }
    @Override
    public String toString(){
        return "Nombre -> " + this.name
                + "\n Temperatura -> " + this.temp
                + "\n Temperatura mínima -> " + this.tempMin
                + "\n Temperatura máxima -> " + this.tempMax;
    }
}
