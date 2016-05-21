package org.devfleet.dotlan;


import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DotlanOptions {

    private final List<String> waypoints = new ArrayList<>();

    public final List<String> getWaypoints() {
        return waypoints;
    }

    public final <T extends DotlanOptions> T addWaypoint(final String waypoint) {
        this.waypoints.add(waypoint);
        return (T)this;
    }

    public final <T extends DotlanOptions> T setWaypoints(final List<String> waypoints) {
        this.waypoints.clear();
        return addWaypoints(waypoints);
    }

    public final <T extends DotlanOptions> T addWaypoints(final List<String> waypoints) {
        this.waypoints.addAll(waypoints);
        return (T)this;
    }

    @JsonIgnore
    public final String getFrom() {
        return ((null == waypoints) || waypoints.isEmpty()) ? null : waypoints.get(0);
    }

    @JsonIgnore
    public final String getTo() {
        return ((null == waypoints) || waypoints.isEmpty()) ? null : waypoints.get(waypoints.size() - 1);
    }
}
