import java.util.ArrayList;
import java.util.List;

public class EquipmentClass extends Equipment {
    private static EquipmentClass classInstance;
    private List<EquipmentClassProperty> classProperties = new ArrayList<>();
    private List<EquipmentClass> aggregatedClasses = new ArrayList<>();
    private List<EquipmentClassProperty> properties = new ArrayList<>();

    private EquipmentClass() {
        super();
    }
    public static EquipmentClass getInstance() {
        if (classInstance == null) {
            classInstance = new EquipmentClass();}
        return classInstance;}
    public void addClassProperty(EquipmentClassProperty classProperty) {classProperties.add(classProperty);}
    public void addAggregatedClass(EquipmentClass equipmentClass) {aggregatedClasses.add(equipmentClass);}
    public void addProperty(EquipmentClassProperty property) {properties.add(property);}
    public List<EquipmentClassProperty> getClassProperties() {return classProperties;}
}
