package org.devfleet.dotlan;

public interface DotlanService {


    DotlanRoute getHighSecRoute(final DotlanOptions options);

    DotlanRoute getLowSecRoute(final DotlanOptions options);

    DotlanRoute getFastestRoute(final DotlanOptions options);

    DotlanRoute getJumpRoute(final DotlanJumpOptions options);
}
