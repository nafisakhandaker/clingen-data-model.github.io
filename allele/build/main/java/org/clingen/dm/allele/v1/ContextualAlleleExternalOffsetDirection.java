package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.Element;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ContextualAlleleExternalOffsetDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextualAlleleExternalOffsetDirection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;attribute name="value" type="{http://org.clingen.dm.allele.v1}ContextualAlleleExternalOffsetDirection-list" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ContextualAlleleExternalOffsetDirection")
public class ContextualAlleleExternalOffsetDirection extends Element
{

	@XmlAttribute (name = "value")
	protected ContextualAlleleExternalOffsetDirectionList value;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ContextualAlleleExternalOffsetDirectionList }
	 *     
	 */
	public ContextualAlleleExternalOffsetDirectionList getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ContextualAlleleExternalOffsetDirectionList }
	 *     
	 */
	public void setValue(ContextualAlleleExternalOffsetDirectionList value)
	{
		this.value = value;
	}

}
