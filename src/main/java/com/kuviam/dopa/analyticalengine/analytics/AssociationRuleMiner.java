package com.kuviam.dopa.analyticalengine.analytics;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.converters.JSONLoader;

public class AssociationRuleMiner {

	private Apriori model = new Apriori();

	public String mineRelations(DataSource dataSource) {

		try {
			Instances data = dataSource.getDataSet();
			model.buildAssociations(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return model.toString();

	}

	public String mineRelations(JSONLoader jsonLoader) {

		try {
			Instances data = jsonLoader.getDataSet();
			model.buildAssociations(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return model.toString();

	}
}
