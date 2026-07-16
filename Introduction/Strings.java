public class Strings {
    public static void main(String[] args) {
        String txt = "Hello, World!";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println(txt.indexOf("orl"));
        for(int i = 0; i < txt.length(); i++)
            System.out.print(txt.charAt(i) + " ");
        System.out.println();

        String txt1 = "Hello";
        String txt2 = "Hello";
        System.out.println(txt1.equals(txt2)); // true

        String txt3 = "Greetings";
        String txt4 = "Great things";
        System.out.println(txt3.equals(txt4)); // false

        txt = "          Hello,    World!         ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");

        System.out.println(txt1.concat(" = " + txt2));

        String test = "\nSome text";
        System.out.println(test);
    }
}
