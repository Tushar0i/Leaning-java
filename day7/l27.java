public interface l27 {

    public static void main(String[] args) {
        System.out.println("Int this we are going to learn about 2D array");

        String[] vegetable = { "potato", "onion", "carrot" };

        String[] bevrages = { "redbull", "sprite", "coke", "fizz" };

        String[][] groceries = { { "apple", "orange", "banana" }, vegetable, bevrages };

        groceries[0][1] = "pineapple";
        groceries[1][0] = "tomato";
        groceries[2][3] = "fanta";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        // A number pad

        char[][] telephone = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, { '*', '0', '#' } };

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");

            }
            System.out.println();
        }
    }
}
