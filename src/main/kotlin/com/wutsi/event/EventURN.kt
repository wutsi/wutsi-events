package com.wutsi.event

enum class EventURN(val urn: String) {
    BUSINESS_CREATED("urn:wutsi:event:business-created"),
    BUSINESS_SUSPENDED("urn:wutsi:event:business-suspended"),

    BUSINESS_ACCOUNT_ENABLED("urn:wutsi:event:business-account-enabled"),
    BUSINESS_ACCOUNT_DISABLED("urn:wutsi:event:business-account-disabled"),

    MEMBER_ATTRIBUTE_UPDATED("urn:wutsi:event:member-attribute-updated"),
    MEMBER_DELETED("urn:wutsi:event:member-deleted"),
    MEMBER_REGISTERED("urn:wutsi:event:member-registered"),

    ORDER_OPENED("urn:wutsi:event:order-opened"),
    ORDER_EXPIRED("urn:wutsi:event:order-expired"),
    ORDER_CANCELLED("urn:wutsi:event:order-cancelled"),

    STORE_ENABLED("urn:wutsi:event:store-enabled"),
    STORE_SUSPENDED("urn:wutsi:event:store-suspended"),

    PAYMENT_METHOD_ADDED("urn:wutsi:event:payment-method-added")
}
