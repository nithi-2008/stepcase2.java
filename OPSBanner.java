class OPSBanner {

    public static String[] buildO() {
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        return O;
    }

    public static String[] buildP() {
        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
        return P;
    }

    public static String[] buildS() {
        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
        return S;
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        for (int i = 0; i < 5; i++) {
            System.out.println(O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
} class OPSBanner {
    
}
