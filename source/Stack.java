public class Stack {
  private static final int CAPACITY=100;
  private Object[] stackArray;
  private int mid;
  private int firstStackMax;
  private int secondStackMax;
  private int sizeOfFirstStack;
  private int sizeOfSecondStack;
  private int capacityField;

  Stack(){
    this(CAPACITY);
  }


  public Stack(int enteredCap){
    int capacity = enteredCap;
    stackArray=new Object[capacity];
    mid= capacity /2;
    capacityField=capacity-1;
    firstStackMax=mid;
    secondStackMax=mid+1;
    sizeOfFirstStack=0;
    sizeOfSecondStack=0;
  }


  public void push(int stackName,Object data){

    if (stackName==1){
      if (sizeOfFirstStack>firstStackMax){
        System.out.println("stack 1 is full");
      }
      else {

        for (int i = 0; i < firstStackMax; i++) {
          if (stackArray[i] == null) {
            stackArray[i] = data;
            sizeOfFirstStack++;
            break;
          }
        }
        //System.out.println(sizeOfFirstStack);
      }

    }


    else{
      if (sizeOfSecondStack>secondStackMax){
        System.out.println("stack 2 is full");
      }
      else {

        for (int i = capacityField; i>=mid; i--) {
          if (stackArray[i] == null) {
            stackArray[i] = data;
            sizeOfSecondStack++;
            break;
          }
        }
      }

    }
  }


  public Object pop(int stackName){
    if (stackName==1){
      if (sizeOfFirstStack==0){
        return "stack 1 is empty";
      }

      int lastEnteredIndex=sizeOfFirstStack-1;
      Object lastEnteredData=stackArray[lastEnteredIndex];
      stackArray[lastEnteredIndex]=null;
      sizeOfFirstStack--;
      //System.out.println(sizeOfFirstStack);
      return lastEnteredData;
    }

    else if (stackName==2){
      if (sizeOfSecondStack==0){
        return "stack 2 is empty";
      }
      int lastEnteredIndex=stackArray.length-sizeOfSecondStack;
      Object lastEnteredData=stackArray[lastEnteredIndex];
      stackArray[lastEnteredIndex]=null;
      sizeOfSecondStack--;
      return lastEnteredData;
    }
    return "There is no stack with this name :|";
  }


  public Object top(int stackName){
    if (stackName==1){
      if (sizeOfFirstStack==0){
        return "stack 1 is empty";
      }

      int lastEnteredIndex=sizeOfFirstStack-1;
      Object lastEnteredData=stackArray[lastEnteredIndex];
      return lastEnteredData;
    }

    else if (stackName==2){
      if (sizeOfSecondStack==0){
        return "stack 2 is empty";
      }
      int lastEnteredIndex=stackArray.length-sizeOfSecondStack+1;
      Object lastEnteredData=stackArray[lastEnteredIndex];
      return lastEnteredData;
    }
    return "There is no stack with this number";
  }

}