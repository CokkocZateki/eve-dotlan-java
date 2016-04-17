package org.devfleet.dotlan;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class DotlanOptions {

    private List<String> waypoints = new ArrayList<>();

    public final List<String> getWaypoints() {
        return waypoints;
    }

    public final <T extends DotlanOptions> T addWaypoint(final String waypoint) {
        this.waypoints.add(waypoint);
        return (T)this;
    }

    public final String getFrom() {
        return (CollectionUtils.isEmpty(waypoints)) ? null : waypoints.get(0);
    }


    public final String getTo() {
        return (CollectionUtils.isEmpty(waypoints)) ? null : waypoints.get(waypoints.size() - 1);
    }
}
