
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createPersonResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createPersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPersonResponse", propOrder = {
    "person"
})
public class CreatePersonResponse {

    protected Long person;

    /**
     * Recupera il valore della proprieta person.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPerson() {
        return person;
    }

    /**
     * Imposta il valore della proprieta person.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPerson(Long value) {
        this.person = value;
    }

}
