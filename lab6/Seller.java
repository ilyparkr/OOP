
public class Seller {
    public Food sell(Employee e){
        Food f1 = new Food();
        if (e.getWallet().getBalance()>= f1.getPrice()){
            this.getWallet().setBlance();
            
        }
    }
}
