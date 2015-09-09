/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kuviam.dopa.analyticalengine.web;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.kuviam.dopa.analyticalengine.domain.AnalyticalData;
import com.kuviam.dopa.analyticalengine.domain.AnalyticalDataDao;

@Named
@RequestScoped
public class AnalyticDataController {

	@Inject
	private FacesContext facesContext;

	@Inject
	private AnalyticalDataDao analyticsDataDao;

	@Named
	@Produces
	@RequestScoped
	private AnalyticalData analyticalData = new AnalyticalData();

	public void create() {
		try {
			analyticsDataDao.createAnalyticData(analyticalData);
			String message = "A new Analytical Record with id "
					+ analyticalData.getId() + " has been created successfully";
			facesContext.addMessage(null, new FacesMessage(message));
		} catch (Exception e) {
			String message = "An error has occured while creating the analytical record (see log for details)";
			facesContext.addMessage(null, new FacesMessage(message));
		}
	}

//	public void insertInto(AnalyticDTO analyticDTO) {
//		public void insertInto(AnalyticDTO analyticDTO) {
//
//			AnalyticalData analyticalData = new AnalyticalData();
//			analyticalData.setDeviceId(new Long(34343));
//			analyticalData.setDisciplineName(analyticDTO.getDisciplineName());
//			analyticalData.setLocusName(analyticDTO.getLocusName());
//			analyticalData.setAssignedPracticeTime(new Long(analyticDTO
//					.getAssignedPracticeTime()));
//			analyticalData.setAssignedRecallTime(new Long(analyticDTO
//					.getAssignedRecallTime()));
//			analyticalData.setNoOfItems(new Integer(analyticDTO.getNoOfItems()));
//
//
//			createAnalyticData(analyticalData);
//		}
//	}
}
