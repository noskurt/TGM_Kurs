package tgm_kurs_8_1;

public class TurkishChar {

	private String text;
	private String fixedText = "";
	private int quantity;

	public TurkishChar() {
	}

	public TurkishChar(String text) {
		this.text = text;
	}
	
	// Tek tek tüm harfleri gezerek türkçe karakterleri değiştiriyor
	public void generate () {
		for (int i = 0; i < text.length(); i++) {
			switch (text.charAt(i)) {
				case 'ü':
					fixedText += 'u';
					quantity++;
					break;
				case 'ğ':
					fixedText += 'g';
					quantity++;
					break;
				case 'ı':
					fixedText += 'i';
					quantity++;
					break;
				case 'ç':
					fixedText += 'c';
					quantity++;
					break;
				case 'ö':
					fixedText += 'o';
					quantity++;
					break;
				case 'ş':
					fixedText += 's';
					quantity++;
					break;
				default:
					fixedText += text.charAt(i);
					break;
			}
		}
	}

	public String getText () {
		return text;
	}

	public void setText (String text) {
		this.text = text;
	}

	public String getFixedText () {
		return fixedText;
	}

	public void setFixedText (String fixedText) {
		this.fixedText = fixedText;
	}

	public int getQuantity () {
		return quantity;
	}

	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
}