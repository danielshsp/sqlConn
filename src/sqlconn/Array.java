/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconn;

import java.util.*;
public class Array {

     
    public static void main(String[] args) {
        int j = 0;
        int count=0;
        int cheked = 0;
        int cheked1 = 0;
        ArrayList<Integer> arr = new ArrayList(); 
        for(int i = 0; i< 5; i++){
            arr.add(1);
            arr.add(2);
        }
        int s = arr.size();
        int [] arrInt = new int[s];
        for(int num :arr){
          arrInt[j] = num; 
          j++;
          
        }
        for(int i =0; i <arrInt.length-1; i++){
           // System.out.println(arrInt[i]); 
             if(arrInt[i]==2){
                    if(arrInt[i+1] != 2){
                     count++;
                    } 
             }
        }
       System.out.print(count); 
       //System.out.print(Arrays.toString(arrInt)); 
    }
    
}
