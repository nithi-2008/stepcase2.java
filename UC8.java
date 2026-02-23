import java.util.HashMap;
import java.util.Map;

class UC8 {

    private static Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
    

