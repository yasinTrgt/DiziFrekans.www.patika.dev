public class Main {
    public static void main(String[] args) {

            int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
            int[] frekans = new int[arr.length];
            int k = -1;

            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;

                        frekans[j] = k;
                    }
                }
                if (frekans[i] != k) {
                    frekans[i] = count;
                }
            }

            for (int i = 0; i < frekans.length; i++) {
                if (frekans[i] != k) {
                    System.out.println(arr[i] + " sayisi " + frekans[i] + " kez tekrar etti. ");
                }
            }
        }
    }

