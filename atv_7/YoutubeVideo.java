package atv_7;
import java.util.Arrays;

public class YoutubeVideo extends Video{
    private int[] bits;
    public YoutubeVideo(int[] bits) {
        this.bits = bits;
    }
    public int[] getBits() {
        return bits;
    }

    @Override
    public String[] getContent() {
        String frase = "";
        for (int i = 0; i < bits.length; i++) {
            int a = bits[i];
            String str = Character.toString(a);
            frase += str;
        }
        return ;
    }
}
