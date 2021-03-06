package edu.inst;

import java.io.*;
import java.util.Arrays;

public class InputMain {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/info.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
            }


//        try (FileReader reader = new FileReader("data/info.txt");
//            FileWriter writer = new FileWriter("data/out2.txt")) {
//            int symbol = reader.read();
//            System.out.println(symbol);
//            writer.write(symbol);
//            char[] buffer = new char[8];
//            int charNum = reader.read(buffer);
//            while (charNum != -1) {
//                writer.write(buffer, 0, charNum);
//                charNum = reader.read(buffer);
//            }
//        } catch (FileNotFoundException e) {
//                e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream("data/info.txt");
//            int code = inputStream.read();
//            System.out.println(code + " char = " + (char)code);
//            byte[] ar = new byte[16];
//            int num = inputStream.read(ar);
//            System.out.println("num = " + num);
//            System.out.println(Arrays.toString(ar));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}