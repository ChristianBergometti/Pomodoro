import java.util.Scanner;

public class Menu {
  public static void menu() throws InterruptedException {
    Scanner leer = new Scanner(System.in);
    String opcion = null;
    String idioma = "1";
    String opcionIdioma;

    do {
      CleanScreen.cleanScreen();

      if (idioma.equals("1")) {
        do{
          CleanScreen.cleanScreen();
          
          System.out.print("Menu\n\n1. Reloj 24H\n2. Reloj 12H\n3. Temporizador\n4. Pomodoro\n5. Idioma/Lenguage\nS. Salir\n\nAviso: Sólo las opciones 'Temporizador', 'Pomodoro' e 'Idioma' le permitiran volver a éste menú.\n\nElija una opción: ");
          opcion = leer.next().toUpperCase();
        } while (opcion.isEmpty());
        
        switch (opcion) {
          case "1":
            ConfigurarReloj.configurarReloj(idioma, opcion);
            break;
          case "2":
            ConfigurarReloj.configurarReloj(idioma, opcion);
            break;
          case "3":
            ConfigurarReloj.configurarReloj(idioma, opcion);
            break;
          case "4":
            Pomodoro.pomodoroMenu(idioma, opcion);
            break;
          case "5":
            do {
              CleanScreen.cleanScreen();
              System.out.print("Idioma/Lenguage\n\n1. Español/Spanish\n2. Inglés/English\n3. Volver al menú anterior\n\nElija una opción / Choose an option: ");
              opcionIdioma = leer.next();
              if (!opcionIdioma.equals("1") && !opcionIdioma.equals("2") && !opcionIdioma.equals("3")) {
                System.out.println("\nLa opción ingresada no es válida.");
                System.out.println("\nThe choosed option isn't valid.");
                Thread.sleep(3000);
              } else if (opcionIdioma.equals("1") || opcionIdioma.equals("2")) {
                idioma = opcionIdioma;
              }
            } while (!opcionIdioma.equals("1") && !opcionIdioma.equals("2") && !opcionIdioma.equals("3"));
            break;
          case "S":
            System.out.println("\nGracias por usar mi programa!");
            break;
          default:
            System.out.println("\nLa opción ingresada no es válida.");
            Thread.sleep(3000);
        }
      } else {

        do{
          CleanScreen.cleanScreen();
          System.out.print("Menu\n\n1. Clock 24H\n2. Clock 12H\n3. Timer\n4. Pomodoro\n5. Lenguage/Idioma\nS. Exit\n\nAdvice: Only the options 'Timer', 'Pomodoro' and 'Lenguage' will allow you to return to this menu.\n\nChoose an option: ");
          opcion = leer.next().toUpperCase();
        } while (opcion.isEmpty());

        switch (opcion) {
          case "1":
            ConfigurarReloj.configurarReloj(idioma, opcion);
            break;
          case "2":
            ConfigurarReloj.configurarReloj(idioma, opcion);
            break;
          case "3":
            ConfigurarReloj.configurarReloj(idioma, opcion);
            break;
          case "4":
            Pomodoro.pomodoroMenu(idioma, opcion);
            break;
          case "5":
            do {
              CleanScreen.cleanScreen();
              System.out.print("Lenguage/Idioma\n\n1. Español/Spanish\n2. Inglés/English\n3. Return to previous menu\n\nChoose an option / Elija una opción: ");
              opcionIdioma = leer.next();
              if (!opcionIdioma.equals("1") && !opcionIdioma.equals("2") && !opcionIdioma.equals("3")) {
                System.out.println("\nThe choosed option isn't valid.");
                System.out.println("\nLa opción ingresada no es válida.");
                Thread.sleep(3000);
              } else if (opcionIdioma.equals("1") || opcionIdioma.equals("2")) {
                idioma = opcionIdioma;
              }
            } while (!opcionIdioma.equals("1") && !opcionIdioma.equals("2") && !opcionIdioma.equals("3"));
            break;
          case "S":
            System.out.println("\nThank you for using my program!");
            break;
          default:
            System.out.println("\nThe choosed option isn't valid.");
            Thread.sleep(3000);
        }
      }
    } while (!opcion.equals("S"));

  }
}