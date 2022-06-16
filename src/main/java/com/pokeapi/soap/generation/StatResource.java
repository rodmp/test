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
 *         &lt;element name="base_stat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="effort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Stat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "baseStat",
    "effort",
    "stat"
})
@XmlRootElement(name = "StatResource")
public class StatResource {

    @XmlElement(name = "base_stat")
    protected int baseStat;
    protected int effort;
    @XmlElement(name = "Stat", required = true)
    protected StatResource.Stat stat;

    /**
     * Obtiene el valor de la propiedad baseStat.
     * 
     */
    public int getBaseStat() {
        return baseStat;
    }

    /**
     * Define el valor de la propiedad baseStat.
     * 
     */
    public void setBaseStat(int value) {
        this.baseStat = value;
    }

    /**
     * Obtiene el valor de la propiedad effort.
     * 
     */
    public int getEffort() {
        return effort;
    }

    /**
     * Define el valor de la propiedad effort.
     * 
     */
    public void setEffort(int value) {
        this.effort = value;
    }

    /**
     * Obtiene el valor de la propiedad stat.
     * 
     * @return
     *     possible object is
     *     {@link StatResource.Stat }
     *     
     */
    public StatResource.Stat getStat() {
        return stat;
    }

    /**
     * Define el valor de la propiedad stat.
     * 
     * @param value
     *     allowed object is
     *     {@link StatResource.Stat }
     *     
     */
    public void setStat(StatResource.Stat value) {
        this.stat = value;
    }


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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "name",
        "url"
    })
    public static class Stat {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String url;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }

}
