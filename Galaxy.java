
public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String ring() {
        return "I'm a Galaxy";
    }
    @Override
    public String unlock() {
        return "Face";
    }
	@Override
	public void displayInfo() {
		System.out.print(this.getVersion());
		System.out.print(this.getBattery());
		System.out.print(this.getCarrier());
		System.out.println(this.getTone());
	}
}
