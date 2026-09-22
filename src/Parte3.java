import java.io.*;

public class Parte3 {


    public void EscribirTexto(String cadea, String cadea2) {
        File destino = new File(cadea2);

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(destino))) {
            int i = 0;
            while (i != 3){
                System.out.println("escribindo a cadea: "+cadea);
                out.writeUTF(cadea);
                System.out.println("tamano do ficheiro: "+out.size()+" bytes");
                i=i+1;
            }
            System.out.println("tamano final do ficheiro: "+out.size()+" bytes");
        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }

    public void LecturaTexto(String cadea2) {
        File origen = new File(cadea2);

        try (DataInputStream in = new DataInputStream(new FileInputStream(origen))) {
            while (in.available() != 0){
                System.out.println("quedan: " + in.available() + " bytes por ler");
                String leer = in.readUTF();
                System.out.println("cadea: "+leer);
            }
            System.out.println("Xa non queda nada por leer");

        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}

