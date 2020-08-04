package theoryJavaStech;

/**
 * Created by Loky on 20/07/2020.
 */
public class Substring {
    public static void main(String[ ] args)
        {
            String string = "substringUnderstanding";



        /* Index    0 1 2 3 4 5 6 7 8 9 ...
         *             s u b s t r i n g U n d e r s t a n d i n g
         *         Beginn      3
         *                   s t r
         *         Ende    >|3
         *                   s t r
         *
         * z.B.:
         * -----
         * 0 1 2 3
         * H a n s
         * 1  |s
         *
         *  System.out.println("Hans".substring(1,3));
         */
            String result= string.substring(3,3);

            System.out.println("result == null ? -> " + (result == null));
            System.out.println("result.isEmpty() ? -> " + result.isEmpty());
        }

        /*    public String substring​(int beginIndex, int endIndex)



            Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.

            Examples:

                 "hamburger".substring(4, 8) returns "urge"
                 "smiles".substring(1, 5) returns "mile"


            Parameters:
                beginIndex - the beginning index, inclusive.
                endIndex - the ending index, exclusive.
            Returns:
                the specified substring.
            Throws:
            IndexOutOfBoundsException - if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.
         */

}
