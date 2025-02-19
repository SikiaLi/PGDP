package pgdp.threads.race;

public class BusinessPenguin {
	private String name;
	private int balance;
	private BusinessPenguin partner;

	public BusinessPenguin(String name) {
		this.name = name;
		this.balance = 0;
	}

	public void setPartner(BusinessPenguin partner) {
		this.partner = partner;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	/*public void sellFish(int price) {
		synchronized (this) {
			balance += price / 2;
			synchronized (partner){
				partner.balance += price / 2;
			}
		}
	}*/
	public synchronized void sellFish(int price) {
		balance += price / 2;
		partner.addMoney(price / 2);
	}

	public synchronized void addMoney(int amount) {
		balance += amount;
	}

}