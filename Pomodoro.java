import java.util.Scanner;

public class Pomodoro {

  public static void pomodoroMenu(String idioma, String opcion) throws InterruptedException {
    String opcionPomodoro;
    Scanner leer = new Scanner(System.in);
    
    do {
      
      if (idioma.equals("1")) {
        do {
          CleanScreen.cleanScreen();
          System.out.print("Pomodoro\n\n1. Comenzar\n2. Qué es Pomodoro?\n3. Qué hace éste programa?\n4. Volver al menú anterior\n\nElija una opción: ");
          opcionPomodoro = leer.nextLine();
        } while (opcionPomodoro.isEmpty());

        switch (opcionPomodoro) {
          case "1":

            for (int i = 3; i>0; i--){
              CleanScreen.cleanScreen();
              System.out.print("Pomodoro comenzará en " + i + "...");
              Thread.sleep(1000);
            }

            for (int i = 0; i<3; i++){
              Temporizador.temporizador(0, 25, 0, idioma, opcion, "Pomodoro");
              Temporizador.temporizador(0, 5, 0, idioma, opcion, "Descanso");
            }
              
            Temporizador.temporizador(0, 25, 0, idioma, opcion, "Pomodoro");
            Temporizador.temporizador(0, 30, 0, idioma, opcion, "Descanso");
            
            CleanScreen.volverAlMenuEspanol();
            break;
          case "2":
            CleanScreen.cleanScreen();
            System.out.print(
                "Qué es Pomodoro?\n\nLa técnica Pomodoro consiste en usar un temporizador para dividir el trabajo en bloques de tiempo enfocados (generalmente 25 minutos) separados por un breve descanso, generalmente de cinco minutos.\n\nDespués de cuatro bloques de tiempo de trabajo consecutivos, se toma un descanso más largo, alrededor de 20 o 30 minutos.\n\nCada bloque de trabajo de 25 minutos se llama “pomodoro”. Si sientes la necesidad de hacer algo diferente al trabajo durante un período de concentración, anótalo. Con el tiempo, te entrenarás para ser más productivo durante cada pomodoro.\n\n\nFuente: https://protecciondatos-lopd.com/empresas/tecnica-pomodoro/#Que_es_la_tecnica_Pomodoro\n");

            CleanScreen.volverAlMenuEspanol();
            break;
          case "3":
            CleanScreen.cleanScreen();
            System.out.print(
                "Qué hace éste programa?\n\nAl elegir la opción 'Comenzar', se iniciarán ininterrumpidamente 4 temporizadores de 25 minutos cada uno, alternando entre cada bloque, un descanso de 5 minutos. Una vez acabado el 4to temporizador de 25 minutos, comenzará el último descanso, esta vez de 30 minutos. Ya concluído éste último, será devuelto al menú principal.\n\nUna vez iniciado el programa, éste no podrá detenerse hasta que se haya cumplido todo lo anteriormente mencionado.\n");

            CleanScreen.volverAlMenuEspanol();
            break;
          case "4":
            break;
          default:
            System.out.println("\nLa opción ingresada no es válida.");
            Thread.sleep(3000);
        }
      } else {
        do {
          CleanScreen.cleanScreen();
          System.out.print("Pomodoro\n\n1. Start\n2. What's Pomodoro?\n3. What does this program do?\n4. Return to previous menu\n\nChoose an option: ");
          opcionPomodoro = leer.nextLine();
        } while (opcionPomodoro.isEmpty());

        switch (opcionPomodoro) {
          case "1":

            for (int i = 3; i>0; i--){
              CleanScreen.cleanScreen();
              System.out.print("Pomodoro will start in " + i + "...");
              Thread.sleep(1000);
            }

            for (int i = 0; i<3; i++){
              Temporizador.temporizador(0, 25, 0, idioma, opcion, "Pomodoro");
              Temporizador.temporizador(0, 5, 0, idioma, opcion, "Break");
            }
              Temporizador.temporizador(0, 25, 0, idioma, opcion, "Pomodoro");
              Temporizador.temporizador(0, 30, 0, idioma, opcion, "Break");

            CleanScreen.volverAlMenuIngles();
            break;
          case "2":
            CleanScreen.cleanScreen();
            System.out.print(
                "What's Pomodoro?\n\nThe Pomodoro technique consists in using a timer to divide work into focused blocks of time, usually of 25 minutes, separated by a short break, usually of five minutes.\n\nAfter four consecutive blocks of work time, you take a longer break, about 20 or 30 minutes long.\n\nEach 25-minute work block is called “pomodoro”. If you feel the need to do something different than work during a period of concentration, write it up. Over time, you will train yourself to be more productive during each pomodoro.\n\n\nSource: https://protecciondatos-lopd.com/empresas/tecnica-pomodoro/#Que_es_la_tecnica_Pomodoro\n");

            CleanScreen.volverAlMenuIngles();
            break;
          case "3":
            CleanScreen.cleanScreen();
            System.out.print(
                "What do this program do?\n\nBy choosing the 'Start' option, 4 timers of 25 minutes each will start uninterruptedly, alternating between each block, a 5-minute break. After the 4th 25-minute timer ends, the last break will begin, this time of 30 minutes. Once the latter is finished, you'll be returned to the main menu.\n\nOnce the program has started, it cannot be stopped until all of the above has been accomplished.\n");

            CleanScreen.volverAlMenuIngles();
            break;
          case "4":
            break;
          default:
          System.out.println("\nThe choosed option isn't valid.");
          Thread.sleep(3000);
        }
      }
    } while (!opcionPomodoro.equals("4"));

  }
}