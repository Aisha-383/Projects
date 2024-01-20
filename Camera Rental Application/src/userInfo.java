import java.util.Scanner;
public class userInfo {
	String username;
	String password;
	double walletAmt;
	
	Scanner sc=new Scanner(System.in);
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getWalletAmt() {
		return walletAmt;
	}
	public void setWalletAmt(double walletAmt) {
		this.walletAmt = walletAmt;
	}
	
	public void addAmtToWallet() {
		System.out.println("Current Balance: " + walletAmt);
        System.out.println("Enter amount to add to wallet: ");
        double amount = sc.nextDouble();
        walletAmt += amount;
        System.out.println("Your Wallet Balance is updated Successfully \nCurrent Wallet Balance: " + walletAmt);
    }
	}

		