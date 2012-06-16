package cap6;

public class Ex6_38 {
    public static void main( String args[] ){
        System.out.printf("%5s%15s%10s%15s\n\n", "Decimal", "Binario", "Octal", "Hexadecimal");
        for(int i = 1; i <= 256; i++){
            System.out.printf("%5d%15s%10s%15s\n", i, Integer.toBinaryString(i),
                    Integer.toOctalString(i), Integer.toHexString(i));
        }
    }
}
