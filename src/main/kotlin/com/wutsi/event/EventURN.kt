package com.wutsi.event

enum class EventURN(val urn: String) {
    BUSINESS_ACTIVATED("urn:wutsi:event:business-activated"),
    BUSINESS_CREATED("urn:wutsi:event:business-created"),
    BUSINESS_DEACTIVATED("urn:wutsi:event:business-deactivated"),

    MEMBER_ATTRIBUTE_UPDATED("urn:wutsi:event:member-attribute-updated"),
    MEMBER_DELETED("urn:wutsi:event:member-deleted"),
    MEMBER_REGISTERED("urn:wutsi:event:member-registered"),

    ORDER_EXPIRED("urn:wutsi:event:order-expired"),

    STORE_ACTIVATED("urn:wutsi:event:store-activated"),
    STORE_DEACTIVATED("urn:wutsi:event:store-deactivated"),

    PAYMENT_METHOD_ADDED("urn:wutsi:event:payment-method-added")
}
