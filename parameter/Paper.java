class Paper {
   
    public static void write(String content) {
        System.out.println("Writing: " + content);
    }

    public static void fold(int folds) {
        System.out.println("Paper folded " + folds );
    }

    public static void size(String dimensions) {
        System.out.println("Paper size: " + dimensions);
    }

 
    public static void print(String content, int copies) {
        System.out.println("Printing content of " + content + " copies of: " + copies);
    }

    public static void cut(String shape, int pieces) {
        System.out.println("Cutting paper in " + shape+"into " + pieces );
    }

    
    public static void bind(String type, int pages, double cost) {
        System.out.println("Binding " + type + " with pages of  " + pages + " for " + cost+"Rs");
    }

    public static void recycle(String paperType, int weight, boolean isColored) {
        System.out.println("Recycling of " + paperType + "in " + weight + "kg"+"Colored: " + isColored );
    }
}