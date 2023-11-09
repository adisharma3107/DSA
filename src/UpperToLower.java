public class UpperToLower {
        static String UpperToLower(String s) {
            String result = "";
            char ch = ' ';
            for (int i = 0; i < s.length(); i++) {

                //check valid alphabet and it is in Uppercase
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    ch = (char)(s.charAt(i) + 32);
                }
                //else keep the same alphabet or any character
                else {
                    ch = (char)(s.charAt(i));
                }

                result += ch; // concatenation, append c to result
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(UpperToLower("IncludeHelp.com"));
            System.out.println(UpperToLower("www.example.com"));
            System.out.println(UpperToLower("123ABCD@9081"));
            System.out.println(UpperToLower("OKAY@123"));
        }
}
