package my.ds.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMDTestProgram {
    public static void main(String[] args) throws Exception {
        /*String command = "cd \"E:\\Spring Boot Applications\\TicketBookingManagementApp\" && mvn clean";
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", command);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }*/

        String command = "javac";

        try {
            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
