public class Fundamentals_I
{
   public static void main (String[] args){
       dataTypes();
    }
    
   public static void dataTypes(){
       byte a = 100;
       short b = 10000;
       int c = 100000;
       long d = 100000L; 
       float f = 234.5f; 
       double e = 123.4;
       boolean g = true; 
       char letterA = 'A'; 
       String ex_byte = "A byte is an 8-bit signed two's complement integer"; 
       String ex_byte_r = "1) number of fingers, 2) number of the classes you take, 3) number of movies you watched per day"; 
       String ex_short = "[16 bit] Short data type can also be used to save memory as byte data type."; 
       String ex_short_r = "1) the amount of giant pandas left in the world, 2) the amount of seconds I spend in school, 3) the amount of seconds I sleep every day"; 
       String ex_int = "Integer is generally used as the default data type for integral values unless there is a concern about memory."; 
       String ex_int_r = "1) the amount of calories 15 people comsume in their life time, 2) the amount of tissue in human, 3) chinese population"; 
       String ex_long = "Long data type is a 64-bit signed two's complement integer"; 
       String ex_long_r = "1) number of cells in human body 2) the amount of lego nedded to build a Big Ben, 3) human population"; 
       String ex_float = "Float data type is a single-precision 32-bit IEEE 754 floating point"; 
       String ex_float_r = "1) grade, 2) game points, 3) miles walked per day"; 
       String ex_double = "default data type for decimal values, generally the default choice";
       String ex_double_r = "1) the first few hundred decimals of pi 2)test percentage 3)gaming hours"; 
       String ex_boolean = "There are only two possible values: true and false"; 
       String ex_boolean_r = "1) did I study? 2) the computer is on? 3) the box is open?"; 
       String ex_char = "Char data type is used to store any character"; 
       String ex_char_r = "1) name 2) email message 3) my pet name"; 
       System.out.format("Example data types: %n byte :%d%n short :%d%n int :%d%n long :%d%n float :%f%n double :%f%n boolean :%s%n char:%s%n", a, b, c, d, f, e, g, letterA);  
    }
    
   public static int add(int a, int b){ 
       int sum = a+b;
       return sum;
       
   }      
   
   public static int subtract(int a, int b){ 
       int differance = a-b;
       return differance;
       
   } 
   
   public static int div(int a, int b){ 
       int quotient = a/b;
       return quotient;
       
   }
   
   public static int mul(int a, int b){ 
       int product = a*b;
       return product;
       
   }
}