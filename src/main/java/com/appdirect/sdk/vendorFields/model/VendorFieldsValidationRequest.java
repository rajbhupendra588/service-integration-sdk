package com.appdirect.sdk.vendorFields.model;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VendorFieldsValidationRequest {
	private String partner;
	private String editionCode;
	private FlowType flowType;
	private OperationType operationType;
	private String applicationIdentifier;
	private Map<String, String> fieldValues;
	private List<Locale> locales;
}
