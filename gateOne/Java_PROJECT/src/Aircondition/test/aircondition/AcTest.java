//package Aircondition.test.aircondition;
//
//public class AcTest {
//
//        @Test
//        public void testingifACisTurnOn(){
//
//        Ac ac = new Ac();
//        ac.on();
//        assertEquals(true , ac.isOperate());
//        }
//        @Test
//        public void testingIfACIsTurnOff(){
//        Ac ac = new Ac();
//        ac.off();
//        assertEquals(false , ac.isOperate());
//        }
//        @Test
//        public void testingIfAcCanIncreaseInTemperature(){
//            Ac ac = new Ac();
//            ac.on();
//            assertEquals(true, ac.isOperate());
//            ac.changeTemperatureIncreasing(1);
//            assertEquals(17, ac.getTemperature());
//            ac.changeTemperatureIncreasing(1);
//            assertEquals(18, ac.getTemperature());
//        }
//        @Test
//    public void iftestingIfAcCanDecreaseInTemperature(){
//            Ac ac = new Ac();
//            ac.on();
//            assertEquals(true, ac.isOperate());
//            ac.changeTemperatureIncreasing(1);
//            assertEquals(17, ac.getTemperature());
//            ac.changeTemperatureIncreasing(1);
//            assertEquals(18, ac.getTemperature());
//            ac.changeTemperatureIncreasing(1);
//            assertEquals(19, ac.getTemperature());
//            ac.changeTemperatureDecreasing(1);
//            assertEquals(18, ac.getTemperature());
//            ac.changeTemperatureDecreasing(1);
//            assertEquals(17, ac.getTemperature());
//    }
//    @Test
//    public void testingIfTemperatureRemain30IfAbove30Degree(){
//        Ac ac = new Ac();
//        ac.on();
//        assertEquals(true, ac.isOperate());
//        ac.ifTemperaturerAbove30ShouldRemain30(31);
//        assertEquals(30, ac.getTemperature());
//    }
//    @Test
//    public void testingIfTemperatureRemain16IfBelow16Degree(){
//            Ac ac = new Ac();
//            ac.on();
//            assertEquals(true, ac.isOperate());
//            ac.ifTemperaturerBelow16ShouldRemain16(3);
//            assertEquals(16, ac.getTemperature());
//    }
//}
