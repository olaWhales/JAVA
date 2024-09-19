package GeoPolitical;


import java.lang.foreign.ValueLayout;

import static GeoPolitical.EnumGeoPolitical.SOUTH_EAST;

public class GeoPoliticalMainMethod {
    public static void main(String[] args) {

        GeoPolitical.EnumGeoPolitical political = SOUTH_EAST;
        System.out.println(political.valueOf("SOUTH_EAST"));
    }
}
