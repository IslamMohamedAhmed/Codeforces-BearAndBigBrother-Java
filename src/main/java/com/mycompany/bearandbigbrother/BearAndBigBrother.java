/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bearandbigbrother;

/**
 *
 * @author Islam Mohamed
 */

import java.util.*;
public class BearAndBigBrother {

    public static void main(String[] args) {
        int limak,brother,ref=1;
        Scanner scan = new Scanner(System.in);
        limak = scan.nextInt();
        brother = scan.nextInt();
        while(limak<=brother){
            limak*=3;
            brother*=2;
            if(limak<=brother){
                ref++;
            }
                    
        }
        System.out.println(ref);
        
        
    }
}
