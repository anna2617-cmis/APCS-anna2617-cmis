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

    public Crystal(){
        this.cirno = ((MyWorld)getWorld()).getCirno(); 
        offset = (int)(Math.random() * 200) + 10;
        rotdir = (int)(Math.random() * 10) - 5;
        spd = (int)(Math.random() * 5) + 2;
    }

    public void addedToWorld(World world){
        while( Math.random() > 0.1){
            Crystal child = new Crystal();
            int[] offsets = {child.offset, -child.offset, 0};
            int x = getX() + offsets[(int)(Math.random() * 3)];
            int y = getY() + offsets[(int)(Math.random() * 3)];
            if(x == 0 && y == 0)
                y += offset;
            world.addObject(child, x, y);
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
        // Add your action code here.
    }    
}
