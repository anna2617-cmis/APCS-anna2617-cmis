import java.util.*; 
public class SuperHeroDriver
{
    public static void main(String[] args){
        FriedEggMan egg = new FriedEggMan(); 
        egg.setSuitColor("yellow"); 
        egg.setCape(true); 

        AsteroidMan asteroid = new AsteroidMan(); 
        asteroid.setSuitColor("gray"); 
        asteroid.setCape(false);

        PepsiMan pepsi = new PepsiMan(); 
        pepsi.setSuitColor("blue"); 
        pepsi.setCape(false);

        List<SuperHero> heroes = new ArrayList<SuperHero>(); 

        heroes.add(egg); 
        heroes.add(asteroid);
        heroes.add(pepsi);
        System.out.println("Original set of ArrayList heroes..."); 
        for(SuperHero hero : heroes){ 
            System.out.print(hero + "  "); 
            System.out.print(hero.getSuitColor() + "  "); 
            System.out.print(hero.isCaped() + "  "); 
            System.out.print(hero.motto() + "  " + "\n"); 
        }
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int index = 0; 
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                if (index < heroes.size() && heroes.get(index).isCaped() == true){
                    capedHeroes[a][b] = heroes.get(index); 
                    heroes.remove(index); 
                }else{
                    index ++; 
                }
            }
        }
        System.out.println("\n"); 
        System.out.println("Printing 2D Array CapedHeroes..."); 
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                System.out.print(capedHeroes[a][b] + "  "); 
            }
            System.out.println(); 
        }
        System.out.println("\n"); 
        System.out.println("Printing contents of capedHeroes..."); 
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                if (capedHeroes[a][b]!= null){
                    System.out.print(capedHeroes[a][b] + "  "); 
                    System.out.print(capedHeroes[a][b].getSuitColor() + "  "); 
                    System.out.print(capedHeroes[a][b].isCaped() + "  "); 
                    System.out.println(capedHeroes[a][b].motto() + "  "); 
                }
            }
        }
        System.out.println("\n"); 
        System.out.println("Printing set of ArrayList heroes..."); 
        for(SuperHero hero : heroes){ 
            System.out.print(hero + "  "); 
            System.out.print(hero.getSuitColor() + "  "); 
            System.out.print(hero.isCaped() + "  "); 
            System.out.println(hero.motto() + "  "); 
        }
    }
}
