public class Main {
    public static void main(String[] args) {
        String string1 = "are you able to climb, are you able to swim or are you able to fly?";
        String string2 = string1.replaceAll("\s+are","_XYZ");
        System.out.println(string2);
    }
}