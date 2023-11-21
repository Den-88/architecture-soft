package ModelEliments;

import java.util.List;

import Stuff.Type;

public class Scene {
    int id;
    public List<PoligonModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        this.flashes = flashes;

        if (models.isEmpty()) {
            throw new Exception("Models is empty");
        } else {
            this.models = models;
        }

        if (cameras.isEmpty()) {
            throw new Exception("Cameras is empty");
        } else {
            this.cameras = cameras;
        }
    }

    public Type method1(Type type) {
        return null;
    }

    public Type method2(Type type1, Type type2) {
        return null;
    }
}
