//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.12.06 a las 09:09:30 PM COT 
//


package org.example.wsmails;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.wsmails package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.wsmails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMailRequest }
     * 
     */
    public SendMailRequest createSendMailRequest() {
        return new SendMailRequest();
    }

    /**
     * Create an instance of {@link SendMailResponse }
     * 
     */
    public SendMailResponse createSendMailResponse() {
        return new SendMailResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link Mail }
     * 
     */
    public Mail createMail() {
        return new Mail();
    }

}
