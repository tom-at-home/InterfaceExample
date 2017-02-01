import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Beverage> beverages = new ArrayList<>();
    private int value = 0;

    public void showBeverages(){
        for (int i = 0; i < this.beverages.size(); i++) {
            System.out.println("(" + i + "): " + this.beverages.get(i).getName() + " " + this.beverages.get(i).getPrice());
        }
    }

    public void showValue(){
        System.out.println(this.value);
    }

    public void addValue(Euro euro){
        this.value += euro.getValue();
    }

    public void subtractValue(Beverage beverage){
        this.value -= beverage.getPrice();
    }

    public void getBeverage(int index) {
        if(this.value >= this.beverages.get(index).getPrice()){
            this.subtractValue(this.beverages.get(index));
            this.removeBeverage(this.beverages.get(index));
        }
        else{
            System.out.println("Please insert more coins.");
        }
    }

    public void addBeverage(Beverage beverage) {
        this.beverages.add(beverage);
    }

    public void removeBeverage(Beverage beverage) {
        this.beverages.remove(beverage);
    }

}
