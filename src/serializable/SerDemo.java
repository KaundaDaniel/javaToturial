package serializable;

import java.io.*;

public class SerDemo {
    public static void main(String[] args) throws IOException {
        Student student = new Student("Pedro", 23, "calemba 2");
        String filaName = "/home/kaunda-daniel/Documentos/C/nomes.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream object = null;

        try {
            fileOut = new FileOutputStream(filaName);
            object = new ObjectOutputStream(fileOut);
            object.writeObject(student);
            object.close();
            fileOut.close();
            System.out.println("O objecto foi serializado \n " + student);

        } catch (FileNotFoundException e) {
            System.out.println("Erro");
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileIn = null;
            ObjectInputStream objIn = null;
            fileIn = new FileInputStream(filaName);
            objIn = new ObjectInputStream(fileIn);
            Student objecto = (Student) objIn.readObject();
            System.out.println("O objecto foi Deserializado \n " + student);

        } catch (IOException ex) {
            System.out.println("IOException is caught");

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException " + "is Caught");
        }
    }
}
