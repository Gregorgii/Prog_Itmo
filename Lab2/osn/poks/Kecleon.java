package osn.poks;

import osn.moves.kecleon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

    public class Kecleon extends Pokemon{
        public Kecleon(String name, int level){
            super(name, level);

            super.setType(Type.NORMAL);           
            super.setStats(60, 90, 70, 60, 120, 40);

            
            ShadowBall shadowBall = new ShadowBall(80, 100);
            Thunder thunder = new Thunder(110, 70);
            Slash slash = new Slash(70, 100);
            FurySwipes furySwipes = new FurySwipes(18, 80);


            super.setMove(thunder, shadowBall, slash, furySwipes);

        }
    }