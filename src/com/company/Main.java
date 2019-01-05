package com.company;

public class Main {
    public static int[] A = {15,9,8,1,4,11,7,12,13,6,5,3,16,2,10,14};

    public static void main(String[] args) {
	    for(int pos = 1; pos<A.length -1; pos++){
	        insert(pos,A[pos]);
        }
    }

    public static void insert(int pos, int value){
        int i = pos -1;
        while ((i>=0)&&A[i]>value){
            A[i+1] = A[i];
            i = i-1;
            A[i+1] = value;
        }
    }

}
