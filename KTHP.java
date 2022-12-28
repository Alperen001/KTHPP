import java.util.Scanner;

public class KTHP {

	public static void main(String[] args) {
		double tutar, kdvOran, kdvTutar, kdvliTutar;
		Scanner inp = new Scanner(System.in);
		System.out.println("Lütfen Fiyatý Giriniz: ");
		tutar = inp.nextDouble();
		if (tutar > 1000)
			kdvOran = 0.08;
		else
			kdvOran = 0.18;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		System.out.println("Kdv'siz tutar: " + tutar);
		System.out.println("Kdv Oraný: " + kdvOran);
		System.out.println("Kdv Tutarý: " + kdvTutar);
		System.out.println("Kdv'li Tutar: " + kdvliTutar);
	}

}
