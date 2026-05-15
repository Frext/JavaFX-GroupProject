import javafx.scene.Group;
import javafx.scene.Node;

/** Furkan USUL 150125042
 * A base class for anything that moves(Hunter, Ghost, Ripper and Wisp).
 */
public abstract class Entity {
    protected double x,y;
    protected Group view;

    /** Furkan USUL 150125042
     * This constructor initializes position, visibility and entity visual.
     */
    public Entity(double x, double y, boolean isVisible){
        this.x = x;
        this.y = y;
        this.view = implementView();

        view.setLayoutX(x);
        view.setLayoutY(y);
        view.setVisible(isVisible);
    }

    /** Furkan USUL 150125042
     * Move the entity according to their movement rule.
     */
    public abstract void move(double minX, double minY, double maxX, double maxY);

    /** Furkan USUL 150125042
     * Implement the entity visual
     */
    public abstract Group implementView();

    /** Furkan USUL 150125042
     * This method is for adding the Entity to a Pane.
     * Usage is : pane.getChildren().add(entity.getView())
     */
    public Node getView(){
        return view;
    }
}
