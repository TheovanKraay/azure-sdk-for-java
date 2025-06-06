// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

/**
 * HTTP Status Code of the operation.
 */
public enum HttpStatusCode {
    /**
     * Enum value Continue.
     */
    CONTINUE("Continue"),

    /**
     * Enum value SwitchingProtocols.
     */
    SWITCHING_PROTOCOLS("SwitchingProtocols"),

    /**
     * Enum value OK.
     */
    OK("OK"),

    /**
     * Enum value Created.
     */
    CREATED("Created"),

    /**
     * Enum value Accepted.
     */
    ACCEPTED("Accepted"),

    /**
     * Enum value NonAuthoritativeInformation.
     */
    NON_AUTHORITATIVE_INFORMATION("NonAuthoritativeInformation"),

    /**
     * Enum value NoContent.
     */
    NO_CONTENT("NoContent"),

    /**
     * Enum value ResetContent.
     */
    RESET_CONTENT("ResetContent"),

    /**
     * Enum value PartialContent.
     */
    PARTIAL_CONTENT("PartialContent"),

    /**
     * Enum value MultipleChoices.
     */
    MULTIPLE_CHOICES("MultipleChoices"),

    /**
     * Enum value Ambiguous.
     */
    AMBIGUOUS("Ambiguous"),

    /**
     * Enum value MovedPermanently.
     */
    MOVED_PERMANENTLY("MovedPermanently"),

    /**
     * Enum value Moved.
     */
    MOVED("Moved"),

    /**
     * Enum value Found.
     */
    FOUND("Found"),

    /**
     * Enum value Redirect.
     */
    REDIRECT("Redirect"),

    /**
     * Enum value SeeOther.
     */
    SEE_OTHER("SeeOther"),

    /**
     * Enum value RedirectMethod.
     */
    REDIRECT_METHOD("RedirectMethod"),

    /**
     * Enum value NotModified.
     */
    NOT_MODIFIED("NotModified"),

    /**
     * Enum value UseProxy.
     */
    USE_PROXY("UseProxy"),

    /**
     * Enum value Unused.
     */
    UNUSED("Unused"),

    /**
     * Enum value TemporaryRedirect.
     */
    TEMPORARY_REDIRECT("TemporaryRedirect"),

    /**
     * Enum value RedirectKeepVerb.
     */
    REDIRECT_KEEP_VERB("RedirectKeepVerb"),

    /**
     * Enum value BadRequest.
     */
    BAD_REQUEST("BadRequest"),

    /**
     * Enum value Unauthorized.
     */
    UNAUTHORIZED("Unauthorized"),

    /**
     * Enum value PaymentRequired.
     */
    PAYMENT_REQUIRED("PaymentRequired"),

    /**
     * Enum value Forbidden.
     */
    FORBIDDEN("Forbidden"),

    /**
     * Enum value NotFound.
     */
    NOT_FOUND("NotFound"),

    /**
     * Enum value MethodNotAllowed.
     */
    METHOD_NOT_ALLOWED("MethodNotAllowed"),

    /**
     * Enum value NotAcceptable.
     */
    NOT_ACCEPTABLE("NotAcceptable"),

    /**
     * Enum value ProxyAuthenticationRequired.
     */
    PROXY_AUTHENTICATION_REQUIRED("ProxyAuthenticationRequired"),

    /**
     * Enum value RequestTimeout.
     */
    REQUEST_TIMEOUT("RequestTimeout"),

    /**
     * Enum value Conflict.
     */
    CONFLICT("Conflict"),

    /**
     * Enum value Gone.
     */
    GONE("Gone"),

    /**
     * Enum value LengthRequired.
     */
    LENGTH_REQUIRED("LengthRequired"),

    /**
     * Enum value PreconditionFailed.
     */
    PRECONDITION_FAILED("PreconditionFailed"),

    /**
     * Enum value RequestEntityTooLarge.
     */
    REQUEST_ENTITY_TOO_LARGE("RequestEntityTooLarge"),

    /**
     * Enum value RequestUriTooLong.
     */
    REQUEST_URI_TOO_LONG("RequestUriTooLong"),

    /**
     * Enum value UnsupportedMediaType.
     */
    UNSUPPORTED_MEDIA_TYPE("UnsupportedMediaType"),

    /**
     * Enum value RequestedRangeNotSatisfiable.
     */
    REQUESTED_RANGE_NOT_SATISFIABLE("RequestedRangeNotSatisfiable"),

    /**
     * Enum value ExpectationFailed.
     */
    EXPECTATION_FAILED("ExpectationFailed"),

    /**
     * Enum value UpgradeRequired.
     */
    UPGRADE_REQUIRED("UpgradeRequired"),

    /**
     * Enum value InternalServerError.
     */
    INTERNAL_SERVER_ERROR("InternalServerError"),

    /**
     * Enum value NotImplemented.
     */
    NOT_IMPLEMENTED("NotImplemented"),

    /**
     * Enum value BadGateway.
     */
    BAD_GATEWAY("BadGateway"),

    /**
     * Enum value ServiceUnavailable.
     */
    SERVICE_UNAVAILABLE("ServiceUnavailable"),

    /**
     * Enum value GatewayTimeout.
     */
    GATEWAY_TIMEOUT("GatewayTimeout"),

    /**
     * Enum value HttpVersionNotSupported.
     */
    HTTP_VERSION_NOT_SUPPORTED("HttpVersionNotSupported");

    /**
     * The actual serialized value for a HttpStatusCode instance.
     */
    private final String value;

    HttpStatusCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HttpStatusCode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed HttpStatusCode object, or null if unable to parse.
     */
    public static HttpStatusCode fromString(String value) {
        if (value == null) {
            return null;
        }
        HttpStatusCode[] items = HttpStatusCode.values();
        for (HttpStatusCode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
