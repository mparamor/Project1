/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Sarah
 */
public class Inventory {
    ArrayList<String> db = new ArrayList<>();
    int b = db.size();
    
    public void display(String p){
        int z = 0;
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
            else
                z++;
                    
        }
        if (z == b){
            System.out.println("Part not found.");
        }
    }
    
    public void sortName(ArrayList a){
        
    }
    
    public ArrayList<String> sortNum(ArrayList a){
        int i;
        int j;
        for(i=0;i<b-1;i++){
            for (j=0;j<b-i-1;j++){
                String e = db.get(i);
                String f = db.get(i+1);
                String[] g = e.split(",");
                String[] h = f.split(",");
                int first = Integer.parseInt(g[1]);
                int sec = Integer.parseInt(h[1]);
                if (first>sec){
                    Collections.swap(db,i,i+1);
                    
                }
            }
        }
        return db;
    }
    }

