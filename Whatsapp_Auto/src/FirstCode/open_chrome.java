package FirstCode;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class open_chrome {
    public static void main(String[] args) {
        try {
            // Specify the URL of the website you want to open
            URI uri = new URI("https://wa.me/919716615316");
            
            // Open the URL in the default browser
            Desktop.getDesktop().browse(uri);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}