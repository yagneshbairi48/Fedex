package com.example.fedexdemo1;

import com.example.fedexdemo1.Service.FedService;
import com.example.fedexdemo1.beans.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Fedexdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Fedexdemo1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(FedService service) {
		return args -> {

			String json="{\r\n    \"transactionId\": \"fe07e2e7-e7c1-40a7-af4b-3ace2fbf9848\",\r\n    \"output\": {\r\n        \"completeTrackResults\": [\r\n\t\t\r\n              {\r\n                \"trackingNumber\": \"774845878692\",\r\n                \"trackResults\": [\r\n                    {\r\n                        \"trackingNumberInfo\": {\r\n                            \"trackingNumber\": \"774845878692\",\r\n                            \"trackingNumberUniqueId\": \"2460327000~774845878692~FX\",\r\n                            \"carrierCode\": \"FDXE\"\r\n                        },\r\n                        \"additionalTrackingInfo\": {\r\n                            \"nickname\": \"\",\r\n                            \"packageIdentifiers\": [\r\n                                {\r\n                                    \"type\": \"PURCHASE_ORDER\",\r\n                                    \"values\": [\r\n                                        \"414-2740\"\r\n                                    ],\r\n                                    \"trackingNumberUniqueId\": \"\",\r\n                                    \"carrierCode\": \"\"\r\n                                },\r\n                                {\r\n                                    \"type\": \"SHIPPER_REFERENCE\",\r\n                                    \"values\": [\r\n                                        \"UTLX 666582\"\r\n                                    ],\r\n                                    \"trackingNumberUniqueId\": \"\",\r\n                                    \"carrierCode\": \"\"\r\n                                }\r\n                            ],\r\n                            \"hasAssociatedShipments\": false\r\n                        },\r\n                        \"shipperInformation\": {\r\n                            \"contact\": {},\r\n                            \"address\": {\r\n                                \"city\": \"VILLE PLATTE\",\r\n                                \"stateOrProvinceCode\": \"LA\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            }\r\n                        },\r\n                        \"recipientInformation\": {\r\n                            \"contact\": {},\r\n                            \"address\": {\r\n                                \"city\": \"VALDOSTA\",\r\n                                \"stateOrProvinceCode\": \"GA\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            }\r\n                        },\r\n                        \"latestStatusDetail\": {\r\n                            \"code\": \"DL\",\r\n                            \"derivedCode\": \"DL\",\r\n                            \"statusByLocale\": \"Delivered\",\r\n                            \"description\": \"Delivered\",\r\n                            \"scanLocation\": {\r\n                                \"city\": \"VALDOSTA\",\r\n                                \"stateOrProvinceCode\": \"GA\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            }\r\n                        },\r\n                        \"dateAndTimes\": [\r\n                            {\r\n                                \"type\": \"ACTUAL_DELIVERY\",\r\n                                \"dateTime\": \"2024-01-19T12:30:00-05:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"ACTUAL_PICKUP\",\r\n                                \"dateTime\": \"2024-01-17T14:19:00-06:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"SHIP\",\r\n                                \"dateTime\": \"2024-01-17T00:00:00-06:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"ACTUAL_TENDER\",\r\n                                \"dateTime\": \"2024-01-17T14:19:00-06:00\"\r\n                            }\r\n                        ],\r\n                        \"availableImages\": [\r\n                            {\r\n                                \"type\": \"SIGNATURE_PROOF_OF_DELIVERY\"\r\n                            }\r\n                        ],\r\n                        \"specialHandlings\": [\r\n                            {\r\n                                \"type\": \"DELIVER_WEEKDAY\",\r\n                                \"description\": \"Deliver Weekday\",\r\n                                \"paymentType\": \"OTHER\"\r\n                            }\r\n                        ],\r\n                        \"packageDetails\": {\r\n                            \"packagingDescription\": {\r\n                                \"type\": \"YOUR_PACKAGING\",\r\n                                \"description\": \"Your Packaging\"\r\n                            },\r\n                            \"sequenceNumber\": \"1\",\r\n                            \"count\": \"1\",\r\n                            \"weightAndDimensions\": {\r\n                                \"weight\": [\r\n                                    {\r\n                                        \"value\": \"20.0\",\r\n                                        \"unit\": \"LB\"\r\n                                    },\r\n                                    {\r\n                                        \"value\": \"9.07\",\r\n                                        \"unit\": \"KG\"\r\n                                    }\r\n                                ],\r\n                                \"dimensions\": [\r\n                                    {\r\n                                        \"length\": 13,\r\n                                        \"width\": 11,\r\n                                        \"height\": 13,\r\n                                        \"units\": \"IN\"\r\n                                    },\r\n                                    {\r\n                                        \"length\": 33,\r\n                                        \"width\": 27,\r\n                                        \"height\": 33,\r\n                                        \"units\": \"CM\"\r\n                                    }\r\n                                ]\r\n                            },\r\n                            \"packageContent\": []\r\n                        },\r\n                        \"shipmentDetails\": {\r\n                            \"possessionStatus\": true,\r\n                            \"weight\": [\r\n                                {\r\n                                    \"value\": \"20.0\",\r\n                                    \"unit\": \"LB\"\r\n                                },\r\n                                {\r\n                                    \"value\": \"9.07\",\r\n                                    \"unit\": \"KG\"\r\n                                }\r\n                            ]\r\n                        },\r\n                        \"scanEvents\": [\r\n                            {\r\n                                \"date\": \"2024-01-19T12:30:00-05:00\",\r\n                                \"eventType\": \"DL\",\r\n                                \"eventDescription\": \"Delivered\",\r\n                                \"exceptionCode\": \"\",\r\n                                \"exceptionDescription\": \"\",\r\n                                \"scanLocation\": {\r\n                                    \"streetLines\": [\r\n                                        \"\"\r\n                                    ],\r\n                                    \"city\": \"VALDOSTA\",\r\n                                    \"stateOrProvinceCode\": \"GA\",\r\n                                    \"postalCode\": \"31601\",\r\n                                    \"countryCode\": \"US\",\r\n                                    \"residential\": false,\r\n                                    \"countryName\": \"United States\"\r\n                                },\r\n                                \"locationId\": \"VLDA\",\r\n                                \"locationType\": \"DELIVERY_LOCATION\",\r\n                                \"derivedStatusCode\": \"DL\",\r\n                                \"derivedStatus\": \"Delivered\"\r\n                            }\r\n                        ],\r\n                        \"availableNotifications\": [\r\n                            \"ON_DELIVERY\"\r\n                        ],\r\n                        \"deliveryDetails\": {\r\n                            \"actualDeliveryAddress\": {\r\n                                \"city\": \"VALDOSTA\",\r\n                                \"stateOrProvinceCode\": \"GA\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            },\r\n                            \"locationType\": \"RECEPTIONIST_OR_FRONT_DESK\",\r\n                            \"locationDescription\": \"Receptionist/Front Desk\",\r\n                            \"deliveryAttempts\": \"0\",\r\n                            \"receivedByName\": \"Y.JACKSON\",\r\n                            \"deliveryOptionEligibilityDetails\": [\r\n                                {\r\n                                    \"option\": \"INDIRECT_SIGNATURE_RELEASE\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"REDIRECT_TO_HOLD_AT_LOCATION\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"REROUTE\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"RESCHEDULE\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"RETURN_TO_SHIPPER\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"DISPUTE_DELIVERY\",\r\n                                    \"eligibility\": \"POSSIBLY_ELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"SUPPLEMENT_ADDRESS\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                }\r\n                            ]\r\n                        },\r\n                        \"originLocation\": {\r\n                            \"locationContactAndAddress\": {\r\n                                \"address\": {\r\n                                    \"city\": \"LAFAYETTE\",\r\n                                    \"stateOrProvinceCode\": \"LA\",\r\n                                    \"countryCode\": \"US\",\r\n                                    \"residential\": false,\r\n                                    \"countryName\": \"United States\"\r\n                                }\r\n                            },\r\n                            \"locationId\": \"LFTA\"\r\n                        },\r\n                        \"destinationLocation\": {\r\n                            \"locationContactAndAddress\": {\r\n                                \"address\": {\r\n                                    \"city\": \"VALDOSTA\",\r\n                                    \"stateOrProvinceCode\": \"GA\",\r\n                                    \"countryCode\": \"US\",\r\n                                    \"residential\": false,\r\n                                    \"countryName\": \"United States\"\r\n                                }\r\n                            },\r\n                            \"locationType\": \"\"\r\n                        },\r\n                        \"lastUpdatedDestinationAddress\": {\r\n                            \"city\": \"VALDOSTA\",\r\n                            \"stateOrProvinceCode\": \"GA\",\r\n                            \"countryCode\": \"US\",\r\n                            \"residential\": false,\r\n                            \"countryName\": \"United States\"\r\n                        },\r\n                        \"serviceDetail\": {\r\n                            \"type\": \"FEDEX_EXPRESS_SAVER\",\r\n                            \"description\": \"FedEx Express Saver\",\r\n                            \"shortDescription\": \"XS\"\r\n                        },\r\n                        \"standardTransitTimeWindow\": {\r\n                            \"window\": {\r\n                                \"ends\": \"2024-01-22T17:00:00-05:00\"\r\n                            }\r\n                        },\r\n                        \"estimatedDeliveryTimeWindow\": {\r\n                            \"window\": {}\r\n                        },\r\n                        \"goodsClassificationCode\": \"\",\r\n                        \"returnDetail\": {}\r\n                    }\r\n                ]\r\n            },\r\n\t\t\t {\r\n                \"trackingNumber\": \"774750777027\",\r\n                \"trackResults\": [\r\n                    {\r\n                        \"trackingNumberInfo\": {\r\n                            \"trackingNumber\": \"774750777027\",\r\n                            \"trackingNumberUniqueId\": \"12027~774750777027~FDEG\",\r\n                            \"carrierCode\": \"FDXG\"\r\n                        },\r\n                        \"additionalTrackingInfo\": {\r\n                            \"nickname\": \"\",\r\n                            \"packageIdentifiers\": [\r\n                                {\r\n                                    \"type\": \"CUSTOMER_REFERENCE\",\r\n                                    \"values\": [\r\n                                        \"0249\"\r\n                                    ],\r\n                                    \"trackingNumberUniqueId\": \"\",\r\n                                    \"carrierCode\": \"\"\r\n                                },\r\n                                {\r\n                                    \"type\": \"PURCHASE_ORDER\",\r\n                                    \"values\": [\r\n                                        \"Spool Return #64083\"\r\n                                    ],\r\n                                    \"trackingNumberUniqueId\": \"\",\r\n                                    \"carrierCode\": \"\"\r\n                                }\r\n                            ],\r\n                            \"hasAssociatedShipments\": false\r\n                        },\r\n                        \"shipperInformation\": {\r\n                            \"contact\": {},\r\n                            \"address\": {\r\n                                \"city\": \"Naples\",\r\n                                \"stateOrProvinceCode\": \"FL\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            }\r\n                        },\r\n                        \"recipientInformation\": {\r\n                            \"contact\": {},\r\n                            \"address\": {\r\n                                \"city\": \"HAWTHORNE\",\r\n                                \"stateOrProvinceCode\": \"NJ\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            }\r\n                        },\r\n                        \"latestStatusDetail\": {\r\n                            \"code\": \"DL\",\r\n                            \"derivedCode\": \"DL\",\r\n                            \"statusByLocale\": \"Delivered\",\r\n                            \"description\": \"Delivered\",\r\n                            \"scanLocation\": {\r\n                                \"city\": \"Hawthorne\",\r\n                                \"stateOrProvinceCode\": \"NJ\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            }\r\n                        },\r\n                        \"dateAndTimes\": [\r\n                            {\r\n                                \"type\": \"ACTUAL_DELIVERY\",\r\n                                \"dateTime\": \"2024-01-15T11:44:56-05:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"ACTUAL_PICKUP\",\r\n                                \"dateTime\": \"2024-01-10T00:00:00-06:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"SHIP\",\r\n                                \"dateTime\": \"2024-01-10T00:00:00-06:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"ACTUAL_TENDER\",\r\n                                \"dateTime\": \"2024-01-10T00:00:00-06:00\"\r\n                            },\r\n                            {\r\n                                \"type\": \"ANTICIPATED_TENDER\",\r\n                                \"dateTime\": \"2024-01-10T00:00:00-06:00\"\r\n                            }\r\n                        ],\r\n                        \"availableImages\": [\r\n                            {\r\n                                \"type\": \"SIGNATURE_PROOF_OF_DELIVERY\"\r\n                            }\r\n                        ],\r\n                        \"packageDetails\": {\r\n                            \"packagingDescription\": {\r\n                                \"type\": \"YOUR_PACKAGING\",\r\n                                \"description\": \"Package\"\r\n                            },\r\n                            \"physicalPackagingType\": \"PACKAGE\",\r\n                            \"sequenceNumber\": \"1\",\r\n                            \"count\": \"1\",\r\n                            \"weightAndDimensions\": {\r\n                                \"weight\": [\r\n                                    {\r\n                                        \"value\": \"10.0\",\r\n                                        \"unit\": \"LB\"\r\n                                    },\r\n                                    {\r\n                                        \"value\": \"4.54\",\r\n                                        \"unit\": \"KG\"\r\n                                    }\r\n                                ],\r\n                                \"dimensions\": [\r\n                                    {\r\n                                        \"length\": 17,\r\n                                        \"width\": 16,\r\n                                        \"height\": 12,\r\n                                        \"units\": \"IN\"\r\n                                    },\r\n                                    {\r\n                                        \"length\": 43,\r\n                                        \"width\": 40,\r\n                                        \"height\": 30,\r\n                                        \"units\": \"CM\"\r\n                                    }\r\n                                ]\r\n                            },\r\n                            \"packageContent\": []\r\n                        },\r\n                        \"shipmentDetails\": {\r\n                            \"possessionStatus\": true\r\n                        },\r\n                        \"scanEvents\": [\r\n                            {\r\n                                \"date\": \"2024-01-15T11:44:56-05:00\",\r\n                                \"eventType\": \"DL\",\r\n                                \"eventDescription\": \"Delivered\",\r\n                                \"exceptionCode\": \"\",\r\n                                \"exceptionDescription\": \"\",\r\n                                \"scanLocation\": {\r\n                                    \"streetLines\": [\r\n                                        \"\"\r\n                                    ],\r\n                                    \"city\": \"Hawthorne\",\r\n                                    \"stateOrProvinceCode\": \"NJ\",\r\n                                    \"postalCode\": \"07506\",\r\n                                    \"countryCode\": \"US\",\r\n                                    \"residential\": false,\r\n                                    \"countryName\": \"United States\"\r\n                                },\r\n                                \"locationType\": \"DELIVERY_LOCATION\",\r\n                                \"derivedStatusCode\": \"DL\",\r\n                                \"derivedStatus\": \"Delivered\"\r\n                            }\r\n                        ],\r\n                        \"availableNotifications\": [\r\n                            \"ON_DELIVERY\"\r\n                        ],\r\n                        \"deliveryDetails\": {\r\n                            \"actualDeliveryAddress\": {\r\n                                \"city\": \"Hawthorne\",\r\n                                \"stateOrProvinceCode\": \"NJ\",\r\n                                \"countryCode\": \"US\",\r\n                                \"residential\": false,\r\n                                \"countryName\": \"United States\"\r\n                            },\r\n                            \"deliveryAttempts\": \"0\",\r\n                            \"receivedByName\": \"MMELQUIN\",\r\n                            \"deliveryOptionEligibilityDetails\": [\r\n                                {\r\n                                    \"option\": \"INDIRECT_SIGNATURE_RELEASE\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"REDIRECT_TO_HOLD_AT_LOCATION\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"REROUTE\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"RESCHEDULE\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"RETURN_TO_SHIPPER\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"DISPUTE_DELIVERY\",\r\n                                    \"eligibility\": \"POSSIBLY_ELIGIBLE\"\r\n                                },\r\n                                {\r\n                                    \"option\": \"SUPPLEMENT_ADDRESS\",\r\n                                    \"eligibility\": \"INELIGIBLE\"\r\n                                }\r\n                            ]\r\n                        },\r\n                        \"originLocation\": {\r\n                            \"locationContactAndAddress\": {\r\n                                \"address\": {\r\n                                    \"city\": \"FORT MYERS\",\r\n                                    \"stateOrProvinceCode\": \"FL\",\r\n                                    \"countryCode\": \"US\",\r\n                                    \"residential\": false,\r\n                                    \"countryName\": \"United States\"\r\n                                }\r\n                            }\r\n                        },\r\n                        \"lastUpdatedDestinationAddress\": {\r\n                            \"city\": \"HAWTHORNE\",\r\n                            \"stateOrProvinceCode\": \"NJ\",\r\n                            \"countryCode\": \"US\",\r\n                            \"residential\": false,\r\n                            \"countryName\": \"United States\"\r\n                        },\r\n                        \"serviceDetail\": {\r\n                            \"type\": \"FEDEX_GROUND\",\r\n                            \"description\": \"FedEx Ground\",\r\n                            \"shortDescription\": \"FG\"\r\n                        },\r\n                        \"standardTransitTimeWindow\": {\r\n                            \"window\": {\r\n                                \"ends\": \"2024-01-15T00:00:00-06:00\"\r\n                            }\r\n                        },\r\n                        \"estimatedDeliveryTimeWindow\": {\r\n                            \"window\": {}\r\n                        },\r\n                        \"goodsClassificationCode\": \"\",\r\n                        \"returnDetail\": {}\r\n                    }\r\n                ]\r\n            }\r\n        ]\r\n    }\r\n}\r\n";
			String token = "{\"transactionId\":\"3c5ff255-7005-42ea-8ace-bdf5c8cecce3\",\"output\":{\"transitTimes\":[{\"transitTimeDetails\":[{\"serviceType\":\"FIRST_OVERNIGHT\",\"serviceName\":\"FedExFirstOvernight®\",\"commit\":{\"dateDetail\":{\"dayOfWeek\":\"Sat\",\"time\":\"12:30\",\"day\":\"Jan-06-2024\"},\"derivedDestinationDetail\":{\"countryCode\":\"US\",\"stateOrProvinceCode\":\"CA\",\"postalCode\":\"93230\",\"serviceArea\":\"A8\",\"locationId\":\"VISA\",\"locationNumber\":0,\"airportId\":\"OAK\"}},\"customerMessages\":[]},{\"serviceType\":\"PRIORITY_OVERNIGHT\",\"serviceName\":\"FedExPriorityOvernight®\",\"commit\":{\"dateDetail\":{\"dayOfWeek\":\"Sat\",\"time\":\"13:30\",\"day\":\"Jan-06-2024\"},\"derivedDestinationDetail\":{\"countryCode\":\"US\",\"stateOrProvinceCode\":\"CA\",\"postalCode\":\"93230\",\"serviceArea\":\"A8\",\"locationId\":\"VISA\",\"locationNumber\":0,\"airportId\":\"OAK\"}},\"customerMessages\":[]}]}],\"encoded\":false}}";
			ObjectMapper objectMapper = new ObjectMapper();

			Fed f1 = objectMapper.readValue(token, Fed.class);
			Fed fed = objectMapper.readValue(json, Fed.class);

			if (fed.getOutput() != null) {

				if (fed.getOutput().getCompleteTrackResults() != null) {
					for (int i = 0; i < fed.getOutput().getCompleteTrackResults().length; i++) {

						FedEntity fedEntity = new FedEntity();
						fedEntity.setTransactionId(fed.getTransactionId());

						fedEntity.setCustomerTransactionId(fed.getCustomerTransactionId());
						fedEntity.setTrackingNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackingNumber());

						if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0] != null) {

							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getTrackingNumberInfo() != null) {
								fedEntity.setTrackingNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getTrackingNumberInfo().getTrackingNumber());
								fedEntity.setCarrierCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getTrackingNumberInfo().getCarrierCode());
								fedEntity.setTrackingNumberUniqueId(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getTrackingNumberInfo().getTrackingNumberUniqueId());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAdditionalTrackingInfo() != null) {

								fedEntity.setHasAssociatedShipments(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAdditionalTrackingInfo().isHasAssociatedShipments());
								fedEntity.setNickname(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAdditionalTrackingInfo().getNickname());
								String pack = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAdditionalTrackingInfo().getPackageIdentifiers());
								fedEntity.setPackageIdentifiers(pack);
								fedEntity.setShipmentNotes((fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAdditionalTrackingInfo().getShipmentNotes()));
							}

							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDistanceToDestination() != null) {
								fedEntity.setDistanceToDestinationValue(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDistanceToDestination().getValue());
								fedEntity.setDistanceToDestinationUnits(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDistanceToDestination().getUnits());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail() != null) {
								fedEntity.setConsolidationDetailTimeStamp(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail()[0].getTimeStamp());
								fedEntity.setConsolidationID(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail()[0].getConsolidationID());
								fedEntity.setConsolidationreasonDetailDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail()[0].getReasonDetail().getDescription());
								fedEntity.setConsolidationreasonDetailType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail()[0].getReasonDetail().getType());
								fedEntity.setConsolidationPackageCount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail()[0].getPackageCount());
								fedEntity.setConsolidationEventType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getConsolidationDetail()[0].getEventType());
							}
							fedEntity.setMeterNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getMeterNumber());
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReturnDetail() != null) {
								fedEntity.setReturnAuthorizationName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReturnDetail().getAuthorizationName());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReturnDetail().getReasonDetail() != null) {
									fedEntity.setReturnReasonDetailDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReturnDetail().getReasonDetail()[0].getDescription());
									fedEntity.setReturnReasonDetailType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReturnDetail().getReasonDetail()[0].getType());
								}
							}

							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceDetail() != null) {
								fedEntity.setServiceDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceDetail().getDescription());
								fedEntity.setServiceShortDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceDetail().getShortDescription());
								fedEntity.setServiceType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceDetail().getType());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation() != null) {
								fedEntity.setDestLocationId(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationId());

								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress() != null) {
									Contact contact = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact();
									if (contact != null) {

										fedEntity.setDestPersonName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact().getPersonName());
										fedEntity.setDestPhoneNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact().getPhoneNumber());
										fedEntity.setDestCompanyName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact().getCompanyName());
									}
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress() != null) {
										fedEntity.setDestAddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getAddressClassification());
										fedEntity.setDestResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getResidential());
										if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getStreetLines() != null) {
											String[] streetlines = (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getStreetLines());
											fedEntity.setLastUpdatedDestinationAddressStreetLines(String.join(",", streetlines));

										}
										fedEntity.setDestCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getCity());
										fedEntity.setDestUrbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getUrbanizationCode());
										fedEntity.setDestStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getStateOrProvinceCode());
										fedEntity.setDestPostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getPostalCode());
										fedEntity.setDestCountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getCountryCode());
										fedEntity.setDestCountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getCountryName());
									}
								}
								fedEntity.setDestLocationType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDestinationLocation().getLocationType());
							}

							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail() != null) {

								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation() != null) {
									fedEntity.setLatestStatusAddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getAddressClassification());
									fedEntity.setLatestStatusResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().isResidential());
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getStreetLines() != null) {
										String[] lateststatusstringarray = (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getStreetLines());
										String lateststatusstring = String.join(",", lateststatusstringarray);
										fedEntity.setLatestStatusStreetLines(lateststatusstring);
									}

									fedEntity.setLatestStatusCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getCity());
									fedEntity.setLatestStatusUrbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getUrbanizationCode());
									fedEntity.setLatestStatusStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getStateOrProvinceCode());
									fedEntity.setLatestStatusPostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getPostalCode());
									fedEntity.setLatestStatusCountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getCountryCode());
									fedEntity.setLatestStatusCountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getCountryName());
								}
								fedEntity.setLatestStatusCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getCode());
								fedEntity.setLatestStatusDerivedCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getDerivedCode());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails() != null) {
									fedEntity.setLatestStatusAncillaryReason(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getReason());
									fedEntity.setLatestStatusAncillaryReasonDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getReasonDescription());
									fedEntity.setLatestStatusAncillaryAction(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getAction());
									fedEntity.setLatestStatusAncillaryActionDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getActionDescription());
								}

								fedEntity.setLatestStatusByLocale(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getStatusByLocale());
								fedEntity.setLatestStatusDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getDescription());


								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getDelayDetail() != null) {
									fedEntity.setLatestStatusdelayType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getDelayDetail().getType());
									fedEntity.setLatestStatusdelaysubType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getDelayDetail().getSubType());
									fedEntity.setLatestStatusdelayStatus(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLatestStatusDetail().getDelayDetail().getStatus());
								}
							}

							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceCommitMessage() != null) {
								fedEntity.setServiceCommitMessage(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceCommitMessage().getMessage());
								fedEntity.setServiceCommitType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getServiceCommitMessage().getType());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getInformationNotes() != null) {
								String informationnotes = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getInformationNotes());
								fedEntity.setInformationNotes(informationnotes);
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getError() != null) {
								fedEntity.setErrorCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getError().getCode());

								String errorparameter = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getError().getParameterList());
								fedEntity.setErrorParameterList(errorparameter);

								fedEntity.setErrorMessage(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getError().getMessage());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getSpecialHandlings() != null) {
								String specialhandlings = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getSpecialHandlings());
								fedEntity.setSpecialHandlings(specialhandlings);
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAvailableImages() != null) {
								String availablimages = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAvailableImages());
								fedEntity.setAvailableImages(availablimages);
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails() != null) {
								fedEntity.setDeliveryreceivedByName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getReceivedByName());
								fedEntity.setDeliverydestinationServiceArea(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getDestinationServiceArea());
								fedEntity.setDeliverydestinationServiceAreadescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getDestinationServiceAreaDescription());
								fedEntity.setDeliverylocationDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getLocationDescription());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress() != null) {
									fedEntity.setActualAddressclassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getAddressClassification());
									fedEntity.setActualAddressresidental(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().isResidential());
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getStreetLines() != null) {
										String[] actualaddressstringarray = (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getStreetLines());
										fedEntity.setActualAddressstreetLines(String.join(",", actualaddressstringarray));
									}
									fedEntity.setActualAddressCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getCity());
									fedEntity.setActualAddressurbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getUrbanizationCode());
									fedEntity.setActualAddressstateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getStateOrProvinceCode());
									fedEntity.setActualAddresspostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getPostalCode());
									fedEntity.setActualAddresscountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getCountryCode());
									fedEntity.setActualAddresscountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getCountryName());
								}
								fedEntity.setDeliveryToday(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().isDeliveryToday());
								fedEntity.setDeliverylocationType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getLocationType());
								fedEntity.setDeliverysignedByName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getSignedByName());
								fedEntity.setOfficeOrderDeliveryMethod(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getOfficeOrderDeliveryMethod());
								fedEntity.setDeliveryattempts(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getDeliveryAttempts());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getDeliveryOptionEligibilityDetails() != null) {
									String s = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDeliveryDetails().getDeliveryOptionEligibilityDetails());
									fedEntity.setDeliveryOptionEligibilityDetails(s);
								}
							}

							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress() != null) {
								fedEntity.setLastUpdatedDestinationAddressCountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getCountryName());
								fedEntity.setLastUpdatedDestinationAddressCountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getCountryCode());
								fedEntity.setLastUpdatedDestinationAddressPostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getPostalCode());
								fedEntity.setLastUpdatedDestinationAddressStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getUrbanizationCode());
								fedEntity.setLastUpdatedDestinationAddressUrbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getUrbanizationCode());
								fedEntity.setLastUpdatedDestinationAddressCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getCity());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getStreetLines() != null) {
									String[] laststreetlines = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getStreetLines();
									fedEntity.setLastUpdatedDestinationAddressStreetLines(String.join(",", laststreetlines));
								}
								fedEntity.setLastUpdatedDestinationAddressResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getResidential());
								fedEntity.setLastUpdatedDestinationAddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getLastUpdatedDestinationAddress().getAddressClassification());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation() != null) {

								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress() != null) {
									fedEntity.setShipperAddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getAddressClassification());
									fedEntity.setShipperResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getResidential());
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getStreetLines() != null) {
										String[] shipperstreetlines = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getStreetLines();
										fedEntity.setShipperStreetLines(String.join(",", shipperstreetlines));
									}
									fedEntity.setShipperCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getCity());
									fedEntity.setShipperUrbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getUrbanizationCode());
									fedEntity.setShipperStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getStateOrProvinceCode());
									fedEntity.setShipperPostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getPostalCode());
									fedEntity.setShipperCountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getCountryCode());
									fedEntity.setShipperCountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getAddress().getCountryName());
								}
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getContact() != null) {
									//fedEntity.setShipperContact	(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getContact());
									fedEntity.setShipperContactPersonName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getContact().getPersonName());
									fedEntity.setShipperContactPhoneNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getContact().getPhoneNumber());
									fedEntity.setShipperContactCompanyName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipperInformation().getContact().getCompanyName());
								}
							}
							if(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAvailableNotifications()!=null) {
								fedEntity.setAvailableNotifications(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getAvailableNotifications()[0]);
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReasonDetail() != null) {
								fedEntity.setReasonDetailDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReasonDetail().getDescription());
								fedEntity.setReasonDetailType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getReasonDetail().getType());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails() != null) {

								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getContents() != null) {
									fedEntity.setShipmentContentItemNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getContents()[0].getItemNumber());
									fedEntity.setShipmentContentReceivedQuantity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getContents()[0].getReceivedQuantity());
									fedEntity.setShipmentContentdescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getContents()[0].getDescription());
									fedEntity.setShipmentContentPartNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getContents()[0].getPartNumber());
								}
								fedEntity.setShipmentbeforePossessionStatus(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getpossessionStatus());
								String shipmentweight = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getWeight());
								fedEntity.setShipmentWeight(shipmentweight);
								fedEntity.setShipmentcontentPieceCount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getContentPieceCount());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getSplitShipments() != null) {
									fedEntity.setSplitShipmentsPieceCount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getPieceCount());
									fedEntity.setSplitShipmentsStatusCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getStatusCode());
									fedEntity.setSplitShipmentsStatusDesp(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getStatusDescription());
									fedEntity.setSplitShipmentstimeStamp(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getTimestamp());
								}
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getStandardTransitTimeWindow() != null) {
								fedEntity.setStdTransitTimeWindowDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getStandardTransitTimeWindow().getDescription());
								fedEntity.setStdTransitTimeWindowBegins(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getStandardTransitTimeWindow().getWindow().getBegins());
								fedEntity.setStdTransitTimeWindowEnds(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getStandardTransitTimeWindow().getWindow().getEnds());
								fedEntity.setStdTransitTimeWindowType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getStandardTransitTimeWindow().getType());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation() != null) {

								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getContact() != null) {
									fedEntity.setRecipientPersonName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getContact().getPersonName());
									fedEntity.setRecipientPhoneNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getContact().getPhoneNumber());
									fedEntity.setRecipientCompanyName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getContact().getCompanyName());
								}
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress() != null) {
									fedEntity.setRecipientAddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getAddressClassification());
									fedEntity.setRecipientResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getResidential());
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getStreetLines() != null) {
										String[] recipient = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getStreetLines();
										fedEntity.setRecipientStreetLines(String.join(",", recipient));
									}
									fedEntity.setRecipientCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getCity());
									fedEntity.setRecipientUrbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getUrbanizationCode());
									fedEntity.setRecipientStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getStateOrProvinceCode());
									fedEntity.setRecipientPostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getPostalCode());
									fedEntity.setRecipientCountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getCountryCode());
									fedEntity.setRecipientCountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getRecipientInformation().getAddress().getCountryName());
								}
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation() != null) {
								fedEntity.setOriginLocationId(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationId());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress() != null) {

									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact() != null) {
										fedEntity.setOriginLocationPersonName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact().getPersonName());
										fedEntity.setOriginLocationPhoneNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact().getPhoneNumber());
										fedEntity.setOriginLocationCompanyName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact().getCompanyName());
									}
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress() != null) {
										fedEntity.setOriginLocationAddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getAddressClassification());
										fedEntity.setOriginLocationResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getResidential());
										if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getStreetLines() != null) {
											String[] complete = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getStreetLines();
											fedEntity.setOriginLocationStreetLines(String.join(",", complete));
										}

										fedEntity.setOriginLocationCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getCity());
										fedEntity.setOriginLocationUrbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getUrbanizationCode());
										fedEntity.setOriginLocationStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getStateOrProvinceCode());
										fedEntity.setOriginLocationPostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getPostalCode());
										fedEntity.setOriginLocationcountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getCountryCode());
										fedEntity.setOriginLocationCountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getCountryName());
									}
								}
								fedEntity.setOriginLocationType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getOriginLocation().getLocationType());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPieceCounts() != null) {
								String piececounts = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPieceCounts());
								fedEntity.setPieceCounts(piececounts);
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getEstimatedDeliveryTimeWindow() != null) {
								fedEntity.setEstimatedDeliveryTimeDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getDescription());
								fedEntity.setEstimatedDeliveryTimeWindowbegins(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getWindow().getBegins());
								fedEntity.setEstimatedDeliveryTimeWindowends(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getWindow().getEnds());
								fedEntity.setEstimatedDeliveryTimeWindowType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getType());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions() != null) {
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail() != null) {
									fedEntity.setRequestedAppointmentDate(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail().getDate());
									fedEntity.setRequestedAppointmentWindowBegins(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail().getWindow()[0].getWindow().getBegins());
									fedEntity.setRequestedappointmentwindowends(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail().getWindow()[0].getWindow().getEnds());
								}
								fedEntity.setCustomDeliveryOptionsdescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getDescription());
								fedEntity.setCustomDeliveryOptionsType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getType());
								fedEntity.setCustomDeliveryOptionsStatus(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getCustomDeliveryOptions()[0].getStatus());
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation() != null) {
								fedEntity.setHoldLocationID(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationId());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress() != null) {

									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact() != null) {
										fedEntity.setHoldLocationpersonName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact().getPersonName());
										fedEntity.setHoldLocationphoneNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact().getPhoneNumber());
										fedEntity.setHoldLocationCompanyName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact().getCompanyName());
									}
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress() != null) {
										fedEntity.setHoldLocationaddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getAddressClassification());
										fedEntity.setHoldLocationResidential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getResidential());
										if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getStreetLines() != null) {
											String[] completetrack = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getStreetLines();
											fedEntity.setHoldLocationstreetLines(String.join(",", completetrack));
										}
										fedEntity.setHoldLocationCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getCity());
										fedEntity.setHoldLocationurbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getUrbanizationCode());
										fedEntity.setHoldLocationstateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getStateOrProvinceCode());
										fedEntity.setHoldLocationpostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getPostalCode());
										fedEntity.setHoldLocationcountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getCountryCode());
										fedEntity.setHoldLocationcountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getCountryName());
									}
								}
								fedEntity.setHoldLocationType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getHoldAtLocation().getLocationType());
							}
							fedEntity.setGoodsClassificationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getGoodsClassificationCode());
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails() != null) {
								fedEntity.setPhysicalPackagingType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getPhysicalPackagingType());
								fedEntity.setPackagesequenceNumber(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getSequenceNumber());
								fedEntity.setUndeliveredpackageCount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getUndeliveredCount());
								fedEntity.setPackageDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getPackagingDescription().getDescription());
								fedEntity.setPackageType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getPackagingDescription().getType());
								fedEntity.setPackageCount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getCount());
								//	if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getWeightAndDimensions().getWeight() != null)
								String weight = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getWeightAndDimensions().getWeight());
								fedEntity.setPackageWeight(weight);


								String dimensions = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getWeightAndDimensions().getDimensions());
								fedEntity.setPackageDimensions(dimensions);
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getPackageContent() != null && fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getPackageContent().length > 0) {
									fedEntity.setPackageContent(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getPackageContent()[0]);
								}
								fedEntity.setPackagePieceCount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getContentPieceCount());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getDeclaredValue() != null) {
									fedEntity.setDeclaredValueCurrency(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getDeclaredValue().getCurrency());
									fedEntity.setDeclaredValueAmount(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getPackageDetails().getDeclaredValue().getValue());
								}
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDateAndTimes() != null) {
								String dateandtime = objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getDateAndTimes());
								fedEntity.setDateAndTime(dateandtime);
							}
							if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents() != null) {

								fedEntity.setScanEventsDate(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDate());
								fedEntity.setScanEventsderivedStatus(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDerivedStatus());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation() != null) {
									fedEntity.setScanLocatoinaddressClassification(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getAddressClassification());
									fedEntity.setScanLocationResdential(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().isResidential());
									if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getStreetLines() != null) {
										String[] scanstreetlines = fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getStreetLines();
										String scanstreetlinesstring = String.join(",", scanstreetlines);
										fedEntity.setScanLocationstreetLines(scanstreetlinesstring);
									}
									fedEntity.setScanLocationCity(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getCity());
									fedEntity.setScanLocationurbanizationCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getUrbanizationCode());
									fedEntity.setScanLocationstateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getStateOrProvinceCode());
									fedEntity.setScanLocationpostalCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getPostalCode());
									fedEntity.setScanLocationcountryCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getCountryCode());
									fedEntity.setScanLocationcountryName(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getScanLocation().getCountryName());
								}
								fedEntity.setScanEventsLocationId(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getLocationId());
								fedEntity.setScanEventsLocationType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getLocationType());
								fedEntity.setScanEventDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getEventDescription());
								fedEntity.setScanEventsexceptionDescription(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getExceptionDescription());
								fedEntity.setScaneventType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getEventType());
								fedEntity.setScanEventsderivedStatusCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDerivedStatusCode());
								fedEntity.setScanEventsexceptionCode(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getExceptionCode());
								if (fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDelayDetail() != null) {
									fedEntity.setScanEventsdelayDetailType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDelayDetail().getType());
									fedEntity.setScanEventsdelayDetailsubType(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDelayDetail().getSubType());
									fedEntity.setScanEventsdelayDetailStatus(fed.getOutput().getCompleteTrackResults()[i].getTrackResults()[0].getScanEvents()[0].getDelayDetail().getStatus());
								}
							}
							if (f1.getOutput().getTransitTimes() != null) {

								if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails() != null) {
									fedEntity.setTransitTimeServiceType(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getServiceType());
									//fedEntity.setTransitTimeCustomerMessageCode(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCustomerMessages()[0].getCode());
									if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCustomerMessages() != null) {
										String msg = objectMapper.writeValueAsString(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCustomerMessages());
										fedEntity.setTransitTimeCustomerMessage(msg);
									}
									if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getDistance() != null) {
										String distance = objectMapper.writeValueAsString(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getDistance());
										fedEntity.setTransitTimeDistance(distance);
									}
									if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit() != null) {


										fedEntity.setBrokerCommitTimestamp(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getBrokerCommitTimestamp());
										fedEntity.setCommitCutOffTime(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getCutOffTime());
										fedEntity.setCommitCommodityName(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getCommodityName());
										if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getTransitDays() != null) {
											String transitdays = objectMapper.writeValueAsString(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getTransitDays());
											fedEntity.setCommitTransitDays(transitdays);
										}
										if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getCommitMessageDetails() != null) {
											fedEntity.setCommitMessageDetails(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getCommitMessageDetails());
										}
										if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail() != null) {
											fedEntity.setDerivedDestinationServiceArea(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getServiceArea());
											fedEntity.setDerivedDestinationCountryCode(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getCountryCode());
											fedEntity.setDerivedDestinationLocationId(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getLocationId());
											fedEntity.setDerivedDestinationAirportId(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getAirportId());
											fedEntity.setDerivedDestinationPostalCode(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getPostalCode());
											fedEntity.setDerivedDestinationStateOrProvinceCode(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getStateOrProvinceCode());
											fedEntity.setDerivedDestinationLocationNumber(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDerivedDestinationDetail().getLocationNumber());
										}
										if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDateDetail() != null) {
											String datedetail = objectMapper.writeValueAsString(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getCommit().getDateDetail());
											fedEntity.setTransitTimeDateDetail(datedetail);
										}
									}
									if (f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getDestinationLocation() != null) {
										fedEntity.setTransitTimeGeoPositionalCoordinates(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getDestinationLocation().getGeoPositionalCoordinates());
									}
									fedEntity.setTransitTimeServiceName(f1.getOutput().getTransitTimes()[0].getTransitTimeDetails()[0].getServiceName());
								}
							}

						}
						fedEntity.setAlerts(fed.getOutput().getAlerts());
						fedEntity.setEncoded(fed.getOutput().getEncoded());
						service.saveEntity(fedEntity);
					}

				}
			}

		};

	}

}

