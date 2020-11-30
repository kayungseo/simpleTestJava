package standardJava;
//매개변수의 다형성
//여러 종류의 객체를 배열로 다루기 

//product class
class Product{
	int price;//가격
	int bonusPoint;//적립 포인트 
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product(){}
}

class Tv extends Product{
	Tv(){super(100);}
	
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){super(200);}
	
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(50);}
	
	public String toString() {return "Audio";}
}

class Buyer{
	int money = 1000;//가진 돈 
	int bonusPoint = 0;//가진 포인트 
	Product[] cart = new Product[10];//구입한 제품을 저장하기 위한 배열 
	int i = 0;//Product배열에 사용될 카운터
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.printf("잔액이 부족하여 %s을/를 살 수 없습니다. ", p.toString());
			return;
		}else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[i++] = p;//cart에 p를 담고 i = i + 1;
			System.out.println(p+"를 구입하셨습니다. ");
		}
	}
	
	void summary() { //구매한 물퓸에 대한 정보를 요약해서 보여준다. 
		int sum = 0; //구입한 물품의 합계
		String itemList=""; //구입한 물품목록
		
		//반복문을 이용해서 구입한 물륨의 총 가격과 목록을 만든다. 
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += (i==0)?""+cart[i]:","+cart[i]; 
		}
		System.out.println("구입하신 물퓸의 총액은" + sum + "만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}
public class Ex7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
