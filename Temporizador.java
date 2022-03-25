public class Temporizador {
  
  public static void temporizador(int segundos, int minutos, int horas, String idioma, String opcion, String nombre) throws InterruptedException {

    String segundosStr;
    String minutosStr;
    String horasStr;

    for (int i = horas; i >= 0; i--) {
      for (int j = minutos; j >= 0; j--) {
        if (j == 0 && i > 0) {
          minutos = 59;
        }
        for (int k = segundos; k >= 0; k--) {
          if (k == 0 && j >= 0) {
            segundos = 59;
          }

          horasStr = ConfigurarReloj.agregarCero(i);
          minutosStr = ConfigurarReloj.agregarCero(j);
          segundosStr = ConfigurarReloj.agregarCero(k);

          Thread.sleep(1000);
          CleanScreen.cleanScreen();
          
          System.out.println(nombre + "\n\n");
          
          System.out.println(horasStr + " : " + minutosStr + " : " + segundosStr);

        }
      }
    }
    
    if (opcion.equals("3"))
    CleanScreen.volverAlMenuEspanol();

  }

}
