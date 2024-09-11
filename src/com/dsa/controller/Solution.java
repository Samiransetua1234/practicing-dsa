package com.dsa.controller;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(12);
		oddEvenTransform(list, 3);
		
		System.out.println(list);
	}
    public static List<Integer> oddEvenTransform(List<Integer> arr, int transform) {
        int i =1;
        while(i <= transform)
        {
            for(int j = 0; j< arr.size(); i++)
            {
                int ele = arr.get(j);
                if(ele%2 ==0){
                    arr.set(j, ele-3);
                }else{
                    arr.set(j, ele+3);
                }
            }
            i++;
        }
        
        return arr;
    }

}

