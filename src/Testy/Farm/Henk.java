package Testy.Farm;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class Henk implements CharacterInterface{

    @Override
    public String getHit() {
        String henkGotHit = "Kieteltje";
        return henkGotHit;
    }

    @Override
    public int damage(int curHealth, int damage) {
        return 0;
    }
}
