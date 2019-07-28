package com.javabasics.collections.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableEntrySet {
    public static void main(String args[])
    {   HashMap<String, String> myhashmap = new HashMap<>();
        myhashmap.put("Library" , "books");
        myhashmap.put("School", "students");
        myhashmap.put("Court", "lawyers");
        myhashmap.put("RailwayStation", "passengers");
       // Entry object provides getter methods to access key-value objects. entrySet() method returns Set object with Entry values.
        Set<Entry<String, String>> str = myhashmap.entrySet();
        for (Entry<String, String> ent: str
             ) {//te
            System.out.println(ent.getKey() + " ---> " + ent.getValue() );
        }
        myhashmap.remove("School");
        System.out.println("removing particular key "+myhashmap);
        myhashmap.replace("RailwayStation", "BusStation");
        System.out.println("Replacing particular key "+myhashmap);
        // deleting whole map
        myhashmap.clear();
        System.out.println("Clearing all values " +myhashmap);

    }
}
