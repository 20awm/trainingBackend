package day4.FileDemo;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        String[] matkul = {"Logic Programming", "Database", "Human Computer Interaction"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Nama saya Alif." +
                    "\nJurusan Sistem Informasi" +
                    "\n\nMata Kuliah: ");

            for(String materi : matkul) {
                writer.write("\n" + materi);
            }
            writer.close();
        }catch (IOException e) {
            System.out.println(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
