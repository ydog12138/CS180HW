import java.util.Scanner;
public class LanguageChoice {
    public static void main (String[] args) {

        //QUESTIONS
        String direction = "Enter only the number corresponding to your answer.\n";

        String platform = "What platform do you want to work with?\n" +
                "1: Systems\n" +
                "2: Mobile\n" +
                "3: Web\n" +
                "4: Desktop\n" +
                "5: Games";

        //Mobile
        String devices = "Which platform in particular?\n" +
                "1: iOS\n" +
                "2: Android\n" +
                "3: Windows";

        //Web
        String prefer = "What do you prefer?\n" +
                "1: Interacting with things\n" +
                "2: Figuring out how things work\n" +
                "3: Designing how things look";

        String values = "What do you value most?\n" +
                "1: Flexibility\n" +
                "2: Performance\n" +
                "3: Low Development Time\n" +
                "4: Code Simplicity";

        //Desktop
        String computers = "Which platform in particular?\n" +
                "1: Mac\n" +
                "2: Windows\n" +
                "3: Cross-platform";

        //Games
        String games = "What do you value most?\n" +
                "1: Performance\n" +
                "2: Code Simplicity";

        //ANSWERS
        String c = "You should learn C/C++!";
        String cPlusPlus = "You should learn C++!";
        String cSharp = "You should learn C#!";
        String java = "You should learn Java!";
        String javascript = "You should learn JavaScript!";
        String html5 = "You should learn HTML5 or JavaScript!";
        String apple = "You should learn Swift or Objective-C!";
        String python = "You should learn Python!";
        String ruby = "You should learn Ruby!";

        Scanner input = new Scanner(System.in);
        System.out.println(direction + platform);
        if(input.hasNextInt()){
            switch(input.nextInt()){
                default:
                    System.out.println("You must enter a number between 1 and 5!");
                    break;

                case 1:
                    System.out.println(c);
                    break;

                case 2:
                    System.out.println(devices);
                    if (input.hasNextInt()){
                        switch (input.nextInt()){
                            default:
                                System.out.println("You must enter a number between 1 and 3!");
                                break;

                            case 1:
                                System.out.println(apple);
                                break;

                            case 2:
                                System.out.println(java);
                                break;

                            case 3:
                                System.out.println(cSharp);
                                break;
                        }
                    } else{
                        System.out.println(input.next() + " is not a valid number.");
                        break;
                    }
                    break;

                case 3:
                    System.out.println(prefer);
                    if (input.hasNextInt()){
                        switch (input.nextInt()){
                            default:
                                System.out.println("You must enter a number between 1 and 3!");
                                break;

                            case 1:
                                System.out.println(javascript);
                                break;

                            case 2:
                                System.out.println(values);
                                if (input.hasNextInt()){
                                    switch (input.nextInt()){
                                        default:
                                            System.out.println("You must enter a number between 1 and 4!");
                                            break;

                                        case 1:
                                            System.out.println(ruby);
                                            break;

                                        case 2:
                                            System.out.println(cPlusPlus);
                                            break;

                                        case 3:
                                            System.out.println(cSharp);
                                            break;

                                        case 4:
                                            System.out.println(python);
                                            break;
                                    }
                                } else{
                                    System.out.println(input.next() + " is not a valid number.");
                                    break;
                                }
                                break;

                            case 3:
                                System.out.println(html5);
                                break;
                        }
                    } else{
                        System.out.println(input.next() + " is not a valid number.");
                        break;
                    }
                    break;

                case 4:
                    System.out.println(computers);
                    if (input.hasNextInt()){
                        switch (input.nextInt()){
                            default:
                                System.out.println("You must enter a number between 1 and 3!");
                                break;

                            case 1:
                                System.out.println(apple);
                                break;

                            case 2:
                                System.out.println(cSharp);
                                break;

                            case 3:
                                System.out.println(java);
                                break;
                        }
                    } else{
                        System.out.println(input.next() + " is not a valid number.");
                        break;
                    }
                    break;

                case 5:
                    System.out.println(games);
                    if (input.hasNextInt()){
                        switch (input.nextInt()){
                            default:
                                System.out.println("You must enter a number between 1 and 2!");
                                break;

                            case 1:
                                System.out.println(cPlusPlus);
                                break;

                            case 2:
                                System.out.println(cSharp);
                                break;
                        }
                    } else{
                        System.out.println(input.next() + " is not a valid number.");
                        break;
                    }
                    break;

            }
        } else{
            System.out.println(input.next() + " is not a valid number.");
        }
    }
}