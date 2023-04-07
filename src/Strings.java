// Complete INFORMATION ABOUT STRING AND ITS METHODS :::

// Two ways to Use String in Java :

/*
public class Strings {
    public static void main(String args []){
        //String name =new String ("Meeran Siddiqui");
        //String na =new String ("Dolly Siddiqui");
          // But rather than above we can use string as------>
          String name ="Dolly Siddiqui";
          String na ="Meeran Siddiqui";
        System.out.println(na);
        System.out.println(name);

    }

}*/

// (.length())   method   ----->

 /* public class Strings {
       public static void main(String  args []){
             String name = "Meeran";   //Don't be confuse that its index is start from '1' not from '0' hence it return '6' Not '5'.
             int len =name.length();
           System.out.println(len);

       }
}*/

//  (.toLowerCase())  method  ----->

/*
  public class Strings {
      public static void main(String args []){
            String name;
              name = "MEERAN";
              String lower = name.toLowerCase();

             System.out.println(lower);
      }
  }
*/

// (.toUpperCase())  method ----->

/*
public class Strings {
    public static void main(String args []){
        String name;
        name = "meeran";
        String upper = name.toUpperCase();

        System.out.println(upper);
    }
}
*/

// (.trim())   method  ---->

/*
public class Strings {
    public static void main(String args []){
        String name;
        name = "     meeran         ";
        String trimspace = name.trim();
        System.out.println(trimspace);
    }
}

*/

// (.substring())  method ------->

/*
public class Strings {
    public static void main(String args []){
        String name;
        name = "meeran";
        String index = name.substring(1);  // 1st way
        String ind   = name.substring(1,4);    // 2nd way

        System.out.println(index);
        System.out.println(ind);
    }
}*/

// (.replace())  method ------>

/*public class Strings {
    public static void main(String args []){
        String name;
        name = "meeran";
        String result = (name.replace( 'e' ,   'p'));
        String result1 = (name.replace("eer" , "ppk"));
        String result2 = (name.replace ("e", "kky"));
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
*/

// (.startsWith()) & (.endsWith()) methods ---->

/*
public class Strings {
     public static void main(String args []){
              String name = "Meeran";
              boolean check = (name.startsWith("M"));  // kisse start ho raha hai.
              boolean check2= (name.endsWith("n"));    // kisse ends ho raha hai.
              System.out.println("Result is : "+(check));
              System.out.println("Result is :" +(check2));


     }
}*/

// (.charAt()) method ---->

/*public class Strings {
    public static void main(String args []){
        String name = "Meeran";
        char result = (name.charAt(1));
        System.out.println("Result is : "+(result));

    }
}*/

//  (.indexOf) ----->

 public class Strings {
       public static void main(String[] args) {
          //   String name = "Meeran";
               String modifiedname = "Mraneran";
           //  int result = name.indexOf("M");
          //    int result = modifiedname.indexOf("ran",3);
              int result = modifiedname.indexOf("r", 4);
             System.out.println(result);
       }
}


// (.lastIndexOf)   method  ----->

 /*
   public class Strings{
       public static void main(String[] args) {
              String name ="Meeerrran";
             // int result = name.lastIndexOf("e");
              int result =name.lastIndexOf("e",5);
              int result2= name.lastIndexOf("er",4 );
              System.out.println(result);
              System.out.println(result2);
       }
   }
*/

// (.equals)   Method ------>

/*
 public class Strings {
     public static void main(String[] args) {
           String name = "Meeran";
           boolean name2= name.equals("Meeran");
           System.out.println(name2);
     }
}
*/


// (.equalsIgnoreCase)  Method ------>

/*public class Strings {
    public static void main(String[] args) {
          String name = "Meeran" ;
          boolean name2 = name.equalsIgnoreCase("MeeRan");
             System.out.println(name2);


    }
}*/


// ESCAPE SEQUENCE---------->

/*
public class Strings {
    public static void main(String[] args) {
           String  name ="Meeran";
           System.out.println("(1) :"+"Hello this is Meeran \'This is for Escape Sequence");
           System.out.println("(2) :"+"Hello this is Meeran \n  This is for Escape Sequence");
           System.out.println("(3) :"+"Hello this is Meeran \tThis is for Escape Sequence");
           System.out.println("(4) :"+"Hello this is Meeran \\This is for Escape Sequence");
    }
}
*/





































