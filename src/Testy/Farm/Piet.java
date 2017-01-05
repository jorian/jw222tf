package Testy.Farm;

/**
 * Created by JorianWielink on 27/12/2016.
 */
public class Piet implements CharacterInterface {
    @Override
    public String getHit() {
        return "AU!";
    }

    @Override
    public int damage(int curHealth, int damage) {
        return 0;
    }
}
