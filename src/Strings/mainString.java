package Strings;

public class mainString {

    public static void main(String[] args) {

        String data = "Hola mundo Como estas";
        String data02 = "";

        for(int i = data.length() - 1; i >= 0; i-- ) {
            data02 += data.charAt(i);
        }

        System.out.println(data02);
    }
}
