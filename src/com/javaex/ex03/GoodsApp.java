package com.javaex.ex03;
import java.util.*;

public class GoodsApp {
    public static void main(String[] args) {
    	List<Goods> gList = new ArrayList<Goods>();
    	Scanner sc = new Scanner(System.in);
    	int total = 0;
       
    	System.out.println("상품을 입력해주세요.");

    	while(true) {
    		String gInfo = sc.nextLine();
    		
    		if(gInfo.equals("q")) {
    			System.out.println("[입력완료]");
    			break;
    		}
    		
        	String[] gArray = gInfo.split(",");
        	Goods goods = new Goods(gArray[0], Integer.parseInt(gArray[1]), Integer.parseInt(gArray[2]));
        	
        	gList.add(goods);
        	total++;
    	}
    	sc.close();
    	
		for(int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
		}
		System.out.println("모든 상품의 갯수는 " + total + "입니다.");
    }
}
