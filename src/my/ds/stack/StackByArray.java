package my.ds.stack;

public class StackByArray {

    int[] arr;
    int topOfStack;//keeps track of the cell which is last occupied in Array, this will help in insertion/deletion

    public StackByArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Successfully created an empty Stack of Size: "+size);
    }

    public void push(int value){
        if (isStackFull()){
            System.out.println("Stack overflow error!!");
        }else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("Successfully inserted " + value + " in the stack");
        }
    }

    public void pop(){
        if (isEmptyStack()){
            System.out.println("Stack underflow error!!");
        } else {
            System.out.println("Poping the value from stack "+arr[topOfStack]+"...");
            topOfStack--;
        }
    }

    public void peekOperation(){
        if (!isEmptyStack()){
            System.out.println("Top of stack "+arr[topOfStack]);
        } else {
            System.out.println("Stack is empty...");
        }
        System.out.println("\n");
    }

    public void deleteStack(){
        arr = null;
        System.out.println("Stack is successfully deleted");
    }

    public boolean isEmptyStack(){
        if (topOfStack == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isStackFull(){
        if (topOfStack == arr.length-1){
            System.out.println("Stack is full !");
            return true;
        } else {
            return false;
        }
    }
}
