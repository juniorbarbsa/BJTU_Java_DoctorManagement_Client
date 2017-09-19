
package project.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the project package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMedicalRecord_QNAME = new QName("http://dcproject3.org/wsdl", "getMedicalRecord");
    private final static QName _GetMedicalRecordResponse_QNAME = new QName("http://dcproject3.org/wsdl", "getMedicalRecordResponse");
    private final static QName _GetAllDoctors_QNAME = new QName("http://dcproject3.org/wsdl", "getAllDoctors");
    private final static QName _GetDoctorByIDResponse_QNAME = new QName("http://dcproject3.org/wsdl", "getDoctorByIDResponse");
    private final static QName _GetAllDoctorsResponse_QNAME = new QName("http://dcproject3.org/wsdl", "getAllDoctorsResponse");
    private final static QName _GetAllDepartments_QNAME = new QName("http://dcproject3.org/wsdl", "getAllDepartments");
    private final static QName _GetAllDepartmentsResponse_QNAME = new QName("http://dcproject3.org/wsdl", "getAllDepartmentsResponse");
    private final static QName _CheckLogin_QNAME = new QName("http://dcproject3.org/wsdl", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://dcproject3.org/wsdl", "checkLoginResponse");
    private final static QName _GetDoctorByID_QNAME = new QName("http://dcproject3.org/wsdl", "getDoctorByID");
    private final static QName _MakeAppointmentResponse_QNAME = new QName("http://dcproject3.org/wsdl", "makeAppointmentResponse");
    private final static QName _GetDoctorsByDepartment_QNAME = new QName("http://dcproject3.org/wsdl", "getDoctorsByDepartment");
    private final static QName _GetDoctorsByDepartmentResponse_QNAME = new QName("http://dcproject3.org/wsdl", "getDoctorsByDepartmentResponse");
    private final static QName _MakeAppointment_QNAME = new QName("http://dcproject3.org/wsdl", "makeAppointment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: project
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllDoctors }
     * 
     */
    public GetAllDoctors createGetAllDoctors() {
        return new GetAllDoctors();
    }

    /**
     * Create an instance of {@link GetDoctorByIDResponse }
     * 
     */
    public GetDoctorByIDResponse createGetDoctorByIDResponse() {
        return new GetDoctorByIDResponse();
    }

    /**
     * Create an instance of {@link GetMedicalRecord }
     * 
     */
    public GetMedicalRecord createGetMedicalRecord() {
        return new GetMedicalRecord();
    }

    /**
     * Create an instance of {@link GetMedicalRecordResponse }
     * 
     */
    public GetMedicalRecordResponse createGetMedicalRecordResponse() {
        return new GetMedicalRecordResponse();
    }

    /**
     * Create an instance of {@link GetAllDepartmentsResponse }
     * 
     */
    public GetAllDepartmentsResponse createGetAllDepartmentsResponse() {
        return new GetAllDepartmentsResponse();
    }

    /**
     * Create an instance of {@link GetAllDoctorsResponse }
     * 
     */
    public GetAllDoctorsResponse createGetAllDoctorsResponse() {
        return new GetAllDoctorsResponse();
    }

    /**
     * Create an instance of {@link GetAllDepartments }
     * 
     */
    public GetAllDepartments createGetAllDepartments() {
        return new GetAllDepartments();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link MakeAppointmentResponse }
     * 
     */
    public MakeAppointmentResponse createMakeAppointmentResponse() {
        return new MakeAppointmentResponse();
    }

    /**
     * Create an instance of {@link GetDoctorByID }
     * 
     */
    public GetDoctorByID createGetDoctorByID() {
        return new GetDoctorByID();
    }

    /**
     * Create an instance of {@link GetDoctorsByDepartmentResponse }
     * 
     */
    public GetDoctorsByDepartmentResponse createGetDoctorsByDepartmentResponse() {
        return new GetDoctorsByDepartmentResponse();
    }

    /**
     * Create an instance of {@link GetDoctorsByDepartment }
     * 
     */
    public GetDoctorsByDepartment createGetDoctorsByDepartment() {
        return new GetDoctorsByDepartment();
    }

    /**
     * Create an instance of {@link MakeAppointment }
     * 
     */
    public MakeAppointment createMakeAppointment() {
        return new MakeAppointment();
    }

    /**
     * Create an instance of {@link MedicalRecord }
     * 
     */
    public MedicalRecord createMedicalRecord() {
        return new MedicalRecord();
    }

    /**
     * Create an instance of {@link DepartmentInfo }
     * 
     */
    public DepartmentInfo createDepartmentInfo() {
        return new DepartmentInfo();
    }

    /**
     * Create an instance of {@link DoctorInfo }
     * 
     */
    public DoctorInfo createDoctorInfo() {
        return new DoctorInfo();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getMedicalRecord")
    public JAXBElement<GetMedicalRecord> createGetMedicalRecord(GetMedicalRecord value) {
        return new JAXBElement<GetMedicalRecord>(_GetMedicalRecord_QNAME, GetMedicalRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getMedicalRecordResponse")
    public JAXBElement<GetMedicalRecordResponse> createGetMedicalRecordResponse(GetMedicalRecordResponse value) {
        return new JAXBElement<GetMedicalRecordResponse>(_GetMedicalRecordResponse_QNAME, GetMedicalRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoctors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getAllDoctors")
    public JAXBElement<GetAllDoctors> createGetAllDoctors(GetAllDoctors value) {
        return new JAXBElement<GetAllDoctors>(_GetAllDoctors_QNAME, GetAllDoctors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getDoctorByIDResponse")
    public JAXBElement<GetDoctorByIDResponse> createGetDoctorByIDResponse(GetDoctorByIDResponse value) {
        return new JAXBElement<GetDoctorByIDResponse>(_GetDoctorByIDResponse_QNAME, GetDoctorByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoctorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getAllDoctorsResponse")
    public JAXBElement<GetAllDoctorsResponse> createGetAllDoctorsResponse(GetAllDoctorsResponse value) {
        return new JAXBElement<GetAllDoctorsResponse>(_GetAllDoctorsResponse_QNAME, GetAllDoctorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getAllDepartments")
    public JAXBElement<GetAllDepartments> createGetAllDepartments(GetAllDepartments value) {
        return new JAXBElement<GetAllDepartments>(_GetAllDepartments_QNAME, GetAllDepartments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getAllDepartmentsResponse")
    public JAXBElement<GetAllDepartmentsResponse> createGetAllDepartmentsResponse(GetAllDepartmentsResponse value) {
        return new JAXBElement<GetAllDepartmentsResponse>(_GetAllDepartmentsResponse_QNAME, GetAllDepartmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getDoctorByID")
    public JAXBElement<GetDoctorByID> createGetDoctorByID(GetDoctorByID value) {
        return new JAXBElement<GetDoctorByID>(_GetDoctorByID_QNAME, GetDoctorByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeAppointmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "makeAppointmentResponse")
    public JAXBElement<MakeAppointmentResponse> createMakeAppointmentResponse(MakeAppointmentResponse value) {
        return new JAXBElement<MakeAppointmentResponse>(_MakeAppointmentResponse_QNAME, MakeAppointmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorsByDepartment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getDoctorsByDepartment")
    public JAXBElement<GetDoctorsByDepartment> createGetDoctorsByDepartment(GetDoctorsByDepartment value) {
        return new JAXBElement<GetDoctorsByDepartment>(_GetDoctorsByDepartment_QNAME, GetDoctorsByDepartment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorsByDepartmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "getDoctorsByDepartmentResponse")
    public JAXBElement<GetDoctorsByDepartmentResponse> createGetDoctorsByDepartmentResponse(GetDoctorsByDepartmentResponse value) {
        return new JAXBElement<GetDoctorsByDepartmentResponse>(_GetDoctorsByDepartmentResponse_QNAME, GetDoctorsByDepartmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeAppointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dcproject3.org/wsdl", name = "makeAppointment")
    public JAXBElement<MakeAppointment> createMakeAppointment(MakeAppointment value) {
        return new JAXBElement<MakeAppointment>(_MakeAppointment_QNAME, MakeAppointment.class, null, value);
    }

}
