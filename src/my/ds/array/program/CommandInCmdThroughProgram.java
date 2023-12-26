package my.ds.array.program;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CommandInCmdThroughProgram {

    public static void main(String[] args) throws Exception {
        CommandInCmdThroughProgram cmdThroughProgram = new CommandInCmdThroughProgram();

        cmdThroughProgram.executeCommand("java -version");
        cmdThroughProgram.executeCommand("ping www.google.com");

    }

    private void executeCommand(String command) {
        try {
            log(command);
            Process process = Runtime.getRuntime().exec(command);
            logMessage(process.getInputStream(), "Info : ");
            logMessage(process.getErrorStream(), "Error : ");
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void logMessage(InputStream inputStream, String prefix) {
        String str = null;
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println(prefix + str);
        }
        scanner.close();
    }


    private void log(String message) {
        System.out.println("Message: " + message);
    }
}

