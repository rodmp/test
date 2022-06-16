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
 *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="other">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DreamWorld">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="home">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="official-artwork">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GenerationI">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RedBlue">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Yellow">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationII">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="crystal">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="gold">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="silver">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationIII">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="emerald">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="firered-leafgreen">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ruby-sapphire">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationIV">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="diamond-pearl">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="heartgold-soulsilver">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="platinum">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationV">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="black-white">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="animated">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationVI">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="omegaruby-alphasapphire">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="x-y">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationVII">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="icons">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ultra-sun-ultra-moon">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GenerationVIII">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="icons">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "backDefault",
    "backFemale",
    "backShiny",
    "backShinyFemale",
    "frontDefault",
    "frontFemale",
    "frontShiny",
    "frontShinyFemale",
    "other",
    "versions"
})
@XmlRootElement(name = "Sprites")
public class Sprites {

    @XmlElement(name = "back_default", required = true)
    protected String backDefault;
    @XmlElement(name = "back_female", required = true)
    protected String backFemale;
    @XmlElement(name = "back_shiny", required = true)
    protected String backShiny;
    @XmlElement(name = "back_shiny_female", required = true)
    protected String backShinyFemale;
    @XmlElement(name = "front_default", required = true)
    protected String frontDefault;
    @XmlElement(name = "front_female", required = true)
    protected String frontFemale;
    @XmlElement(name = "front_shiny", required = true)
    protected String frontShiny;
    @XmlElement(name = "front_shiny_female", required = true)
    protected String frontShinyFemale;
    @XmlElement(required = true)
    protected Sprites.Other other;
    @XmlElement(required = true)
    protected Sprites.Versions versions;

    /**
     * Obtiene el valor de la propiedad backDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackDefault() {
        return backDefault;
    }

    /**
     * Define el valor de la propiedad backDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackDefault(String value) {
        this.backDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad backFemale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFemale() {
        return backFemale;
    }

    /**
     * Define el valor de la propiedad backFemale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFemale(String value) {
        this.backFemale = value;
    }

    /**
     * Obtiene el valor de la propiedad backShiny.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackShiny() {
        return backShiny;
    }

    /**
     * Define el valor de la propiedad backShiny.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackShiny(String value) {
        this.backShiny = value;
    }

    /**
     * Obtiene el valor de la propiedad backShinyFemale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    /**
     * Define el valor de la propiedad backShinyFemale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackShinyFemale(String value) {
        this.backShinyFemale = value;
    }

    /**
     * Obtiene el valor de la propiedad frontDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    /**
     * Define el valor de la propiedad frontDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontDefault(String value) {
        this.frontDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad frontFemale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    /**
     * Define el valor de la propiedad frontFemale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontFemale(String value) {
        this.frontFemale = value;
    }

    /**
     * Obtiene el valor de la propiedad frontShiny.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontShiny() {
        return frontShiny;
    }

    /**
     * Define el valor de la propiedad frontShiny.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontShiny(String value) {
        this.frontShiny = value;
    }

    /**
     * Obtiene el valor de la propiedad frontShinyFemale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    /**
     * Define el valor de la propiedad frontShinyFemale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontShinyFemale(String value) {
        this.frontShinyFemale = value;
    }

    /**
     * Obtiene el valor de la propiedad other.
     * 
     * @return
     *     possible object is
     *     {@link Sprites.Other }
     *     
     */
    public Sprites.Other getOther() {
        return other;
    }

    /**
     * Define el valor de la propiedad other.
     * 
     * @param value
     *     allowed object is
     *     {@link Sprites.Other }
     *     
     */
    public void setOther(Sprites.Other value) {
        this.other = value;
    }

    /**
     * Obtiene el valor de la propiedad versions.
     * 
     * @return
     *     possible object is
     *     {@link Sprites.Versions }
     *     
     */
    public Sprites.Versions getVersions() {
        return versions;
    }

    /**
     * Define el valor de la propiedad versions.
     * 
     * @param value
     *     allowed object is
     *     {@link Sprites.Versions }
     *     
     */
    public void setVersions(Sprites.Versions value) {
        this.versions = value;
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
     *         &lt;element name="DreamWorld">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="home">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="official-artwork">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "dreamWorld",
        "home",
        "officialArtwork"
    })
    public static class Other {

        @XmlElement(name = "DreamWorld", required = true)
        protected Sprites.Other.DreamWorld dreamWorld;
        @XmlElement(required = true)
        protected Sprites.Other.Home home;
        @XmlElement(name = "official-artwork", required = true)
        protected Sprites.Other.OfficialArtwork officialArtwork;

        /**
         * Obtiene el valor de la propiedad dreamWorld.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Other.DreamWorld }
         *     
         */
        public Sprites.Other.DreamWorld getDreamWorld() {
            return dreamWorld;
        }

        /**
         * Define el valor de la propiedad dreamWorld.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Other.DreamWorld }
         *     
         */
        public void setDreamWorld(Sprites.Other.DreamWorld value) {
            this.dreamWorld = value;
        }

        /**
         * Obtiene el valor de la propiedad home.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Other.Home }
         *     
         */
        public Sprites.Other.Home getHome() {
            return home;
        }

        /**
         * Define el valor de la propiedad home.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Other.Home }
         *     
         */
        public void setHome(Sprites.Other.Home value) {
            this.home = value;
        }

        /**
         * Obtiene el valor de la propiedad officialArtwork.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Other.OfficialArtwork }
         *     
         */
        public Sprites.Other.OfficialArtwork getOfficialArtwork() {
            return officialArtwork;
        }

        /**
         * Define el valor de la propiedad officialArtwork.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Other.OfficialArtwork }
         *     
         */
        public void setOfficialArtwork(Sprites.Other.OfficialArtwork value) {
            this.officialArtwork = value;
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
         *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "frontDefault",
            "frontFemale"
        })
        public static class DreamWorld {

            @XmlElement(name = "front_default", required = true)
            protected String frontDefault;
            @XmlElement(name = "front_female", required = true)
            protected String frontFemale;

            /**
             * Obtiene el valor de la propiedad frontDefault.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontDefault() {
                return frontDefault;
            }

            /**
             * Define el valor de la propiedad frontDefault.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontDefault(String value) {
                this.frontDefault = value;
            }

            /**
             * Obtiene el valor de la propiedad frontFemale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontFemale() {
                return frontFemale;
            }

            /**
             * Define el valor de la propiedad frontFemale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontFemale(String value) {
                this.frontFemale = value;
            }

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
         *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "frontDefault",
            "frontFemale",
            "frontShiny",
            "frontShinyFemale"
        })
        public static class Home {

            @XmlElement(name = "front_default", required = true)
            protected String frontDefault;
            @XmlElement(name = "front_female", required = true)
            protected String frontFemale;
            @XmlElement(name = "front_shiny", required = true)
            protected String frontShiny;
            @XmlElement(name = "front_shiny_female", required = true)
            protected String frontShinyFemale;

            /**
             * Obtiene el valor de la propiedad frontDefault.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontDefault() {
                return frontDefault;
            }

            /**
             * Define el valor de la propiedad frontDefault.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontDefault(String value) {
                this.frontDefault = value;
            }

            /**
             * Obtiene el valor de la propiedad frontFemale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontFemale() {
                return frontFemale;
            }

            /**
             * Define el valor de la propiedad frontFemale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontFemale(String value) {
                this.frontFemale = value;
            }

            /**
             * Obtiene el valor de la propiedad frontShiny.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontShiny() {
                return frontShiny;
            }

            /**
             * Define el valor de la propiedad frontShiny.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontShiny(String value) {
                this.frontShiny = value;
            }

            /**
             * Obtiene el valor de la propiedad frontShinyFemale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontShinyFemale() {
                return frontShinyFemale;
            }

            /**
             * Define el valor de la propiedad frontShinyFemale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontShinyFemale(String value) {
                this.frontShinyFemale = value;
            }

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
         *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "frontDefault"
        })
        public static class OfficialArtwork {

            @XmlElement(name = "front_default", required = true)
            protected String frontDefault;

            /**
             * Obtiene el valor de la propiedad frontDefault.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrontDefault() {
                return frontDefault;
            }

            /**
             * Define el valor de la propiedad frontDefault.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrontDefault(String value) {
                this.frontDefault = value;
            }

        }

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
     *         &lt;element name="GenerationI">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RedBlue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Yellow">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationII">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="crystal">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="gold">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="silver">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationIII">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="emerald">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="firered-leafgreen">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ruby-sapphire">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationIV">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="diamond-pearl">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="heartgold-soulsilver">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="platinum">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationV">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="black-white">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="animated">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationVI">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="omegaruby-alphasapphire">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="x-y">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationVII">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="icons">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ultra-sun-ultra-moon">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GenerationVIII">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="icons">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "generationI",
        "generationII",
        "generationIII",
        "generationIV",
        "generationV",
        "generationVI",
        "generationVII",
        "generationVIII"
    })
    public static class Versions {

        @XmlElement(name = "GenerationI", required = true)
        protected Sprites.Versions.GenerationI generationI;
        @XmlElement(name = "GenerationII", required = true)
        protected Sprites.Versions.GenerationII generationII;
        @XmlElement(name = "GenerationIII", required = true)
        protected Sprites.Versions.GenerationIII generationIII;
        @XmlElement(name = "GenerationIV", required = true)
        protected Sprites.Versions.GenerationIV generationIV;
        @XmlElement(name = "GenerationV", required = true)
        protected Sprites.Versions.GenerationV generationV;
        @XmlElement(name = "GenerationVI", required = true)
        protected Sprites.Versions.GenerationVI generationVI;
        @XmlElement(name = "GenerationVII", required = true)
        protected Sprites.Versions.GenerationVII generationVII;
        @XmlElement(name = "GenerationVIII", required = true)
        protected Sprites.Versions.GenerationVIII generationVIII;

        /**
         * Obtiene el valor de la propiedad generationI.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationI }
         *     
         */
        public Sprites.Versions.GenerationI getGenerationI() {
            return generationI;
        }

        /**
         * Define el valor de la propiedad generationI.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationI }
         *     
         */
        public void setGenerationI(Sprites.Versions.GenerationI value) {
            this.generationI = value;
        }

        /**
         * Obtiene el valor de la propiedad generationII.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationII }
         *     
         */
        public Sprites.Versions.GenerationII getGenerationII() {
            return generationII;
        }

        /**
         * Define el valor de la propiedad generationII.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationII }
         *     
         */
        public void setGenerationII(Sprites.Versions.GenerationII value) {
            this.generationII = value;
        }

        /**
         * Obtiene el valor de la propiedad generationIII.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationIII }
         *     
         */
        public Sprites.Versions.GenerationIII getGenerationIII() {
            return generationIII;
        }

        /**
         * Define el valor de la propiedad generationIII.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationIII }
         *     
         */
        public void setGenerationIII(Sprites.Versions.GenerationIII value) {
            this.generationIII = value;
        }

        /**
         * Obtiene el valor de la propiedad generationIV.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationIV }
         *     
         */
        public Sprites.Versions.GenerationIV getGenerationIV() {
            return generationIV;
        }

        /**
         * Define el valor de la propiedad generationIV.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationIV }
         *     
         */
        public void setGenerationIV(Sprites.Versions.GenerationIV value) {
            this.generationIV = value;
        }

        /**
         * Obtiene el valor de la propiedad generationV.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationV }
         *     
         */
        public Sprites.Versions.GenerationV getGenerationV() {
            return generationV;
        }

        /**
         * Define el valor de la propiedad generationV.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationV }
         *     
         */
        public void setGenerationV(Sprites.Versions.GenerationV value) {
            this.generationV = value;
        }

        /**
         * Obtiene el valor de la propiedad generationVI.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationVI }
         *     
         */
        public Sprites.Versions.GenerationVI getGenerationVI() {
            return generationVI;
        }

        /**
         * Define el valor de la propiedad generationVI.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationVI }
         *     
         */
        public void setGenerationVI(Sprites.Versions.GenerationVI value) {
            this.generationVI = value;
        }

        /**
         * Obtiene el valor de la propiedad generationVII.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationVII }
         *     
         */
        public Sprites.Versions.GenerationVII getGenerationVII() {
            return generationVII;
        }

        /**
         * Define el valor de la propiedad generationVII.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationVII }
         *     
         */
        public void setGenerationVII(Sprites.Versions.GenerationVII value) {
            this.generationVII = value;
        }

        /**
         * Obtiene el valor de la propiedad generationVIII.
         * 
         * @return
         *     possible object is
         *     {@link Sprites.Versions.GenerationVIII }
         *     
         */
        public Sprites.Versions.GenerationVIII getGenerationVIII() {
            return generationVIII;
        }

        /**
         * Define el valor de la propiedad generationVIII.
         * 
         * @param value
         *     allowed object is
         *     {@link Sprites.Versions.GenerationVIII }
         *     
         */
        public void setGenerationVIII(Sprites.Versions.GenerationVIII value) {
            this.generationVIII = value;
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
         *         &lt;element name="RedBlue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Yellow">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "redBlue",
            "yellow"
        })
        public static class GenerationI {

            @XmlElement(name = "RedBlue", required = true)
            protected Sprites.Versions.GenerationI.RedBlue redBlue;
            @XmlElement(name = "Yellow", required = true)
            protected Sprites.Versions.GenerationI.Yellow yellow;

            /**
             * Obtiene el valor de la propiedad redBlue.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationI.RedBlue }
             *     
             */
            public Sprites.Versions.GenerationI.RedBlue getRedBlue() {
                return redBlue;
            }

            /**
             * Define el valor de la propiedad redBlue.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationI.RedBlue }
             *     
             */
            public void setRedBlue(Sprites.Versions.GenerationI.RedBlue value) {
                this.redBlue = value;
            }

            /**
             * Obtiene el valor de la propiedad yellow.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationI.Yellow }
             *     
             */
            public Sprites.Versions.GenerationI.Yellow getYellow() {
                return yellow;
            }

            /**
             * Define el valor de la propiedad yellow.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationI.Yellow }
             *     
             */
            public void setYellow(Sprites.Versions.GenerationI.Yellow value) {
                this.yellow = value;
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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backGray",
                "backTransparent",
                "frontDefault",
                "frontGray",
                "frontTransparent"
            })
            public static class RedBlue {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_gray", required = true)
                protected String backGray;
                @XmlElement(name = "back_transparent", required = true)
                protected String backTransparent;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_gray", required = true)
                protected String frontGray;
                @XmlElement(name = "front_transparent", required = true)
                protected String frontTransparent;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backGray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackGray() {
                    return backGray;
                }

                /**
                 * Define el valor de la propiedad backGray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackGray(String value) {
                    this.backGray = value;
                }

                /**
                 * Obtiene el valor de la propiedad backTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackTransparent() {
                    return backTransparent;
                }

                /**
                 * Define el valor de la propiedad backTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackTransparent(String value) {
                    this.backTransparent = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontGray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontGray() {
                    return frontGray;
                }

                /**
                 * Define el valor de la propiedad frontGray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontGray(String value) {
                    this.frontGray = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontTransparent() {
                    return frontTransparent;
                }

                /**
                 * Define el valor de la propiedad frontTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontTransparent(String value) {
                    this.frontTransparent = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_gray" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backGray",
                "backTransparent",
                "frontDefault",
                "frontGray",
                "frontTransparent"
            })
            public static class Yellow {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_gray", required = true)
                protected String backGray;
                @XmlElement(name = "back_transparent", required = true)
                protected String backTransparent;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_gray", required = true)
                protected String frontGray;
                @XmlElement(name = "front_transparent", required = true)
                protected String frontTransparent;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backGray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackGray() {
                    return backGray;
                }

                /**
                 * Define el valor de la propiedad backGray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackGray(String value) {
                    this.backGray = value;
                }

                /**
                 * Obtiene el valor de la propiedad backTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackTransparent() {
                    return backTransparent;
                }

                /**
                 * Define el valor de la propiedad backTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackTransparent(String value) {
                    this.backTransparent = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontGray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontGray() {
                    return frontGray;
                }

                /**
                 * Define el valor de la propiedad frontGray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontGray(String value) {
                    this.frontGray = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontTransparent() {
                    return frontTransparent;
                }

                /**
                 * Define el valor de la propiedad frontTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontTransparent(String value) {
                    this.frontTransparent = value;
                }

            }

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
         *         &lt;element name="crystal">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="gold">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="silver">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "crystal",
            "gold",
            "silver"
        })
        public static class GenerationII {

            @XmlElement(required = true)
            protected Sprites.Versions.GenerationII.Crystal crystal;
            @XmlElement(required = true)
            protected Sprites.Versions.GenerationII.Gold gold;
            @XmlElement(required = true)
            protected Sprites.Versions.GenerationII.Silver silver;

            /**
             * Obtiene el valor de la propiedad crystal.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationII.Crystal }
             *     
             */
            public Sprites.Versions.GenerationII.Crystal getCrystal() {
                return crystal;
            }

            /**
             * Define el valor de la propiedad crystal.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationII.Crystal }
             *     
             */
            public void setCrystal(Sprites.Versions.GenerationII.Crystal value) {
                this.crystal = value;
            }

            /**
             * Obtiene el valor de la propiedad gold.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationII.Gold }
             *     
             */
            public Sprites.Versions.GenerationII.Gold getGold() {
                return gold;
            }

            /**
             * Define el valor de la propiedad gold.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationII.Gold }
             *     
             */
            public void setGold(Sprites.Versions.GenerationII.Gold value) {
                this.gold = value;
            }

            /**
             * Obtiene el valor de la propiedad silver.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationII.Silver }
             *     
             */
            public Sprites.Versions.GenerationII.Silver getSilver() {
                return silver;
            }

            /**
             * Define el valor de la propiedad silver.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationII.Silver }
             *     
             */
            public void setSilver(Sprites.Versions.GenerationII.Silver value) {
                this.silver = value;
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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backShiny",
                "backShinyTransparent",
                "backTransparent",
                "frontDefault",
                "frontShiny",
                "frontShinyTransparent",
                "frontTransparent"
            })
            public static class Crystal {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "back_shiny_transparent", required = true)
                protected String backShinyTransparent;
                @XmlElement(name = "back_transparent", required = true)
                protected String backTransparent;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_transparent", required = true)
                protected String frontShinyTransparent;
                @XmlElement(name = "front_transparent", required = true)
                protected String frontTransparent;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShinyTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShinyTransparent() {
                    return backShinyTransparent;
                }

                /**
                 * Define el valor de la propiedad backShinyTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShinyTransparent(String value) {
                    this.backShinyTransparent = value;
                }

                /**
                 * Obtiene el valor de la propiedad backTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackTransparent() {
                    return backTransparent;
                }

                /**
                 * Define el valor de la propiedad backTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackTransparent(String value) {
                    this.backTransparent = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyTransparent() {
                    return frontShinyTransparent;
                }

                /**
                 * Define el valor de la propiedad frontShinyTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyTransparent(String value) {
                    this.frontShinyTransparent = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontTransparent() {
                    return frontTransparent;
                }

                /**
                 * Define el valor de la propiedad frontTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontTransparent(String value) {
                    this.frontTransparent = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backShiny",
                "frontDefault",
                "frontShiny",
                "frontTransparent"
            })
            public static class Gold {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_transparent", required = true)
                protected String frontTransparent;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontTransparent() {
                    return frontTransparent;
                }

                /**
                 * Define el valor de la propiedad frontTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontTransparent(String value) {
                    this.frontTransparent = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_transparent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backShiny",
                "frontDefault",
                "frontShiny",
                "frontTransparent"
            })
            public static class Silver {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_transparent", required = true)
                protected String frontTransparent;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontTransparent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontTransparent() {
                    return frontTransparent;
                }

                /**
                 * Define el valor de la propiedad frontTransparent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontTransparent(String value) {
                    this.frontTransparent = value;
                }

            }

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
         *         &lt;element name="emerald">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="firered-leafgreen">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ruby-sapphire">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "emerald",
            "fireredLeafgreen",
            "rubySapphire"
        })
        public static class GenerationIII {

            @XmlElement(required = true)
            protected Sprites.Versions.GenerationIII.Emerald emerald;
            @XmlElement(name = "firered-leafgreen", required = true)
            protected Sprites.Versions.GenerationIII.FireredLeafgreen fireredLeafgreen;
            @XmlElement(name = "ruby-sapphire", required = true)
            protected Sprites.Versions.GenerationIII.RubySapphire rubySapphire;

            /**
             * Obtiene el valor de la propiedad emerald.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationIII.Emerald }
             *     
             */
            public Sprites.Versions.GenerationIII.Emerald getEmerald() {
                return emerald;
            }

            /**
             * Define el valor de la propiedad emerald.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationIII.Emerald }
             *     
             */
            public void setEmerald(Sprites.Versions.GenerationIII.Emerald value) {
                this.emerald = value;
            }

            /**
             * Obtiene el valor de la propiedad fireredLeafgreen.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationIII.FireredLeafgreen }
             *     
             */
            public Sprites.Versions.GenerationIII.FireredLeafgreen getFireredLeafgreen() {
                return fireredLeafgreen;
            }

            /**
             * Define el valor de la propiedad fireredLeafgreen.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationIII.FireredLeafgreen }
             *     
             */
            public void setFireredLeafgreen(Sprites.Versions.GenerationIII.FireredLeafgreen value) {
                this.fireredLeafgreen = value;
            }

            /**
             * Obtiene el valor de la propiedad rubySapphire.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationIII.RubySapphire }
             *     
             */
            public Sprites.Versions.GenerationIII.RubySapphire getRubySapphire() {
                return rubySapphire;
            }

            /**
             * Define el valor de la propiedad rubySapphire.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationIII.RubySapphire }
             *     
             */
            public void setRubySapphire(Sprites.Versions.GenerationIII.RubySapphire value) {
                this.rubySapphire = value;
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
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "frontDefault",
                "frontShiny"
            })
            public static class Emerald {

                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backShiny",
                "frontDefault",
                "frontShiny"
            })
            public static class FireredLeafgreen {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backShiny",
                "frontDefault",
                "frontShiny"
            })
            public static class RubySapphire {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

            }

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
         *         &lt;element name="diamond-pearl">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="heartgold-soulsilver">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="platinum">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "diamondPearl",
            "heartgoldSoulsilver",
            "platinum"
        })
        public static class GenerationIV {

            @XmlElement(name = "diamond-pearl", required = true)
            protected Sprites.Versions.GenerationIV.DiamondPearl diamondPearl;
            @XmlElement(name = "heartgold-soulsilver", required = true)
            protected Sprites.Versions.GenerationIV.HeartgoldSoulsilver heartgoldSoulsilver;
            @XmlElement(required = true)
            protected Sprites.Versions.GenerationIV.Platinum platinum;

            /**
             * Obtiene el valor de la propiedad diamondPearl.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationIV.DiamondPearl }
             *     
             */
            public Sprites.Versions.GenerationIV.DiamondPearl getDiamondPearl() {
                return diamondPearl;
            }

            /**
             * Define el valor de la propiedad diamondPearl.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationIV.DiamondPearl }
             *     
             */
            public void setDiamondPearl(Sprites.Versions.GenerationIV.DiamondPearl value) {
                this.diamondPearl = value;
            }

            /**
             * Obtiene el valor de la propiedad heartgoldSoulsilver.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationIV.HeartgoldSoulsilver }
             *     
             */
            public Sprites.Versions.GenerationIV.HeartgoldSoulsilver getHeartgoldSoulsilver() {
                return heartgoldSoulsilver;
            }

            /**
             * Define el valor de la propiedad heartgoldSoulsilver.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationIV.HeartgoldSoulsilver }
             *     
             */
            public void setHeartgoldSoulsilver(Sprites.Versions.GenerationIV.HeartgoldSoulsilver value) {
                this.heartgoldSoulsilver = value;
            }

            /**
             * Obtiene el valor de la propiedad platinum.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationIV.Platinum }
             *     
             */
            public Sprites.Versions.GenerationIV.Platinum getPlatinum() {
                return platinum;
            }

            /**
             * Define el valor de la propiedad platinum.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationIV.Platinum }
             *     
             */
            public void setPlatinum(Sprites.Versions.GenerationIV.Platinum value) {
                this.platinum = value;
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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backFemale",
                "backShiny",
                "backShinyFemale",
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class DiamondPearl {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_female", required = true)
                protected String backFemale;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "back_shiny_female", required = true)
                protected String backShinyFemale;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackFemale() {
                    return backFemale;
                }

                /**
                 * Define el valor de la propiedad backFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackFemale(String value) {
                    this.backFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShinyFemale() {
                    return backShinyFemale;
                }

                /**
                 * Define el valor de la propiedad backShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShinyFemale(String value) {
                    this.backShinyFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backFemale",
                "backShiny",
                "backShinyFemale",
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class HeartgoldSoulsilver {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_female", required = true)
                protected String backFemale;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "back_shiny_female", required = true)
                protected String backShinyFemale;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackFemale() {
                    return backFemale;
                }

                /**
                 * Define el valor de la propiedad backFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackFemale(String value) {
                    this.backFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShinyFemale() {
                    return backShinyFemale;
                }

                /**
                 * Define el valor de la propiedad backShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShinyFemale(String value) {
                    this.backShinyFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
                }

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
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "backDefault",
                "backFemale",
                "backShiny",
                "backShinyFemale",
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class Platinum {

                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_female", required = true)
                protected String backFemale;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "back_shiny_female", required = true)
                protected String backShinyFemale;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackFemale() {
                    return backFemale;
                }

                /**
                 * Define el valor de la propiedad backFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackFemale(String value) {
                    this.backFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShinyFemale() {
                    return backShinyFemale;
                }

                /**
                 * Define el valor de la propiedad backShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShinyFemale(String value) {
                    this.backShinyFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
                }

            }

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
         *         &lt;element name="black-white">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="animated">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "blackWhite"
        })
        public static class GenerationV {

            @XmlElement(name = "black-white", required = true)
            protected Sprites.Versions.GenerationV.BlackWhite blackWhite;

            /**
             * Obtiene el valor de la propiedad blackWhite.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationV.BlackWhite }
             *     
             */
            public Sprites.Versions.GenerationV.BlackWhite getBlackWhite() {
                return blackWhite;
            }

            /**
             * Define el valor de la propiedad blackWhite.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationV.BlackWhite }
             *     
             */
            public void setBlackWhite(Sprites.Versions.GenerationV.BlackWhite value) {
                this.blackWhite = value;
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
             *         &lt;element name="animated">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "animated",
                "backDefault",
                "backFemale",
                "backShiny",
                "backShinyFemale",
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class BlackWhite {

                @XmlElement(required = true)
                protected Sprites.Versions.GenerationV.BlackWhite.Animated animated;
                @XmlElement(name = "back_default", required = true)
                protected String backDefault;
                @XmlElement(name = "back_female", required = true)
                protected String backFemale;
                @XmlElement(name = "back_shiny", required = true)
                protected String backShiny;
                @XmlElement(name = "back_shiny_female", required = true)
                protected String backShinyFemale;
                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad animated.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Sprites.Versions.GenerationV.BlackWhite.Animated }
                 *     
                 */
                public Sprites.Versions.GenerationV.BlackWhite.Animated getAnimated() {
                    return animated;
                }

                /**
                 * Define el valor de la propiedad animated.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Sprites.Versions.GenerationV.BlackWhite.Animated }
                 *     
                 */
                public void setAnimated(Sprites.Versions.GenerationV.BlackWhite.Animated value) {
                    this.animated = value;
                }

                /**
                 * Obtiene el valor de la propiedad backDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackDefault() {
                    return backDefault;
                }

                /**
                 * Define el valor de la propiedad backDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackDefault(String value) {
                    this.backDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad backFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackFemale() {
                    return backFemale;
                }

                /**
                 * Define el valor de la propiedad backFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackFemale(String value) {
                    this.backFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShiny() {
                    return backShiny;
                }

                /**
                 * Define el valor de la propiedad backShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShiny(String value) {
                    this.backShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad backShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackShinyFemale() {
                    return backShinyFemale;
                }

                /**
                 * Define el valor de la propiedad backShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackShinyFemale(String value) {
                    this.backShinyFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
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
                 *         &lt;element name="back_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="back_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="back_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="back_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "backDefault",
                    "backFemale",
                    "backShiny",
                    "backShinyFemale",
                    "frontDefault",
                    "frontFemale",
                    "frontShiny",
                    "frontShinyFemale"
                })
                public static class Animated {

                    @XmlElement(name = "back_default", required = true)
                    protected String backDefault;
                    @XmlElement(name = "back_female", required = true)
                    protected String backFemale;
                    @XmlElement(name = "back_shiny", required = true)
                    protected String backShiny;
                    @XmlElement(name = "back_shiny_female", required = true)
                    protected String backShinyFemale;
                    @XmlElement(name = "front_default", required = true)
                    protected String frontDefault;
                    @XmlElement(name = "front_female", required = true)
                    protected String frontFemale;
                    @XmlElement(name = "front_shiny", required = true)
                    protected String frontShiny;
                    @XmlElement(name = "front_shiny_female", required = true)
                    protected String frontShinyFemale;

                    /**
                     * Obtiene el valor de la propiedad backDefault.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBackDefault() {
                        return backDefault;
                    }

                    /**
                     * Define el valor de la propiedad backDefault.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBackDefault(String value) {
                        this.backDefault = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad backFemale.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBackFemale() {
                        return backFemale;
                    }

                    /**
                     * Define el valor de la propiedad backFemale.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBackFemale(String value) {
                        this.backFemale = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad backShiny.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBackShiny() {
                        return backShiny;
                    }

                    /**
                     * Define el valor de la propiedad backShiny.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBackShiny(String value) {
                        this.backShiny = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad backShinyFemale.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBackShinyFemale() {
                        return backShinyFemale;
                    }

                    /**
                     * Define el valor de la propiedad backShinyFemale.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBackShinyFemale(String value) {
                        this.backShinyFemale = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad frontDefault.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrontDefault() {
                        return frontDefault;
                    }

                    /**
                     * Define el valor de la propiedad frontDefault.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrontDefault(String value) {
                        this.frontDefault = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad frontFemale.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrontFemale() {
                        return frontFemale;
                    }

                    /**
                     * Define el valor de la propiedad frontFemale.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrontFemale(String value) {
                        this.frontFemale = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad frontShiny.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrontShiny() {
                        return frontShiny;
                    }

                    /**
                     * Define el valor de la propiedad frontShiny.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrontShiny(String value) {
                        this.frontShiny = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad frontShinyFemale.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrontShinyFemale() {
                        return frontShinyFemale;
                    }

                    /**
                     * Define el valor de la propiedad frontShinyFemale.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrontShinyFemale(String value) {
                        this.frontShinyFemale = value;
                    }

                }

            }

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
         *         &lt;element name="omegaruby-alphasapphire">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="x-y">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "omegarubyAlphasapphire",
            "xy"
        })
        public static class GenerationVI {

            @XmlElement(name = "omegaruby-alphasapphire", required = true)
            protected Sprites.Versions.GenerationVI.OmegarubyAlphasapphire omegarubyAlphasapphire;
            @XmlElement(name = "x-y", required = true)
            protected Sprites.Versions.GenerationVI.XY xy;

            /**
             * Obtiene el valor de la propiedad omegarubyAlphasapphire.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationVI.OmegarubyAlphasapphire }
             *     
             */
            public Sprites.Versions.GenerationVI.OmegarubyAlphasapphire getOmegarubyAlphasapphire() {
                return omegarubyAlphasapphire;
            }

            /**
             * Define el valor de la propiedad omegarubyAlphasapphire.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationVI.OmegarubyAlphasapphire }
             *     
             */
            public void setOmegarubyAlphasapphire(Sprites.Versions.GenerationVI.OmegarubyAlphasapphire value) {
                this.omegarubyAlphasapphire = value;
            }

            /**
             * Obtiene el valor de la propiedad xy.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationVI.XY }
             *     
             */
            public Sprites.Versions.GenerationVI.XY getXY() {
                return xy;
            }

            /**
             * Define el valor de la propiedad xy.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationVI.XY }
             *     
             */
            public void setXY(Sprites.Versions.GenerationVI.XY value) {
                this.xy = value;
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
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class OmegarubyAlphasapphire {

                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
                }

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
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class XY {

                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
                }

            }

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
         *         &lt;element name="icons">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ultra-sun-ultra-moon">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "icons",
            "ultraSunUltraMoon"
        })
        public static class GenerationVII {

            @XmlElement(required = true)
            protected Sprites.Versions.GenerationVII.Icons icons;
            @XmlElement(name = "ultra-sun-ultra-moon", required = true)
            protected Sprites.Versions.GenerationVII.UltraSunUltraMoon ultraSunUltraMoon;

            /**
             * Obtiene el valor de la propiedad icons.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationVII.Icons }
             *     
             */
            public Sprites.Versions.GenerationVII.Icons getIcons() {
                return icons;
            }

            /**
             * Define el valor de la propiedad icons.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationVII.Icons }
             *     
             */
            public void setIcons(Sprites.Versions.GenerationVII.Icons value) {
                this.icons = value;
            }

            /**
             * Obtiene el valor de la propiedad ultraSunUltraMoon.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationVII.UltraSunUltraMoon }
             *     
             */
            public Sprites.Versions.GenerationVII.UltraSunUltraMoon getUltraSunUltraMoon() {
                return ultraSunUltraMoon;
            }

            /**
             * Define el valor de la propiedad ultraSunUltraMoon.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationVII.UltraSunUltraMoon }
             *     
             */
            public void setUltraSunUltraMoon(Sprites.Versions.GenerationVII.UltraSunUltraMoon value) {
                this.ultraSunUltraMoon = value;
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
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "frontDefault",
                "frontFemale"
            })
            public static class Icons {

                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

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
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_shiny_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "frontDefault",
                "frontFemale",
                "frontShiny",
                "frontShinyFemale"
            })
            public static class UltraSunUltraMoon {

                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;
                @XmlElement(name = "front_shiny", required = true)
                protected String frontShiny;
                @XmlElement(name = "front_shiny_female", required = true)
                protected String frontShinyFemale;

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShiny.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShiny() {
                    return frontShiny;
                }

                /**
                 * Define el valor de la propiedad frontShiny.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShiny(String value) {
                    this.frontShiny = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontShinyFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontShinyFemale() {
                    return frontShinyFemale;
                }

                /**
                 * Define el valor de la propiedad frontShinyFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontShinyFemale(String value) {
                    this.frontShinyFemale = value;
                }

            }

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
         *         &lt;element name="icons">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "icons"
        })
        public static class GenerationVIII {

            @XmlElement(required = true)
            protected Sprites.Versions.GenerationVIII.Icons icons;

            /**
             * Obtiene el valor de la propiedad icons.
             * 
             * @return
             *     possible object is
             *     {@link Sprites.Versions.GenerationVIII.Icons }
             *     
             */
            public Sprites.Versions.GenerationVIII.Icons getIcons() {
                return icons;
            }

            /**
             * Define el valor de la propiedad icons.
             * 
             * @param value
             *     allowed object is
             *     {@link Sprites.Versions.GenerationVIII.Icons }
             *     
             */
            public void setIcons(Sprites.Versions.GenerationVIII.Icons value) {
                this.icons = value;
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
             *         &lt;element name="front_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="front_female" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "frontDefault",
                "frontFemale"
            })
            public static class Icons {

                @XmlElement(name = "front_default", required = true)
                protected String frontDefault;
                @XmlElement(name = "front_female", required = true)
                protected String frontFemale;

                /**
                 * Obtiene el valor de la propiedad frontDefault.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontDefault() {
                    return frontDefault;
                }

                /**
                 * Define el valor de la propiedad frontDefault.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontDefault(String value) {
                    this.frontDefault = value;
                }

                /**
                 * Obtiene el valor de la propiedad frontFemale.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrontFemale() {
                    return frontFemale;
                }

                /**
                 * Define el valor de la propiedad frontFemale.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrontFemale(String value) {
                    this.frontFemale = value;
                }

            }

        }

    }

}
