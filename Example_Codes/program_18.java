class BinaryPattern {
    public static void main(String s[]) {
        int i, j;
        int count = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.format("%d", count++ % 2);
                if (j == i && i != 5)
                    System.out.println("");
            }

            if (i % 2 == 0)
                count = 1;
            else
                count = 0;
        }
    }
}
