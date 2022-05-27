package simpleGUI;

/**
 * Bread crumbs.
 */
public class BreadCrumbs {

    /**
     * {@link Menu}
     */
    private Menu owner;

    /**
     * Indicate if the bread crumbs are visible.
     */
    private boolean visible = true;

    /**
     * Create bread crumbs.
     * @param owner {@link Menu}
     */
    public BreadCrumbs(Menu owner) {
        this.owner = owner;
    }

    /**
     * @return Indicate if the bread crumbs are visible.
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Set visible.
     * @param visible Indicate if the bread crumbs are visible.
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
