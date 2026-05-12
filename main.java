import java.util.Scanner;

// AI Bot Class
class AIBot {

    String name = "max AI Bot";

    // Method for chatting
    void chat(String message) {

        if (message.equalsIgnoreCase("hello")) {
            System.out.println(name + ": Hello BOSS i am your assistant how can i help you!");

        } else if (message.equalsIgnoreCase("how are you")) {
            System.out.println(name + ": I am fine BOSS.");

        } else if (message.equalsIgnoreCase("what is your name")) {
            System.out.println(name + ": My name is max AI Bot.");

        } else if (message.equalsIgnoreCase("time")) {
            System.out.println(name + ": I cannot check real time now.");

        } else if (message.equalsIgnoreCase("bye")) {
            System.out.println(name + ": Goodbye BOSS !");

        } else {
            System.out.println(name + ": Sorry, I don't understand.");
        }
    }
}

// Main Class
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object Creation
        AIBot bot = new AIBot();

        System.out.println("===== SIMPLE AI CHAT BOT =====");

        while (true) {

            System.out.print("You: ");
            String userMessage = sc.nextLine();

            // Calling method using object
            bot.chat(userMessage);

            // Exit condition
            if (userMessage.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}