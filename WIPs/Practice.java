import java.util.*;
import java.io.*;

public class Practice{

  
  public static void main(String[] args) {
    int key = 445;
    
    System.out.println(linearSearch(key));
    
  }

  public static int linearSearch(int key) { //returns index of key found in data
     int[] data = new int[5];
     data[0] = 100;
     data[1] = 222;
     data[2] = 333;
     data[3] = 445;
     data[4] = 5565;
     
    for (int i=0; i < data.length;i++) {
      if (data[i] == key) {
        return i;
      }
    }
    return -1;
  }
}

