package lab12;

abstract class RentalProduct {
	private int id ;  //제품 번호 
	int price ;          //대여 비용 
	boolean isrent ;    //현재 대여 중인지 여부 : true면 대여 중. false면 보유 중 
	String title ;
	RentalProduct (int id, int price,String title )
	{   this.id = id;
		this.price = price;
		this.title = title;
	}
	public int getId() {
		return id;
	}

}
class DVD extends RentalProduct{
	String type ;    //드라마, 공포, 오락, 애니메이션, 다큐멘터리 등 DVD 종류
	DVD (int id, String type, String title, int price ){
		super(id, price,title);
		this.type = type;
	}
}
class Book extends RentalProduct{
	String author  ;  //저자  
	Book (int id, String title, int price, String author  ){
		super(id, price,title);
		this.author = author;
	}
}