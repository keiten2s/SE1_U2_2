public class U1 {

    public int minuten;
    public int stunden;
    public double erg;
    public static void main(String[] args) {

    
    int t = 50;

    int stunden = t / 60;
    int minuten = t % 60;

    System.out.printf("%d:%02d", stunden, minuten);
        
    }

    public int addieren(int a, int b) {
        return a * b;
        }
}