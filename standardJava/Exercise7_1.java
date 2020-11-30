package standardJava;

/**
 * 1. 섯다카드 20장 포함하는 섯다카드 한벌을 정의함.
 * 섯다카드 20장 담는 SutdaCard배열을 초기화하라. 
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 
 * 숫자가 1, 3, 8인 경우에는 둘 중 한장은 광(Kwang)이어야 한다.
 * 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.  
 * 
 * @author USER
 *
 */

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	//문제 
	SutdaDeck() {
		for(int i=1;i<CARD_NUM+1;i++) {
			int num = i;
			cards[i-1] = new SutdaCard(num, (num==1||num==3||num==8? true:false));
		}
	}
	
	//1.
	public void shuffle() {
		for(int i=0;i<cards.length;i++) {
			int n = (int)(Math.random() * cards.length);
			SutdaCard temp = new SutdaCard();
			
			temp = cards[n];
			cards[n] = cards[i];
			cards[i] = temp;
		}
	}
	
	//2. 
	public SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) {
			return null;
		}
		
		return cards[index];
	}
	
	//3.
	public SutdaCard pick() {
		int random = (int)(Math.random() * cards.length);
		
		return cards[random];
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0;i<deck.cards.length;i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
