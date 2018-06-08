
public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String ring() {
        return "I'm an IPhone";
    }
    @Override
    public String unlock() {
    	return "Fingerprints";
        // your code here
    }
	@Override
	public void displayInfo() {
		System.out.print(this.getVersion());
		System.out.print(this.getBattery());
		System.out.print(this.getCarrier());
		System.out.println(this.getTone());
	}

}
