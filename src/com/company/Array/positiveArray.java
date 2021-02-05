package com.company.Array;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {38, 5, 10, 0, 89, 1, -9, 13, 29};

        int i;
        int n = 0;
        for (i = 0; i < arr.length; i++) {

                if (arr[i] > 0) {
                    n++;
                }
            }
            int[] posArr = new int[n];
            int j;

        for (i=0, j=0; i< arr.length && j< n; i++) {
            if(arr[i]>0) {
                 posArr[j]=arr[i];
                 j++;
             }

        }
        for (j=0; j<posArr.length; j++){
        System.out.println(posArr[j]);
    } } }
