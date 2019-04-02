public class StudentDriver
{
    public static void main(String[] args){
        UnderGrad ug1 = new UnderGrad("John","CS",3); 
        UnderGrad ug2 = new UnderGrad("Tom","Economic",5); 
        Graduate g1 = new Graduate("Lily","Philosophy",2); 
        Graduate g2 = new Graduate("Nathan","Economic",4); 
        PostGraduate pg1 = new PostGraduate("Kelly","Physics",4);
        PostGraduate pg2 = new PostGraduate("Andy","Phycology",10);
        Student[][] studentBody = {{pg1,pg2},{g1,g2},{ug1,ug2}};
        
        for(int a = 0; a < 3; a++){
            for (int b = 0; b < 2; b++){
                System.out.print(studentBody[a][b].getName() + "  "); 
                System.out.print(studentBody[a][b].getMajor() + "  "); 
                if(studentBody[a][b] instanceof UnderGrad){
                    UnderGrad x = (UnderGrad) studentBody[a][b];
                    System.out.print(x.calculateTuition(studentBody[a][b].getUnits()));
                }else if (studentBody[a][b] instanceof Graduate){
                    Graduate x = (Graduate) studentBody[a][b];
                    System.out.print(x.calculateTuition(studentBody[a][b].getUnits()));
                }else{
                    PostGraduate x = (PostGraduate) studentBody[a][b];
                    System.out.print(x.calculateTuition(studentBody[a][b].getUnits()));
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}
