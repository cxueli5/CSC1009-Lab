import java.util.LinkedList;

class generate{
    public static void main(String args[])
	{
		LinkedList<Integer> llist2 = new LinkedList<>();
        int i;
        for (i=0; i<500; i++){
            llist2.add(randomNumberGenerator(1000, 9999));
        }
        // System.out.println(llist2);

        int checkExist = randomNumberGenerator(1000, 9999);
        System.out.println(findValue(llist2, checkExist));
        // System.out.println(findValue(llist2, 2648));
	}

    public static int findValue(LinkedList<Integer> list, int searchVal){
        if(list.contains(searchVal)){
            return list.indexOf(searchVal);
        } else {
            return -1;
        }
    }

    public static int randomNumberGenerator(int min, int max){
    double r = Math.random();
        int randomNum = (int) (r * (max - min)) + min;
        return randomNum;
    }
    
}

