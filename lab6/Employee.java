
public class Employee {
    private String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public boolean equals(Employee e){
        return e.name.equals(name);
    }
    public String toString(){
        return ("My name is "+name+"\nI have"+energy+"energy left.\nI have a blance of "+wallet.getBalance()+" baht");
    }
    public boolean buyFood(Seller s){
    
    }
    public void eat(Food f){
        energy += f.getEnergy();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNatioanlity(String nationality){
        this.nationality = nationality;
    }
}
