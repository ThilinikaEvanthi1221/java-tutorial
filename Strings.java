public class Strings {
    public static void main(String[] args) {
        String name1 = "Thilinika";
        String name2 = "Evanthi";

        String name3 = name1 + " " + name2;
        System.out.println(name3);

        // charAt
        // to check what character in the given position

        String name = "Aman";
        System.out.println(name.charAt(0));
        System.out.println(name.length());

        // replace
        String name4 = "Aman";
        String name5 = name4.replace('a', 'b');
        System.out.println(name5);

        // substring
        String name6 = "Aman and Apu";
        System.out.println(name6.substring(0, 4));
        // end index not include to the output
        System.out.println(name6.substring(5, 8));
    }
}
