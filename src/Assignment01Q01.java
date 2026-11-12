public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String st : args) {
            int val = (int) st.charAt(0) ;
            if (val % 5 == 0) {
                System.out.println(st.charAt(0));
            }
        }
    }
}
