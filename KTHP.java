import java.util.Scanner;

public class KTHP {

	public static void main(String[] args) {
		double tutar, kdvOran, kdvTutar, kdvliTutar;
		Scanner inp = new Scanner(System.in);
		System.out.println("L�tfen Fiyat� Giriniz: ");
		tutar = inp.nextDouble();
		if (tutar > 1000)
			kdvOran = 0.08;
		else
			kdvOran = 0.18;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		System.out.println("Kdv'siz tutar: " + tutar);
		System.out.println("Kdv Oran�: " + kdvOran);
		System.out.println("Kdv Tutar�: " + kdvTutar);
		System.out.println("Kdv'li Tutar: " + kdvliTutar);
	}

}
