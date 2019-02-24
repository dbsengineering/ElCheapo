
import decorator.GoodOlCheapoTVA;
import programme.GoodOlCheapo;
import programme.Offer;

public class Main {
	
	public static void main(String[] args) {
	
		//Ancienne classe
		GoodOlCheapo goCheap = new GoodOlCheapo();
		//System.out.println("White Haze : "+ goCheap.getBestOffer("White Haze").price);
		
		//Application design pattern Decorator
		GoodOlCheapoTVA goCheapTVA = new GoodOlCheapoTVA(goCheap);
		Offer bestOffer = goCheapTVA.getBestOffer("White Haze");
		if(bestOffer != null ) {
			System.out.println("White Haze whith TVA : "+ bestOffer.price);
		}else {
			System.out.println("Nous n'avons pas trouvé d'offres !");
		}
	}

}
