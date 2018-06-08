
public class run {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9 ",99," Verizon"," RingMe");
		IPhone ip = new IPhone("X ",42," AT&T"," ZingMe");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		ip.displayInfo();
		System.out.println(ip.ring());
		System.out.println(ip.unlock());
	}
}
