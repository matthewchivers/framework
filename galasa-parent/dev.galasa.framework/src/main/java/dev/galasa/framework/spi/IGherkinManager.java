/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2019.
 */
package dev.galasa.framework.spi;

import java.util.Map;

import javax.validation.constraints.NotNull;

import dev.galasa.ManagerException;
import dev.galasa.framework.IGherkinExecutable;

public interface IGherkinManager {

    void executeGherkin(@NotNull IGherkinExecutable executable, Map<String, Object> testVariables) throws ManagerException;

}
