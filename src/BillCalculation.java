import java.io.*;
abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
// DomesticPlan class
class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
// CommercialPlan class
class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 7.50;
    }
}
// InstitutionalPlan class
class InstitutionalPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
}
// GetPlanFactory class
class GetPlanFactory {
    // Use getPlan method to get an object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
// GenerateBill class
public class BillCalculation {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of the plan for which the bill will be generated: ");
        String planName = br.readLine();
        System.out.print("Enter the number of units for which the bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());
        Plan p = planFactory.getPlan(planName);
        if (p != null) {
            System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
            p.getRate(); // Call the getRate method
            p.calculateBill(units); // Call the calculateBill method
        } else {
            System.out.println("Invalid plan type entered.");
        }
    }
}