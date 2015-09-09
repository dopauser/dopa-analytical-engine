package com.kuviam.dopa.analyticalengine.bl;

import weka.core.converters.JSONLoader;

import com.google.gson.Gson;
import com.kuviam.dopa.analyticalengine.analytics.AssociationRuleMiner;
import com.kuviam.dopa.analyticalengine.reporter.Reporter;
import com.kuviam.dopa.analyticalengine.web.AnalyticDataController;
import com.kuviam.dopa.analytics.AnalyticDTO;
import com.kuviam.dopa.analytics.ReportDTO;

public class DopaService {

	private AssociationRuleMiner associationRuleMiner = new AssociationRuleMiner();
	private JSONLoader jsonLoader;
	ReportDTO reportDTO = null;
	private Reporter reporter = new Reporter();

	public String performTransaction(AnalyticDTO analyticDTO) {

		String modelOuputString;
		String exportedString;

		updateDB(analyticDTO);

		deriveData();
		prepareData();

		modelOuputString = associationRuleMiner.mineRelations(jsonLoader);

		exportedString = reporter.format(modelOuputString);

		modelOuputString = associationRuleMiner.mineRelations(jsonLoader);

		ReportDTO reportDTO = new ReportDTO();
		exportedString = reporter.format(modelOuputString);
		reportDTO.setRule(exportedString);
		return buildJasonObject(reportDTO);
	}

	private void prepareData() {
		// TODO Auto-generated method stub

	}

	private void deriveData() {
		// TODO Auto-generated method stub

	}

	private void updateDB(AnalyticDTO analyticDTO) {
		AnalyticDataController analyticDataController = new AnalyticDataController();
		analyticDataController.create();
	}

	private String buildJasonObject(ReportDTO reportDTO) {

		Gson gson = new Gson();
		String strAnalyticsData = gson.toJson(reportDTO);
		return strAnalyticsData;
	}

}
