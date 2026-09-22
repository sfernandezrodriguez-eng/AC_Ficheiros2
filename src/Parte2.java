import java.io.*;

public class Parte2 {




    public void clonadorBuffered(String cadea, String cadea2) {
        File origen = new File(cadea);
        File destino = new File(cadea2);

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(origen));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destino))) {

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
