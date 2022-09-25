package atv_7;

public class atv_7 {
    public static void main(String[] args) {
        int bits[] = new int[] {
            80, 97, 114, 97, 98, 233, 110, 115, 44,
            32, 118, 99, 32, 99, 111, 110, 115, 101,
            103, 117, 105, 117, 46
            };
        boolean bitsFace[] = new boolean[] {
            false, true, false, true, false, false, false, false, false, true,
           true, false, false, false, false,
            true, false, true, true, true, false, false, true, false, false,
           true, true, false, false, false, false,
            true, false, true, true, false, false, false, true, false, true,
           true, true, false, true, false, false,
            true, false, true, true, false, true, true, true, false, false,
           true, true, true, false, false, true,
            true, false, false, true, false, true, true, false, false, false,
           false, true, false, false, false,
            false, false, false, true, true, true, false, true, true, false,
           false, true, true, false, false, false,
            true, true, false, false, true, false, false, false, false, false,
           false, true, true, false, false,
            false, true, true, false, true, true, false, true, true, true, true,
           false, true, true, false, true,
            true, true, false, false, true, true, true, false, false, true,
           true, false, true, true, false, false,
            true, false, true, false, true, true, false, false, true, true,
           true, false, true, true, true, false,
            true, false, true, false, true, true, false, true, false, false,
           true, false, true, true, true, false,
            true, false, true, false, false, true, false, true, true, true,
           false
            };
        Video youtubeVideo = new YoutubeVideo(bits);
        Video faceVideo = new FaceVideo(bitsFace);
    }
}
