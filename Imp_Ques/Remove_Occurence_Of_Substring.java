package Imp_Ques;

public class Remove_Occurence_Of_Substring {
    public static void main(String[] args) {
        System.out.println(func("daabcbaabcbc", "abc"));
    }


    public static String func(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            int id = sb.indexOf(part);
            sb.delete(id, id + part.length());
        }
        return sb.toString();
    }
}
