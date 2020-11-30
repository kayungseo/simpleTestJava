package standardJava;
//�Ű������� ������
//���� ������ ��ü�� �迭�� �ٷ�� 

//product class
class Product{
	int price;//����
	int bonusPoint;//���� ����Ʈ 
	
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
	int money = 1000;//���� �� 
	int bonusPoint = 0;//���� ����Ʈ 
	Product[] cart = new Product[10];//������ ��ǰ�� �����ϱ� ���� �迭 
	int i = 0;//Product�迭�� ���� ī����
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.printf("�ܾ��� �����Ͽ� %s��/�� �� �� �����ϴ�. ", p.toString());
			return;
		}else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[i++] = p;//cart�� p�� ��� i = i + 1;
			System.out.println(p+"�� �����ϼ̽��ϴ�. ");
		}
	}
	
	void summary() { //������ ��Ǿ�� ���� ������ ����ؼ� �����ش�. 
		int sum = 0; //������ ��ǰ�� �հ�
		String itemList=""; //������ ��ǰ���
		
		//�ݺ����� �̿��ؼ� ������ ������ �� ���ݰ� ����� �����. 
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += (i==0)?""+cart[i]:","+cart[i]; 
		}
		System.out.println("�����Ͻ� ��Ǿ�� �Ѿ���" + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
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
