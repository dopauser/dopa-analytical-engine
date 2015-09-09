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
package com.kuviam.dopa.analyticalengine.domain;

import java.util.List;

import javax.ejb.Stateful;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Stateful
@Alternative
public class AnalyticalDataDao {

	@Inject
	private EntityManager entityManager;

	public List<AnalyticalData> getAll(Integer deviceId) {
		try {
			Query query = entityManager
					.createQuery("select d from AnalyticalData d where d.deviceId = ?");
			query.setParameter(1, deviceId);
			List<AnalyticalData> resultList = (List<AnalyticalData>) query
					.getResultList();
			return resultList;
		} catch (NoResultException e) {
			return null;
		}
	}

	public AnalyticalData get(Integer deviceId) {
		try {
			Query query = entityManager
					.createQuery("select d from AnalyticalData d where d.deviceId = ?");
			query.setParameter(1, deviceId);
			return (AnalyticalData) query.getSingleResult();

		} catch (NoResultException e) {
			return null;
		}
	}

	public void createAnalyticData(AnalyticalData analyticalData) {

		entityManager.persist(analyticalData);
	}

}
