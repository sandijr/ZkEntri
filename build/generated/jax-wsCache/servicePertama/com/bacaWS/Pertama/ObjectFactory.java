
package com.bacaWS.Pertama;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bacaWS.Pertama package. 
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

    private final static QName _Tambah_QNAME = new QName("http://ade.kang.com/", "tambah");
    private final static QName _TambahResponse_QNAME = new QName("http://ade.kang.com/", "tambahResponse");
    private final static QName _CariPegawaiSesuaiNamaResponse_QNAME = new QName("http://ade.kang.com/", "cariPegawaiSesuaiNamaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ade.kang.com/", "helloResponse");
    private final static QName _CariPegawaiSesuaiNama_QNAME = new QName("http://ade.kang.com/", "cariPegawaiSesuaiNama");
    private final static QName _Hello_QNAME = new QName("http://ade.kang.com/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bacaWS.Pertama
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CariPegawaiSesuaiNama }
     * 
     */
    public CariPegawaiSesuaiNama createCariPegawaiSesuaiNama() {
        return new CariPegawaiSesuaiNama();
    }

    /**
     * Create an instance of {@link CariPegawaiSesuaiNamaResponse }
     * 
     */
    public CariPegawaiSesuaiNamaResponse createCariPegawaiSesuaiNamaResponse() {
        return new CariPegawaiSesuaiNamaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Tambah }
     * 
     */
    public Tambah createTambah() {
        return new Tambah();
    }

    /**
     * Create an instance of {@link TambahResponse }
     * 
     */
    public TambahResponse createTambahResponse() {
        return new TambahResponse();
    }

    /**
     * Create an instance of {@link CacatTbl }
     * 
     */
    public CacatTbl createCacatTbl() {
        return new CacatTbl();
    }

    /**
     * Create an instance of {@link SukuTbl }
     * 
     */
    public SukuTbl createSukuTbl() {
        return new SukuTbl();
    }

    /**
     * Create an instance of {@link StawinTbl }
     * 
     */
    public StawinTbl createStawinTbl() {
        return new StawinTbl();
    }

    /**
     * Create an instance of {@link KelkerTbl }
     * 
     */
    public KelkerTbl createKelkerTbl() {
        return new KelkerTbl();
    }

    /**
     * Create an instance of {@link Pegawai }
     * 
     */
    public Pegawai createPegawai() {
        return new Pegawai();
    }

    /**
     * Create an instance of {@link AgamaTbl }
     * 
     */
    public AgamaTbl createAgamaTbl() {
        return new AgamaTbl();
    }

    /**
     * Create an instance of {@link DarahTbl }
     * 
     */
    public DarahTbl createDarahTbl() {
        return new DarahTbl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tambah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.kang.com/", name = "tambah")
    public JAXBElement<Tambah> createTambah(Tambah value) {
        return new JAXBElement<Tambah>(_Tambah_QNAME, Tambah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.kang.com/", name = "tambahResponse")
    public JAXBElement<TambahResponse> createTambahResponse(TambahResponse value) {
        return new JAXBElement<TambahResponse>(_TambahResponse_QNAME, TambahResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariPegawaiSesuaiNamaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.kang.com/", name = "cariPegawaiSesuaiNamaResponse")
    public JAXBElement<CariPegawaiSesuaiNamaResponse> createCariPegawaiSesuaiNamaResponse(CariPegawaiSesuaiNamaResponse value) {
        return new JAXBElement<CariPegawaiSesuaiNamaResponse>(_CariPegawaiSesuaiNamaResponse_QNAME, CariPegawaiSesuaiNamaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.kang.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariPegawaiSesuaiNama }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.kang.com/", name = "cariPegawaiSesuaiNama")
    public JAXBElement<CariPegawaiSesuaiNama> createCariPegawaiSesuaiNama(CariPegawaiSesuaiNama value) {
        return new JAXBElement<CariPegawaiSesuaiNama>(_CariPegawaiSesuaiNama_QNAME, CariPegawaiSesuaiNama.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ade.kang.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
