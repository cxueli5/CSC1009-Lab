import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map.Entry;

class generateHash{
    public static void main(String args[])
	{
        LinkedHashMap<Integer, Integer> hashMap2 = new LinkedHashMap<Integer, Integer>();
        int i;
        for (i=0; i<500; i++){
            hashMap2.put(i, randomNumberGenerator(1000, 9999));
        }
        // System.out.println(hashMap2);

        int checkExist = randomNumberGenerator(1000, 9999);
        System.out.println(findValue(hashMap2, checkExist));
        // System.out.println(findValue(hashMap2, 4089));
	}

    public static Integer findValue(LinkedHashMap<Integer, Integer> linkHashMap, int searchVal){
        if(linkHashMap.containsValue(searchVal)){
            for (Entry<Integer, Integer> entry : linkHashMap.entrySet()) {
                if (Objects.equals(entry.getValue(), searchVal)) {
                    return entry.getKey();
                }
            }
        } 
        return -1;
    }

    public static int randomNumberGenerator(int min, int max){
    double r = Math.random();
        int randomNum = (int) (r * (max - min)) + min;
        return randomNum;
    }
    
}

