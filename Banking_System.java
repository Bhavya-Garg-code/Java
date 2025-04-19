import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean loop = true;
		double[] account_bal = new double[1000];
		String[] account_name = new String[1000];
		int option,size = 100;
		while(loop) {
			System.out.println("Welcome to our bank");
			System.out.println("Choose the below options");
			System.out.println("1. Add Customer");
			System.out.println("2. Change Customer name");
			System.out.println("3. Check account balance");
			System.out.println("4. Update account balance");
			System.out.println("5. Summary of all accounts");
			System.out.println("6. Quit");
			Scanner inp = new Scanner(System.in);
			System.out.println("Your chosen option");
			option = inp.nextInt();
			if(option == 1) {
				inp.nextLine();
				System.out.println("Enter holder's name");
				String name = inp.nextLine();
				System.out.println("Enter opening balance");
				int bal = inp.nextInt();
				account_name[size] = name;
				account_bal[size] = bal;
				System.out.println("Account number: "+(size));
				System.out.println("Account holder's name: "+account_name[size]);
				System.out.println("Balance: "+account_bal[size]);
				System.out.println("===============");
				size += 1;
			}
			else if(option == 2) {
				System.out.println("Enter Account number: ");
				int acc_index;
				String temp;
				acc_index = inp.nextInt();
				inp.nextLine();
				if(acc_index>size) {
					System.out.println("Account doex not exist..");
				}
				else {
					temp = account_name[acc_index];
					System.out.println("Enter new name: ");
					String new_name = inp.nextLine();
					account_name[acc_index] = new_name;
					System.out.println("System Updated");
					System.out.println("Name changed from "+temp+" to "+new_name);
					System.out.println("===============");
				}
			}
			else if(option == 3) {
				System.out.println("Enter account number: ");
				int acc_index;
				acc_index = inp.nextInt();
				inp.nextLine();
				if(acc_index>size) {
					System.out.println("Account doex not exist..");
				}
				else {
					System.out.println("Your account balance is : "+account_bal[acc_index]);
					System.out.println("==================");
				}
			}
			else if(option == 4) {
				System.out.println("Enter account number: ");
				int acc_index;
				acc_index = inp.nextInt();
				inp.nextLine();
				if(acc_index>size) {
					System.out.println("Account doex not exist..");
				}
				else {
					System.out.println("Enter amount deposited: ");
					double amt = inp.nextDouble();
					account_bal[acc_index] += amt;
					System.out.println("Your new balance is : "+account_bal[acc_index]);
					System.out.println("==============");
				}
			}
			else if(option == 5) {
				for(int i = 100; i < size; i++) {
					System.out.println("Account number: "+i+" Accoutn holder's name: "+account_name[i]+" Balance: "+account_bal[i]);
				}
					System.out.println("=============");
			}
			else if(option == 6){
			    System.out.println("Thanks...");
			    System.out.println("Terminating....");
			    loop = false;
			    
			}
			else{
			    System.out.println("Invalid input entered");
			    System.out.println("Terminating....");
			    System.exit(0);
			}
		}

	}
}