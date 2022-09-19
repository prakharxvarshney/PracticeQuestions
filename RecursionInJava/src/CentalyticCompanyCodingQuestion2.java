import java.util.*;
public class CentalyticCompanyCodingQuestion2 {
    static HashSet<String> st = new HashSet<>();
    static void subsequence(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                String sub = str.substring(i, j);
                st.add(sub);
                for (int k = 1; k < sub.length() - 1; k++) {
                    StringBuilder sb = new StringBuilder(sub);
                    sb.deleteCharAt(k);
                    subsequence(sb.toString());
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string array size - ");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" string");
        String[] s = new String[n];
        for(int i=0; i<n; i++) {
            s[i] = scan.next();
        }
        int[] arr = new int[n];
        int count=0;
        for(int i=0; i<n;i++) {
            String str = s[i];
            subsequence(str);
            count = count+st.size()-1;
            arr[i] = count;
            st.clear();
        }
        System.out.println(Arrays.toString(arr));
    }
}
