package com.tune.ma.analytics.model.event.inapp;

import com.tune.ma.analytics.model.TuneAnalyticsVariable;
import com.tune.ma.inapp.model.TuneInAppMessage;

/**
 * Created by johng on 5/26/17.
 */

public class TuneInAppMessageUnspecifiedActionTakenEvent extends TuneInAppMessageEvent {
    public TuneInAppMessageUnspecifiedActionTakenEvent(TuneInAppMessage message, String unspecifiedActionName, int secondsDisplayed) {
        super(message);

        setAction(ANALYTICS_UNSPECIFIED_ACTION);

        addTag(TuneAnalyticsVariable.Builder(ANALYTICS_UNSPECIFIED_ACTION_KEY).withValue(unspecifiedActionName).build());
        addTag(TuneAnalyticsVariable.Builder(ANALYTICS_SECONDS_DISPLAYED_KEY).withValue(secondsDisplayed).build());
    }
}
