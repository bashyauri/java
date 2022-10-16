class javaMethods {
    public static void main(String[] args) {
        int position = calculateHighScore(400);
        displayHighScore("Bashar", position);

        int position2 = calculateHighScore(1500);
        displayHighScore("Amina", position2);
    }

    public static void displayHighScore(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on high score table");

    }

    public static int calculateHighScore(int score) {
        int scorePosition= 4;
        if (score >= 1000) {
            scorePosition = 1;

        }
        else if (score >= 500){
            scorePosition = 2;
        }
        else if (score >= 100);{
            scorePosition = 3;
        }
        
        return scorePosition;

       
    }
} 
