class Main {
  static int size = 0;
  static int[] arr = new int[5];

  public static void main(String[] args) {

    add(10);
    add(20);
    add(30);
    add(40);
    add(50);
  

    printAll();

    deleteAt(40);
    add(60);
   
    printAll();
  }

  public static void add(int data) {
    if(size==arr.length){
      System.out.println("Array is full "+(arr.length));
      return;
    }
    arr[size++] = data;
  }

  public static void deleteAt(int target) {
   for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
       System.out.println("Found");
        while (i < arr.length - 1) {
          arr[i] = arr[i + 1];
          i++;
        }
        size--;
          break;
      }  
    }
    
 }

  public static void printAll() {
   for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}