public class Reloj {

  public static void reloj(int segundos, int minutos, int horas, String idioma) throws InterruptedException {

    String segundosStr;
    String minutosStr;
    String horasStr;

    do {

      for (int i = horas; i < 24; i++) {
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

            System.out.println(horasStr + " : " + minutosStr + " : " + segundosStr);
          }
        }
      }

      horas = 0;
      minutos = 0;
      segundos = 0;
    } while (true);
  }

}