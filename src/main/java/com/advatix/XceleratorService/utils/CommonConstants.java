package com.advatix.XceleratorService.utils;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Service
public interface CommonConstants {

	public static String CARRIER_CONCISE = "CONCISE";
	
	


	//public static final String PROPERTIES_FILE_PATH = "properties//concise-integration.properties";

	public static final String SERVICE_NAME = "Advatx";
	public static final String SERVICE_PREFIX = "ADVTX";
	public static final String CONTEXT_PATH = "context_path";
	public static final String ADDRESSVALIDATION_LIMIT="ADDRESSVALIDATION_LIMIT";

	/**
	 * Request Status Codes
	 */
	public static final int REQUEST_SUCCESS = 200;

	public static final int RECORD_EXISTS = 201;

	public static final int RECORD_NOT_EXISTS = 202;

	public static final int REQUEST_FAILED = 400;

	public static final int INVALID_REQUEST = 401;

	public static final int USER_DISABLED = 402;

	public static final int USER_SESSION_OUT = 403;

	public static final int USER_REGISTERED_ALREADY = 405;

	public static final int BLOCKED_USER = 406;

	public static final int INVALID_OLD_PASSWORD = 407;

	public static final int MAX_LIMIT_EXCEEDED = 408;

	public static final int SQL_FAILED = 409;

	public static final int DELETION_FAILED = 410;

	public static final int INVALID_TOEKN_ID = 411;

	public static final int MISSING_MANDATORY_PARAMS = 412;

	public static final int CONTAINER_SCAN_FAILED = 413;

	public static final int MAIL_NOT_SENT_CODE = 414;

	public static final int TOKEN_TIME_OUT_CODE = 415;

	public static final int EMAIL_ID_NOT_FOUND_CODE = 416;

	/**
	 * Response description String
	 */
	public static final String MIN_COUNT = "<MIN_COUNT>";
	public static final String MAX_COUNT = "<MAX_COUNT";
	public static final String USER_MAX_LOGIN_ATTEMPT = "user_max_login_attempt";

	public static final String REQUEST_PROCESSED = "Request Processed.";

	public static final String REQUEST_PROCESSING_FAILED = "Request Failed : ";

	public static final String RECORD_EXISTS_STRING = "Requested details already available.";

	public static final String RECORD_NOT_EXISTS_STRING = "Requested detail/record not available.";

	public static final String USER_LOGIN_SUCCESS = "Login successful.";

	public static final String INVALID_USER = "Invalid Username or Password.";

	public static final String INVALID_USERNAME = "Invalid Username.";

	public static final String WRONG_PASSWORD = "You have attempted " + MIN_COUNT
			+ " time with wrong password.Your max count is " + MAX_COUNT + ".";

	public static final String BLOCKED_USER_STRING = "User temporary blocked. Max login attempt failed.";

	public static final String USER_NOT_REGISTERED = "User is not registered with us.";

	public static final String USER_DISABLED_MESSAGE = "User disabled.";

	public static final String INVALID_REQUEST_STRING = "Invalid Request.";

	public static final String INVALID_OLD_PASSWORD_STRING = "Invalid old password.";

	public static final String GENERIC_ERROR = "There is some error, please try after some time.";

	public static final String REQUEST_MAX_MESSENGERS_STRING = "Max messengers added.";

	public static final String SQL_OPERATEION_FAILED = "Invalid transId or packId";

	public static final String PACK_NOT_FOUND_STRING = "Pack not found";

	public static final String UPDATE_SUBSCRIPTION_FAILED = "update subscription failed";

	public static final String UPDATE_USAGE_FAILED = "update usage failed";

	public static final String INVALID_MSG_RECEIVER = "Invalid message receiver";

	public static final String INVALID_MAIL_TO = "Invalid mail receiver address";

	public static final String INVALID_SENDER = "Invalid sender address";

	public static final String MAX_LIMIT_EXCEED = "Max limit exceeded";

	public static final String INVALID_TOKEN_STRING = "User token not found";

	public static final String RECORD_ALREADY_EXISTS_STRING = "Record already exist.";

	public static final String SQL_CONSTRAINT_VIOLATED = "Unique or Null constraint violated";

	public static final String INVALID_EMAIL = "Invalid Email address.";
	public static final String INVALID_MOBILE = "Invalid Mobile/Phone number.";
	public static final String RECORD_FOUND = "Record found.";
	public static final String MAIL_NOT_SENT_STRING = "Email does not sent.";
	public static final String EMAIL_ID_NOT_FOUND_STRING = "Email id not found.";

	public static final String RECORDS_UPLOADED = "Records updated.";

	public static final String TEMPLATE_DETAILS_MISSING = "Template details required";

	public static final String CONTAINER_SCAN_FAILED_SRING = "Unable to scan";

	public static final String CONTAINER_NOT_OPEN = "Container is not open";

	public static final String TOKEN_TIME_OUT_STRING = "Token time expired";

	/**
	 * Cache Related
	 */
	public static final String TIME_TO_REMOVE_TOKEN = "time_to_remove_token_from_cache";

	public static final String TIME_TO_BLOCK_USER = "time_to_remove_blocked_users_from_cache";

	public static final String TIME_TO_CHECK_FAILED_LOGIN_ATTEMPT = "time_to_check_failed_login_attempt";

	public static final String CACHE_PERSIST_PATH = "cache_persist_path";

	// public static final String EMAIL_QUEUE_PERSIST_PATH =
	// "email_queue_persist_path";

	/**
	 * Database Related
	 */
	public static final String ASCENDING_ORDER = "asc";

	public static final String DESCENDING_ORDER = "desc";

	/**
	 * Common Params
	 */
	public static final String TOKEN_STRING_PARAM = "tokenString";

	public static final int MAX_LENGTH_FOR_NEW_PASSWORD = 6;

	public static final int ENCRYPTION_KEY_LENGTH = 25;

	public static final String TEMP_REG_ID = "tempRegId";

	public static final int ACTIVE = 1;

	public static final int INACTIVE = 0;

	public static final long TOKEN_MAX_TIMOUT = 60; // minutes
	/**
	 * SMS-Mail Related
	 */

	public static final String MESSAGE_SENDING_URL = "msg_sending_api";

	public static final String SCHEDULE_BASE_THREAD = "scheduleBase";

	public static final String MAIL_SENDING_BEAN = "mailSendingThread";

	public static final String MESSAGE_SENDING_TIMEOUT = "msg_sending_timeout";

	public static final String MESSAGE_SENDING_HOUR_START = "message_sending_hour_start";

	public static final int DEFAULT_MESSAGE_SENDING_HOUR_START = 0;

	public static final String MESSAGE_SENDING_HOUR_END = "message_sending_hour_end";

	public static final int DEFAULT_MESSAGE_SENDING_HOUR_END = 23;

	public static final int TRANSACTIONL_SMS_EMAIL = 101;

	public static final int PROVIDER_PACK_SMS = 103;

	public static final int PROMOTIONAL_SMS_EMAIL = 102;
	public static final int TRANS_UNICODE_SMS = 104;

	public static final int MESSAGE_PENDING = 100;

	public static final int MESSAGE_SENDING_FAILED = 400;

	public static final int MESSAGE_SENDING_SUCCESS = 200;

	public static final int MAX_MESSENGERS = 3;

	public static final int SEND_EMAIL = 1;

	public static final int NORMAL_SMS = 2;

	public static final int PACKAGE_SMS = 3;

	public static final int MSG_LENGTH = 160;

	/**
	 * SMS-Email Notification Ids constants
	 */
	public static final String MASTER_PASSWORD = "masterPassword";

	public static final String DB_HOST = "database_host";

	public static final String DB_PORT = "database_port";

	public static final String DB_NAME = "database";

	public static final String DB_USERNAME = "database_user";

	public static final String DB_PASSWORD = "database_pwd";

	public static final String HIBERNATE_DIALECT = "hibernate_dialect";

	public static final String SMTP_HOST = "smtp_host";

	public static final String SMTP_PORT = "smtp_port";

	public static final String SMTP_USER = "smtp_user";

	public static final String SMTP_PASSWORD = "smtp_pwd";

	public static final int FACEBOOK = 1;

	public static final int GOOGLE_PLUS = 2;

	public static final int LINKEDIN = 3;

	public static final Integer UNICODE_SMS = 4;

	public static final String PAGINATION_LIMIT = "pagination_limit";

	public static final String DEFAULT_TOKENSTRING = "default_tokenstring";

	public static final String EMAIL_SENDER = "email_sender";

	public static final String AUTH_TOKEN_PARAM = "AuthToken";

	public static final String USER_LOGIN_TEXT = "User Login";

	public static final String DEFAULT_HEADER = "Content-Type: application/json";

	public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

	public static final String ORDER_BY = "ORDER BY";

	public static final String ORDER_DESC = "DESC";

	public static final String ORDER_ASC = "ASC";

	public static final String SUCCESS_STR = "SUCCESS";

	public static final String FAIL_STR = "FAIL";

	public static final int MAX_PWD_LENGTH = 6;

	public static final Object EMAIL_BASE64_ATTACHMENT = null;

	public static final int DEFAULT_PAGENO = 0;

	public static final String TFORCE_TRACKING_SERVICE_URL = "https://nexus.tfesg.com/services/PackageTracking10?wsdl";
	public static final String TFORCE_TRACKING_SERVICE_USERNAME = "TFORCE_TRACKING_SERVICE_USERNAME";
	public static final String TFORCE_TRACKING_SERVICE_PASSWORD = "TFORCE_TRACKING_SERVICE_PASSWROD";

	public static final int NOTIFY_SELECTED = 1;
	public static final int NOTIFY_REMINDER = 2;
	public static final int SMS_BLAST = 3;
	public static final int EMAIL_BLAST = 4;

	/***** Advatix Constant ****/

	public static final String ORDER_ALREADY_EXIST = "Order id already exist, please use another order id.";
	public static final String STATUS_OK = "OK";
	public static final String STATUS_FAILED = "FAILED";
	public static final String STATUS_PENDING = "PENDING";
	public static final String STATUS_PROCESSED = "PROCESSED";
	public static final String INVALID_TOEKN_MESSAGE = "Invalid Token String.";

	public static final String TFORCE_SHIPPING_URL = "tforce_shipping_url";

	public static final String SAMEDAY_STRING = "SAMEDAY";
	public static final String NEXTDAY_STRING = "NEXTDAY";
	public static final int SAMEDAY_ID = 2;
	public static final int NEXTDAY_ID = 1;

	// public static final int CONTAINER_GENERATED = 1;

	public static final String SHIPPER_MISSING = "Shipper Details Missing";

	public static final String DRIVER_MISSING = "Driver Details Missing";

	public static final String SOURCE_MISSING = "Source city Missing";

	public static final String DESTINATION_MISSING = "Destination City Missing";

	public static final String DELIVER_TYPE_MISSING = "Delivery Type Missing";

	public static final String CONTAINER_TYPE_MISSING = "Container Type Missing";

	public static final String ROUTE_MISSING = "Route Details Missing";

	public static final String BARCODE_URL = "barcode_url";

	public static final String CONTAINERID_TRACKID_MISSING_STRING = "ContainerId or TrackingId Missing";

	public static final Integer DRIVER_LOGIN = 14;

	public static final int DRIVER_DAY_STARTS = 1;
	public static final int DRIVER_DAY_ENDS = 2;

	public static final String TACKING_ID = "TRACKINGID";
	public static final String SHIPPER_ID = "SHIPPERID";
	public static final String ORDER_ID = "SHIPPERID";
	public static final String BARCODE = "BARCODE";

	public static final int CONTAINER_DEFAULT = 1;
	public static final int CONTAINER_OPEN = 2;
	public static final int CONTAINER_CLOSED = 3;
	public static final int CONTAINER_DESTROY = 4;

	public static final int CONTAINER_IN_PROCESS = 5;

	public static final String DRIVERID_MISSING_STRING = "Driver Id missing";
	public static final String SHIPMENTID_MISSING_STRING = "Shipment Id missing";

	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;

	/*
	 * Email Detail
	 **/
	public static String MAIL_SUBJECT = "TMS Reset Passsword";
	public static String MAIL_BODY = "Hi <NAME>,\n\n Please enter below mentioned one time password to reset your password.\n\n One time password is <OTP>\n\nThanks & Regards.\nTech Team.";

	public static final String EMAIL_VERIFY = "@";

	/**
	 * Redis Hashes configuration
	 */

	public static String CONTAINER_KEY = "Container";
	public static String DRIVER_KEY = "DriverContainer";
	public static String CONTAINER_SHIPMENT_KEY = "ContainerShipmentMapping";

	// Barcode
	// public static String BARCODE_PDF_PATH =
	// "E:/java_project/advatix/xpdel/JavaSource/AdvatxService/WebContent/WEB-INF/barcode/";
	public static String labelHtmlFile = "label.html";
	public static String labelHtmlUPSFile = "label/ups-label.html";

	public static String weShipBarCodePath = "label/we-ship-label.html";

	public static String weShipXpdelBarcodePath = "weship-label.html";

	public static String labelHtmlNewAmsterdamFile = "newamsterdam-label.html";
	public static String labelHtmlSpeeDeeFile = "label/SpeeDee-label.html";
	public static String SHIPMENT_TYPE_PC = "PC";
	public static String SHIPMENT_TYPE_DC = "DC";

	public static String SHIPMENT_TYPE_SINGLE = "SINGLE";
	public static String SHIPMENT_TYPE_LTL = "LTL";
	public static String SHIPMENT_TYPE_MULTI = "Multi";

	public static String OMS_UPDATE_STATUS_URL = "oms_url";
	public static String APP_VERSION = "app_version";

	public static String NewAmsterdam_url = "NewAmsterdam_url";

	public static String FEDEX_BOL_PDF_PATH = "http://34.196.236.28/XPDEL_OUT/";

	public static final String MANIFEST_NAME = "MFN";

	public static final String AXLEHIRE_SHIPPING_BASE_URL = "axlehire_service_base_url";
	public static final String AXLEHIRE_SHIPPING_TOKEN = "axlehire_service_token";

	public static String CARRIER_TFORCE = "TForce";
	public static String CARRIER_AXELHIRE = "Axlehire";
	public static String CARRIER_UNKNOWN = "Unassigned";
	public static String CARRIER_UPS = "UPS";
	public static final String CARRIER_USPS = "USPS";
	public static final String CARRIER_PITNEY_BOWER_PB_STANDARD = "NEWGISTICS";
	public static String CARRIER_XPDEL = "XPDEL";
	public static String CARRIER_FEDEX = "FEDEX";
	public static String CARRIER_LSO = "LSO";
	public static final String CARRIER_PB_STANDARD = "PUSPS";
	public static final String CARRIER_PB_USPS = "PB-FIRST-CLASS";

	public static final String CARRIER_DELIVERY_AUTHORITY = "DA";
	public static final String CARRIER_GLS = "GLS";

	public static final String CARRIER_SPEE_DEE = "SpeeDee";
	public static final String CARRIER_ABC = "ABC";
	public static final String CARRIER_BREAKAWAY = "BREAKAWAY";
	public static final String CARRIER_DHL = "DHL";
	public static String CARRIER_JOKER = "JOKR";
	public static String CARRIER_JLM = "JLM";
	public static String E_COURIER = "GIO";
	public static String CARRIER_WESHIP = "WESHIP";
	public static String CARRIER_PDQ = "PDQ";
	public static String STAT_CARRIER = "STAT";

	public static String NEW_AMSTERDAM_CARRIER = "New-Amsterdam";

	public static final String DISPATCHED_STATUS_FOR_EMAIL_NOTIFICATION = "dispatched_status_for_notification";
	public static final String DELIVERED_STATUS_FOR_EMAIL_NOTIFICATION = "delivered_status_for_notification";

	public static final String DISPATCHED_SMS_NOTIFICATION = "dispatched_sms_notification";
	public static final String DELIVERED_SMS_NOTIFICATION = "delivered_sms_notification";
	public static final String CONSTANT_TOKEN_STRING = "e4fb6334b285cc3e4ecc7580a28413cd";

	public static final String UPS_BASE_URL = "ups_base_url";
	public static final String UPS_ACCESS_KEY = "ups_access_key";
	public static final String UPS_USER_NAME = "ups_user_name";
	public static final String UPS_PASSWORD = "ups_password";
	public static final String UPS_ACCOUNT_CODE = "ups_account_code";

	public static final String WSDL_LOCATION = "/var/www/html/XPDEL_OUT/wsdl";

	// public static final String WSDL_LOCATION =
	// "D:/Sumit/advatix/advatixwsdl/ups";

	// public static final String WSDL_LOCATION
	// ="C:/Users/Advatix/Downloads/apache-tomcat-9.0.30/wsdl";

	public static final String XPDEL_SMTP_HOST = "xpdel_smtp_host";
	public static final String XPDEL_SMTP_PORT = "xpdel_smtp_port";
	public static final String XPDEL_SMTP_USER = "xpdel_smtp_user";
	public static final String XPDEL_SMTP_PASSWORD = "xpdel_smtp_pwd";

	public static final String SHIPMENT_EXCEPTION_MAIL_LIST = "shipment_exception_mail_list";
	public static final String SHIPMENT_EXCEPTION_MAIL_CONTENT = "shipment_exception_mail_content";
	public static final String EXCEPTION__DELIVERY_STATUS_LIST = "exception_delivery_status_list";
	public static final String EXCEPTION_ATTEMPTED_STATUS_LIST = "exception_attempted_status_list";

	public static final String NOTIFICATION_TYPE_EMAIL = "EMAIL";
	public static final String NOTIFICATION_TYPE_SMS = "SMS";

	public static final String SMS_ACCOUNT_SID = "sms_account_sid";
	public static final String SMS_AUTH_TOKEN = "sms_auth_token";
	public static final String SMS_TWILIO_NUMBER = "sms_twilto_number";

	public static final String INTERNAL_TOKEN = "INTERNAL_TOKEN";

	public static final String UPS_POD_FILE_PATH = "ups_pod_file_path";

	public final String USPS_BASE_URL_SECURE = "usps_base_url_secure";
	public final String USPS_USERID = "usps_userid";

	public final String PITNEY_BOWER_URL = "pitney_bower_url";
	public final String PITNEY_BOWER_FILE_URL = "pitney_bower_file_url";
	public final String PITNEY_BOWER_TOKEN = "pitney_bower_token";
	public final String PITNEY_BOWER_DEVELOPER_ID = "pitney_bower_developer_id";
	public final String PITNEY_BOWER_SHIPPER_ID = "pitney_bower_shipper_id";
	public final String PITNEY_BOWES_SERVICE_KEY = "pitneybowes_service_key";
	public final String PITNEY_BOWES_SERVICE_SECRET = "pitneybowes_service_secret";

	public final String FIRM_NAME = "firm_name";

	public static final String GARTEN_ORDER_STATUS_URL = "garten_order_status_url";
	public static final String GARTEN_ORDER_STATUS_API_TOKEN = "garten_order_status_api_token";

	public static final String EXCEPTION_ORDERS_MAIL_CONTENT = "exception_orders_mail_content";
	public static final String EXCEPTION_ORDERS_MAIL_LIST = "exception_orders_mail_list";

	public static final String NOT_MAPPED_STATUS_MAIL_CONTENT = "not_mapped_status_mail_content";
	public static final String NOT_MAPPED_STATUS_MAIL_LIST = "not_mapped_status_mail_list";

	public static final String FEDEX_API_URL = "FEDEX_API_URL";
	public static final String FEDEX_API_KEY = "FEDEX_API_KEY";
	public static final String FEDEX_API_PASSWORD = "FEDEX_API_PASSWORD";
	public static final String FEDEX_API_ACCOUNT = "FEDEX_API_ACCOUNT";
	public static final String FEDEX_API_METER_NUMBER = "FEDEX_API_METER_NUMBER";
	public static final String FEDEX_API_FILEPATH = "FEDEX_API_FILEPATH";

	public static final String LSO_API_BASE_URL = "LSO_API_BASE_URL";
	public static final String LSO_ACCOUNT_NO = "LSO_ACCOUNT_NO";
	public static final String LSO_USER_NAME = "LSO_USER_NAME";
	public static final String LSO_PASSWORD = "LSO_PASSWORD";
	public static final String HOMEALONE_BASE_URL = "HOMEALONE_BASE_URL";

	public static final String DELIVERY_AUTHORITY_API_BASE_URL = "DELIVERY_AUTHORITY_API_BASE_URL";
	public static final String DELIVERY_AUTHORITY_ACCOUNT_NO = "DELIVERY_AUTHORITY_ACCOUNT_NO";
	public static final String DELIVERY_AUTHORITY_USER_NAME = "DELIVERY_AUTHORITY_USER_NAME";
	public static final String DELIVERY_AUTHORITY_PASSWORD = "DELIVERY_AUTHORITY_PASSWORD";
	public static final String DELIVERY_AUTHORITY_SERVICE = "DELIVERY_AUTHORITY_SERVICE";
	public static final String DELIVERY_AUTHORITY_INDIVIDUAL_PACKAGE_ITEMS_FLAG = "DELIVERY_AUTHORITY_INDIVIDUAL_PACKAGE_ITEMS_FLAG";

	public static final String ABC_API_BASE_URL = "ABC_API_BASE_URL";
	public static final String ABC_ACCOUNT_NO = "ABC_ACCOUNT_NO";
	public static final String ABC_USER_NAME = "ABC_USER_NAME";
	public static final String ABC_PASSWORD = "ABC_PASSWORD";
	public static final String ABC_SERVICE = "ABC_SERVICE";
	public static final String ABC_INDIVIDUAL_PACKAGE_ITEMS_FLAG = "ABC_INDIVIDUAL_PACKAGE_ITEMS_FLAG";

	public static final String GLS_API_BASE_URL = "GLS_API_BASE_URL";
	public static final String GLS_ACCOUNT_NO = "GLS_ACCOUNT_NO";
	public static final String GLS_USER_NAME = "GLS_USER_NAME";
	public static final String GLS_PASSWORD = "GLS_PASSWORD";
	public static final String GLS_SERVICE = "GLS_SERVICE";

	/* DHL OBJECT URL */
	public static final String DHL_API_BASE_URL = "DHL_API_BASE_URL";

	public static final String DHL_AUTH_CLIENT_ID = "DHL_AUTH_CLIENT_ID";
	public static final String DHL_AUTH_CLIENT_SECRET = "DHL_AUTH_CLIENT_SECRET";
	public static final String DHL_PICKUP_NUMBER = "DHL_PICKUP_NUMBER";

	/* E-Courier Data */
	public static final String E_COURIER_CUSTOMER_CODE = "E_Courier_Customer_Code";
	public static final String E_COURIER_SERVICE = "E_Courier_Service";
	public static final String E_COURIER_AUTH = "E_Courier_Auth";
	public static final String E_Courier_USER_GUID = "E_Courier_User_Guid";
	public static final String E_Courier_BASE_URL = "E_Courier_Base_Url";

	/* We-Ship Configuration */
	public static final String WE_SHIP_BASE_URL = "WE_SHIP_BASE_URL";
	public static final String WE_SHIP_LABEL_URL = "WE_SHIP_LABEL_URL";

	public static final String WE_SHIP_CLIENT_CODE = "WE_SHIP_CLIENT_CODE";
	public static final String WE_SHIP_BASE_URL_TRACKING = "WE_SHIP_BASE_URL_TRACKING";

	/* PDQ CARRIER SERVICE */
	public static final String PDQ_BASE_URL = "PDQ_BASE_URL";
	public static final String PDQ_AUTH_KEY = "PDQ_AUTH_KEY";
	public static final String PDQ_AUTH_TOKEN = "PDQ_AUTH_TOKEN";
	public static final String PDQ_SHORT_CODE = "PDQ_SHORT_CODE";
	/* BETTER TRUCK DETAIL */
	public static final String BETTER_TRUCK_BASE_URL = "BETTER_TRUCK_BASE_URL";
	public static final String CARRIER_BETTER_TRUCK = "BETTER-TRUCKS";

	public static final String EMAIL_SCHEDULER_ACTIVE_FLAG = "email_scheduler_active_flag";
	public static final String TRACKING_SCHEDULER_ACTIVE_FLAG = "tracking_scheduler_active_flag";

	public static final String SPEE_DEE_SHIPPER_ACCOUNT = "SPEE_DEE_SHIPPER_ACCOUNT";
	public static final String SPEE_DEE_FTP_SERVER_IP = "SPEE_DEE_FTP_SERVER_IP";
	public static final String SPEE_DEE_FTP_USER_NAME = "SPEE_DEE_FTP_USER_NAME";
	public static final String SPEE_DEE_FTP_PASSWORD = "SPEE_DEE_FTP_PASSWORD";
	public static final String SPEE_DEE_SERVICE_TYPE = "SPEE_DEE_SERVICE_TYPE";
	public static final String SPEE_DEE_FTP_INPUT_DIRECTORY = "SPEE_DEE_FTP_INPUT_DIRECTORY";
	public static final String SPEE_DEE_API_BASE_TRACKING_URL = "SPEE_DEE_API_BASE_TRACKING_URL";
	public static final String SPEE_DEE_API_TRACKING_PASSWORD = "SPEE_DEE_API_TRACKING_PASSWORD";

	public static final String UPS_GROUND = "UPS-GROUND";
	public static final String UPS_3_DAY_SELECT = "UPS-3-DAY-SELECT";
	public static final String TRACKING_WEBHOOK_POST_URL = "TRACKING_WEBHOOK_POST_URL";

	public static final String SWITCH_ACCOUNT_ID = "SWITCH_ACCOUNT_ID";
	public static final String SWITCH_FEDEX_API_KEY = "SWITCH_FEDEX_API_KEY";
	public static final String SWITCH_FEDEX_API_PASSWORD = "SWITCH_FEDEX_API_PASSWORD";
	public static final String SWITCH_FEDEX_API_ACCOUNT = "SWITCH_FEDEX_API_ACCOUNT";
	public static final String SWITCH_FEDEX_API_METER_NUMBER = "SWITCH_FEDEX_API_METER_NUMBER";

	public static final String WE_SHIP_LABEL_STATUS = "WE_SHIP_LABEL_STATUS";

	public static final String SHIPSTATION_API_URL = "SHIPSTATION_API_URL";
	public static final String SHIPSTATION_API_KEY = "SHIPSTATION_API_KEY";

	public static final String FEDEX_LTL_API_ACCOUNT = "FEDEX_LTL_API_ACCOUNT";

	public static final String ACCOUNT_ID_3SPROUTS = "ACCOUNT_ID_3SPROUTS";
	public static final String FEDEX_API_KEY_3SPROUTS = "FEDEX_API_KEY_3SPROUTS";
	public static final String FEDEX_API_PASSWORD_3SPROUTS = "FEDEX_API_PASSWORD_3SPROUTS";
	public static final String FEDEX_API_ACCOUNT_3SPROUTS = "FEDEX_API_ACCOUNT_3SPROUTS";
	public static final String FEDEX_API_METER_NUMBER_3SPROUTS = "FEDEX_API_METER_NUMBER_3SPROUTS";
	public static final String FEDEX_THIRD_PARTY_ACCOUNT_3SPROUTS = "FEDEX_THIRD_PARTY_ACCOUNT_3SPROUTS";
	public static final String WAYFAIR_SOURCE_NAME_3SPROUTS = "WAYFAIR_SOURCE_NAME_3SPROUTS";
	public static final String SHOPIFY_SOURCE_NAME_3SPROUTS = "SHOPIFY_SOURCE_NAME_3SPROUTS";
	public static final String WHOLESALE_SOURCE_NAME_3SPROUTS = "WHOLESALE_SOURCE_NAME_3SPROUTS";
	public static final String SAMPLES_SOURCE_NAME_3SPROUTS = "SAMPLES_SOURCE_NAME_3SPROUTS";
	public static final String WARRANTY_SOURCE_NAME_3SPROUTS = "WARRANTY_SOURCE_NAME_3SPROUTS";

	public static final String UPS_ACCESS_KEY_3SPROUTS = "ups_access_key_3sprouts";
	public static final String UPS_USER_NAME_3SPROUTS = "ups_user_name_3sprouts";
	public static final String UPS_PASSWORD_3SPROUTS = "ups_password_3sprouts";
	public static final String UPS_ACCOUNT_CODE_3SPROUTS = "ups_account_code_3sprouts";
	public static final String UPS_ACCOUNT_CODE_THIRDPARTY_3SPROUTS = "ups_account_code_thirdParty_3sprouts";
	public static final String UPS_POSTALCODE_THIRDPARTY_3SPROUTS = "ups_postalCode_thirdParty_3sprouts";

	public static final String SPS_AUTH_BASE_URL = "SPS_AUTH_BASE_URL";
	public static final String SPS_AUTH_CLIENT_ID = "SPS_AUTH_CLIENT_ID";
	public static final String SPS_AUTH_CLIENT_SECRET = "SPS_AUTH_CLIENT_SECRET";
	public static final String SPS_AUTH_AUDIENCE_URL = "SPS_AUTH_AUDIENCE_URL";
	public static final String SPS_API_BASE_URL = "SPS_API_BASE_URL";
	public static final String SPS_API_LABEL_ID = "SPS_API_LABEL_ID";

	public static final String BREAKAWAY_API_BASE_URL = "BREAKAWAY_API_BASE_URL";
	public static final String BREAKAWAY_ACCOUNT_NO = "BREAKAWAY_ACCOUNT_NO";
	public static final String BREAKAWAY_USER_NAME = "BREAKAWAY_USER_NAME";
	public static final String BREAKAWAY_PASSWORD = "BREAKAWAY_PASSWORD";
	public static final String BREAKAWAY_SERVICE = "BREAKAWAY_SERVICE";
	public static final String BREAKAWAY_INDIVIDUAL_PACKAGE_ITEMS_FLAG = "BREAKAWAY_INDIVIDUAL_PACKAGE_ITEMS_FLAG";

	/* Concise Configuration */
	public static final String CONCISE_BASE_URL = "CONCISE_BASE_URL";
	public static final String CONCISE_API_SECRET_KEY = "CONCISE_API_SECRET_KEY";
	public static final String CONCISE_DEFAULT_CARRIER = "CONCISE_DEFAULT_CARRIER";
	public static final String CONCISE_ACCOUNT_NUMBER = "CONCISE_ACCOUNT_NUMBER";

	/* STAT Configuration */
	public static final String STAT_BASE_URL = "CONCISE_BASE_URL";
	public static final String STAT_API_SECRET_KEY = "CONCISE_API_SECRET_KEY";
	public static final String STAT_DEFAULT_CARRIER = "CONCISE_DEFAULT_CARRIER";
	public static final String STAT_ACCOUNT_NUMBER = "CONCISE_ACCOUNT_NUMBER";

	/* PASSPORT OBJECT URL */
	public static final String PASSPORT_API_BASE_URL = "PASSPORT_API_BASE_URL";

	public static final String DSG_ACCOUNT_ID = "DSG_ACCOUNT_ID";
	public static final String PublicLands_Account_Id = "PublicLands_Account_Id";
	public static final String DSG_FEDEX_THIRD_PARTY_ACCOUNT = "DSG_FEDEX_THIRD_PARTY_ACCOUNT";

	public static final String CHECK_TRACKING_SCHEDULER_ALERT_EMAILID = "CHECK_TRACKING_SCHEDULER_ALERT_EMAILID";

	public static final String SERVER_DOMAIN_DOCS = "SERVER_DOMAIN_DOCS";

	public static final String UPSShipperNumber = "834W97";
	public static final String UPSShipmentBillingOptionCode = "10";
	public static final String UPSServiceCode = "308";
	public static final String UPSDocumentsLabelsPerPage = "1";
	public static final String UPSDocumentsTYPECode = "20";
	public static final String UPSDocumentsForMatCode = "01";
	public static final String UPSHandlingUnitOneQuantity = "1";
	public static final String UPSHandlingUnitOneTypeCode = "PLT";
	public static final String UPSCommodityDescription = "Goods";
	public static final String UPSCommodityWeightUnitOfMeasurementCode = "LBS";
	public static final String UPSCommodityDimensionsUnitOfMeasurementCode = "IN";
	public static final String UPSCommodityPackagingTypeCode = "PKG";
	public static final String CommodityFreightClass = "55";
	public static final String UPSTimeInTransitIndicator = "";
	public static final String UPSMiscellaneousWSVersion = "21.0.11";
	public static final String UPSMiscellaneousReleaseID = "07.12.2008";
	public static final String UPSDensityEligibleIndicator = "";
	public static final String AccountType = "1";

	public static final String ups_pdf_label_path = "ups_pdf_label_path";
	public static final String ups_access_license_number = "ups_access_license_number";

	public static final String EDDIE_BAUER_ACCOUNT_ID = "EDDIE_BAUER_ACCOUNT_ID";
	public static final String EDDIE_BAUER_FEDEX_THIRD_PARTY_ACCOUNT = "EDDIE_BAUER_FEDEX_THIRD_PARTY_ACCOUNT";

	public static final String UPS_REST_BASE_URL = "ups_rest_base_url";
	public static final String UPS_MULTIPLE_SHIPMENT_BASE_URL = "ups_mutliple_shipment_base_url";

	public static final String UPS_TRANSID = "ups_transId";
	public static final String UPS_TRANSACTIONSRC = "ups_transactionSrc";

	public static final String UPS_RATE_BASE_URL = "UPS_RATE_BASE_URL";

	public static final String JPG_EXTENSION = "jpg";

	public static final CharSequence PDF_EXTENSION = ".pdf";
	public static final String LABEL_PDF_BASE_URL = "LABEL_PDF_BASE_URL";

	public static final String BEVMAX_ACCOUNT_ID = "BEVMAX_ACCOUNT_ID";

	public static final String JWT = "JWT";

	public static final String LABEL_IMAGE_FORMAT_CODE = "ZPL";

	public static final String LABEL_STOCK_SIZE_HEIGHT = "6";

	public static final String LABEL_STOCK_SIZE_WIDTH = "4";

	public static final String NEGOTIATED_RATES_INDICATOR = "456999";

	public static final String SHIPMENT_DESCRIPTION = "1206 PTR";

	public static final String REFERENCE_NUMBER_CODE = "01";

	public static final String REFERENCE_NUMBER_CODE2 = "02";

	public static final String REFERENCE_NUMBER_CODE3 = "03";

	public static final String TAX_INDENTIFICATION_NUMBER = "TaxID";

	public static final String SHIPMENT_CHARGE_TYPE = "01";

	public static final String DIMESNION_UOM_CODE = "01";

	public static final String UOM_DESCRIPTION = "INCH";

	public static final String SOURCE_COMPANY_NAMES = "SOURCE_COMPANY_NAMES";

	public static final String FEDEX_THIRD_PARTY_ACCOUNT_3SPROUTS_BBB = "FEDEX_THIRD_PARTY_ACCOUNT_3SPROUTS_BBB";

	public static final String BBB_SOURCE_NAME_3SPROUTS = "BBB_SOURCE_NAME_3SPROUTS";

	public static final String CARRIER_PASSPORT = "PASSPORT";

	public static final String FEDEX_THIRD_PARTY_ACCOUNT_3SPROUTS_SPREETAIL = "FEDEX_THIRD_PARTY_ACCOUNT_3SPROUTS_SPREETAIL";

	public static final String SPREETAIL_SOURCE_NAME_3SPROUTS = "SPREETAIL_SOURCE_NAME_3SPROUTS";

	public static final String CARRIER_MERC = "MERC";

	

	
}
