
package com.pronetbeans.examples;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity class Businesses
 *
 * @author Adam Myatt
 */
@Entity
@Table(name = "Businesses")
@NamedQueries( {
        @NamedQuery(name = "Businesses.findByBusinessId", query = "SELECT b FROM Businesses b WHERE b.businessId = :businessId"),
        @NamedQuery(name = "Businesses.findByBusinessName", query = "SELECT b FROM Businesses b WHERE b.businessName = :businessName")
    })
public class Businesses implements Serializable {

    @Id
    @Column(name = "BUSINESS_ID", nullable = false)
    private BigDecimal businessId;

    @Column(name = "BUSINESS_NAME")
    private String businessName;

    /** Creates a new instance of Businesses */
    public Businesses() {
    }

    /**
     * Creates a new instance of Businesses with the specified values.
     * @param businessId the businessId of the Businesses
     */
    public Businesses(BigDecimal businessId) {
        this.businessId = businessId;
    }

    /**
     * Gets the businessId of this Businesses.
     * @return the businessId
     */
    public BigDecimal getBusinessId() {
        return this.businessId;
    }

    /**
     * Sets the businessId of this Businesses to the specified value.
     * @param businessId the new businessId
     */
    public void setBusinessId(BigDecimal businessId) {
        this.businessId = businessId;
    }

    /**
     * Gets the businessName of this Businesses.
     * @return the businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * Sets the businessName of this Businesses to the specified value.
     * @param businessName the new businessName
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * Returns a hash code value for the object.  This implementation computes
     * a hash code value based on the id fields in this object.
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.businessId != null ? this.businessId.hashCode() : 0);
        return hash;
    }

    /**
     * Determines whether another object is equal to this Businesses.  The result is
     * <code>true</code> if and only if the argument is not null and is a Businesses object that
     * has the same id field values as this object.
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Businesses)) {
            return false;
        }
        Businesses other = (Businesses)object;
        if (this.businessId != other.businessId && (this.businessId == null || !this.businessId.equals(other.businessId))) return false;
        return true;
    }

    /**
     * Returns a string representation of the object.  This implementation constructs
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "com.pronetbeans.examples.Businesses[businessId=" + businessId + "]";
    }

}
