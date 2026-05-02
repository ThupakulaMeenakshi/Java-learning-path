class Account {
    String userName;

    Account(String userName) {
        this.userName = userName;
    }

    void ShowFeatures() {
        System.out.println("Basic: can post photos and videos");
    }
}

class PremiumAccount extends Account {
    double subcriptionFee;

    PremiumAccount(String userName, double subcriptionFee) {
        super(userName);
        this.subcriptionFee = subcriptionFee;
    }

    @Override
    void ShowFeatures() {
        System.out.println("No Ads and can download videos!");
        System.out.println(this.userName + " Has premium subcription at " + subcriptionFee);
    }
}

public class PremiumAccountSubcription {
    public static void main(String args[]) {
        PremiumAccount obj = new PremiumAccount("Meenakshi_16", 165);
        obj.ShowFeatures();
    }
}