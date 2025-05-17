public class JavaStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.toString()); // kosong

        StringBuilder sb1 = new StringBuilder(1000);
        System.out.println(sb1.capacity()); // 1000
        System.out.println(sb1.toString()); // kosong

        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb2.capacity()); // 20
        System.out.println(sb2.toString()); //Java

        CharSequence seq = new StringBuilder("String");
        StringBuilder sb3 = new StringBuilder(seq);
        System.out.println(sb3.capacity()); // 22
        System.out.println(sb3.toString()); //String

        sb3.append(" Java");
        System.out.println(sb3.toString()); //String Java

        sb3.insert(11, " Builder");
        System.out.println(sb3.toString()); //String Java Builder

        System.out.println(sb3.compareTo(sb2)); // 9
        System.out.println(sb3.equals(sb2)); // false
        System.out.println(sb3.charAt(2)); // r
        System.out.println(sb3.substring(3)); //ing Java Builder
        System.out.println(sb3.length()); //19
        System.out.println(sb3.reverse()); //redliuB avaJ gnirtS
    }
}
