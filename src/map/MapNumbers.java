package map;

import java.util.HashMap;
import java.util.Map;

public class MapNumbers {
    public static void main(String[] args) {
        Map<Integer, String> englishNumbers = new HashMap<>();
        englishNumbers.put(1, "one");
        englishNumbers.put(2, "two");
        englishNumbers.put(3, "three");
        englishNumbers.put(4, "four");
        englishNumbers.put(5, "five");

        Map<Integer, String> NumeriItaliani = new HashMap<>();
        NumeriItaliani.put(1, "uno");
        NumeriItaliani.put(3, "tre");
        NumeriItaliani.put(5, "cinque");
        NumeriItaliani.put(7, "sette");
        NumeriItaliani.put(9, "nove");

        //merge the two maps
        for (Map.Entry<Integer, String> entry : NumeriItaliani.entrySet()) {
            englishNumbers.put(entry.getKey(), entry.getValue());
        }

        System.out.println(englishNumbers.get(5)!=null?englishNumbers.get(5):"No associated value");
        System.out.println(englishNumbers.get(6)!=null?englishNumbers.get(6):"No associated value");
        System.out.println(englishNumbers.get(7)!=null?englishNumbers.get(7):"No associated value");
        System.out.println(englishNumbers.get(8)!=null?englishNumbers.get(8):"No associated value");
        System.out.println(englishNumbers.get(9)!=null?englishNumbers.get(9):"No associated value");
    }
}


//Define a testing class with a main() method where you:
//
//create an HashMap that maps the numbers from 1 to 5 with their respective English names
//create an HashMap that maps the odd number from 1 to 9 with their respective Italian names
//merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten in the first HashMap)
//        print the modified firstHashMap
//        print on screen the value of the keys 5, 6, 7, 8 and 9
//                                                                             if there's no mapping for a specific key, print No associated value
