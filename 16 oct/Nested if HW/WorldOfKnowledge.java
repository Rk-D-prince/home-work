import java.util.Scanner;

public class WorldOfKnowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("THE WORLD OF KNOWLEDGE");
        System.out.println("WE WELCOME YOU, SELECT YOUR OPTIONS AS NUMBER:");
        System.out.println("1. FICTION");
        System.out.println("2. FANTASY");
        System.out.println("3. BUSINESS");
        System.out.println("4. PSYCHOLOGY");
        int category = sc.nextInt();

        if (category == 1) {
            System.out.println("FICTION");
            System.out.println("The Options are:");
            System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book 1");
            System.out.println("2. Shadows Rising");
            System.out.println("3. Kunex, It Ends with Us");
            int book = sc.nextInt();

            if (book == 1) {
                System.out.println("Description: A cultural fusion. A modern twist. An ancient battle of good and evil.");
                System.out.println("Amidst an eternal family feud, a purposeless and hyper-anxious Rinad discovers that he is part human and part celestial - a Manwaan!");
                System.out.println("As he navigates through his strange new reality, he encounters magnificent Angels, along with savage Asuras and Rakshasas infiltrating Mumbai.");
                System.out.println("Author: Abhishek Krishnan");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.300");
            } else if (book == 2) {
                System.out.println("Description: Banished from the celestial court for an unspeakable crime, Akran, once a powerful yaksha, spends his days in the city of Mumbai, drinking cheap rum and pretending to be human.");
                System.out.println("When a young girl is abducted, Akran finds himself reluctantly dragged into the investigation.");
                System.out.println("But, as he soon discovers, this is not a simple case of kidnapping—villainous thugs, gods and demons are all involved.");
                System.out.println("And an ancient evil is returning to the world.");
                System.out.println("Author: Rohan Monteiro");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.250");
            } else if (book == 3) {
                System.out.println("Description: The newest, highly anticipated novel from beloved #1 New York Times bestselling author, Colleen Hoover.");
                System.out.println("Sometimes it is the one who loves you who hurts you the most.");
                System.out.println("Lily hasn’t always had it easy, but that's never stopped her from working hard for the life she wants.");
                System.out.println("She’s come a long way from the small town in Maine where she grew up—she graduated from college, moved to Boston and started her own business.");
                System.out.println("So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything in Lily’s life suddenly seems almost too good to be true.");
                System.out.println("Author: Rohan Monteiro");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.350");
            } else {
                System.out.println("Invalid book option!");
            }
        } else if (category == 2) {
            System.out.println("FANTASY");
            System.out.println("The Options are:");
            System.out.println("1. Compass and Blade");
            System.out.println("2. Blood metal Bone");
            System.out.println("3. The shadows between us.");
            int book = sc.nextInt();

            if (book == 1) {
                System.out.println("Description: Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked ships beyond the Isle of Rosevear.");
                System.out.println("The waves sing to her soul, the call of the sea beckoning her into deeper waters.");
                System.out.println("But Rosevear needs her, and she could never abandon her home.");
                System.out.println("Until one evening when lightning splits the sky and the Watch descend, taking Mira’s father away.");
                System.out.println("Author: Rachel Greenlaw");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.370");
            } else if (book == 2) {
                System.out.println("Description: Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced to execution by her own mother.");
                System.out.println("Punished and left for dead, the shadows have cursed her with a second life as a Shadow-blood, cast out and hunted by society for her demon-like powers.");
                System.out.println("Author: Lindsay Cummings");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.275");
            } else if (book == 3) {
                System.out.println("Description: No one knows the extent of the freshly crowned Shadow King's power.");
                System.out.println("Some say he can command the shadows that swirl around him to do his bidding.");
                System.out.println("Others say they speak to him, whispering the thoughts of his enemies.");
                System.out.println("Regardless, Alessandra, tired of being overlooked, has a plan to gain power: woo the Shadow King, marry him, then kill him and take his kingdom for herself.");
                System.out.println("Author: Tricia Leven-seller");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.304");
            } else {
                System.out.println("Invalid book option!");
            }
        } else if (category == 3) {
            System.out.println("BUSINESS");
            System.out.println("The Options are:");
            System.out.println("1. The Psychology of Money");
            System.out.println("2. Do It Today");
            System.out.println("3. Atomic Habits");
            int book = sc.nextInt();

            if (book == 1) {
                System.out.println("Description: Timeless lessons on wealth, greed, and happiness doing well with money isn’t necessarily about what you know.");
                System.out.println("It’s about how you behave. And behavior is hard to teach, even to really smart people.");
                System.out.println("How to manage money, invest it, and make business decisions are typically considered to involve a lot of mathematical calculations, where data and formulae tell us exactly what to do.");
                System.out.println("Author: Morgan Housel");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.300");
            } else if (book == 2) {
                System.out.println("Description: Are you also tired of putting off your dreams until \"tomorrow?\" Guess what! Tomorrow never comes. Am I right?");
                System.out.println("I've procrastinated and put off my desire to write a book for a decade.");
                System.out.println("I always came up with excuses like, \"it's not the right time.\" Or, \"I need to do more research.\"");
                System.out.println("But in 2015 I got tired of this endless procrastination, and finally took action.");
                System.out.println("Six months later, my first book was published.");
                System.out.println("Look, we all have limited time on our hands.");
                System.out.println("And we're getting closer to death every single minute.");
                System.out.println("That shouldn't scare. That should motivate you!");
                System.out.println("Time is limited, that's why we must do the things we want: Today.");
                System.out.println("Author: Darius Foroux");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.100");
            } else if (book == 3) {
                System.out.println("Description: People think that when you want to change your life, you need to think big.");
                System.out.println("But world-renowned habits expert James Clear has discovered another way.");
                System.out.println("He knows that real change comes from the compound effect of hundreds of small decisions: doing two push-ups a day, waking up five minutes early, or holding a single short phone call.");
                System.out.println("Author: James Clear");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.350");
            } else {
                System.out.println("Invalid book option!");
            }
        } else if (category == 4) {
            System.out.println("PSYCHOLOGY");
            System.out.println("The Options are:");
            System.out.println("1. Dark Psychology Secrets & Manipulation");
            System.out.println("2. The Power of Your Subconscious Mind");
            System.out.println("3. The Courage to Be Disliked");
            int book = sc.nextInt();

            if (book == 1) {
                System.out.println("Description: In relation to the psychological essence of the various kinds of people who prey on others, dark psychology can be seen as studying the human condition.");
                System.out.println("The truth is that there is the potential for any single human being to victimize other people or other living creatures.");
                System.out.println("Most people prefer to suppress their dark impulses and prevent themselves from acting on any desire they have because of social norms, a human conscience, and other factors.");
                System.out.println("Author: Amy Brown");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.300");
            } else if (book == 2) {
                System.out.println("Description: This remarkable book by Dr. Joseph Murphy, one of the pioneering voices of affirmative thinking, will unlock for you the truly staggering powers of your subconscious mind.");
                System.out.println("Combining time honored spiritual wisdom with cutting edge scientific research, Dr. Murphy explains how the subconscious mind influences every single thing that you do and how, by understanding it and learning to control its incredible force, you can improve the quality of your daily life.");
                System.out.println("Everything, from the promotion that you wanted and the raise you think you deserve, to overcoming phobias and bad habits and strengthening interpersonal relationships, the Power of Your Subconscious Mind will open a world of happiness, success, prosperity and peace for you.");
                System.out.println("It will change your life and your world by changing your beliefs.");
                System.out.println("Author: Joseph Murphy");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.100");
            } else if (book == 3) {
                System.out.println("Description: The Courage to be Disliked shows you how to unlock the power within yourself to become your best and truest self, change your future and find lasting happiness.");
                System.out.println("Using the theories of Alfred Adler, one of the three giants of 19th century psychology alongside Freud and Jung, the authors explain how we are all free to determine our own future free of the shackles of past experiences, doubts and the expectations of others.");
                System.out.println("It's a philosophy that's profoundly liberating, allowing us to develop the courage to change, and to ignore the limitations that we and those around us can place on ourselves.");
                System.out.println("Author: Ichiro Kishimi and Fumitake Koga");
                System.out.println("Language: English");
                System.out.println("Rate: Rs.350");
            } else {
                System.out.println("Invalid book option!");
            }
        } else {
            System.out.println("Invalid category option!");
        }

        System.out.println("THANK YOU FOR USING ME");
        sc.close();
    }
}
