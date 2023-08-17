import java.util.ArrayList;
import java.util.List;

public class PhysicalAssetClass extends PhysicalAsset {
    private static PhysicalAssetClass classInstance;
    private List<PhysicalAssetClassProperty> classProperties = new ArrayList<>();
    private List<PhysicalAssetClass> aggregatedClasses = new ArrayList<>();
    private List<PhysicalAssetClassProperty> properties = new ArrayList<>();

    private PhysicalAssetClass() {super();}
    public static PhysicalAssetClass getInstance() {
        if (classInstance == null) {
            classInstance = new PhysicalAssetClass();}
        return classInstance;}
    public void addClassProperty(PhysicalAssetClassProperty classProperty) {classProperties.add(classProperty);}
    public void addAggregatedClass(PhysicalAssetClass assetClass) {aggregatedClasses.add(assetClass);}
    public void addProperty(PhysicalAssetClassProperty property) {properties.add(property);}
    public List<PhysicalAssetClassProperty> getClassProperties() {return classProperties;}
}
