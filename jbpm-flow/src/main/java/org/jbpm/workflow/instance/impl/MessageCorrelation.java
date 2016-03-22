package org.jbpm.workflow.instance.impl;

import org.kie.api.definition.process.Node;

import java.util.Map;

/**
 * @author Tim Urmancheev
 */
public interface MessageCorrelation {

  boolean matches(Object event, Node node, Map<String, Object> variables);
}
