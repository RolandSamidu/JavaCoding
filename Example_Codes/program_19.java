class ChristmasTree {
    public static final int segments = 4;
    public static final int height = 4;

    public static void main(String[] args) {
        makeTree();
    }

    public static void makeTree() {
        int maxStars = 2 * height + 2 * segments - 3;
        String maxStr = "";
        for (int l = 0; l < maxStars; l++) {
            maxStr += " ";
        }

        for (int i = 1; i <= segments; i++) {
            for (int line = 1; line <= height; line++) {
                String starStr = "";
                for (int j = 1; j <= 2 * line + 2 * i - 3; j++) {
                    starStr += "*";
                }

                for (int space = 0; space <= maxStars - (height + line + i); space++) {
                    starStr = " " + starStr;
                }
                System.out.println(starStr);
            }
        }

        for (int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }

        System.out.println(" " + "*" + " ");

        for (int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }

        System.out.println(" " + "*" + " ");

        for (int i = 0; i <= maxStars / 2 - 3; i++) {
            System.out.print(" ");
        }

        System.out.println(" " + "***");
    }
}
