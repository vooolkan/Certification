package questions;

public class q08 {

	public static void main(String[] args) {
		CheckingAccount acct=new CheckingAccount ((int)(Math.random()*1000));// burdaki turunde bir constructor olmasi gerekili
	
//		acct.amount=0;  // burada amount degerine direkt 0 atandigindan sonuc 0 oluyor

//		acct.changeAmount(-acct.amount);// burada rasgele olusan amount degeri kadar - deger int x yerine gonderilince amount-amount=0 oluyur
//		acct.changeAmount(-acct.getAmount());//ayni sekilde olusan amount negatifiyle toplaniyor.

// 		bu uc atamadan birini yapmayinca math.rondom ile aldigi rasgele bir sayiyi amount olarak atiyor		
		
		System.out.println(acct.getAmount());
	}
}

 class CheckingAccount{
	public int amount; //default value=0
	
	public CheckingAccount(int amount) { //****constructer
		this.amount=amount;
	}
	
	public int getAmount() {
		return amount;
	}
	public void changeAmount(int x) {
		amount+=x;
	}
}