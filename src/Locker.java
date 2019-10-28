
/* create a boolean array of [101], call it locker[101]
.initalize boolean all elements array to false //where  closed locker is false
. for (int index = 0; index < 100; index++)
   // set booleanarry[index] = ! booleanarray[index]
   // booleanarry[index] = true


   for(int m = i; m < 100; m++){
  for (int
   if (locker[m] == true)
   locker[m] = false
   else locker[m] = true

}
4. for (int i =1; i <= 100; i++)
{
if (locker[i] is open
then print locker number
}









*/


import java.util.Scanner;

public class Locker {

    public static void Locker(String[] args) {
        boolean locker[] = new boolean[101];
//close all lockers
        for (int i = 0; i < 101; i++)
            locker[i] = false;

        // Starting from locker 1 to locker 100
        for (int i = 1; i <= 100; i++) {
            // starting from i th Locker, open or close every i th Locker

            for (int m = i; m <= 100; m = m + i) {


                locker[m] = !locker[m];


        }
    }

// check all lockers. if open then print out Locker number
        for (int i = 1; i <=100; i++)
           if (locker[i])
            System.out.println("locker number"+ i +"is opened");
}
}