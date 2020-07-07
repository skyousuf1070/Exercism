import java.util.ArrayList;
import java.lang.Integer;
class DnDCharacter {

    int ability() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<4; i++) {
            int randNum = (int)Math.random()*6+1;
            list.add(randNum);
        }
        int sum = 0;
        int minValue = list.get(0);
        for (int num: list) {
            //System.out.println(num);
            if (num<minValue) {
                minValue = num;
            }
            sum += num;
        }
        return sum-minValue;
    }

    int modifier(int input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        double temp = input-10;
        double result = Math.floor(temp/2);
        return (int)result;
    }

    int getStrength() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ability();
    }

    int getDexterity() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ability();
    }

    int getConstitution() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ability();
    }

    int getIntelligence() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ability();
    }

    int getWisdom() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ability();
    }

    int getCharisma() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ability();
    }

    int getHitpoints() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return 10 + modifier(getConstitution());
    }

}
