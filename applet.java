import java.applet.Applet;
import java.io.*;
import java.net.*;

public class SimulatedAttackApplet extends Applet {
    public void init() {
        try {
            String fileUrl = "https://example.com/safe-file.txt"; // URL fictícia para um arquivo seguro
            String savePath = System.getProperty("user.home") + "/simulated_download.txt";
            
            downloadFile(fileUrl, savePath);
            System.out.println("Arquivo salvo em: " + savePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void downloadFile(String fileUrl, String savePath) throws IOException {
        URL url = new URL(fileUrl);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        FileOutputStream outputStream = new FileOutputStream(savePath);
        
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        
        inputStream.close();
        outputStream.close();
        System.out.println("Download simulado concluído.");
    }
}
