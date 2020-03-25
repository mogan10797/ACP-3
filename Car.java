import java.util.ArrayList;
import java.util.Scanner;

public class Car {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Truck> Tricklists = new ArrayList<Truck>();
        ArrayList<Bus> buslists = new ArrayList<Bus>();
        ArrayList<Sedan> sedanslists = new ArrayList<Sedan>();
        ArrayList<Car1> car1lists = new ArrayList<Car1>();
        Boolean flag = true;
        while (flag) {
            System.out.println("1.Truck " + "2.Bus " + "3.sedan " + "4.Car1" + " 5.Quit ");
            int cho = scn.nextInt();
            switch (cho) {
            case 1:

                System.out.println("Truck~~~" + "貨斗數量 : " + "輪子數 : ");
                Truck trick1 = new Truck("貨斗數量 : " + scn.next(), "輪子數 : " + scn.next());
                Tricklists.add(new Truck());
                System.out.println(trick1.showinfo());

                break;
            case 2:
                System.out.println("Bus~~~" + "乘客人數 : " + "車門數 : " + "航運公司 : ");
                Bus bus1 = new Bus("乘客人數 : " + scn.next(), "車門數 : " + scn.next(), "航運公司 : " + scn.next());
                buslists.add(new Bus());
                System.out.println(bus1.showinfo());
                break;
            case 3:
                System.out.println("Sedan~~~" + "乘客人數 : " + "型式 : " + "用途 : ");
                Sedan sedan1 = new Sedan("乘客人數 : " + scn.next(), "型式 : " + scn.next(), "用途 : " + scn.next());
                sedanslists.add(new Sedan());
                System.out.println(sedan1.showinfo());
                break;
            case 4:
                System.out.println("Car1~~~" + "顏色 : " + "油箱容量 : " + "動力型態 : " + "排氣量 : " + "出廠年 : ");
                Car1 car2 = new Car1("顏色 : " + scn.next(), "油箱容量 : " + scn.next(), "動力型態 : " + scn.next(),
                        "排氣量 : " + scn.next(), "出廠年 : " + scn.next());
                car1lists.add(new Car1());
                System.out.println(car2.showinfo());
                break;
            case 5:
                flag = false;
                System.out.println("System offline");
                break;
            default:
                System.out.println("No Chance");
            }
        }
    }
}
