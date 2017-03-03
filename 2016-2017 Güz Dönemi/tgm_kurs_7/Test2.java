package tgm_kurs_7;

public class Test2 {

	public static void main (String[] args) {

		String[] members = {"Ali", "Ayşe", "Fatma", "Kemal"};

		Trip trip = new Trip();

		trip.setGoing("Eskişehir");
		trip.setComeback("Ankara");
		trip.setLeaderName("Mustafa Kemal ATATÜRK");
		trip.setMembers(members);
		
		Tarih going = new Tarih(2, 12, 2016, 20, 00);
		Tarih back = new Tarih(2, 12, 2016, 15, 30);
		
		trip.setGoingDate(going);
		trip.setBackDate(back);
		
		System.out.println(trip);

	}
}