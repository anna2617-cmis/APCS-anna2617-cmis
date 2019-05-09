public class TextBook implements Readable,Flyable,Changeable 
{
    String title; 
    int pageNum; 
    int ifThrownHeight; 
    int position; 
    
    public TextBook(String newTitle, int newNum){
        title = newTitle; 
        pageNum = newNum; 
    }

    public String words(){
        return "title"; 
    }   

    public void changeBook(String newTitle, int newNum){
        title = newTitle; 
        pageNum = newNum;
    } 

    public int height(){
        return ifThrownHeight; 
    } 

    public void destination(int x, int y){
        position = x + y; 
    }

    public void change(int value){
        pageNum = value; 
    }

    public int getPosition(){
        return position; 
    }
}
