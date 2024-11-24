public class ArrayOperation {
    public static void main(String[] args) {
        
        ArrayAdt array = new ArrayAdt(10);

        array.insertion(20);
        array.insertion(90);
        array.insertion(40);
        array.insertion(30);

        System.out.println("Array size" +array.getSize());


        array.traverse();

        array.update(1, 14);

        array.traverse();

        // arrayAdt.search(40);
        int searchIndex = array.search(30);
        System.out.println("Search index of 30" + searchIndex);

        array.delete(1);
        System.out.println("Array size" +array.getSize());
        array.traverse();

        System.out.println(array.get(2));


    }
    
}
