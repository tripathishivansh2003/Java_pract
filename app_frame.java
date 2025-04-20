import java.applet.*;
import java.awt.*;
import java.net.*;

public class app_frame extends Applet {
    Image img;
    AudioClip sound;

    public void init() {
        img = getImage(getDocumentBase(), "image.jpg");
        sound = getAudioClip(getDocumentBase(), "audio.wav");
    }

    public void paint(Graphics g) {
        g.drawImage(img, 50, 50, this);
        sound.play();
        g.drawString("Video will play here", 50, 200);
    }
}