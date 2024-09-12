package GeoPolitical;

import GeoPolitical.EnumGeoPolitical;

import java.util.Scanner;

import static GeoPolitical.EnumGeoPolitical.NORTH_WEST;

public class GeoPoliticalMainMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        EnumGeoPolitical political = EnumGeoPolitical.NORTH_WEST;
        EnumGeoPolitical political2 = EnumGeoPolitical.NORTH_CENTRAL;
        System.out.println(political);
        System.out.println(political2);
    }
}
