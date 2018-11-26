package com.rbc.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbc.model.ScoringApplicaitonResponse;
import com.rbc.model.ScoringApplicationData;
import com.rbc.model.ScoringApplicationSaveDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/credit-scoring")
public class RBCSaveCreditScoringApplicationController {

	// ResponseEntity<ModelApiResponse> decisionPost(@ApiParam(value = "Client
	// Application Organization: Identifies the consuming organization."
	// ,required=true) @RequestHeader(value="appOrg", required=true) String
	// appOrg,@ApiParam(value = "Originating App Code: Identifies the consuming
	// application." ,required=true) @RequestHeader(value="appCode",
	// required=true) String appCode,@ApiParam(value = "Application Version:
	// Indicates the version of the Client Application (consumer)."
	// ,required=true) @RequestHeader(value="appVersion", required=true) String
	// appVersion,@ApiParam(value = "Request Unique Id: This is a universally
	// unique string value used to identify the associated request message sent
	// to the service. It is needed for logging purposes as well as correlating
	// the request with the response." ,required=true)
	// @RequestHeader(value="requestUniqueId", required=true) String
	// requestUniqueId,@ApiParam(value = "Information on the application for
	// which recommendation of decision should be given" ,required=true ) @Valid
	// @RequestBody Application body);

	@ApiOperation("API to post the data (New entries) for credit scoring application")
	@PostMapping("/api/application/{applicationId}")
	public ResponseEntity<Boolean> postApplicationData(@ApiParam(value = "Applicaiton id required to be created", required=true) @PathParam("applicationId") @PathVariable String applicationId,
			@ApiParam(value = "Request Unique Id: This is a universally unique string value used to identify the associated request message sent to the service. It is needed for logging purposes as well as correlating the request with the response.", required = true) @RequestHeader(value = "requestUniqueId", required = true) String requestUniqueId,
			 @RequestBody(required=true) ScoringApplicationSaveDTO requestScoringApplicationData
			) {
		return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
	}

	@ApiOperation("API to PUT the data (New entries) for credit scoring application")
	@PutMapping("/api/application/{applicationId}")
	public ResponseEntity<Boolean> putApplicationData(@ApiParam(value = "Applicaiton id required to be created", required=true)   @PathParam("applicationId") @PathVariable String applicationId,
			@ApiParam(value = "Request Unique Id: This is a universally unique string value used to identify the associated request message sent to the service. It is needed for logging purposes as well as correlating the request with the response.", required = true) @RequestHeader(value = "requestUniqueId", required = true) String requestUniqueId,
			 @RequestBody(required=true) ScoringApplicationSaveDTO requestScoringApplicationData
			) {
		return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
	}
}
