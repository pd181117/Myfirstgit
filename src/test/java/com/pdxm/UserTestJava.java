package com.pdxm;

import java.util.ArrayList;
import java.util.List;

import com.pdxm.entity.User;

public class UserTestJava {

	public static void main(String[] args) {
		List<User> list1=new ArrayList<User>();
		list1.add(new User(1, "tom123", "123", "tom"));
	
		List<User> list2=new ArrayList<User>();
		list2.add(new User(1, "tom123", "123", "tom"));
		
		
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				 if(list1.get(i).getId().equals(list2.get(j).getId())) {
					 list2.remove(list2.get(j));
					 list1.remove(list1.get(i));
					 i--;
					 break;
				 }
			}
		}
	
		for (User user : list1) {
			System.out.println(user);
		}
        System.out.println("------------------");
		for (User user : list2) {
			System.out.println(user);
		}
	}
	
}
