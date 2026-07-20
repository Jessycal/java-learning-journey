//creating an object from the Autopolicy class created
public class AutopolicyTest {
	public static void main(String[] args) {
		Autopolicy policy1 = new Autopolicy("NY", "Toyota Camry", 1234);
		Autopolicy policy2 = new Autopolicy("NJ", "Sedan", 5040);
		Autopolicy policy3 = new Autopolicy("LOS", "Mercedes", 2028);

		//display whether each policy is in a no fault state
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		policyInNoFaultState(policy3);

	}

	public static void policyInNoFaultState(Autopolicy policy) {

		System.out.println("%%%%%%%%%%The Autopolicy%%%%%%%%%%%%%%%");
		System.out.printf(
         "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n", 
         policy.getAccountNumber(), policy.getMakeAndModel(), 
         policy.getState(), 
         (policy.isNoFaultState() ? "is": "is not"));
	}
}