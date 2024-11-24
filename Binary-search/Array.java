public class Array{
    public static void main(String[] args) {
        
        int marks[] = {70,38,39,37,28,82};

        for(int i = 0; i<marks.length; i++){
            System.err.println(marks[i]);
        }

        //enhanced loop
        for(int values: marks){
            System.err.println(values);
        }
    }
}