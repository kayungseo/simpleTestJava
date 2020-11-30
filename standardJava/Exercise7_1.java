package standardJava;

/**
 * 1. ����ī�� 20�� �����ϴ� ����ī�� �ѹ��� ������.
 * ����ī�� 20�� ��� SutdaCard�迭�� �ʱ�ȭ�϶�. 
 * ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �ѽ־� �ְ�, 
 * ���ڰ� 1, 3, 8�� ��쿡�� �� �� ������ ��(Kwang)�̾�� �Ѵ�.
 * ��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾�� �Ѵ�.  
 * 
 * @author USER
 *
 */

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	//���� 
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
