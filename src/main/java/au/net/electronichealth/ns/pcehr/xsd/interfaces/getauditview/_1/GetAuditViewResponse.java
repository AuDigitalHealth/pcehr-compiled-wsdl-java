
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getauditview._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.AccessConditionsType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.AccessedEntityType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ParticipantActionType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ParticipantDetailsType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
 *         &lt;element name="auditView" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="eventTrail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="businessEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="eventTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="auditEvent" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="auditEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="participantDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantDetailsType" minOccurs="0"/&gt;
 *                                       &lt;element name="accessedEntity" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessedEntityType" minOccurs="0"/&gt;
 *                                       &lt;element name="participantAction" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantActionType" minOccurs="0"/&gt;
 *                                       &lt;element name="accessConditions" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessConditionsType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="logEvent" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="messageLogLevel"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="WARN"/&gt;
 *                                             &lt;enumeration value="ERROR"/&gt;
 *                                             &lt;enumeration value="DEBUG"/&gt;
 *                                             &lt;enumeration value="AUDIT"/&gt;
 *                                             &lt;enumeration value="FATAL"/&gt;
 *                                             &lt;enumeration value="INFO"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="statusDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
 *                                       &lt;element name="errorDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseStatus",
    "auditView"
})
@XmlRootElement(name = "getAuditViewResponse")
public class GetAuditViewResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    protected GetAuditViewResponse.AuditView auditView;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the auditView property.
     * 
     * @return
     *     possible object is
     *     {@link GetAuditViewResponse.AuditView }
     *     
     */
    public GetAuditViewResponse.AuditView getAuditView() {
        return auditView;
    }

    /**
     * Sets the value of the auditView property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAuditViewResponse.AuditView }
     *     
     */
    public void setAuditView(GetAuditViewResponse.AuditView value) {
        this.auditView = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="eventTrail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="businessEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="eventTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="auditEvent" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="auditEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="participantDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantDetailsType" minOccurs="0"/&gt;
     *                             &lt;element name="accessedEntity" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessedEntityType" minOccurs="0"/&gt;
     *                             &lt;element name="participantAction" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantActionType" minOccurs="0"/&gt;
     *                             &lt;element name="accessConditions" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessConditionsType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="logEvent" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="messageLogLevel"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="WARN"/&gt;
     *                                   &lt;enumeration value="ERROR"/&gt;
     *                                   &lt;enumeration value="DEBUG"/&gt;
     *                                   &lt;enumeration value="AUDIT"/&gt;
     *                                   &lt;enumeration value="FATAL"/&gt;
     *                                   &lt;enumeration value="INFO"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="statusDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
     *                             &lt;element name="errorDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventTrail"
    })
    public static class AuditView {

        @XmlElement(required = true)
        protected List<GetAuditViewResponse.AuditView.EventTrail> eventTrail;

        /**
         * Gets the value of the eventTrail property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the eventTrail property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEventTrail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetAuditViewResponse.AuditView.EventTrail }
         * </p>
         * 
         * 
         * @return
         *     The value of the eventTrail property.
         */
        public List<GetAuditViewResponse.AuditView.EventTrail> getEventTrail() {
            if (eventTrail == null) {
                eventTrail = new ArrayList<>();
            }
            return this.eventTrail;
        }


        /**
         * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
         * 
         * &lt;pre&gt;{&#064;code
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="businessEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="eventTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="auditEvent" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="auditEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="participantDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantDetailsType" minOccurs="0"/&gt;
         *                   &lt;element name="accessedEntity" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessedEntityType" minOccurs="0"/&gt;
         *                   &lt;element name="participantAction" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantActionType" minOccurs="0"/&gt;
         *                   &lt;element name="accessConditions" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessConditionsType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="logEvent" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="messageLogLevel"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="WARN"/&gt;
         *                         &lt;enumeration value="ERROR"/&gt;
         *                         &lt;enumeration value="DEBUG"/&gt;
         *                         &lt;enumeration value="AUDIT"/&gt;
         *                         &lt;enumeration value="FATAL"/&gt;
         *                         &lt;enumeration value="INFO"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="statusDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
         *                   &lt;element name="errorDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * }&lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "businessEvent",
            "eventTimeStamp",
            "auditEvent",
            "logEvent"
        })
        public static class EventTrail {

            @XmlElement(required = true)
            protected String businessEvent;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar eventTimeStamp;
            protected GetAuditViewResponse.AuditView.EventTrail.AuditEvent auditEvent;
            protected GetAuditViewResponse.AuditView.EventTrail.LogEvent logEvent;

            /**
             * Gets the value of the businessEvent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessEvent() {
                return businessEvent;
            }

            /**
             * Sets the value of the businessEvent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessEvent(String value) {
                this.businessEvent = value;
            }

            /**
             * Gets the value of the eventTimeStamp property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEventTimeStamp() {
                return eventTimeStamp;
            }

            /**
             * Sets the value of the eventTimeStamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEventTimeStamp(XMLGregorianCalendar value) {
                this.eventTimeStamp = value;
            }

            /**
             * Gets the value of the auditEvent property.
             * 
             * @return
             *     possible object is
             *     {@link GetAuditViewResponse.AuditView.EventTrail.AuditEvent }
             *     
             */
            public GetAuditViewResponse.AuditView.EventTrail.AuditEvent getAuditEvent() {
                return auditEvent;
            }

            /**
             * Sets the value of the auditEvent property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetAuditViewResponse.AuditView.EventTrail.AuditEvent }
             *     
             */
            public void setAuditEvent(GetAuditViewResponse.AuditView.EventTrail.AuditEvent value) {
                this.auditEvent = value;
            }

            /**
             * Gets the value of the logEvent property.
             * 
             * @return
             *     possible object is
             *     {@link GetAuditViewResponse.AuditView.EventTrail.LogEvent }
             *     
             */
            public GetAuditViewResponse.AuditView.EventTrail.LogEvent getLogEvent() {
                return logEvent;
            }

            /**
             * Sets the value of the logEvent property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetAuditViewResponse.AuditView.EventTrail.LogEvent }
             *     
             */
            public void setLogEvent(GetAuditViewResponse.AuditView.EventTrail.LogEvent value) {
                this.logEvent = value;
            }


            /**
             * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
             * 
             * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
             * 
             * &lt;pre&gt;{&#064;code
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="auditEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="participantDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantDetailsType" minOccurs="0"/&gt;
             *         &lt;element name="accessedEntity" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessedEntityType" minOccurs="0"/&gt;
             *         &lt;element name="participantAction" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}participantActionType" minOccurs="0"/&gt;
             *         &lt;element name="accessConditions" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}accessConditionsType" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * }&lt;/pre&gt;
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "auditEventID",
                "participantDetails",
                "accessedEntity",
                "participantAction",
                "accessConditions"
            })
            public static class AuditEvent {

                protected String auditEventID;
                protected ParticipantDetailsType participantDetails;
                protected AccessedEntityType accessedEntity;
                protected ParticipantActionType participantAction;
                protected AccessConditionsType accessConditions;

                /**
                 * Gets the value of the auditEventID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuditEventID() {
                    return auditEventID;
                }

                /**
                 * Sets the value of the auditEventID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuditEventID(String value) {
                    this.auditEventID = value;
                }

                /**
                 * Gets the value of the participantDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ParticipantDetailsType }
                 *     
                 */
                public ParticipantDetailsType getParticipantDetails() {
                    return participantDetails;
                }

                /**
                 * Sets the value of the participantDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ParticipantDetailsType }
                 *     
                 */
                public void setParticipantDetails(ParticipantDetailsType value) {
                    this.participantDetails = value;
                }

                /**
                 * Gets the value of the accessedEntity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AccessedEntityType }
                 *     
                 */
                public AccessedEntityType getAccessedEntity() {
                    return accessedEntity;
                }

                /**
                 * Sets the value of the accessedEntity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AccessedEntityType }
                 *     
                 */
                public void setAccessedEntity(AccessedEntityType value) {
                    this.accessedEntity = value;
                }

                /**
                 * Gets the value of the participantAction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ParticipantActionType }
                 *     
                 */
                public ParticipantActionType getParticipantAction() {
                    return participantAction;
                }

                /**
                 * Sets the value of the participantAction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ParticipantActionType }
                 *     
                 */
                public void setParticipantAction(ParticipantActionType value) {
                    this.participantAction = value;
                }

                /**
                 * Gets the value of the accessConditions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AccessConditionsType }
                 *     
                 */
                public AccessConditionsType getAccessConditions() {
                    return accessConditions;
                }

                /**
                 * Sets the value of the accessConditions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AccessConditionsType }
                 *     
                 */
                public void setAccessConditions(AccessConditionsType value) {
                    this.accessConditions = value;
                }

            }


            /**
             * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
             * 
             * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
             * 
             * &lt;pre&gt;{&#064;code
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="messageLogLevel"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="WARN"/&gt;
             *               &lt;enumeration value="ERROR"/&gt;
             *               &lt;enumeration value="DEBUG"/&gt;
             *               &lt;enumeration value="AUDIT"/&gt;
             *               &lt;enumeration value="FATAL"/&gt;
             *               &lt;enumeration value="INFO"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="statusDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
             *         &lt;element name="errorDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * }&lt;/pre&gt;
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "messageLogLevel",
                "statusDetails",
                "errorDetails"
            })
            public static class LogEvent {

                @XmlElement(required = true)
                protected String messageLogLevel;
                @XmlElement(required = true)
                protected ResponseStatusType statusDetails;
                protected ResponseStatusType errorDetails;

                /**
                 * Gets the value of the messageLogLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessageLogLevel() {
                    return messageLogLevel;
                }

                /**
                 * Sets the value of the messageLogLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessageLogLevel(String value) {
                    this.messageLogLevel = value;
                }

                /**
                 * Gets the value of the statusDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResponseStatusType }
                 *     
                 */
                public ResponseStatusType getStatusDetails() {
                    return statusDetails;
                }

                /**
                 * Sets the value of the statusDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResponseStatusType }
                 *     
                 */
                public void setStatusDetails(ResponseStatusType value) {
                    this.statusDetails = value;
                }

                /**
                 * Gets the value of the errorDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ResponseStatusType }
                 *     
                 */
                public ResponseStatusType getErrorDetails() {
                    return errorDetails;
                }

                /**
                 * Sets the value of the errorDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ResponseStatusType }
                 *     
                 */
                public void setErrorDetails(ResponseStatusType value) {
                    this.errorDetails = value;
                }

            }

        }

    }

}
