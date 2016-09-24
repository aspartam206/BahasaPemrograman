import java.util.Scanner; 

class ifelse{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int input = 5;
		System.out.print("Masukan Sebuah Bilangan \t:");
		double input = in.nextDouble();
		else if (input <= 10.0 ) {
			System.out.println("Belok Kiri");
		}
		else if (input <= 20.0 ) {
			System.out.println("Belok Kanan");
		}
		String sInput = "Mochammad Rizki";

		//System.out.print("Masukan namamu :");
		//String sInput = in.next();
		String namapanggilan = sInput.substring(10);
		String namapendek = sInput.substring(10,13);

		System.out.println("nama asli adalah : "+sInput);
		System.out.println("nama panggilan adalah : "+namapanggilan);
		System.out.println("nama pendek adalah : "+namapendek);
		System.out.println("panjang nama adalah : "+sInput.length());
	}
}