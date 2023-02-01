package src.com.aurionpro.test;


import src.com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

//		Account acc = new Account(101, "ABC", 100000);
//		System.out.println("Account Deatils: ");
//		printAccDetails(acc);
//		accountWithdraw(acc, 200000);	
//		System.out.println();
//		accountDeposit(acc, 4000);		
//	
		Account[] accounts= {
				new Account(101, "ABC", 100000),
				new Account(102, "IJK", 10000),
				new Account(103, "XYZ", 167000),
				new Account(104, "PQR", 10002),
				new Account(105, "GHI", 2342343)
		};
		
		for(Account x: accounts) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Highest balance is: ");
		double max=accounts[0].getBalance();
		int index=0;
		for(int i=0;i<5;i++) {
			if(max<(accounts[i].getBalance())){
				max=accounts[i].getBalance();
				index=i;
			}
		}
		System.out.println(accounts[index]);
		
		System.out.println();
		System.out.println("Sorted Data is: ");
		bubbleSort(accounts);
		for(Account x: accounts) {
			System.out.println(x);
		}
	}

	private static void bubbleSort(Account[] array) {
		int i, j;
		Account temp;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[j].getBalance() > array[i].getBalance()) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
