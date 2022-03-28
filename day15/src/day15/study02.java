package day15;

public class study02 {
	public static void main(String[] args) {
		전사1 a전사1 = new 전사1();

	    a전사1.공격("브라이언","칼"); 
	    // 브라이언이(가) 칼(으)로 공격합니다.

	    a전사1.재공격("브라이언","칼");
	    // 브라이언이(가) 칼(으)로 공격합니다.

	    a전사1.공격("필립","창"); 
	    // 필립이(가) 창(으)로 공격합니다.

	    a전사1.공격("마크","지팡이"); 
	    // 마크(가) 지팡이(으)로 공격합니다.

	    a전사1.재공격("마크","지팡이");
	    // 마크(가) 지팡이(으)로 공격합니다.

	    a전사1.재공격("마크","지팡이");
	    // 마크(가) 지팡이(으)로 공격합니다.
	}
}
class 전사1 {
	String name;
	String wp;
	void 공격(String name,String wp) {
		this.name = name;
		this.wp = wp;
		
		System.out.printf("%s"+"이(가)"+"%s"+"(으)로 공격합니다.\n",name,wp);
	}
	void 재공격(String name,String wp) {
		System.out.printf("%s"+"이(가)"+"%s"+"(으)로 공격합니다.\n",name,wp);
	}
}
