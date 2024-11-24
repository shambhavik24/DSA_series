 class ArrayAdt {
    
    //array: to store data
    private int[] array;

    //size: size f array
    private int index;

    //capacity
    private int size;

    //constructore
    public ArrayAdt(int Size){
        this.size = Size;
        this.array=new int[this.size];
        this.index=0;
    }
    //Insertion
    public void insertion(int value){
        //check array
        if(index==this.size){
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
    }
    //delete
    public void delete(int deleteIndex){
        if(deleteIndex <0 || deleteIndex >=index)
        {
            System.out.println("Invalid index");
            return;
        }
        for(int i = deleteIndex; i<index-1; i++){
            array[i] = array[i+1];
        }
        index--;
    }

    //searching
    public int search(int value){
        int indexResult = -1;
        for(int i=0; i<index; i++){
            if(array[i] == value){
                indexResult = i;
                break;
            }
        }
        return indexResult;
    }

    //get the data
    public int get(int getIndex){

        if(getIndex <0 || getIndex >=this.index){
            System.out.println("invalid index");
            return -1;
        }
        return array[getIndex];
    }
    //traverse
    public void traverse(){
        for(int i=0; i<this.index; i++){
            System.out.println(array[i] +"\t");
        }
        System.out.println();
    }

    //update
    public void update(int updateIndex, int value){
        if(updateIndex < 0 || updateIndex >=0){
            System.out.println("invalid index");

        }
        array[updateIndex] = value;
    }

    //get the size
    public int getSize(){
        return this.index;
    }
    
    
}
