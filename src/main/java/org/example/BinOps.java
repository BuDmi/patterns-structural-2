package org.example;

// Для парсинга из двоичной записи используйте Integer.parseInt(binStr, 2), для конвертации обратно - Integer.toBinaryString.
public class BinOps {
    public String sum(String a, String b) {
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int mult = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(mult);
    }
}
