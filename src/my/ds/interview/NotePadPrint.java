package my.ds.interview;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotePadPrint {
    public static void main(String[] args) {
        try {
            // Open Notepad
            Process process = Runtime.getRuntime().exec("notepad.exe");

            // Type a message using Robot class
            String message = "Notepad Started";
            String message2 = " ";
            typeMessage(message);

          do {
              Thread.sleep(1000);
              typeMessage(message2);
          }while (true);


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void typeMessage(String message) {
        try {
            Robot robot = new Robot();

            // Type each character of the message
            for (char c : message.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }


        } catch (AWTException | IllegalArgumentException e) {
            //e.printStackTrace();
        }
    }
}
