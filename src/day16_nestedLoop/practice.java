package day16_nestedLoop;

public class practice {
    public static void main(String[] args) {

        String str = "aaabbccccddeeeeeee";


        int highest = 0;

        //checks first index
        for (int i = 0; i <= str.length()-1; i++) {
            int count = 0;
            //compares every single following character to index in first loop
            for (int j = 0; j <= str.length()-1; j++)
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            if (count > highest) {
                highest = count;
            }
        }
        System.out.println(highest);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
                if (count == highest) {
                    if (!result.contains("" + str.charAt(j))) {
                        result += str.charAt(j);
                    }
                }
            }
        }

        System.out.println(result);

    }
}





