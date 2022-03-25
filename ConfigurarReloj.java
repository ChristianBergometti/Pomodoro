import java.util.Scanner;

public class ConfigurarReloj {

  public static void configurarReloj(String idioma, String opcion) throws InterruptedException {
    Scanner leer = new Scanner(System.in);

    int segundos;
    int minutos;
    int horas;
    String meridiano;
    CleanScreen.cleanScreen();

    if (idioma.equals("1")) {

      do {
        System.out.print("Ingrese segundos (0-59): ");
        segundos = leer.nextInt();
      } while (segundos > 59 || segundos < 0);

      do {
        System.out.print("Ingrese minutos (0-59): ");
        minutos = leer.nextInt();
      } while (minutos > 59 || minutos < 0);

      switch (opcion) {
        case "1":
          do {
            System.out.print("Ingrese horas (0-24): ");
            horas = leer.nextInt();
          } while (horas < 0 || horas > 23);
          Reloj.reloj(segundos, minutos, horas, idioma);
          break;
        case "2":
          do {
            System.out.print("Ingrese horas (0-12): ");
            horas = leer.nextInt();
          } while (horas < 0 || horas > 11);

          do {
            System.out.print("Ingrese la franja horaria (AM/PM): ");
            meridiano = leer.next().toUpperCase();
          } while (!meridiano.equals("AM") && !meridiano.equals("PM"));

          Reloj12H.reloj12H(segundos, minutos, horas, meridiano, idioma);
          break;
        case "3":
          do {
            System.out.print("Ingrese horas: ");
            horas = leer.nextInt();
          } while (horas < 0);
          Temporizador.temporizador(segundos, minutos, horas, idioma, opcion, "Temporizador");
          break;
      }

    } else {

      do {
        System.out.print("Set seconds (0-59): ");
        segundos = leer.nextInt();
      } while (segundos > 59 || segundos < 0);

      do {
        System.out.print("Set minutes (0-59): ");
        minutos = leer.nextInt();
      } while (minutos > 59 || minutos < 0);

      switch (opcion) {
        case "1":
          do {
            System.out.print("Set hours (0-24): ");
            horas = leer.nextInt();
          } while (horas < 0 || horas > 23);

          Reloj.reloj(segundos, minutos, horas, idioma);
          break;
        case "2":
          do {
            System.out.print("Set hours (0-12): ");
            horas = leer.nextInt();
          } while (horas < 0 || horas > 11);

          do {
            System.out.print("Set time zone (AM/PM): ");
            meridiano = leer.next().toUpperCase();
          } while (!meridiano.equals("AM") && !meridiano.equals("PM"));

          Reloj12H.reloj12H(segundos, minutos, horas, meridiano, idioma);
          break;
        case "3":
          do {
            System.out.print("Set hours: ");
            horas = leer.nextInt();
          } while (horas < 0);

          Temporizador.temporizador(segundos, minutos, horas, idioma, opcion, "Timer");
          break;
      }
    }
  }

  public static String agregarCero(int numero) {
    String numeroStr = String.valueOf(numero);
    
    if (numeroStr.length() == 1) {
      numeroStr = "0".concat(numeroStr);
    }

    return numeroStr;
  }

}