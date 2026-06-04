
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getrepresentativelist._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.AddressTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.NameTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;


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
 *         &lt;element name="PCEHRRecord" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="representativeList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="representative" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="Authorised Representative"/&gt;
 *                                             &lt;enumeration value="Legally Appointed Authorised Representative"/&gt;
 *                                             &lt;enumeration value="Parent"/&gt;
 *                                             &lt;enumeration value="Guardian"/&gt;
 *                                             &lt;enumeration value="Nominated Representative"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/&gt;
 *                                       &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/&gt;
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
    "pcehrRecord"
})
@XmlRootElement(name = "getRepresentativeListResponse")
public class GetRepresentativeListResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "PCEHRRecord")
    protected GetRepresentativeListResponse.PCEHRRecord pcehrRecord;

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
     * Gets the value of the pcehrRecord property.
     * 
     * @return
     *     possible object is
     *     {@link GetRepresentativeListResponse.PCEHRRecord }
     *     
     */
    public GetRepresentativeListResponse.PCEHRRecord getPCEHRRecord() {
        return pcehrRecord;
    }

    /**
     * Sets the value of the pcehrRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRepresentativeListResponse.PCEHRRecord }
     *     
     */
    public void setPCEHRRecord(GetRepresentativeListResponse.PCEHRRecord value) {
        this.pcehrRecord = value;
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
     *         &lt;element name="representativeList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="representative" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="Authorised Representative"/&gt;
     *                                   &lt;enumeration value="Legally Appointed Authorised Representative"/&gt;
     *                                   &lt;enumeration value="Parent"/&gt;
     *                                   &lt;enumeration value="Guardian"/&gt;
     *                                   &lt;enumeration value="Nominated Representative"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/&gt;
     *                             &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/&gt;
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
        "representativeList"
    })
    public static class PCEHRRecord {

        @XmlElement(required = true)
        protected GetRepresentativeListResponse.PCEHRRecord.RepresentativeList representativeList;

        /**
         * Gets the value of the representativeList property.
         * 
         * @return
         *     possible object is
         *     {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList }
         *     
         */
        public GetRepresentativeListResponse.PCEHRRecord.RepresentativeList getRepresentativeList() {
            return representativeList;
        }

        /**
         * Sets the value of the representativeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList }
         *     
         */
        public void setRepresentativeList(GetRepresentativeListResponse.PCEHRRecord.RepresentativeList value) {
            this.representativeList = value;
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
         *         &lt;element name="representative" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="Authorised Representative"/&gt;
         *                         &lt;enumeration value="Legally Appointed Authorised Representative"/&gt;
         *                         &lt;enumeration value="Parent"/&gt;
         *                         &lt;enumeration value="Guardian"/&gt;
         *                         &lt;enumeration value="Nominated Representative"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/&gt;
         *                   &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/&gt;
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
            "representatives"
        })
        public static class RepresentativeList {

            @XmlElement(name = "representative", required = true)
            protected List<GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative> representatives;

            /**
             * Gets the value of the representatives property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the representatives property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRepresentatives().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative }
             * 
             * 
             */
            public List<GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative> getRepresentatives() {
                if (representatives == null) {
                    representatives = new ArrayList<GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative>();
                }
                return this.representatives;
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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="Authorised Representative"/&gt;
             *               &lt;enumeration value="Legally Appointed Authorised Representative"/&gt;
             *               &lt;enumeration value="Parent"/&gt;
             *               &lt;enumeration value="Guardian"/&gt;
             *               &lt;enumeration value="Nominated Representative"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTypeSupp"/&gt;
             *         &lt;element name="address" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressTypeSupp" minOccurs="0"/&gt;
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
                "id",
                "type",
                "name",
                "address"
            })
            public static class Representative {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected NameTypeSupp name;
                protected AddressTypeSupp address;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameTypeSupp }
                 *     
                 */
                public NameTypeSupp getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameTypeSupp }
                 *     
                 */
                public void setName(NameTypeSupp value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressTypeSupp }
                 *     
                 */
                public AddressTypeSupp getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressTypeSupp }
                 *     
                 */
                public void setAddress(AddressTypeSupp value) {
                    this.address = value;
                }

            }

        }

    }

}
