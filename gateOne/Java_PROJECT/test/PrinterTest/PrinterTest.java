package PrinterTest;

import Printer.Printer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {
    @Test
    public void testIfPrinterClassExist() {
        Printer printer = new Printer(0, 1, true);
    }
    @Test
    public void testIfTonerLevelCantakeAbove100() {
        Printer printer = new Printer(100, 1, false);
        printer.addToner(110);
        assertEquals(printer.getTonerLevel(), 100);
    }
    @Test
    public void testIfTonerLevelCantakeBelow100() {
        Printer printer = new Printer(100, 1, true);
        printer.addToner(-5);
        assertEquals(printer.getTonerLevel(), 100);
    }

}
