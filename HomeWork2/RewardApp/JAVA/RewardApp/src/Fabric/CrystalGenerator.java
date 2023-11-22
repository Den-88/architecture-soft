package Fabric;

import Interface.iGameItem;
import Product.Crystal;

public class CrystalGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Crystal();
    }
}