
import decorator.GoodOlCheapoTVA;
import programme.GoodOlCheapo;

public class Main {
	
	public static void main(String[] args) {
	
		//Ancienne classe
		GoodOlCheapo goCheap = new GoodOlCheapo();
		System.out.println("White Haze : "+ goCheap.getBestOffer("White Haze").price);
		
		//Application design pattern Decorator
		GoodOlCheapoTVA goCheapTVA = new GoodOlCheapoTVA(goCheap);
		System.out.println("White Haze whith TVA : "+ goCheapTVA.getBestOffer("White Haze").price);
		System.out.println("White Haze whith TVA : "+ goCheapTVA.getBestOffer("White Haze").category.getName());
	}

}
