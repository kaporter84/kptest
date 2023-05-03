package commons;

import java.io.*;
import java.util.Base64;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Base64ToImageConverter {
    public static void convert(String base64Label, String outputFilePath) throws IOException {
        String imageDataString = base64Label.substring(base64Label.indexOf(",") + 1);
        byte[] imageDataBytes = Base64.getDecoder().decode(imageDataString);

        ByteArrayInputStream bis = new ByteArrayInputStream(imageDataBytes);
        BufferedImage image = ImageIO.read(bis);

        File outputFile = new File(outputFilePath);
        ImageIO.write(image, "png", outputFile);
    }
}
