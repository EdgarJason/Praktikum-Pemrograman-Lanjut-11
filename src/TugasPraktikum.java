import java.util.StringTokenizer;

// edgar jason husin / 245150201111047 / tif - f

public class TugasPraktikum {
    public static void main(String args[]) {

        System.out.println("\n[Penghitung Kata]\n");
        String kalimat = "Saya belajar bahasa Java. Bahasa Java mempunyai kelas berupa String. Belajar String Java itu mudah. String Java juga sering diimplementasikan.";
        String kalimatNew = kalimat.replaceAll("[.,]", "").toLowerCase(); // buat ilangin . , dan buat semua jadi lowercase

        StringTokenizer token = new StringTokenizer(kalimatNew);

        int length = kalimat.length();

        String[] unik = new String[length];
        int[] jumlah = new int[length];
        int x = 0;

        while (token.hasMoreTokens()) {
            String kata = token.nextToken();
            boolean cek = false;

            for (int i = 0; i < x; i++) {
                if (unik[i].equals(kata)) {
                    jumlah[i]++;
                    cek = true;
                    break;
                }
            }

            if (!cek) {
                unik[x] = kata;
                jumlah[x] = 1;
                x++;
            }
        }

        // display keluaran
        String line = "---------------------------------------------------------";

        System.out.println("Kalimat = " + kalimat + "\n");

        System.out.println(line);
        System.out.printf("| %-30s | %-20s |\n", "Token", "Jumlah");
        System.out.println(line);

        for (int i = 0; i < x; i++) {
            System.out.printf("| %-30s | %-20d |\n", unik[i], jumlah[i]);
        }

        System.out.println(line);
    }

}
