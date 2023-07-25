package ModelElements;

//import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;
    //public List<Camera> cameras = new ArrayList<Camera>();
    
public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if(models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        //this.models = models;
        this.flashes = flashes;
        if(cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        //this.cameras = cameras;
    }

    public <T> T Method1(T flash){
        return flash;
    }

    public <T, E> T Method2(T Model, E Flash){
        return Model;
    }
    
    //public Type1 Method1(Type1 t){
        //return t;
    //}
}
