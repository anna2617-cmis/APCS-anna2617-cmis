import greenfoot.*; 
import java.util.*; 
public class Crystal extends Actor
{
    /**
     * Act - do whatever the Crystal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Cirno cirno; 
    private List<Crystal> wings;
    private int dx, dy;
    private int side;
    private int steps = 0;
    protected int offset;
    private int rotdir;
    private int spd;
    private boolean starter; 

    public Crystal(boolean starter){
        offset = (int)(Math.random() * 200) + 10;
        rotdir = (int)(Math.random() * 10) - 5;
        spd = (int)(Math.random() * 5) + 2;
        this.starter = starter; 
    }

    public void addedToWorld(World world){
        this.cirno = ((MyWorld)world).getCirno(); 
   
        while(starter && Math.random() > 0.1){
            Crystal weapon = new Crystal(false);
            int[] offsets = {weapon.offset, -weapon.offset, 0};
            int x = getX() + offsets[(int)(Math.random() * 3)];
            int y = getY() + offsets[(int)(Math.random() * 3)];
            if(x == 0 && y == 0)
                y += offset;
            world.addObject(weapon, x, y);
            starter = false; 
        }

        if(getY() < cirno.getY()){
            side = 0;
            dx = spd;
            dy = -spd;
        }else{
            side = 2;
            dx = -spd;
            dy = spd;
        }

    }

    public void act() 
    {
        switch(side){
            case 0:
            setLocation(getX() + dx, cirno.getY()-offset);
            if(getX() > cirno.getX() + offset){
                side = 1;
                dy = spd;
            }
            break;
            case 1:
            setLocation(cirno.getX()+offset, getY() + dy);
            if(getY() > cirno.getY() + offset){
                side = 2;
                dx = -spd;
            }     
            break;
            case 2:
            setLocation(getX() + dx, cirno.getY() + offset);
            if(getX() <= cirno.getX() - offset){
                side = 3;
                dy = -spd;
            }     
            break;
            case 3:
            setLocation(cirno.getX() - offset, getY() + dy);
            if(getY() < cirno.getY() - offset){
                side = 0;
                dx = spd;
            }     
            break;

        }
        turn(rotdir);
    }    
}
