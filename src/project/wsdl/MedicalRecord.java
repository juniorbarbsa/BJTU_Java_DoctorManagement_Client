
package project.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicalRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicalRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagnosisDate" type="{http://dcproject3.org/wsdl}timestamp" minOccurs="0"/>
 *         &lt;element name="doctorID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="symptoms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicalRecord", propOrder = {
    "diagnosis",
    "diagnosisDate",
    "doctorID",
    "note",
    "patientID",
    "recordId",
    "symptoms"
})
public class MedicalRecord {

    protected String diagnosis;
    protected Timestamp diagnosisDate;
    protected int doctorID;
    protected String note;
    protected int patientID;
    protected int recordId;
    protected String symptoms;

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosis(String value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the diagnosisDate property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * Sets the value of the diagnosisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setDiagnosisDate(Timestamp value) {
        this.diagnosisDate = value;
    }

    /**
     * Gets the value of the doctorID property.
     * 
     */
    public int getDoctorID() {
        return doctorID;
    }

    /**
     * Sets the value of the doctorID property.
     * 
     */
    public void setDoctorID(int value) {
        this.doctorID = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the patientID property.
     * 
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     * Sets the value of the patientID property.
     * 
     */
    public void setPatientID(int value) {
        this.patientID = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     */
    public int getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     */
    public void setRecordId(int value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the symptoms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymptoms() {
        return symptoms;
    }

    /**
     * Sets the value of the symptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymptoms(String value) {
        this.symptoms = value;
    }

}
