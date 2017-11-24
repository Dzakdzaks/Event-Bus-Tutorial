package com.faishalbadri.apptab.eventbus;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by faishal on 14/11/17.
 */

public class GlobalBus {
  private static EventBus eventBus;

  public static EventBus getEventBus() {
    if (eventBus == null)
      eventBus = EventBus.getDefault();
    return eventBus;
  }
}
