package org.geotools.po.bindings;


import javax.xml.namespace.QName;

import org.geotools.po.ObjectFactory;
import org.geotools.xml.AbstractComplexBinding;
import org.geotools.xml.ElementInstance;
import org.geotools.xml.Node;

/**
 * Binding object for the type http://www.geotools.org/po:Items_item.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;xsd:complexType name="Items_item"&gt;
 *      &lt;xsd:sequence&gt;
 *          &lt;xsd:element name="productName" type="xsd:string"/&gt;
 *          &lt;xsd:element name="quantity"&gt;
 *              &lt;xsd:simpleType&gt;
 *                  &lt;xsd:restriction base="xsd:positiveInteger"&gt;
 *                      &lt;xsd:maxExclusive value="100"/&gt;
 *                  &lt;/xsd:restriction&gt;
 *              &lt;/xsd:simpleType&gt;
 *          &lt;/xsd:element&gt;
 *          &lt;xsd:element name="USPrice" type="xsd:decimal"/&gt;
 *          &lt;xsd:element minOccurs="0" ref="comment"/&gt;
 *          &lt;xsd:element minOccurs="0" name="shipDate" type="xsd:date"/&gt;
 *      &lt;/xsd:sequence&gt;
 *      &lt;xsd:attribute name="partNum" type="SKU" use="required"/&gt;
 *  &lt;/xsd:complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class Items_itemBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public Items_itemBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return PO.Items_item;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {
		
		//TODO: implement and remove call to super
		return super.parse(instance,node,value);
	}

}