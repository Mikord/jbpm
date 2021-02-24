package org.jbpm.util;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * @author zamaliev
 */
public class SignalEventDesc {

  private UUID signalUUID;
  private Map<String, Object> params;

  public SignalEventDesc(UUID signalUUID, Map<String, Object> params) {
    this.signalUUID = Objects.requireNonNull(signalUUID);
    this.params = params;
  }

  public UUID getSignalUUID() {
    return signalUUID;
  }

  public void setSignalUUID(UUID signalUUID) {
    this.signalUUID = signalUUID;
  }

  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SignalEventDesc that = (SignalEventDesc) o;
    return signalUUID.equals(that.signalUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signalUUID);
  }
}
