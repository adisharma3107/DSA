public class CheckForUnique {
    public static boolean checkUnique(String str) {
        boolean containsUnique = false;
        for(Character c : str.toCharArray()){
            if(str.indexOf(c) == str.lastIndexOf(c)){
                containsUnique = true;
            }else{
                containsUnique = false;
            }
        }
        return containsUnique;
    }

    public static void main(String[] args) {
        String unique = "Mississippi";
        System.out.println(checkUnique(unique));
    }
}
