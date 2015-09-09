package com.kuviam.dopa.analyticalengine;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.kuviam.dopa.analyticalengine.bl.DopaService;
import com.kuviam.dopa.analytics.AnalyticDTO;

@Path("/")
public class ExposedAPI {
	@Inject
	DopaService dopaService;

	@POST
	@Path("/postentity")
	@Consumes("application/json")
	@Produces("application/json")
	public String postAnalyticData(AnalyticDTO analyticDTO) {
		return dopaService.performTransaction(analyticDTO);

	}
}
