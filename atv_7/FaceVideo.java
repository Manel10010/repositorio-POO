package atv_7;

public class FaceVideo extends Video{
    private boolean[] bitsFace;

    public FaceVideo(boolean[] bitsFace) {
        this.bitsFace = bitsFace;
    }

    public boolean[] getBitsFace() {
        return bitsFace;
    }

    @Override
    public String[] getContent() {
        String frase[] = new String[];
        for (int i = 0; i < bitsFace.length; i+= 8) {

            String letra = '';
        }
        String frase[] = new String[] {};
        return frase;
    }
}
