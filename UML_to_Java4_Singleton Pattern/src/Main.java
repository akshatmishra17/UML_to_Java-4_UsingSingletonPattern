import java.util.List;

public class Main {
    public static void main(String[] args) {
        Equipment equipment = Equipment.getInstance();
        equipment.addProperty(new EquipmentProperty("Weight", "200 kg"));
        equipment.addProperty(new EquipmentProperty("Color", "Black"));
        equipment.addProperty(new EquipmentProperty("Material", "Iron"));

        EquipmentClass equipmentClass = EquipmentClass.getInstance();
        equipmentClass.addClassProperty(new EquipmentClassProperty("Model", "UP12345"));
        equipmentClass.addClassProperty(new EquipmentClassProperty("Manufacturer", "TATA"));
        equipmentClass.addClassProperty(new EquipmentClassProperty("Manufactured Date", "16/09/2015"));

        PhysicalAsset physicalAsset = PhysicalAsset.getInstance();
        physicalAsset.addProperty(new PhysicalAssetProperty("Weight", "300 kg"));
        physicalAsset.addProperty(new PhysicalAssetProperty("Color", "Red"));
        physicalAsset.addProperty(new PhysicalAssetProperty("Dimensions", "20x20"));

        PhysicalAssetClass physicalAssetClass = PhysicalAssetClass.getInstance();
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Model", "UP1067"));
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Manufacturer", "ABC Corporation"));

        EquipmentAssetMapping mapping1 = new EquipmentAssetMapping(physicalAsset, equipment);
        EquipmentAssetMapping mapping2 = new EquipmentAssetMapping(physicalAsset, equipmentClass);

        RoleBasedEquipment roleBasedEquipment = new RoleBasedEquipment("Role A");

        List<EquipmentProperty> equipmentProperties = equipment.getProperties();
        System.out.println("Equipment Properties:");
        for (int i = 0; i < equipmentProperties.size(); i++) {
            EquipmentProperty property = equipmentProperties.get(i);
            System.out.println(property.getName() + ": " + property.getValue());
        }

        List<PhysicalAssetProperty> physicalAssetProperties = physicalAsset.getProperties();
        System.out.println();
        System.out.println("Physical Asset Properties:");
        for (int i = 0; i < physicalAssetProperties.size(); i++) {
            PhysicalAssetProperty property = physicalAssetProperties.get(i);
            System.out.println(property.getName() + ": " + property.getValue());
        }

        List<EquipmentClassProperty> equipmentClassProperties = equipmentClass.getClassProperties();
        System.out.println();
        System.out.println("Equipment Class Properties:");
        for (int i = 0; i < equipmentClassProperties.size(); i++) {
            EquipmentClassProperty classProperty = equipmentClassProperties.get(i);
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }

        List<PhysicalAssetClassProperty> physicalAssetClassProperties = physicalAssetClass.getClassProperties();
        System.out.println();
        System.out.println("Physical Asset Class Properties:");
        for (int i = 0; i < physicalAssetClassProperties.size(); i++) {
            PhysicalAssetClassProperty classProperty = physicalAssetClassProperties.get(i);
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }
    }
}
