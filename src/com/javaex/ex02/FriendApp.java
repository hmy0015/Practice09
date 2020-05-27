package com.javaex.ex02;
import java.util.*;

public class FriendApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
		List<Friend> fList = new ArrayList<Friend>();
		int cnt = 0;

        System.out.println("친구를 3명 등록해 주세요");
    	
        while(cnt < 3) {
        	String fInfo = sc.nextLine();
        	String[] sArray = fInfo.split(" ");
        	
        	Friend friend = new Friend(sArray[0], sArray[1], sArray[2]);
        	fList.add(friend);
        	cnt++;
        }
        
        for(int i = 0; i < fList.size(); i++) {
        	fList.get(i).showInfo();
        }
        sc.close();
    }
}
