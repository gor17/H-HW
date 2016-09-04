package homework06.task02;


public class Solution {

    public class  Car{
        String name;
        int speed;

        public Car(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
    public class  Cow{

        String name;

        public void sayMuMu() {
            System.out.println("му-му");
        }
    }
}
