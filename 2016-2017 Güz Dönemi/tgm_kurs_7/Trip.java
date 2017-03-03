package tgm_kurs_7;

import java.util.Arrays;

// Bu sınıfta bir gezi düzenlediğimizi varsaydık
// Nereye gidileceğini nerden gidileceği gibi bilgiler
// için değişkenler oluşturduk
// Tarih tutmak için ise yeni bir sınıf oluşturduk

public class Trip {

	String going;
	String comeback;
	String leaderName;
	String[] members;

	Tarih goingDate;
	Tarih backDate;

	public Tarih getGoingDate () {
		return goingDate;
	}

	public void setGoingDate (Tarih goingDate) {
		this.goingDate = goingDate;
	}

	public Tarih getBackDate () {
		return backDate;
	}

	public void setBackDate (Tarih backDate) {
		this.backDate = backDate;
	}

	public String getGoing () {
		return going;
	}

	public void setGoing (String going) {
		this.going = going;
	}

	public String getComeback () {
		return comeback;
	}

	public void setComeback (String comeback) {
		this.comeback = comeback;
	}

	public String getLeaderName () {
		return leaderName;
	}

	public void setLeaderName (String leaderName) {
		this.leaderName = leaderName;
	}

	public String[] getMembers () {
		return members;
	}

	public void setMembers (String[] members) {
		this.members = members;
	}

	public String toString () {
		return "Trip [going=" + going + ", comeback=" + comeback
				+ ", leaderName=" + leaderName + ", members="
				+ Arrays.toString(members) + ", goingDate=" + goingDate
				+ ", backDate=" + backDate + "]";
	}
	
	

}