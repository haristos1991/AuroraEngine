/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aurora.engine.V1.Logic;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface AuroraScreenLogic {

    /**
     * .-----------------------------------------------------------------------.
     * | setHandler(DashboardHandler)
     * .-----------------------------------------------------------------------.
     * |
     * | Pass the Handler Instanced in the AuroraUI component of this Screen
     * | For the Logic to work the Handler *MUST* be passed using this method
     * |
     * |
     * .........................................................................
     * <p/>
     * @param handler AuroraScreenHandler
     */
    void setHandler(final AuroraScreenHandler handler);
}
