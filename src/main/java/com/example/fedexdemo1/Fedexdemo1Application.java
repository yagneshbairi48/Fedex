package com.example.fedexdemo1;

import com.example.fedexdemo1.Service.FedService;
import com.example.fedexdemo1.beans.Fed;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Fedexdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Fedexdemo1Application.class, args);
	}
	@Bean
	public CommandLineRunner demo(FedService service) {
		return args -> {
			FedEntity fedEntity = new FedEntity();
			ObjectMapper objectMapper = new ObjectMapper();
			String json ="{\n" +
					"  \"transactionId\": \"624deea6-b709-470c-8c39-4b5511281492\",\n" +
					"  \"customerTransactionId\": \"AnyCo_order123456789\",\n" +
					"  \"output\": {\n" +
					"    \"completeTrackResults\": [\n" +
					"      {\n" +
					"        \"trackingNumber\": \"123456789012\",\n" +
					"        \"trackResults\": [\n" +
					"          {\n" +
					"            \"trackingNumberInfo\": {\n" +
					"              \"trackingNumber\": \"128667043726\",\n" +
					"              \"carrierCode\": \"FDXE\",\n" +
					"              \"trackingNumberUniqueId\": \"245822~123456789012~FDEG\"\n" +
					"            },\n" +
					"            \"additionalTrackingInfo\": {\n" +
					"              \"hasAssociatedShipments\": false,\n" +
					"              \"nickname\": \"shipment nickname\",\n" +
					"              \"packageIdentifiers\": [\n" +
					"                {\n" +
					"                  \"type\": \"SHIPPER_REFERENCE\",\n" +
					"                  \"value\": \"ASJFGVAS\",\n" +
					"                  \"trackingNumberUniqueId\": \"245822~123456789012~FDEG\"\n" +
					"                }\n" +
					"              ],\n" +
					"              \"shipmentNotes\": \"shipment notes\"\n" +
					"            },\n" +
					"            \"distanceToDestination\": {\n" +
					"              \"units\": \"KM\",\n" +
					"              \"value\": 685.7\n" +
					"            },\n" +
					"            \"consolidationDetail\": [\n" +
					"              {\n" +
					"                \"timeStamp\": \"2020-10-13T03:54:44-06:00\",\n" +
					"                \"consolidationID\": \"47936927\",\n" +
					"                \"reasonDetail\": {\n" +
					"                  \"description\": \"Wrong color\",\n" +
					"                  \"type\": \"REJECTED\"\n" +
					"                },\n" +
					"                \"packageCount\": 25,\n" +
					"                \"eventType\": \"PACKAGE_ADDED_TO_CONSOLIDATION\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"meterNumber\": \"8468376\",\n" +
					"            \"returnDetail\": {\n" +
					"              \"authorizationName\": \"Sammy Smith\",\n" +
					"              \"reasonDetail\": [\n" +
					"                {\n" +
					"                  \"description\": \"Wrong color\",\n" +
					"                  \"type\": \"REJECTED\"\n" +
					"                }\n" +
					"              ]\n" +
					"            },\n" +
					"            \"serviceDetail\": {\n" +
					"              \"description\": \"FedEx Freight Economy.\",\n" +
					"              \"shortDescription\": \"FL\",\n" +
					"              \"type\": \"FEDEX_FREIGHT_ECONOMY\"\n" +
					"            },\n" +
					"            \"destinationLocation\": {\n" +
					"              \"locationId\": \"SEA\",\n" +
					"              \"locationContactAndAddress\": {\n" +
					"                \"contact\": {\n" +
					"                  \"personName\": \"John Taylor\",\n" +
					"                  \"phoneNumber\": \"1234567890\",\n" +
					"                  \"companyName\": \"Fedex\"\n" +
					"                },\n" +
					"                \"address\": {\n" +
					"                  \"addressClassification\": \"BUSINESS\",\n" +
					"                  \"residential\": false,\n" +
					"                  \"streetLines\": [\n" +
					"                    \"1043 North Easy Street\",\n" +
					"                    \"Suite 999\"\n" +
					"                  ],\n" +
					"                  \"city\": \"SEATTLE\",\n" +
					"                  \"urbanizationCode\": \"RAFAEL\",\n" +
					"                  \"stateOrProvinceCode\": \"WA\",\n" +
					"                  \"postalCode\": \"98101\",\n" +
					"                  \"countryCode\": \"US\",\n" +
					"                  \"countryName\": \"United States\"\n" +
					"                }\n" +
					"              },\n" +
					"              \"locationType\": \"PICKUP_LOCATION\"\n" +
					"            },\n" +
					"            \"latestStatusDetail\": {\n" +
					"              \"scanLocation\": {\n" +
					"                \"addressClassification\": \"BUSINESS\",\n" +
					"                \"residential\": false,\n" +
					"                \"streetLines\": [\n" +
					"                  \"1043 North Easy Street\",\n" +
					"                  \"Suite 999\"\n" +
					"                ],\n" +
					"                \"city\": \"SEATTLE\",\n" +
					"                \"urbanizationCode\": \"RAFAEL\",\n" +
					"                \"stateOrProvinceCode\": \"WA\",\n" +
					"                \"postalCode\": \"98101\",\n" +
					"                \"countryCode\": \"US\",\n" +
					"                \"countryName\": \"United States\"\n" +
					"              },\n" +
					"              \"code\": \"PU\",\n" +
					"              \"derivedCode\": \"PU\",\n" +
					"              \"ancillaryDetails\": [\n" +
					"                {\n" +
					"                  \"reason\": \"15\",\n" +
					"                  \"reasonDescription\": \"Customer not available or business closed\",\n" +
					"                  \"action\": \"Contact us at <http://www.fedex.com/us/customersupport/call/index.html> to discuss possible delivery or pickup alternatives.\",\n" +
					"                  \"actionDescription\": \"Customer not Available or Business Closed\"\n" +
					"                }\n" +
					"              ],\n" +
					"              \"statusByLocale\": \"Picked up\",\n" +
					"              \"description\": \"Picked up\",\n" +
					"              \"delayDetail\": {\n" +
					"                \"type\": \"WEATHER\",\n" +
					"                \"subType\": \"SNOW\",\n" +
					"                \"status\": \"DELAYED\"\n" +
					"              }\n" +
					"            },\n" +
					"            \"serviceCommitMessage\": {\n" +
					"              \"message\": \"No scheduled delivery date available at this time.\",\n" +
					"              \"type\": \"ESTIMATED_DELIVERY_DATE_UNAVAILABLE\"\n" +
					"            },\n" +
					"            \"informationNotes\": [\n" +
					"              {\n" +
					"                \"code\": \"CLEARANCE_ENTRY_FEE_APPLIES\",\n" +
					"                \"description\": \"this is an informational message\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"error\": {\n" +
					"              \"code\": \"TRACKING.TRACKINGNUMBER.EMPTY\",\n" +
					"              \"parameterList\": [\n" +
					"                {\n" +
					"                  \"value\": \"value\",\n" +
					"                  \"key\": \"key\"\n" +
					"                }\n" +
					"              ],\n" +
					"              \"message\": \"Please provide tracking number.\"\n" +
					"            },\n" +
					"            \"specialHandlings\": [\n" +
					"              {\n" +
					"                \"description\": \"Deliver Weekday\",\n" +
					"                \"type\": \"DELIVER_WEEKDAY\",\n" +
					"                \"paymentType\": \"OTHER\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"availableImages\": [\n" +
					"              {\n" +
					"                \"size\": \"LARGE\",\n" +
					"                \"type\": \"BILL_OF_LADING\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"deliveryDetails\": {\n" +
					"              \"receivedByName\": \"Reciever\",\n" +
					"              \"destinationServiceArea\": \"EDDUNAVAILABLE\",\n" +
					"              \"destinationServiceAreaDescription\": \"Appointment required\",\n" +
					"              \"locationDescription\": \"Receptionist/Front Desk\",\n" +
					"              \"actualDeliveryAddress\": {\n" +
					"                \"addressClassification\": \"BUSINESS\",\n" +
					"                \"residential\": false,\n" +
					"                \"streetLines\": [\n" +
					"                  \"1043 North Easy Street\",\n" +
					"                  \"Suite 999\"\n" +
					"                ],\n" +
					"                \"city\": \"SEATTLE\",\n" +
					"                \"urbanizationCode\": \"RAFAEL\",\n" +
					"                \"stateOrProvinceCode\": \"WA\",\n" +
					"                \"postalCode\": \"98101\",\n" +
					"                \"countryCode\": \"US\",\n" +
					"                \"countryName\": \"United States\"\n" +
					"              },\n" +
					"              \"deliveryToday\": false,\n" +
					"              \"locationType\": \"FEDEX_EXPRESS_STATION\",\n" +
					"              \"signedByName\": \"Reciever\",\n" +
					"              \"officeOrderDeliveryMethod\": \"Courier\",\n" +
					"              \"deliveryAttempts\": \"0\",\n" +
					"              \"deliveryOptionEligibilityDetails\": [\n" +
					"                {\n" +
					"                  \"option\": \"INDIRECT_SIGNATURE_RELEASE\",\n" +
					"                  \"eligibility\": \"INELIGIBLE\"\n" +
					"                }\n" +
					"              ]\n" +
					"            },\n" +
					"            \"scanEvents\": [\n" +
					"              {\n" +
					"                \"date\": \"2018-02-02T12:01:00-07:00\",\n" +
					"                \"derivedStatus\": \"Picked Up\",\n" +
					"                \"scanLocation\": {\n" +
					"                  \"addressClassification\": \"BUSINESS\",\n" +
					"                  \"residential\": false,\n" +
					"                  \"streetLines\": [\n" +
					"                    \"1043 North Easy Street\",\n" +
					"                    \"Suite 999\"\n" +
					"                  ],\n" +
					"                  \"city\": \"SEATTLE\",\n" +
					"                  \"urbanizationCode\": \"RAFAEL\",\n" +
					"                  \"stateOrProvinceCode\": \"WA\",\n" +
					"                  \"postalCode\": \"98101\",\n" +
					"                  \"countryCode\": \"US\",\n" +
					"                  \"countryName\": \"United States\"\n" +
					"                },\n" +
					"                \"locationId\": \"SEA\",\n" +
					"                \"locationType\": \"PICKUP_LOCATION\",\n" +
					"                \"exceptionDescription\": \"Package available for clearance\",\n" +
					"                \"eventDescription\": \"Picked Up\",\n" +
					"                \"eventType\": \"PU\",\n" +
					"                \"derivedStatusCode\": \"PU\",\n" +
					"                \"exceptionCode\": \"A25\",\n" +
					"                \"delayDetail\": {\n" +
					"                  \"type\": \"WEATHER\",\n" +
					"                  \"subType\": \"SNOW\",\n" +
					"                  \"status\": \"DELAYED\"\n" +
					"                }\n" +
					"              }\n" +
					"            ],\n" +
					"            \"dateAndTimes\": [\n" +
					"              {\n" +
					"                \"dateTime\": \"2007-09-27T00:00:00\",\n" +
					"                \"type\": \"ACTUAL_DELIVERY\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"packageDetails\": {\n" +
					"              \"physicalPackagingType\": \"BARREL\",\n" +
					"              \"sequenceNumber\": \"45\",\n" +
					"              \"undeliveredCount\": \"7\",\n" +
					"              \"packagingDescription\": {\n" +
					"                \"description\": \"FedEx Pak\",\n" +
					"                \"type\": \"FEDEX_PAK\"\n" +
					"              },\n" +
					"              \"count\": \"1\",\n" +
					"              \"weightAndDimensions\": {\n" +
					"                \"weight\": [\n" +
					"                  {\n" +
					"                    \"unit\": \"LB\",\n" +
					"                    \"value\": \"22222.0\"\n" +
					"                  }\n" +
					"                ],\n" +
					"                \"dimensions\": [\n" +
					"                  {\n" +
					"                    \"length\": 100,\n" +
					"                    \"width\": 50,\n" +
					"                    \"height\": 30,\n" +
					"                    \"units\": \"CM\"\n" +
					"                  }\n" +
					"                ]\n" +
					"              },\n" +
					"              \"packageContent\": [\n" +
					"                \"wire hangers\",\n" +
					"                \"buttons\"\n" +
					"              ],\n" +
					"              \"contentPieceCount\": \"100\",\n" +
					"              \"declaredValue\": {\n" +
					"                \"currency\": \"USD\",\n" +
					"                \"value\": 56.8\n" +
					"              }\n" +
					"            },\n" +
					"            \"goodsClassificationCode\": \"goodsClassificationCode\",\n" +
					"            \"holdAtLocation\": {\n" +
					"              \"locationId\": \"SEA\",\n" +
					"              \"locationContactAndAddress\": {\n" +
					"                \"contact\": {\n" +
					"                  \"personName\": \"John Taylor\",\n" +
					"                  \"phoneNumber\": \"1234567890\",\n" +
					"                  \"companyName\": \"Fedex\"\n" +
					"                },\n" +
					"                \"address\": {\n" +
					"                  \"addressClassification\": \"BUSINESS\",\n" +
					"                  \"residential\": false,\n" +
					"                  \"streetLines\": [\n" +
					"                    \"1043 North Easy Street\",\n" +
					"                    \"Suite 999\"\n" +
					"                  ],\n" +
					"                  \"city\": \"SEATTLE\",\n" +
					"                  \"urbanizationCode\": \"RAFAEL\",\n" +
					"                  \"stateOrProvinceCode\": \"WA\",\n" +
					"                  \"postalCode\": \"98101\",\n" +
					"                  \"countryCode\": \"US\",\n" +
					"                  \"countryName\": \"United States\"\n" +
					"                }\n" +
					"              },\n" +
					"              \"locationType\": \"PICKUP_LOCATION\"\n" +
					"            },\n" +
					"            \"customDeliveryOptions\": [\n" +
					"              {\n" +
					"                \"requestedAppointmentDetail\": {\n" +
					"                  \"date\": \"2019-05-07\",\n" +
					"                  \"window\": [\n" +
					"                    {\n" +
					"                      \"description\": \"Description field\",\n" +
					"                      \"window\": {\n" +
					"                        \"begins\": \"2021-10-01T08:00:00\",\n" +
					"                        \"ends\": \"2021-10-15T00:00:00-06:00\"\n" +
					"                      },\n" +
					"                      \"type\": \"ESTIMATED_DELIVERY\"\n" +
					"                    }\n" +
					"                  ]\n" +
					"                },\n" +
					"                \"description\": \"Redirect the package to the hold location.\",\n" +
					"                \"type\": \"REDIRECT_TO_HOLD_AT_LOCATION\",\n" +
					"                \"status\": \"HELD\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"estimatedDeliveryTimeWindow\": {\n" +
					"              \"description\": \"Description field\",\n" +
					"              \"window\": {\n" +
					"                \"begins\": \"2021-10-01T08:00:00\",\n" +
					"                \"ends\": \"2021-10-15T00:00:00-06:00\"\n" +
					"              },\n" +
					"              \"type\": \"ESTIMATED_DELIVERY\"\n" +
					"            },\n" +
					"            \"pieceCounts\": [\n" +
					"              {\n" +
					"                \"count\": \"35\",\n" +
					"                \"description\": \"picec count description\",\n" +
					"                \"type\": \"ORIGIN\"\n" +
					"              }\n" +
					"            ],\n" +
					"            \"originLocation\": {\n" +
					"              \"locationId\": \"SEA\",\n" +
					"              \"locationContactAndAddress\": {\n" +
					"                \"contact\": {\n" +
					"                  \"personName\": \"John Taylor\",\n" +
					"                  \"phoneNumber\": \"1234567890\",\n" +
					"                  \"companyName\": \"Fedex\"\n" +
					"                },\n" +
					"                \"address\": {\n" +
					"                  \"addressClassification\": \"BUSINESS\",\n" +
					"                  \"residential\": false,\n" +
					"                  \"streetLines\": [\n" +
					"                    \"1043 North Easy Street\",\n" +
					"                    \"Suite 999\"\n" +
					"                  ],\n" +
					"                  \"city\": \"SEATTLE\",\n" +
					"                  \"urbanizationCode\": \"RAFAEL\",\n" +
					"                  \"stateOrProvinceCode\": \"WA\",\n" +
					"                  \"postalCode\": \"98101\",\n" +
					"                  \"countryCode\": \"US\",\n" +
					"                  \"countryName\": \"United States\"\n" +
					"                }\n" +
					"              },\n" +
					"              \"locationType\": \"PICKUP_LOCATION\"\n" +
					"            },\n" +
					"            \"recipientInformation\": {\n" +
					"              \"contact\": {\n" +
					"                \"personName\": \"John Taylor\",\n" +
					"                \"phoneNumber\": \"1234567890\",\n" +
					"                \"companyName\": \"Fedex\"\n" +
					"              },\n" +
					"              \"address\": {\n" +
					"                \"addressClassification\": \"BUSINESS\",\n" +
					"                \"residential\": false,\n" +
					"                \"streetLines\": [\n" +
					"                  \"1043 North Easy Street\",\n" +
					"                  \"Suite 999\"\n" +
					"                ],\n" +
					"                \"city\": \"SEATTLE\",\n" +
					"                \"urbanizationCode\": \"RAFAEL\",\n" +
					"                \"stateOrProvinceCode\": \"WA\",\n" +
					"                \"postalCode\": \"98101\",\n" +
					"                \"countryCode\": \"US\",\n" +
					"                \"countryName\": \"United States\"\n" +
					"              }\n" +
					"            },\n" +
					"            \"standardTransitTimeWindow\": {\n" +
					"              \"description\": \"Description field\",\n" +
					"              \"window\": {\n" +
					"                \"begins\": \"2021-10-01T08:00:00\",\n" +
					"                \"ends\": \"2021-10-15T00:00:00-06:00\"\n" +
					"              },\n" +
					"              \"type\": \"ESTIMATED_DELIVERY\"\n" +
					"            },\n" +
					"            \"shipmentDetails\": {\n" +
					"              \"contents\": [\n" +
					"                {\n" +
					"                  \"itemNumber\": \"RZ5678\",\n" +
					"                  \"receivedQuantity\": \"13\",\n" +
					"                  \"description\": \"pulyurethane rope\",\n" +
					"                  \"partNumber\": \"RK1345\"\n" +
					"                }\n" +
					"              ],\n" +
					"              \"beforePossessionStatus\": false,\n" +
					"              \"weight\": [\n" +
					"                {\n" +
					"                  \"unit\": \"LB\",\n" +
					"                  \"value\": \"22222.0\"\n" +
					"                }\n" +
					"              ],\n" +
					"              \"contentPieceCount\": \"3333\",\n" +
					"              \"splitShipments\": [\n" +
					"                {\n" +
					"                  \"pieceCount\": \"10\",\n" +
					"                  \"statusDescription\": \"status\",\n" +
					"                  \"timestamp\": \"2019-05-07T08:00:07\",\n" +
					"                  \"statusCode\": \"statuscode\"\n" +
					"                }\n" +
					"              ]\n" +
					"            },\n" +
					"            \"reasonDetail\": {\n" +
					"              \"description\": \"Wrong color\",\n" +
					"              \"type\": \"REJECTED\"\n" +
					"            },\n" +
					"            \"availableNotifications\": [\n" +
					"              \"ON_DELIVERY\",\n" +
					"              \"ON_EXCEPTION\"\n" +
					"            ],\n" +
					"            \"shipperInformation\": {\n" +
					"              \"contact\": {\n" +
					"                \"personName\": \"John Taylor\",\n" +
					"                \"phoneNumber\": \"1234567890\",\n" +
					"                \"companyName\": \"Fedex\"\n" +
					"              },\n" +
					"              \"address\": {\n" +
					"                \"addressClassification\": \"BUSINESS\",\n" +
					"                \"residential\": false,\n" +
					"                \"streetLines\": [\n" +
					"                  \"1043 North Easy Street\",\n" +
					"                  \"Suite 999\"\n" +
					"                ],\n" +
					"                \"city\": \"SEATTLE\",\n" +
					"                \"urbanizationCode\": \"RAFAEL\",\n" +
					"                \"stateOrProvinceCode\": \"WA\",\n" +
					"                \"postalCode\": \"98101\",\n" +
					"                \"countryCode\": \"US\",\n" +
					"                \"countryName\": \"United States\"\n" +
					"              }\n" +
					"            },\n" +
					"            \"lastUpdatedDestinationAddress\": {\n" +
					"              \"addressClassification\": \"BUSINESS\",\n" +
					"              \"residential\": false,\n" +
					"              \"streetLines\": [\n" +
					"                \"1043 North Easy Street\",\n" +
					"                \"Suite 999\"\n" +
					"              ],\n" +
					"              \"city\": \"SEATTLE\",\n" +
					"              \"urbanizationCode\": \"RAFAEL\",\n" +
					"              \"stateOrProvinceCode\": \"WA\",\n" +
					"              \"postalCode\": \"98101\",\n" +
					"              \"countryCode\": \"US\",\n" +
					"              \"countryName\": \"United States\"\n" +
					"            }\n" +
					"          }\n" +
					"        ]\n" +
					"      }\n" +
					"    ],\n" +
					"    \"alerts\": \"TRACKING.DATA.NOTFOUND-Tracking data unavailable\"\n" +
					"  }\n" +
					"}";
			Fed fed=objectMapper.readValue(json,Fed.class);
			fedEntity.setTransactionId(fed.getTransactionId());
			fedEntity.setCustomerTransactionId(fed.getCustomerTransactionId());
			fedEntity.setTrackingNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackingNumber());
			fedEntity.setTrackingNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getTrackingNumberInfo().getTrackingNumber());
			fedEntity.setCarrierCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getTrackingNumberInfo().getCarrierCode());
			fedEntity.setTrackingNumberUniqueId(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getTrackingNumberInfo().getTrackingNumberUniqueId());
			fedEntity.setHasAssociatedShipments(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAdditionalTrackingInfo().isHasAssociatedShipments());
			fedEntity.setNickname(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAdditionalTrackingInfo().getNickname());
			fedEntity.setPackageIdentifiersType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAdditionalTrackingInfo().getPackageIdentifiers()[0].getType());
			fedEntity.setPackageIdentifiersValue(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAdditionalTrackingInfo().getPackageIdentifiers()[0].getValue());
			fedEntity.setTrackingNumberUniqueId(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAdditionalTrackingInfo().getPackageIdentifiers()[0].getTrackingNumberUniqueId());
			fedEntity.setShipmentNotes((fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAdditionalTrackingInfo().getShipmentNotes()));
			fedEntity.setDistanceToDestinationValue(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDistanceToDestination().getValue());
			fedEntity.setDistanceToDestinationUnits(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDistanceToDestination().getUnits());
			fedEntity.setConsolidationDetailTimeStamp(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getConsolidationDetail()[0].getTimeStamp());
			fedEntity.setConsolidationID(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getConsolidationDetail()[0].getConsolidationID());
			fedEntity.setConsolidationreasonDetailDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getConsolidationDetail()[0].getReasonDetail().getDescription());
			fedEntity.setConsolidationreasonDetailType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getConsolidationDetail()[0].getReasonDetail().getType());
			fedEntity.setConsolidationPackageCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getConsolidationDetail()[0].getPackageCount());
			fedEntity.setConsolidationEventType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getConsolidationDetail()[0].getEventType());
			fedEntity.setMeterNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getMeterNumber());
			fedEntity.setReturnAuthorizationName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getReturnDetail().getAuthorizationName());
			fedEntity.setReturnReasonDetailDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getReturnDetail().getReasonDetail()[0].getDescription());
			fedEntity.setReturnReasonDetailType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getReturnDetail().getReasonDetail()[0].getType());
			fedEntity.setServiceDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getServiceDetail().getDescription());
			fedEntity.setServiceShortDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getServiceDetail().getShortDescription());
			fedEntity.setServiceType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getServiceDetail().getType());
			fedEntity.setDestLocationId(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationId());
			fedEntity.setDestPersonName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact().getPersonName());
			fedEntity.setDestPhoneNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact().getPhoneNumber());
			fedEntity.setDestCompanyName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getContact().getCompanyName());
			fedEntity.setDestAddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getAddressClassification());
			fedEntity.setDestResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getResidential());
			fedEntity.setDestStreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getStreetLines()[0]);
			fedEntity.setDestCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getCity());
			fedEntity.setDestUrbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getUrbanizationCode());
			fedEntity.setDestStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getStateOrProvinceCode());
			fedEntity.setDestPostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getPostalCode());
			fedEntity.setDestCountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getCountryCode());
			fedEntity.setDestCompanyName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationContactAndAddress().getAddress().getCountryName());
			fedEntity.setDestLocationType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDestinationLocation().getLocationType());
			fedEntity.setLatestStatusAddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getAddressClassification());
			fedEntity.setLatestStatusResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().isResidential());
			fedEntity.setLatestStatusStreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getStreetLines());
			fedEntity.setLatestStatusCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getCity());
			fedEntity.setLatestStatusUrbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getUrbanizationCode());
			fedEntity.setLatestStatusStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getStateOrProvinceCode());
			fedEntity.setLatestStatusPostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getPostalCode());
			fedEntity.setLatestStatusCountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getCountryCode());
			fedEntity.setLatestStatusCountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getScanLocation().getCountryName());
			fedEntity.setLatestStatusCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getCode());
			fedEntity.setLatestStatusDerivedCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getDerivedCode());
			fedEntity.setLatestStatusAncillaryReason(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getReason());
			fedEntity.setLatestStatusAncillaryReasonDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getReasonDescription());
			fedEntity.setLatestStatusAncillaryAction(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getAction());
			fedEntity.setLatestStatusAncillaryActionDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getAncillaryDetails()[0].getActionDescription());
			fedEntity.setLatestStatusByLocale(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getStatusByLocale());
			fedEntity.setLatestStatusDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getDescription());
			fedEntity.setLatestStatusdelayType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getDelayDetail().getType());
			fedEntity.setLatestStatusdelaysubType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getDelayDetail().getSubType());
			fedEntity.setLatestStatusdelayStatus(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLatestStatusDetail().getDelayDetail().getStatus());
			fedEntity.setServiceCommitMessage(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getServiceCommitMessage().getMessage());
			fedEntity.setServiceCommitType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getServiceCommitMessage().getType());
			String informationnotes= objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getInformationNotes());
			fedEntity.setInformationNotes(informationnotes);
			fedEntity.setErrorCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getError().getCode());

			String errorparameter=objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getError().getParameterList());
			fedEntity.setErrorParameterList(errorparameter);

			String specialhandlings=objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getSpecialHandlings());
			fedEntity.setSpecialHandlings(specialhandlings);

			String availablimages=objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAvailableImages());
			fedEntity.setInformationNotes(availablimages);

			fedEntity.setDeliveryreceivedByName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getReceivedByName());
			fedEntity.setDeliverydestinationServiceArea(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getDestinationServiceArea());
			fedEntity.setDeliverydestinationServiceAreadescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getDestinationServiceAreaDescription());
			fedEntity.setDeliverylocationDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getLocationDescription());
			fedEntity.setActualAddressclassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getAddressClassification());
			fedEntity.setActualAddressresidental(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().isResidential());
			fedEntity.setActualAddressstreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getStreetLines());
			fedEntity.setActualAddressCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getCity());
			fedEntity.setActualAddressurbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getUrbanizationCode());
			fedEntity.setActualAddressstateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getStateOrProvinceCode());
			fedEntity.setActualAddresspostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getPostalCode());
			fedEntity.setActualAddresscountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getCountryCode());
			fedEntity.setActualAddresscountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getActualDeliveryAddress().getCountryName());
			fedEntity.setDeliveryToday(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().isDeliveryToday());
			fedEntity.setDeliverylocationType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getLocationType());
			fedEntity.setDeliverysignedByName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getSignedByName());
			fedEntity.setOfficeOrderDeliveryMethod(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getOfficeOrderDeliveryMethod());
			fedEntity.setDeliveryattempts(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getDeliveryAttempts());
			String s= objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDeliveryDetails().getDeliveryOptionEligibilityDetails());
			fedEntity.setDeliveryOptionEligibilityDetails(s);




			fedEntity.setAlerts(fed.getOutput().getAlerts());
			fedEntity.setLastUpdatedDestinationAddressCountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getCountryName());
			fedEntity.setLastUpdatedDestinationAddressCountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getCountryCode());
			fedEntity.setLastUpdatedDestinationAddressPostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getPostalCode());
			fedEntity.setLastUpdatedDestinationAddressStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getUrbanizationCode());
			fedEntity.setLastUpdatedDestinationAddressCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getCity());
			fedEntity.setLastUpdatedDestinationAddressStreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getStreetLines()[0]);
			fedEntity.setLastUpdatedDestinationAddressResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getResidential());
			fedEntity.setLastUpdatedDestinationAddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getLastUpdatedDestinationAddress().getAddressClassification());
			fedEntity.setShipperAddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getAddressClassification());
			fedEntity.setShipperResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getResidential());
			fedEntity.setShipperStreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getStreetLines()[0]);
			fedEntity.setShipperCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getCity());
			fedEntity.setShipperUrbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getUrbanizationCode());
			fedEntity.setShipperStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getStateOrProvinceCode());
			fedEntity.setShipperPostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getPostalCode());
			fedEntity.setShipperCountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getCountryCode());
			fedEntity.setShipperCountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getAddress().getCountryName());
			//fedEntity.setShipperContact	(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getContact());
			fedEntity.setShipperContactPersonName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getContact().getPersonName());
			fedEntity.setShipperContactPhoneNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getContact().getPhoneNumber());
			fedEntity.setShipperContactCompanyName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipperInformation().getContact().getCompanyName());
			fedEntity.setAvailableNotifications(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getAvailableNotifications()[0]);
			fedEntity.setReasonDetailDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getReasonDetail().getDescription());
			fedEntity.setReasonDetailType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getReasonDetail().getType());
			fedEntity.setShipmentContentItemNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getContents()[0].getItemNumber());
			fedEntity.setShipmentContentReceivedQuantity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getContents()[0].getReceivedQuantity());
			fedEntity.setShipmentContentdescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getContents()[0].getDescription());
			fedEntity.setShipmentContentPartNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getContents()[0].getPartNumber());

			fedEntity.setShipmentbeforePossessionStatus(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getBeforePossessionStatus());
			fedEntity.setShipmentWeightUnit(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getWeight()[0].getUnit());
			fedEntity.setShipmentWeightValue(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getWeight()[0].getValue());
			fedEntity.setShipmentcontentPieceCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getContentPieceCount());
			fedEntity.setSplitShipmentsPieceCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getPieceCount());
			fedEntity.setSplitShipmentsStatusCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getStatusCode());
			fedEntity.setSplitShipmentsStatusDesp(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getStatusDescription());
			fedEntity.setSplitShipmentstimeStamp(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getShipmentDetails().getSplitShipments()[0].getTimestamp());

			fedEntity.setStdTransitTimeWindowDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getStandardTransitTimeWindow().getDescription());
			fedEntity.setStdTransitTimeWindowBegins(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getStandardTransitTimeWindow().getWindow().getBegins());
			fedEntity.setStdTransitTimeWindowEnds(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getStandardTransitTimeWindow().getWindow().getEnds());
			fedEntity.setStdTransitTimeWindowType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getStandardTransitTimeWindow().getType());
			fedEntity.setRecipientPersonName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getContact().getPersonName());
			fedEntity.setRecipientPhoneNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getContact().getPhoneNumber());
			fedEntity.setRecipientCompanyName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getContact().getCompanyName());
			fedEntity.setRecipientAddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getAddressClassification());
			fedEntity.setRecipientResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getResidential());
			fedEntity.setRecipientStreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getStreetLines()[0]);
			fedEntity.setRecipientCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getCity());
			fedEntity.setRecipientUrbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getUrbanizationCode());
			fedEntity.setRecipientStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getStateOrProvinceCode());
			fedEntity.setRecipientPostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getPostalCode());
			fedEntity.setRecipientCountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getCountryCode());
			fedEntity.setRecipientCountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getRecipientInformation().getAddress().getCountryName());
			fedEntity.setOriginLocationId(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationId());
			fedEntity.setOriginLocationPersonName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact().getPersonName());
			fedEntity.setOriginLocationPhoneNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact().getPhoneNumber());
			fedEntity.setOriginLocationCompanyName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getContact().getCompanyName());
			fedEntity.setOriginLocationAddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getAddressClassification());
			fedEntity.setOriginLocationResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getResidential());
			fedEntity.setOriginLocationStreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getStreetLines()[0]);
			fedEntity.setOriginLocationCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getCity());
			fedEntity.setOriginLocationUrbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getUrbanizationCode());
			fedEntity.setOriginLocationStateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getStateOrProvinceCode());
			fedEntity.setOriginLocationPostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getPostalCode());
			fedEntity.setOriginLocationcountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getCountryCode());
			fedEntity.setOriginLocationCountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationContactAndAddress().getAddress().getCountryName());
			fedEntity.setOriginLocationType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getOriginLocation().getLocationType());
			fedEntity.setPieceCountsCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPieceCounts()[0].getCount());
			fedEntity.setPieceCountsType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPieceCounts()[0].getType());
			fedEntity.setEstimatedDeliveryTimeDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getDescription());
			fedEntity.setEstimatedDeliveryTimeWindowbegins(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getWindow().getBegins());
			fedEntity.setEstimatedDeliveryTimeWindowends(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getWindow().getEnds());
			fedEntity.setEstimatedDeliveryTimeWindowType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getEstimatedDeliveryTimeWindow().getType());
			fedEntity.setRequestedAppointmentDate(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail().getDate());
			fedEntity.setRequestedAppointmentWindowBegins(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail().getWindow()[0].getWindow().getBegins());
			fedEntity.setRequestedappointmentwindowends(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getCustomDeliveryOptions()[0].getRequestedAppointmentDetail().getWindow()[0].getWindow().getEnds());

			fedEntity.setRequestedAppointmentDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getCustomDeliveryOptions()[0].getDescription());
			fedEntity.setRequestedAppointmentType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getCustomDeliveryOptions()[0].getType());
			fedEntity.setRequestedAppointmentType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getCustomDeliveryOptions()[0].getStatus());
			fedEntity.setHoldLocationID(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationId());
			fedEntity.setHoldLocationpersonName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact().getPersonName());
			fedEntity.setHoldLocationphoneNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact().getPhoneNumber());
			fedEntity.setHoldLocationCompanyName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getContact().getCompanyName());
			fedEntity.setHoldLocationaddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getAddressClassification());
			fedEntity.setHoldLocationResidential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getResidential());
			fedEntity.setHoldLocationstreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getStreetLines()[0]);
			fedEntity.setHoldLocationCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getCity());
			fedEntity.setHoldLocationurbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getUrbanizationCode());
			fedEntity.setHoldLocationstateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getStateOrProvinceCode());
			fedEntity.setHoldLocationpostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getPostalCode());
			fedEntity.setHoldLocationcountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getCountryCode());
			fedEntity.setHoldLocationcountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationContactAndAddress().getAddress().getCountryName());
			fedEntity.setHoldLocationType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getHoldAtLocation().getLocationType());
			fedEntity.setGoodsClassificationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getGoodsClassificationCode());
			fedEntity.setPhysicalPackagingType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getPhysicalPackagingType());
			fedEntity.setPackagesequenceNumber(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getSequenceNumber());
			fedEntity.setUndeliveredpackageCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getUndeliveredCount());
			fedEntity.setPackageDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getPackagingDescription().getDescription());
			fedEntity.setPackageType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getPackagingDescription().getType());
			fedEntity.setPackageCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getCount());
			String weight= objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getWeightAndDimensions().getWeight());
			fedEntity.setPackageWeight(weight);

			String dimensions= objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getWeightAndDimensions().getDimensions());
			fedEntity.setPackageDimensions(dimensions);

			fedEntity.setPackageContent(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getPackageContent()[0]);
			fedEntity.setPackagePieceCount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getContentPieceCount());
			fedEntity.setDeclaredValueCurrency(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getDeclaredValue().getCurrency());
			fedEntity.setDeclaredValueAmount(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getPackageDetails().getDeclaredValue().getValue());
			String dateandtime=objectMapper.writeValueAsString(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDateAndTimes());
			fedEntity.setDateAndTime(dateandtime);
			//fedEntity.setDateAndTimeType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getDateAndTimes()[0].getType());
			fedEntity.setScanEventsDate(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getDate());
			fedEntity.setScanEventsderivedStatus(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getDerivedStatus());
			fedEntity.setScanLocatoinaddressClassification(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getAddressClassification());
			fedEntity.setScanLocationResdential(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().isResidential());
			fedEntity.setScanLocationstreetLines(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getStreetLines());
			fedEntity.setScanLocationCity(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getCity());
			fedEntity.setScanLocationurbanizationCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getUrbanizationCode());
			fedEntity.setScanLocationstateOrProvinceCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getStateOrProvinceCode());
			fedEntity.setScanLocationpostalCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getPostalCode());
			fedEntity.setScanLocationcountryCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getCountryCode());
			fedEntity.setScanLocationcountryName(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getScanLocation().getCountryName());
			fedEntity.setScanEventsLocationType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getLocationType());
			fedEntity.setScanEventDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getEventDescription());
			fedEntity.setScanEventsexceptionDescription(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getExceptionDescription());
			fedEntity.setScaneventType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getEventType());
			fedEntity.setScanEventsderivedStatusCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getDerivedStatusCode());
			fedEntity.setScanEventsexceptionCode(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getExceptionCode());
			fedEntity.setScanEventsdelayDetailType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getDelayDetail().getType());
			fedEntity.setScanEventsdelayDetailsubType(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getDelayDetail().getSubType());
			fedEntity.setScanEventsdelayDetailStatus(fed.getOutput().getCompleteTrackResults()[0].getTrackResults()[0].getScanEvents()[0].getDelayDetail().getStatus());
			service.saveEntity(fedEntity);
		};
	}
}
