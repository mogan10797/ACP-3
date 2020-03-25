public class Truck extends Car {

    private String GoodsCapacity, TairsNum;

    public Truck() {
    }

    public Truck(String GoodsCapacity1, String TairsNum1) {
        GoodsCapacity = GoodsCapacity1;
        TairsNum = TairsNum1;
    }

    public void setGoodsCapacity(String newGoodsCapacity) {
        this.GoodsCapacity = newGoodsCapacity;
    }

    public String getGoodsCapacity() {
        return this.GoodsCapacity;

    }

    public void setTairsNum(String newTairsNum) {
        this.TairsNum = newTairsNum;
    }

    public String getTairsNum() {
        return this.TairsNum;
    }

    public String showinfo() {
        return "Trick: " + getGoodsCapacity() + " | " + getTairsNum();
    }
}