//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.15 a las 10:12:31 AM CDT 
//


package com.pokeapi.soap.generation;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}abilities"/>
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}forms"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}gameIndices"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}heldItems"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}moves"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="past_types" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}Species"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}Sprites"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}stats"/>
 *         &lt;element ref="{http://www.pokeapi.com/soap/generation}types"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "abilities",
    "baseExperience",
    "forms",
    "gameIndices",
    "height",
    "heldItems",
    "id",
    "isDefault",
    "locationAreaEncounters",
    "moves",
    "name",
    "order",
    "pastTypes",
    "species",
    "sprites",
    "stats",
    "types",
    "weight"
})
@XmlRootElement(name = "pokeApi")
public class PokeApi {

    @XmlElement(required = true)
    protected Abilities abilities;
    @XmlElement(name = "base_experience")
    protected int baseExperience;
    @XmlElement(required = true)
    protected Forms forms;
    @XmlElement(required = true)
    protected GameIndices gameIndices;
    protected int height;
    @XmlElement(required = true)
    protected HeldItems heldItems;
    protected int id;
    @XmlElement(name = "is_default")
    protected boolean isDefault;
    @XmlElement(name = "location_area_encounters", required = true)
    protected String locationAreaEncounters;
    @XmlElement(required = true)
    protected Moves moves;
    @XmlElement(required = true)
    protected String name;
    protected int order;
    @XmlElement(name = "past_types")
    protected List<String> pastTypes;
    @XmlElement(name = "Species", required = true)
    protected Species species;
    @XmlElement(name = "Sprites", required = true)
    protected Sprites sprites;
    @XmlElement(required = true)
    protected Stats stats;
    @XmlElement(required = true)
    protected Types types;
    protected int weight;

    /**
     * Obtiene el valor de la propiedad abilities.
     * 
     * @return
     *     possible object is
     *     {@link Abilities }
     *     
     */
    public Abilities getAbilities() {
        return abilities;
    }

    /**
     * Define el valor de la propiedad abilities.
     * 
     * @param value
     *     allowed object is
     *     {@link Abilities }
     *     
     */
    public void setAbilities(Abilities value) {
        this.abilities = value;
    }

    /**
     * Obtiene el valor de la propiedad baseExperience.
     * 
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Define el valor de la propiedad baseExperience.
     * 
     */
    public void setBaseExperience(int value) {
        this.baseExperience = value;
    }

    /**
     * Obtiene el valor de la propiedad forms.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getForms() {
        return forms;
    }

    /**
     * Define el valor de la propiedad forms.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public void setForms(Forms value) {
        this.forms = value;
    }

    /**
     * Obtiene el valor de la propiedad gameIndices.
     * 
     * @return
     *     possible object is
     *     {@link GameIndices }
     *     
     */
    public GameIndices getGameIndices() {
        return gameIndices;
    }

    /**
     * Define el valor de la propiedad gameIndices.
     * 
     * @param value
     *     allowed object is
     *     {@link GameIndices }
     *     
     */
    public void setGameIndices(GameIndices value) {
        this.gameIndices = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

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

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad isDefault.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Define el valor de la propiedad isDefault.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad locationAreaEncounters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Define el valor de la propiedad locationAreaEncounters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreaEncounters(String value) {
        this.locationAreaEncounters = value;
    }

    /**
     * Obtiene el valor de la propiedad moves.
     * 
     * @return
     *     possible object is
     *     {@link Moves }
     *     
     */
    public Moves getMoves() {
        return moves;
    }

    /**
     * Define el valor de la propiedad moves.
     * 
     * @param value
     *     allowed object is
     *     {@link Moves }
     *     
     */
    public void setMoves(Moves value) {
        this.moves = value;
    }

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
     * Obtiene el valor de la propiedad order.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the pastTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPastTypes() {
        if (pastTypes == null) {
            pastTypes = new ArrayList<String>();
        }
        return this.pastTypes;
    }

    /**
     * Obtiene el valor de la propiedad species.
     * 
     * @return
     *     possible object is
     *     {@link Species }
     *     
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * Define el valor de la propiedad species.
     * 
     * @param value
     *     allowed object is
     *     {@link Species }
     *     
     */
    public void setSpecies(Species value) {
        this.species = value;
    }

    /**
     * Obtiene el valor de la propiedad sprites.
     * 
     * @return
     *     possible object is
     *     {@link Sprites }
     *     
     */
    public Sprites getSprites() {
        return sprites;
    }

    /**
     * Define el valor de la propiedad sprites.
     * 
     * @param value
     *     allowed object is
     *     {@link Sprites }
     *     
     */
    public void setSprites(Sprites value) {
        this.sprites = value;
    }

    /**
     * Obtiene el valor de la propiedad stats.
     * 
     * @return
     *     possible object is
     *     {@link Stats }
     *     
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Define el valor de la propiedad stats.
     * 
     * @param value
     *     allowed object is
     *     {@link Stats }
     *     
     */
    public void setStats(Stats value) {
        this.stats = value;
    }

    /**
     * Obtiene el valor de la propiedad types.
     * 
     * @return
     *     possible object is
     *     {@link Types }
     *     
     */
    public Types getTypes() {
        return types;
    }

    /**
     * Define el valor de la propiedad types.
     * 
     * @param value
     *     allowed object is
     *     {@link Types }
     *     
     */
    public void setTypes(Types value) {
        this.types = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
