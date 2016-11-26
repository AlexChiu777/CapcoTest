package capco;

/**
 * Created by Alex on 9/7/2016.
 */

/*
*
* Merge Strings*/
public class Test1 {

    static String mergeStrings (String a, String b) {
        String result = "";

        int sizeA = a.length();
        int sizeB = b.length();

        int loopLength = 0;

        if (sizeA >= sizeB) {
            loopLength = sizeA;
        } else {
            loopLength = sizeB;
        }

        for (int i=0; i<loopLength; i++) {
            if (i < sizeA) {
                result = result + a.charAt(i);
            }

            if (i < sizeB) {
                result = result + b.charAt(i);
            }
        }



        return result;
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("abc", "defef"));
    }


}
