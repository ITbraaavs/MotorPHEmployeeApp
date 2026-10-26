import java.io.*;
import java.util.ArrayList;

public class AttendanceDataHandler {

    public static ArrayList<String[]> loadAttendance() {

        ArrayList<String[]> attendance = new ArrayList<>();

        try (BufferedReader reader =
                new BufferedReader(new FileReader("attendance.csv"))) {

            String line;

            reader.readLine(); // Skip header

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                attendance.add(data);

            }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

        return attendance;

    }

}