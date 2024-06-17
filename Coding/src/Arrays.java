
public class Arrays {

    public static void main(String[] args) {
        
        String[] names = {"svfs","SVd"};
        // names[0] = "abc";
        // names[1] = "abcsf";
        // //names[2] = "wqerf"; 
        

        System.out.println(names[1]);
    

    // Two dimensional array

    int [][] marks = {{10, 25, 56}, {55,88,66}, {88,88,88,87,6}};

    System.out.println(marks[2][4] + " " + marks[0][1]);


    Object [][] array = {{"abc", "bcd", "def", "ghi", "jkl"}, {52, 88, 98, 91, 74}};
    
    System.out.println(array[0][0]);

    System.out.println(names.length);
   

    }
}
