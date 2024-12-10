    package com.enigmacamp.inheritance;

    import java.lang.reflect.Field;

    public class GeoApp {
    public static void main(String[] args) {
         //---------- Rectangle
        var rectangle  = new Rectangle(10.0, 5.3);
        Double rectangleSurface = rectangle.getSurface();
        Double rectangleRound = rectangle.getRound();

        System.out.println("Rectangle Class");
        System.out.println("Surface : " + rectangleSurface);
        System.out.println("Round   : " + rectangleRound);

        // ---------- Block
        var block = new BlockInheritanceRectangle(10.4, 5.2, 7.1);
        Double blockSurface = block.getSurface();
        Double blockRound = block.getRound();
        Double blockVolomue = block.getVolume();


        System.out.println("Block Class");
        System.out.println("Surface : " + blockSurface);
        System.out.println("Round   : " + blockRound);
        System.out.println("Volume  : " + blockVolomue);

//        Class<?> strukturBlock = BlockInheritanceRectangle.class;
//
//        System.out.println(strukturBlock.getName());
//
//        // menampilkan field class
//        Field[] fields = strukturBlock.getDeclaredFields();
//        for(var field: fields) {
//            System.out.println(field);
//        }
//
    }
}
