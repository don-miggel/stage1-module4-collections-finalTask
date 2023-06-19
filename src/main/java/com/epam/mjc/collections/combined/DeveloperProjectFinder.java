package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new ArrayList<>();
        Comparator<String> compLen = (s1, s2)-> {
            if(s1.length() == s2.length())
                return s2.compareTo(s1);
            else
                return s2.length() - s1.length();
        };

        for(String key : projects.keySet()){
            if(projects.get(key).contains(developer))
                res.add(key);
        }
        res.sort(compLen);
        return res;


    }
}
