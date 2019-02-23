package com.collections;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableExample {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","Chaitanya");
   hashtable.put("Key2","Ajeet");
   hashtable.put("Key3","Peter");
   hashtable.put("Key4","Ricky");
   hashtable.put("Key5","Mona");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " + hashtable.get(key));
      //System.out.println("Size of Hashtable: " + hashtable.size()); 
   }
   System.out.println("Size of Hashtable: " + hashtable.size());
   //Remove the elemets
   hashtable.remove("Key1");
   System.out.println("Values afetr removal +++++++++++++++++++++++");
   names = hashtable.keys();
   
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " + hashtable.get(key));
      
      
    //Add the elemets
      hashtable.clear();
      hashtable.remove("Key1");
      System.out.println("Values afetr clear the elements");
      names = hashtable.keys();
      
      while(names.hasMoreElements()) {
         key = (String) names.nextElement();
         System.out.println("Key: " +key+ " & Value: " + hashtable.get(key));
    }
 }

}
}