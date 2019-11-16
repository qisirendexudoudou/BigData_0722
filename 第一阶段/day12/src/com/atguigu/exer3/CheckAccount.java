package com.atguigu.exer3;

public class CheckAccount extends Account {

	private double overdraft;//可透支额度
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}


	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}


	/**
	 *  取钱:
	 *  
	 *  1.先判断余额是否足够取钱的额度
	 *  	1.1如果额度够 - 那么直接从余额中减去
	 *  	1.2如额度不够
	 *  		1.2.1计算需要透支的额度
	 *  		1.2.2如果需要透支的金额小于等于可透支额度 - ①那么直接从可透支额度中减去需要透支的钱②将余额变为0
	 *  		1.2.3如里需要透支的金额大于可透支额度 - 取款失败
	 */
	@Override
	public void withdraw(double amount) {
		
		//1.不需要透支
		if(amount <= getBalance()){
			//直接从余额中减去需要取的钱
//			this.setBalance(this.getBalance() - amount);
//			balance -= amount;
			super.withdraw(amount); //调用父类中的取钱的方法
		}else{//需要透支
			//2.计算需要透支的额度
			double overdraftMoney = amount - getBalance();
			//3.判断需要透支的额度是否足够
			if(overdraftMoney > overdraft){//需要透支的金额 > 可透支额度 ：取款失败
				System.out.println("超过可透支额度");
			}else{//需要透支的金额 <= 可透支额度
				//4.从可透支额度中减去需要透支的金额
				this.overdraft -= overdraftMoney;
				//5.将余额变为0
				setBalance(0);
			}
		}
	}

}
