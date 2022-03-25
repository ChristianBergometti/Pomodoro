public class Reloj12H {
  
  public static void reloj12H(int segundos, int minutos, int horas, String meridiano, String idioma) throws InterruptedException {

    int contador;
    String segundosStr;
    String minutosStr;
    String horasStr;

    if (meridiano.equals("AM")) {
      contador = 0;
    } else {
      contador = 1;
    }

    do {

      for (int i = horas; i < 12; i++) {
        for (int j = minutos; j < 60; j++) {
          if (j == 59) {
            minutos = 0;
          }
          for (int k = segundos; k < 60; k++) {
            if (k == 59) {
              segundos = 0;
            }

            horasStr = ConfigurarReloj.agregarCero(i);
            minutosStr = ConfigurarReloj.agregarCero(j);
            segundosStr = ConfigurarReloj.agregarCero(k);

            Thread.sleep(1000);
            CleanScreen.cleanScreen();

            String nombre = idioma.equals("1") ? "Reloj" : "Clock";
            
            System.out.print(nombre + "\n\n");

            System.out.println(horasStr + " : " + minutosStr + " : " + segundosStr + " " + meridiano);
          }
        }
      }

      horas = 0;
      minutos = 0;
      segundos = 0;
      contador++;

      meridiano = (contador % 2 == 0) ? "AM" : "PM";

    } while (true);
  }

  
}
