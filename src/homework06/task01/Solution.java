package homework06.task01;

/*
* 1. Создайте класс для и определите методы для предмета "Фонарь".
* У него будет название, определенное количество батареек, которые можно вставить,
* он должен уметь светить красным, белым светом, а также мигать, причем для белого света
* достаточно одной батарейки, для красного нужно 2, для мигающего нужно 3 (свойство int battery, которое
* будет хранить количество батареек для этого подойдет). Вы можете добавить возможности фонаря, как сочтете нужным.*/

public class Solution {

    public static class Lamp{

        String name;
        int battery;
        String colorOfShining; // красный(2), белый(1), мигать(3)

        public Lamp(int battery, String colorOfShining, String name) {
            this.battery = battery;
            this.name = name;
            if (battery < 0) {
                System.out.println("It is time to pray. Only God can forgive you. Check the batteries quantity");
            }
            if (colorOfShining.equals("white") && battery >= 1) {
                this.colorOfShining=colorOfShining;
            }
            if (colorOfShining.equals("red") && battery >= 2) {
                this.colorOfShining=colorOfShining;
            }
            if (colorOfShining.equals("strobe") && battery >= 3) {
                this.colorOfShining=colorOfShining;
            }
            else{
                System.out.println("This color is not available");
            }

        }
        private Lamp(){  }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        Lamp l = new Lamp(-2, "white", "white");
    }
}
