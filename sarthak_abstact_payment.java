abstract class MobileRechargePlan {
    protected String planName;
    protected double planAmount;
    protected int validityDays;

    public MobileRechargePlan(String planName, double planAmount, int validityDays) {
        this.planName = planName;
        this.planAmount = planAmount;
        this.validityDays = validityDays;
    }

    public abstract void displayPlanDetails();

    public abstract double calculateRechargeAmount(double talkTime);
}

class PrepaidRecharge extends MobileRechargePlan {
    public PrepaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    @Override
    public void displayPlanDetails() {
        System.out.println("Prepaid Recharge Plan Details:");
        System.out.println("Plan Name: " + planName);
        System.out.println("Plan Amount: " + planAmount);
        System.out.println("Validity Days: " + validityDays);
    }

    @Override
    public double calculateRechargeAmount(double talkTime) {
        
        return talkTime * 0.5; 
    }
}

class PostpaidRecharge extends MobileRechargePlan {
    public PostpaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    @Override
    public void displayPlanDetails() {
        System.out.println("Postpaid Recharge Plan Details:");
        System.out.println("Plan Name: " + planName);
        System.out.println("Plan Amount: " + planAmount);
        System.out.println("Validity Days: " + validityDays);
    }

    @Override
    public double calculateRechargeAmount(double talkTime) {
      
        return talkTime * 0.8; // Sample calculation
    }
}

public class sarthak_abstact_payment {
    public static void main(String[] args) {
        PrepaidRecharge prepaidRecharge = new PrepaidRecharge("Prepaid Plan 1", 100.0, 30);
        prepaidRecharge.displayPlanDetails();
        double prepaidRechargeAmount = prepaidRecharge.calculateRechargeAmount(50.0);
        System.out.println("Prepaid Recharge Amount: " + prepaidRechargeAmount);

        System.out.println();

        PostpaidRecharge postpaidRecharge = new PostpaidRecharge("Postpaid Plan 1", 200.0, 30);
        postpaidRecharge.displayPlanDetails();
        double postpaidRechargeAmount = postpaidRecharge.calculateRechargeAmount(100.0);
        System.out.println("Postpaid Recharge Amount: " + postpaidRechargeAmount);
    }
}
