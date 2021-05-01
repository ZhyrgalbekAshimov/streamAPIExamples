public class Notebook {

    private int id;
    private int ramGb;          // ОЗУ
    private int hddGb;          // размер накопителя
    private double screenSize;
    private String producer;    // производитель
    private String processor;
    private double price;
    private String color;
    private String OS;          //  операционная система
    private boolean isUsed;     //  б/у или новый

    public Notebook(String producer, int ramGb, int hddGb, double screenSize,  String processor, double price, String color, String OS, boolean isUsed) {
        this.id = (int) (Math.random() * 1000000);
        this.ramGb = ramGb;
        this.hddGb = hddGb;
        this.screenSize = screenSize;
        this.producer = producer;
        this.processor = processor;
        this.price = price;
        this.color = color;
        this.OS = OS;
        this.isUsed = isUsed;
    }

    public int getId() {
        return id;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public int getHddGb() {
        return hddGb;
    }

    public void setHddGb(int hddGb) {
        this.hddGb = hddGb;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public String toString() {
        return  "\nid=" + id +
                ", \nramGb=" + ramGb +
                ", \nhddGb=" + hddGb +
                ", \nscreenSize=" + screenSize +
                ", \nproducer='" + producer + '\'' +
                ", \nprocessor='" + processor + '\'' +
                ", \nprice=" + price +
                ", \ncolor='" + color + '\'' +
                ", \nOS='" + OS + '\'' +
                ", \nisUsed=" + isUsed + "\n";

    }
}
