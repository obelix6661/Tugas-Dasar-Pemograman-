import java.util.Scanner;

 class Hewan {

	void karnivora (){
		System.out.println("");
	System.out.println("Hewan Karnivora");
	System.out.println("");
		System.out.println("Ciri umum yang menjadi karakteristik hewan karnivora,\n terutama hewan karnivora vertebrata adalah memiliki organ yang dipergunakan untuk \n menangkap dan juga mencabik mangsa gigi dan cakar");
	System.out.println("=============================================================================================================");
	}
	void herbivora() {
		System.out.print("");
		System.out.println("Hewan Herbivora");
		System.out.println("");
		System.out.println("Herbivora adalah hewan pemakan tumbuhan. Ciri-ciri hewan herbivora: berkaki empat, berdarah panas, hidup di daratan, \n vivipar (beranak), mamalia. Misalnya, sapi, kerbau, kuda, domba.");
		System.out.println("=============================================================================================================");
	}
	void omnivora(){
		System.out.print("");
		System.out.println("Hewan Omnivora");
		System.out.println("");
		System.out.println("adalah hewan pemakan segala. Ciri-ciri hewan omnivora: berkembang biak secara ovipar, berdarah panas/dingin, \n mengerami telurnya, berkaki dua. Contohnya ayam, angsa, burung dan itik.");
		System.out.println("=============================================================================================================");
		}
 }
class Tumbuhan{

	void dikotil(){
		System.out.print("");
		System.out.println("Dikotil");
		System.out.println("");
		System.out.println("Biji pada tumbuhan yang tergolong dalam dikotil yakni berkeping dua. Hal ini dapat dilihat saat proses \n perkecambahan biji membelah menjadi dua bagian.");
		System.out.println("=============================================================================================================");
	}	
	void monokotil(){
		System.out.print("");
		System.out.println("Monokotil");
		System.out.println("");
		System.out.println("Biji pada tumbuhan yang tergolong kepada kelompok monokotil yaitu berkeping satu. Pada saat perkecambahan \n tidak ada pembelahaan.");
	System.out.println("=============================================================================================================");
	}
	}
	
	
public class Makhlukhidup{
	public static void main(String [] args){
	
		Hewan Ciri= new Hewan();
		Tumbuhan Jenis=new Tumbuhan();
		Scanner masuk=new Scanner(System.in);
int pilih;

for (String tanya = "ya"; tanya.equals("ya")||tanya.equals(""); ) {

	System.out.println("Selamat Datang Di Buku Flora dan Fauna");
	System.out.println("1. Seputar Hewan");
	System.out.println("2. Seputar Tumbuhan");
	System.out.print("Silahkan Pilih Menu Yang Akan Anda Akses : " );
	pilih=masuk.nextInt();
	
		if (pilih==1) {
			System.out.println("=============================================================================================================");
			System.out.println("ANDA MEMASUKI MENU HEWAN");
			System.out.println("=============================================================================================================");
		Ciri.karnivora();
		Ciri.herbivora();
		Ciri.omnivora();
		}
		
		else{
			System.out.println("=============================================================================================================");
			System.out.println("ANDA MEMASUKI MENU TUMBUHAN");
			System.out.println("=============================================================================================================");
		Jenis.dikotil();
		Jenis.monokotil();
		}
			System.out.println("");
		
					System.out.println("Apakah anda mau melanjutkan? ya/tidak");
					tanya=masuk.next();
					
				System.out.println("=============================================================================================================");
					System.out.println("");
	
		}
	}
}