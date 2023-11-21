package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelEliments.Camera;
import ModelEliments.Flash;
import ModelEliments.PoligonModel;
import ModelEliments.Scene;
import ModelEliments.Texture;

public class ModelStore implements IModelChanger {
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        List<Texture> textures = new ArrayList<>();
        this.models.add(new PoligonModel(textures));

        this.scenes = new ArrayList<>();
        this.scenes.add(new Scene(1, models, flashes, cameras));

        this.flashes = new ArrayList<>();
        this.flashes.add(new Flash());

        this.cameras = new ArrayList<>();
        this.cameras.add(new Camera());
    }

    public Scene getScene(int id) {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }
}
