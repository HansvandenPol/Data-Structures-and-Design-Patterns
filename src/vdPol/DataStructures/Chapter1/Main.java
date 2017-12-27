package vdPol.DataStructures.Chapter1;

public class Main {
    // EXERCISE 1
    public static boolean isLeapYear(int year)
    {
        if(year % 4 == 0 && year % 400 == 0)
        {
            if(year % 100 != 0){
                return true;
            }
        }
        return false;
    }

    // EXERCISE 2
    public static int maxOfFour(int a, int b, int c, int d)
    {
        int[] tempArr = {a,b,c,d};
        int temp = a;

        for(int x : tempArr)
        {
            if(x > temp)
            {
                temp = x;
            }
        }
        return temp;
    }

    // EXERCISE 2
    public static int maxOfFive(int a, int b, int c, int d, int e)
    {
        int[] tempArr = {a,b,c,d,e};
        int temp = a;

        for(int x : tempArr)
        {
            if(x > temp)
            {
                temp = x;
            }
        }
        return temp;
    }

    // EXERCISE 4
    public static void looper()
    {
        String s = "a";

        for(; ;)
        {
            System.out.println("d");
        }


    }

    public static void main(String[] args)
    {
        System.out.println("EXERCISE 1: " + isLeapYear(1600));
        System.out.println("EXERCISE 2: Max of Four(1, 5, 3, 4): " + maxOfFour(1,5,3,4) + " Max of Five(3, 7, 2, 1, 7): " + maxOfFive(3, 7, 2, 1, 7));
        System.out.println("Exercise 4: looper ");
    }
}
