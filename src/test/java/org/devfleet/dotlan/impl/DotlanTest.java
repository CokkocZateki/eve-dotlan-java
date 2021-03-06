package org.devfleet.dotlan.impl;

import org.devfleet.dotlan.DotlanJumpOptions;
import org.devfleet.dotlan.DotlanOptions;
import org.devfleet.dotlan.DotlanRoute;
import org.devfleet.dotlan.DotlanService;
import org.junit.Assert;
import org.junit.Test;

public class DotlanTest {

    private static final DotlanService dotlan = new DotlanServiceImpl();

    @Test
    public void testFastest() {
        final DotlanOptions options = new DotlanOptions().addWaypoint("Jita").addWaypoint("Amarr").addWaypoint("DNR-7M");
        DotlanRoute route = dotlan.getFastestRoute(options);
        Assert.assertNotNull(route);
        Assert.assertFalse(route.getRoute().isEmpty());
        Assert.assertEquals("Jita", route.getFrom().getSolarSystemName());
        Assert.assertEquals("DNR-7M", route.getTo().getSolarSystemName());
    }

    @Test
    public void testJump() {
        final DotlanJumpOptions options = new DotlanJumpOptions()
                .setJumpShip("Thanatos")
                .addWaypoint("1H4V-O")
                .addWaypoint("S-DLKC");
        DotlanRoute route = dotlan.getJumpRoute(options);
        Assert.assertNotNull(route);
        Assert.assertFalse(route.getRoute().isEmpty());
        Assert.assertEquals("1H4V-O", route.getFrom().getSolarSystemName());
        Assert.assertEquals("S-DLKC", route.getTo().getSolarSystemName());
    }
}
