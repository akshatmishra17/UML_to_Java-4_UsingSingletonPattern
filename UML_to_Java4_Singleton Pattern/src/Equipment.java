import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private static Equipment instance;
    private List<EquipmentProperty> properties = new ArrayList<>();
    private List<Equipment> aggregatedEquipment = new ArrayList<>();
    private List<EquipmentProperty> values = new ArrayList<>();

    Equipment() {
    }
    public static Equipment getInstance() {
        if (instance == null) {
            instance = new Equipment();}
        return instance;}
    public void addProperty(EquipmentProperty property) {properties.add(property);}
    public void addAggregatedEquipment(Equipment equipment) {aggregatedEquipment.add(equipment);}
    public void addValue(EquipmentProperty value) {values.add(value);}
    public List<EquipmentProperty> getProperties() {return properties;}
}
