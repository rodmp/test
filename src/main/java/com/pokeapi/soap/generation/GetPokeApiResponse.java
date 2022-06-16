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
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}pokeApi"/>
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
    "pokeApi"
})
@XmlRootElement(name = "getPokeApiResponse")
public class GetPokeApiResponse {

    @XmlElement(required = true)
    protected PokeApi pokeApi;

    /**
     * Obtiene el valor de la propiedad pokeApi.
     * 
     * @return
     *     possible object is
     *     {@link PokeApi }
     *     
     */
    public PokeApi getPokeApi() {
        return pokeApi;
    }

    /**
     * Define el valor de la propiedad pokeApi.
     * 
     * @param value
     *     allowed object is
     *     {@link PokeApi }
     *     
     */
    public void setPokeApi(PokeApi value) {
        this.pokeApi = value;
    }

}
