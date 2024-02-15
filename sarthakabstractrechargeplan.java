
    //WAP to create an abstract class called MobileRechargePlan with attributes like planName, planAmount, and validityDays alongside abstract methods displayPlanDetails() and calculateRechargeAmount(double talkTime). Further, create two concrete classes as prepaidRecharge and PostpaidRecharge extending the MobileRechargePlan class, provide methods for display the plan details, and calculate the recharge amount methods. Instantiate both the classes and display their respective plan details along with calculate recharge amounts. 
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
      
        return talkTime * 0.5; //
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
      
        return planAmount + (talkTime * 0.1); 
    }
}

public class sarthakabstractrechargeplan  {
    public static void main(String[] args) {
        MobileRechargePlan prepaid = new PrepaidRecharge("Prepaid Plan 1", 100.0, 30);
        prepaid.displayPlanDetails();
        double prepaidRechargeAmount = prepaid.calculateRechargeAmount(60.0);
        System.out.println("Prepaid Recharge Amount: " + prepaidRechargeAmount);

        MobileRechargePlan postpaid = new PostpaidRecharge("Postpaid Plan 1", 500.0, 30);
        postpaid.displayPlanDetails();
        double postpaidRechargeAmount = postpaid.calculateRechargeAmount(60.0);
        System.out.println("Postpaid Recharge Amount: " + postpaidRechargeAmount);
    }


    
}
