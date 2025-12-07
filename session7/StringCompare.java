package session7;

public class StringCompare {
    public static void main(String[] args) {
        //A=65 - Z=91
        //a=97 - z=123
        String s1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String s2 = new String("Tungjatjeta");

//        if (s1 == s2) {
//            System.out.println("s1 dhe s2 e kane referencen e njejte");
//        } else if (s1.equals(s2)) {
//            System.out.println("s1 dhe s2 kane permbajtjen e njejte");
//        } else if (s1.equalsIgnoreCase(s2)) {
//            System.out.println("s1 dhe s2 lexohen njejte");
//        } else {
//            System.out.println("s1 dhe s2 NUK jane te barabarte");
//        }
//        System.out.println("s1: " + System.identityHashCode(s1));
//        System.out.println("s2: " + System.identityHashCode(s2));

//        int comp = s1.compareTo(s2);
        int comp = s1.compareToIgnoreCase(s2);
        if(comp <  0){
            System.out.printf("%s renditet para %s%n",s1,s2);
        } else if (comp > 0) {
            System.out.printf("%s renditet pas %s%n",s1,s2);
        } else {
            System.out.printf("%s e barabarte me %s%n",s1,s2);
        }
    }
}
