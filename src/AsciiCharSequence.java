public class AsciiCharSequence implements java.lang.CharSequence {

    private byte[] ascii;

    AsciiCharSequence(byte[] ascii){
        this.ascii = ascii;
    }

    public int length(){
        return ascii.length;
    }

    public char charAt(int index){
        return (char)ascii[index];
    }

    public CharSequence subSequence(int start, int end){
        byte[] asciiTmp = new byte[end - start + 1];
        for(int i = 0;end > start;i++){
            asciiTmp[i] = ascii[start];
            start++;
        }
        return new AsciiCharSequence(asciiTmp);

    }

    public String toString(){
        return new String(ascii);
    }
}