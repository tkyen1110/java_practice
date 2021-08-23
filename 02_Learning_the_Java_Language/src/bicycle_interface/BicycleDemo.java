package bicycle_interface;

class BicycleDemo {
    public static void main(String[] args) {

        // Create MountainBike object
        MountainBike mbike = new MountainBike();

        mbike.changeCadence(50);
        mbike.speedUp(10);
        mbike.changeGear(2);
        mbike.changeCadence(40);
        mbike.speedUp(10);
        mbike.changeGear(3);
        mbike.printStates();
    }
}
