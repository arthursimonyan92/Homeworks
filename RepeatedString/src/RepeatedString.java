import java.util.ArrayList;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "ararata";

        char a[] = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if (a[i] == a[j]) {
                    if (!arrayList.contains(a[i])){
                        arrayList.add(a[i]);
                    }
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+ " ");
        }
    }
}
