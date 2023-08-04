public class ValidPassword {

    public static boolean isValidPassword(String password){
        if(password.length() < 6 || password.contains(" ")){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;


       for(char ch : password.toCharArray()) {
           if(Character.isUpperCase(ch)){
               hasUpperCase = true;
           }else if (Character.isLowerCase(ch)){
               hasLowerCase = true;
           }else if (Character.isDigit(ch)){
               hasDigit = true;
           }else {
               hasSpecialChar = true;
           }
       }

       return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }


    public static void main(String[] args) {

        String password = "XanL!Kho@";
        boolean isValid = isValidPassword(password);
        System.out.println(isValid);
    }

}
