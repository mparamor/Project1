/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;
import java.util.ArrayList;
/**
 *
 * @author Sarah
 */
public class Inventory {
    ArrayList<String> db = new ArrayList<>();
    int b = db.size();
    
    public void diaplay(String p){
        for(int i=0;i<b;i++){
            String s = db.get(i);
            if (s.contains(p)){
                String[] det = s.split(",");
                System.out.print(det[0]+", ");
                String m = det[4];
                if (m.equals("true")){
                    System.out.print(det[3]);}
                else
                    System.out.print(det[2]);
                }
            }
        }
    }

