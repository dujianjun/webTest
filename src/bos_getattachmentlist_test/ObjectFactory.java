
package bos_getattachmentlist_test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bos_getattachmentlist_test package. 
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

    private final static QName _AuthenticationInfo_QNAME = new QName("urn:BOS_GetAttachmentList_Test", "AuthenticationInfo");
    private final static QName _GetAttachmentListResponse_QNAME = new QName("urn:BOS_GetAttachmentList_Test", "GetAttachmentListResponse");
    private final static QName _GetAttachmentList_QNAME = new QName("urn:BOS_GetAttachmentList_Test", "GetAttachmentList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bos_getattachmentlist_test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutputMapping1 }
     * 
     */
    public OutputMapping1 createOutputMapping1() {
        return new OutputMapping1();
    }

    /**
     * Create an instance of {@link InputMapping1 }
     * 
     */
    public InputMapping1 createInputMapping1() {
        return new InputMapping1();
    }

    /**
     * Create an instance of {@link AuthenticationInfo }
     * 
     */
    public AuthenticationInfo createAuthenticationInfo() {
        return new AuthenticationInfo();
    }

    /**
     * Create an instance of {@link OutputMapping1 .GetListValues }
     * 
     */
    public OutputMapping1 .GetListValues createOutputMapping1GetListValues() {
        return new OutputMapping1 .GetListValues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:BOS_GetAttachmentList_Test", name = "AuthenticationInfo")
    public JAXBElement<AuthenticationInfo> createAuthenticationInfo(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_AuthenticationInfo_QNAME, AuthenticationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputMapping1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:BOS_GetAttachmentList_Test", name = "GetAttachmentListResponse")
    public JAXBElement<OutputMapping1> createGetAttachmentListResponse(OutputMapping1 value) {
        return new JAXBElement<OutputMapping1>(_GetAttachmentListResponse_QNAME, OutputMapping1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputMapping1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:BOS_GetAttachmentList_Test", name = "GetAttachmentList")
    public JAXBElement<InputMapping1> createGetAttachmentList(InputMapping1 value) {
        return new JAXBElement<InputMapping1>(_GetAttachmentList_QNAME, InputMapping1 .class, null, value);
    }

}
