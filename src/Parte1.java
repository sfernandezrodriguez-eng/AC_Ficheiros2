import java.io.*;

public class Parte1 {




    public void clonadorByte(String cadea, String cadea2) {
        File origen = new File(cadea);
        File destino = new File(cadea2);

        try (FileInputStream in = new FileInputStream(origen);
             FileOutputStream out = new FileOutputStream(destino)) {

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }



    public void clonadorTexto(String cadea, String cadea2) {
        File origen = new File(cadea);
        File destino = new File(cadea2);

        try (FileInputStream in = new FileInputStream(origen);
             FileOutputStream out = new FileOutputStream(destino,true)) {

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
