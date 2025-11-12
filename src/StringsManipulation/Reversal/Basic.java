package StringsManipulation.Reversal;

public class Basic {

    public static void main(String[] args) {

        String str = "delicious";
        char[] arr = str.toCharArray();

        int n = arr.length;
        int s=0;
        int e=n-1;

        while(s<e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        System.out.println(new String(arr));
    }
}
