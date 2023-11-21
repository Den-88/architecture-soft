package ModelEliments;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {
    public List<Poligon> poligons = new ArrayList<Poligon>();
    public List<Texture> textures = new ArrayList<Texture>();

    public PoligonModel(List<Texture> textures) {
        this.textures = textures;

        this.poligons = new ArrayList<Poligon>();
        this.poligons.add(new Poligon());
    }
}
