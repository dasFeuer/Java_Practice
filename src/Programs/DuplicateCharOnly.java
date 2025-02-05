package Programs;

public class DuplicateCharOnly {
    public static void printDuplicate(String str){
        StringBuilder restChar = new StringBuilder();
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > 1 && !restChar.toString().contains(String.valueOf(str.charAt(i)))){
                restChar.append(str.charAt(i));
            }
        }
        System.out.println("Duplicates char: " + restChar);
    }
    public static void main(String[] args) {
        String str = "AaBbcCdDEeFfGgHhIiJjKkLlMmNnOoPpQqRr";
        printDuplicate(str);
    }
}
