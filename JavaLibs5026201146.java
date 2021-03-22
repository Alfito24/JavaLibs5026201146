import javax.swing.*;

public class JavaLibs5026201146 {
    public static void main(String[] args) {
        String name, favoriteClub, favoritePlayer, stadium, describePlayer;
        int win, draw, totalPoints, title, year, capacity, games, loses;
        double  price, income, average;
        JOptionPane.showMessageDialog(null, "Hello Everyone, Welcome to Our Survey, Please fill the questions");
        name = JOptionPane.showInputDialog(null, "What is your name");
        JOptionPane.showMessageDialog(null,  name + ", we hear that you a truly football fans. Let us test your football knowledge");
        favoriteClub = JOptionPane.showInputDialog(null, "What is your favorite club ?");
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "When your club estabilished?"));
        favoritePlayer = JOptionPane.showInputDialog("What is your favorite player in " + favoriteClub + "?");
        describePlayer = JOptionPane.showInputDialog("One word about " + favoritePlayer + "?");
        title = Integer.parseInt(JOptionPane.showInputDialog(null, "How many league trophies your club have?"));
        stadium = JOptionPane.showInputDialog(null, "What is the name of  " + favoriteClub + " stadium?");
        capacity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many capacity in that stadium?"));
        price = Double.parseDouble(JOptionPane.showInputDialog(null, "How many the ticket price in USD?"));
        income = (double) capacity * price;
        win = Integer.parseInt(JOptionPane.showInputDialog(null, "How many wins that the " + favoriteClub + " get this season? "));
        draw = Integer.parseInt(JOptionPane.showInputDialog(null, "How many draws that " + favoriteClub + " get this season? "));
        loses = Integer.parseInt(JOptionPane.showInputDialog(null, "How many loses that " + favoriteClub + " get this season? "));
        games = win + draw + loses;
        totalPoints = (3 * win) + (1 * draw);
        average =  (double) totalPoints / games;
        String win2 = Integer.toString(win);
        JOptionPane.showMessageDialog(null, "Thank you " + name + " for your answers. Lets recap your answers");
        JOptionPane.showMessageDialog(null, name + " is the football fans, " + "He/She knows everything about " + favoriteClub  +
                name + " said that " + favoriteClub + " was estabilished in " + year + ", " + "and now, " + favoriteClub + " has " + title + " trophies. " + name + " favorite player is " + favoritePlayer + ", "  + name + " thinks " + favoritePlayer + " is " + describePlayer +
                "\nThe name of " + favoriteClub + " stadium is " + stadium + ", the capacity is " + capacity + ". If stadium full, total income is " + " $" +income + "\n" +
                "This season " + favoriteClub + " play " + games + " games, get " + win2 + " wins, " + draw + " draws,and  " + loses + " loses" + ", so " + favoriteClub + " get " + totalPoints + " points or " + " get " + average + " per game" );
    }
}
