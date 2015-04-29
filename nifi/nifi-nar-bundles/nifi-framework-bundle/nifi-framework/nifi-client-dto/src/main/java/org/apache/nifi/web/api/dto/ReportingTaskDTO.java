/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto;

import java.util.Collection;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

/**
 * Component that is capable of reporting internal NiFi state to an external service
 */
@XmlType(name = "reportingTask")
public class ReportingTaskDTO extends NiFiComponentDTO {

    private String name;
    private String type;
    private String state;
    private String availability;
    private String comments;

    private String schedulingPeriod;
    private String schedulingStrategy;
    private Map<String, String> defaultSchedulingPeriod;

    private Map<String, String> properties;
    private Map<String, PropertyDescriptorDTO> descriptors;

    private String customUiUrl;
    private String annotationData;

    private Collection<String> validationErrors;
    private Integer activeThreadCount;

    /**
     * @return user-defined name of the reporting task
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return user-defined comments for the reporting task
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return type of reporting task
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The frequency with which to schedule the reporting task. The format of the value will depend on the value of {@link #getSchedulingStrategy()}.
     *
     * @return The scheduling period
     */
    public String getSchedulingPeriod() {
        return schedulingPeriod;
    }

    public void setSchedulingPeriod(String schedulingPeriod) {
        this.schedulingPeriod = schedulingPeriod;
    }

    /**
     * @return current scheduling state of the reporting task
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The scheduling strategy that determines how the {@link #getSchedulingPeriod()} value should be interpreted
     */
    public String getSchedulingStrategy() {
        return schedulingStrategy;
    }

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * @return Where this service is available. Possible values are CLUSTER_MANAGER_ONLY, NODE_ONLY, BOTH
     */
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * @return reporting task's properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * @return Map of property name to descriptor
     */
    public Map<String, PropertyDescriptorDTO> getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
        this.descriptors = descriptors;
    }

    /**
     * @return the URL for this reporting task custom configuration UI if applicable. Null otherwise
     */
    public String getCustomUiUrl() {
        return customUiUrl;
    }

    public void setCustomUiUrl(String customUiUrl) {
        this.customUiUrl = customUiUrl;
    }

    /**
     * @return currently configured annotation data for the reporting task
     */
    public String getAnnotationData() {
        return annotationData;
    }

    public void setAnnotationData(String annotationData) {
        this.annotationData = annotationData;
    }

    /**
     * Gets the validation errors from this reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run.
     *
     * @return The validation errors
     */
    public Collection<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Collection<String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    /**
     * @return default scheduling period for the different scheduling strategies
     */
    public Map<String, String> getDefaultSchedulingPeriod() {
        return defaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(Map<String, String> defaultSchedulingPeriod) {
        this.defaultSchedulingPeriod = defaultSchedulingPeriod;
    }

    /**
     * @return number of active threads for this reporting task
     */
    public Integer getActiveThreadCount() {
        return activeThreadCount;
    }

    public void setActiveThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
    }

}