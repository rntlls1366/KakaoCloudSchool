package lab12;

import java.util.ArrayList;
import java.util.Iterator;

public class RentalProductTest {
	static ArrayList<RentalProduct>  products = new ArrayList<RentalProduct>();
	public static void main(String[] args) {
		Book book  = new Book(1,"트와일라잇",1000,"스테파니메이어"); products.add(book);
		book = new Book(2,"뉴문",1000, "스테파니메이어" );products.add(book);
		book = new Book(3,"이클립스",3000, "스테파니메이어" );;products.add(book);
		book = new Book(4,"브레이킹던",1000, "스테파니메이어" );;products.add(book);

		System.out.println("-----1차로  저장한 객체 모두 출력-----");
		//1)번 메소드 구현 후 실행해봅니다. 
		visitAll(); //저장한 모든 객체 출력 



		//2)번 메소드 구현 후 실행해봅니다. 
		RentalProduct p = searchRentalProductByTitle("브레이킹던") ;
		if(p!=null){
			System.out.println("브레이킹던의 id는 "+p.getId()+" 입니다.");
		}


		//3)4)번 메소드 구현 후 실행해봅니다. 
		book = new Book(5,"아리랑",4000, "조정래" );printMsg(addRentalProduct(book));
		book = new Book(6,"젊은그들",2000, "김동인" );printMsg(addRentalProduct(book));
		//id가 같은 객체가 있어서 저장되지 않아야 함.
		book = new Book(6,"아프니까 청춘이다",1000, "김난도" );printMsg(addRentalProduct(book));
		DVD dvd = new DVD(8, "드라마", "옥자", 10000 ) ;printMsg(addRentalProduct(dvd));

		System.out.println("-----2차로  저장한 객체 모두 출력-----");
		visitAll(); //저장한 모든 객체 출력 


	}

	/**
	 * 1) RentalProductTest.products에 저장하고 있는 모든 RentalProduct의
	 * 정보(id, title, price, 대여여부)를 출력하도록 구현하세요.
	 */
	static void visitAll(){
		Iterator<RentalProduct> iter = products.iterator();
		while(iter.hasNext()) {
			RentalProduct r = iter.next();
			System.out.println("Id : " + r.getId() + " / title : " + r.title + " / price : " + r.price + " / rent : " + r.isrent);
		}
	}

	/**2) RentalProductTest.products 에 저장하고 있는 RentalProduct 중
	 매개인자의 title와 같은 title를 가진 RentalProduct가 있으면 그 객체를 return
	 없으면 null을 return 하도록 구현하세요.
	 */
	static RentalProduct searchRentalProductByTitle(String title){
		for(RentalProduct r : products) {
			if(title.equals(r.title)) return r;
		}
		return null;
	}

	/**3)   RentalProductTest.products 에 저장하고 있는 RentalProduct 중 
	 매개인자의 id와 같은 id를 가진 RentalProduct가 있으면 그 객체를 return
	 없으면 null을 return 하도록 구현하세요.
	 */
	static RentalProduct searchRentalProductById(int id){
		for(RentalProduct r : products) {
			if(id == (r.getId())) return r;
		}
		return null;
	}

	/**4)  RentalProductTest.products 에 저장하고 있는 RentalProduct 중 
	 매개인자 RentalProduct객체의 id와 같은 id를 가진 RentalProduct가 있으면 저장하지 않고,
	 없으면 매개인자 RentalProduct객체를 RentalProductTest.products 에 저장하도록 구현하세요.
	 */
	static boolean addRentalProduct(RentalProduct c){

		for(RentalProduct r : products) {
			if(r.getId() == c.getId()) return false;
		}

		products.add(c);
		return true; //add 하지 못한 경우 false 반환
	}




	static void printMsg(boolean flag){
		if(flag)
			System.out.println(" 성공");
		else
			System.out.println(" 실패");
	}
}