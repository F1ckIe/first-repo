//2024.7.1
//by cjm

import java.io.*;

public class NumberCheck {
    boolean compare(String number) {
        String BookFile = "Book.txt";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(BookFile), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                if (values[0].equals(number)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String CDFile = "CD.txt";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(CDFile), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                if (values[0].equals(number)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String PictureFile = "Picture.txt";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(PictureFile), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                if (values[0].equals(number)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
