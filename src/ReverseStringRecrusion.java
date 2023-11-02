public class ReverseStringRecrusion {
        public static void main(String[] args) {

            String input = "AliveisAwesome";
            //create Method and pass input string as parameter
            String reversed = reverseString(input);
            System.out.println("The reversed string is: " + reversed);

        }

        //Method take string parameter and check string is empty or not
        public static String reverseString(String input)
        {
            if (input.isEmpty()){
                return input;
            }
            //Calling Function Recursively
            return reverseString(input.substring(1)) + input.charAt(0);
        }
}
