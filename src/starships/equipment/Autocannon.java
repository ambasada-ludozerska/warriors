package starships.equipment;

public class Autocannon extends Weapon {

    public Autocannon(double facing) {
        super(facing, 179, 15, 20, 2, 40, 6);
        this.type = weaponType.SECONDARY;
    }
}
