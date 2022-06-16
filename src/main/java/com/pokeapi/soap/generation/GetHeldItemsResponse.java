//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.15 a las 10:12:31 AM CDT 
//


package com.pokeapi.soap.generation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}heldItems"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heldItems"
})
@XmlRootElement(name = "getHeldItemsResponse")
public class GetHeldItemsResponse {

    @XmlElement(required = true)
    protected HeldItems heldItems;

    /**
     * Obtiene el valor de la propiedad heldItems.
     * 
     * @return
     *     possible object is
     *     {@link HeldItems }
     *     
     */
    public HeldItems getHeldItems() {
        return heldItems;
    }

    /**
     * Define el valor de la propiedad heldItems.
     * 
     * @param value
     *     allowed object is
     *     {@link HeldItems }
     *     
     */
    public void setHeldItems(HeldItems value) {
        this.heldItems = value;
    }

}
