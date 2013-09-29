/*
 * This software is provided "AS IS" without a warranty of any kind.
 * You use it on your own risk and responsibility!!!
 *
 * This file is shared under BSD v3 license.
 * See readme.txt and BSD3 file for details.
 *
 */

package kendzi.josm.kendzi3d.jogl.model.roof.mk.type.alias;

import kendzi.josm.kendzi3d.jogl.model.roof.mk.type.RoofType5v2;

/**
 * Roof type half_round.
 *
 * @author Tomasz Kędziora (Kendzi)
 *
 */
public class RoofTypeHalfRound extends RoofType5v2 {

    @Override
    public RoofTypeAliasEnum getPrefixKey() {
        return RoofTypeAliasEnum.HALF_ROUND;
    }

}
