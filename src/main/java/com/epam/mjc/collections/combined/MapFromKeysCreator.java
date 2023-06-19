package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> res = new HashMap<>();
        int wordLen = 0;
        for(String key : sourceMap.keySet()){
            wordLen = key.length();
            if(res.containsKey(wordLen))
                res.get(wordLen).add(key);
            else {
                res.put(wordLen, new HashSet<>());
                res.get(wordLen).add(key);
            }
        }
        return res;
    }
}

