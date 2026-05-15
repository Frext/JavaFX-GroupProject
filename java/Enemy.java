/** Furkan USUL 150125042
 * An interface for enemy entities(Ghost, Ripper and Wisp).
 */
public interface Enemy {
    /** Furkan USUL 150125042
     * This method applies the blinking effect when an enemy is inside the red scanner triangle.
     */
    public void applyScannerEffect(boolean isInsideTriangle);
}
