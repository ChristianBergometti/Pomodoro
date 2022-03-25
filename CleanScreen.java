public class CleanScreen {
  
  public static void cleanScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void volverAlMenuEspanol() {
    System.out.println("\nPresione Enter para volver al Menú");
    new java.util.Scanner(System.in).nextLine();
  }

  public static void volverAlMenuIngles() {
    System.out.println("\nPress Enter to return to the menu");
    new java.util.Scanner(System.in).nextLine();
  }
}