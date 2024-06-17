public class Strings_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Barun");

        System.out.println("0." + " " + sb);

        //char at index 0
        System.out.println("1." + " " + sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'A');
        System.out.println("2." + " " + sb);

        //insert
        sb.insert(0, 'S');
        System.out.println("3." + " " + sb);

        sb.insert(2, 'a');
        System.out.println("4." + " " + sb);

        //delete
        sb.delete(2, 3);
        System.out.println("5." + " " + sb);

        sb.delete(0, 2);
        System.out.println("6." + " " + sb);

        sb.insert(0, 'B');
        System.out.println("7." + " " + sb);

        //append
        sb.append(" ");
        sb.append("P");
        sb.append("a");
        sb.append("n");
        sb.append("t");
        sb.append("h");
        sb.append("i");
        sb.append(" ");
        sb.append("S");
        sb.append("h");
        sb.append("a");
        sb.append("r");
        sb.append("m");
        sb.append("a");
        System.out.println("8." + " " + sb);
        System.out.println("9." + " " + sb.length());

        //reverse
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 20 - 1 - 0 ==> 19

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("10." + " " + sb);
    }
}
