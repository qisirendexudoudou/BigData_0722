package run100;

import org.junit.Test;


public class Test10_11
{

}


class BankXu{
	private BankXu(){}
	private static  BankXu bank = null; 
	
	public static BankXu getInstance(){
		if (bank == null) {
			synchronized (BankXu.class) {
				if (bank == null) {
					bank = new BankXu();
				}
			}					
		}
		return bank;
	}
}

class BankLuo{
	private BankLuo(){}
	private static BankLuo bank = new BankLuo();
	public static BankLuo getInstance(){
		return bank;
	}
}