package Singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RensyuTriple {

    private static Map<String, RensyuTriple> map = new HashMap<>();
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA"};
        Arrays.stream(names).forEach(s->map.put(s, new RensyuTriple(s)));
    }

    private String name;
    
    private RensyuTriple(String name){
        this.name = name;
    }

    public static RensyuTriple getInstance(String name){
        return map.get(name);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
