public class Gray {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 64; i++){
            print_padded(toGray(i), 6);
            // System.out.println(fromGray(toGray(i)));
        }
    }

    public static void print_padded(int n, int desiredLength) {
        String binaryString = Integer.toBinaryString(n);
        int paddingLength = desiredLength - binaryString.length();
        for (int i = 0; i < paddingLength; i++) {
            binaryString = "0" + binaryString;
        }
        System.out.println(binaryString);
    }
    

    public static int toGray(int n) {
        return n ^ (n/2);
    }
    
    public static int fromGray(int g) {
        int num = g;
        for (int i = 1; i < 32; i <<= 1) { // 1,2, 4, 8, 16
            num ^= (num >> i);             // num >> i -> num's bits shifted i positions to the right -> each loop reflects on mirroring
        }
        return num;
    }
}
