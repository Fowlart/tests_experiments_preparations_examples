/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.sephora.services.reservation.avro.audit;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ServiceDetailsAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7161809114151801930L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ServiceDetailsAvro\",\"namespace\":\"com.sephora.services.reservation.avro.audit\",\"fields\":[{\"name\":\"activityType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"storeBaId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isBaChosenByClient\",\"type\":\"boolean\",\"default\":false},{\"name\":\"activityId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"storeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"skuId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"startDateTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cancelChargeHours\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tipIncluded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"tipAmount\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orderXrefId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ServiceDetailsAvro> ENCODER =
      new BinaryMessageEncoder<ServiceDetailsAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ServiceDetailsAvro> DECODER =
      new BinaryMessageDecoder<ServiceDetailsAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ServiceDetailsAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ServiceDetailsAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ServiceDetailsAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ServiceDetailsAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ServiceDetailsAvro from a ByteBuffer. */
  public static ServiceDetailsAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public CharSequence activityType;
  @Deprecated public CharSequence storeBaId;
  @Deprecated public boolean isBaChosenByClient;
  @Deprecated public CharSequence activityId;
  @Deprecated public CharSequence storeId;
  @Deprecated public CharSequence skuId;
  @Deprecated public CharSequence startDateTime;
  @Deprecated public CharSequence cancelChargeHours;
  @Deprecated public CharSequence eventType;
  @Deprecated public boolean tipIncluded;
  @Deprecated public CharSequence tipAmount;
  @Deprecated public CharSequence orderXrefId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ServiceDetailsAvro() {}

  /**
   * All-args constructor.
   * @param activityType The new value for activityType
   * @param storeBaId The new value for storeBaId
   * @param isBaChosenByClient The new value for isBaChosenByClient
   * @param activityId The new value for activityId
   * @param storeId The new value for storeId
   * @param skuId The new value for skuId
   * @param startDateTime The new value for startDateTime
   * @param cancelChargeHours The new value for cancelChargeHours
   * @param eventType The new value for eventType
   * @param tipIncluded The new value for tipIncluded
   * @param tipAmount The new value for tipAmount
   * @param orderXrefId The new value for orderXrefId
   */
  public ServiceDetailsAvro(CharSequence activityType, CharSequence storeBaId, Boolean isBaChosenByClient, CharSequence activityId, CharSequence storeId, CharSequence skuId, CharSequence startDateTime, CharSequence cancelChargeHours, CharSequence eventType, Boolean tipIncluded, CharSequence tipAmount, CharSequence orderXrefId) {
    this.activityType = activityType;
    this.storeBaId = storeBaId;
    this.isBaChosenByClient = isBaChosenByClient;
    this.activityId = activityId;
    this.storeId = storeId;
    this.skuId = skuId;
    this.startDateTime = startDateTime;
    this.cancelChargeHours = cancelChargeHours;
    this.eventType = eventType;
    this.tipIncluded = tipIncluded;
    this.tipAmount = tipAmount;
    this.orderXrefId = orderXrefId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return activityType;
    case 1: return storeBaId;
    case 2: return isBaChosenByClient;
    case 3: return activityId;
    case 4: return storeId;
    case 5: return skuId;
    case 6: return startDateTime;
    case 7: return cancelChargeHours;
    case 8: return eventType;
    case 9: return tipIncluded;
    case 10: return tipAmount;
    case 11: return orderXrefId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: activityType = (CharSequence)value$; break;
    case 1: storeBaId = (CharSequence)value$; break;
    case 2: isBaChosenByClient = (Boolean)value$; break;
    case 3: activityId = (CharSequence)value$; break;
    case 4: storeId = (CharSequence)value$; break;
    case 5: skuId = (CharSequence)value$; break;
    case 6: startDateTime = (CharSequence)value$; break;
    case 7: cancelChargeHours = (CharSequence)value$; break;
    case 8: eventType = (CharSequence)value$; break;
    case 9: tipIncluded = (Boolean)value$; break;
    case 10: tipAmount = (CharSequence)value$; break;
    case 11: orderXrefId = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'activityType' field.
   * @return The value of the 'activityType' field.
   */
  public CharSequence getActivityType() {
    return activityType;
  }

  /**
   * Sets the value of the 'activityType' field.
   * @param value the value to set.
   */
  public void setActivityType(CharSequence value) {
    this.activityType = value;
  }

  /**
   * Gets the value of the 'storeBaId' field.
   * @return The value of the 'storeBaId' field.
   */
  public CharSequence getStoreBaId() {
    return storeBaId;
  }

  /**
   * Sets the value of the 'storeBaId' field.
   * @param value the value to set.
   */
  public void setStoreBaId(CharSequence value) {
    this.storeBaId = value;
  }

  /**
   * Gets the value of the 'isBaChosenByClient' field.
   * @return The value of the 'isBaChosenByClient' field.
   */
  public Boolean getIsBaChosenByClient() {
    return isBaChosenByClient;
  }

  /**
   * Sets the value of the 'isBaChosenByClient' field.
   * @param value the value to set.
   */
  public void setIsBaChosenByClient(Boolean value) {
    this.isBaChosenByClient = value;
  }

  /**
   * Gets the value of the 'activityId' field.
   * @return The value of the 'activityId' field.
   */
  public CharSequence getActivityId() {
    return activityId;
  }

  /**
   * Sets the value of the 'activityId' field.
   * @param value the value to set.
   */
  public void setActivityId(CharSequence value) {
    this.activityId = value;
  }

  /**
   * Gets the value of the 'storeId' field.
   * @return The value of the 'storeId' field.
   */
  public CharSequence getStoreId() {
    return storeId;
  }

  /**
   * Sets the value of the 'storeId' field.
   * @param value the value to set.
   */
  public void setStoreId(CharSequence value) {
    this.storeId = value;
  }

  /**
   * Gets the value of the 'skuId' field.
   * @return The value of the 'skuId' field.
   */
  public CharSequence getSkuId() {
    return skuId;
  }

  /**
   * Sets the value of the 'skuId' field.
   * @param value the value to set.
   */
  public void setSkuId(CharSequence value) {
    this.skuId = value;
  }

  /**
   * Gets the value of the 'startDateTime' field.
   * @return The value of the 'startDateTime' field.
   */
  public CharSequence getStartDateTime() {
    return startDateTime;
  }

  /**
   * Sets the value of the 'startDateTime' field.
   * @param value the value to set.
   */
  public void setStartDateTime(CharSequence value) {
    this.startDateTime = value;
  }

  /**
   * Gets the value of the 'cancelChargeHours' field.
   * @return The value of the 'cancelChargeHours' field.
   */
  public CharSequence getCancelChargeHours() {
    return cancelChargeHours;
  }

  /**
   * Sets the value of the 'cancelChargeHours' field.
   * @param value the value to set.
   */
  public void setCancelChargeHours(CharSequence value) {
    this.cancelChargeHours = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public CharSequence getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(CharSequence value) {
    this.eventType = value;
  }

  /**
   * Gets the value of the 'tipIncluded' field.
   * @return The value of the 'tipIncluded' field.
   */
  public Boolean getTipIncluded() {
    return tipIncluded;
  }

  /**
   * Sets the value of the 'tipIncluded' field.
   * @param value the value to set.
   */
  public void setTipIncluded(Boolean value) {
    this.tipIncluded = value;
  }

  /**
   * Gets the value of the 'tipAmount' field.
   * @return The value of the 'tipAmount' field.
   */
  public CharSequence getTipAmount() {
    return tipAmount;
  }

  /**
   * Sets the value of the 'tipAmount' field.
   * @param value the value to set.
   */
  public void setTipAmount(CharSequence value) {
    this.tipAmount = value;
  }

  /**
   * Gets the value of the 'orderXrefId' field.
   * @return The value of the 'orderXrefId' field.
   */
  public CharSequence getOrderXrefId() {
    return orderXrefId;
  }

  /**
   * Sets the value of the 'orderXrefId' field.
   * @param value the value to set.
   */
  public void setOrderXrefId(CharSequence value) {
    this.orderXrefId = value;
  }

  /**
   * Creates a new ServiceDetailsAvro RecordBuilder.
   * @return A new ServiceDetailsAvro RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new ServiceDetailsAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ServiceDetailsAvro RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new ServiceDetailsAvro RecordBuilder by copying an existing ServiceDetailsAvro instance.
   * @param other The existing instance to copy.
   * @return A new ServiceDetailsAvro RecordBuilder
   */
  public static Builder newBuilder(ServiceDetailsAvro other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for ServiceDetailsAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ServiceDetailsAvro>
    implements org.apache.avro.data.RecordBuilder<ServiceDetailsAvro> {

    private CharSequence activityType;
    private CharSequence storeBaId;
    private boolean isBaChosenByClient;
    private CharSequence activityId;
    private CharSequence storeId;
    private CharSequence skuId;
    private CharSequence startDateTime;
    private CharSequence cancelChargeHours;
    private CharSequence eventType;
    private boolean tipIncluded;
    private CharSequence tipAmount;
    private CharSequence orderXrefId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.activityType)) {
        this.activityType = data().deepCopy(fields()[0].schema(), other.activityType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.storeBaId)) {
        this.storeBaId = data().deepCopy(fields()[1].schema(), other.storeBaId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isBaChosenByClient)) {
        this.isBaChosenByClient = data().deepCopy(fields()[2].schema(), other.isBaChosenByClient);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.activityId)) {
        this.activityId = data().deepCopy(fields()[3].schema(), other.activityId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.storeId)) {
        this.storeId = data().deepCopy(fields()[4].schema(), other.storeId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.skuId)) {
        this.skuId = data().deepCopy(fields()[5].schema(), other.skuId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.startDateTime)) {
        this.startDateTime = data().deepCopy(fields()[6].schema(), other.startDateTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.cancelChargeHours)) {
        this.cancelChargeHours = data().deepCopy(fields()[7].schema(), other.cancelChargeHours);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.eventType)) {
        this.eventType = data().deepCopy(fields()[8].schema(), other.eventType);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.tipIncluded)) {
        this.tipIncluded = data().deepCopy(fields()[9].schema(), other.tipIncluded);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.tipAmount)) {
        this.tipAmount = data().deepCopy(fields()[10].schema(), other.tipAmount);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.orderXrefId)) {
        this.orderXrefId = data().deepCopy(fields()[11].schema(), other.orderXrefId);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ServiceDetailsAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(ServiceDetailsAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.activityType)) {
        this.activityType = data().deepCopy(fields()[0].schema(), other.activityType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.storeBaId)) {
        this.storeBaId = data().deepCopy(fields()[1].schema(), other.storeBaId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isBaChosenByClient)) {
        this.isBaChosenByClient = data().deepCopy(fields()[2].schema(), other.isBaChosenByClient);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.activityId)) {
        this.activityId = data().deepCopy(fields()[3].schema(), other.activityId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.storeId)) {
        this.storeId = data().deepCopy(fields()[4].schema(), other.storeId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.skuId)) {
        this.skuId = data().deepCopy(fields()[5].schema(), other.skuId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.startDateTime)) {
        this.startDateTime = data().deepCopy(fields()[6].schema(), other.startDateTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.cancelChargeHours)) {
        this.cancelChargeHours = data().deepCopy(fields()[7].schema(), other.cancelChargeHours);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.eventType)) {
        this.eventType = data().deepCopy(fields()[8].schema(), other.eventType);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.tipIncluded)) {
        this.tipIncluded = data().deepCopy(fields()[9].schema(), other.tipIncluded);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.tipAmount)) {
        this.tipAmount = data().deepCopy(fields()[10].schema(), other.tipAmount);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.orderXrefId)) {
        this.orderXrefId = data().deepCopy(fields()[11].schema(), other.orderXrefId);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'activityType' field.
      * @return The value.
      */
    public CharSequence getActivityType() {
      return activityType;
    }

    /**
      * Sets the value of the 'activityType' field.
      * @param value The value of 'activityType'.
      * @return This builder.
      */
    public Builder setActivityType(CharSequence value) {
      validate(fields()[0], value);
      this.activityType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'activityType' field has been set.
      * @return True if the 'activityType' field has been set, false otherwise.
      */
    public boolean hasActivityType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'activityType' field.
      * @return This builder.
      */
    public Builder clearActivityType() {
      activityType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeBaId' field.
      * @return The value.
      */
    public CharSequence getStoreBaId() {
      return storeBaId;
    }

    /**
      * Sets the value of the 'storeBaId' field.
      * @param value The value of 'storeBaId'.
      * @return This builder.
      */
    public Builder setStoreBaId(CharSequence value) {
      validate(fields()[1], value);
      this.storeBaId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'storeBaId' field has been set.
      * @return True if the 'storeBaId' field has been set, false otherwise.
      */
    public boolean hasStoreBaId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'storeBaId' field.
      * @return This builder.
      */
    public Builder clearStoreBaId() {
      storeBaId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'isBaChosenByClient' field.
      * @return The value.
      */
    public Boolean getIsBaChosenByClient() {
      return isBaChosenByClient;
    }

    /**
      * Sets the value of the 'isBaChosenByClient' field.
      * @param value The value of 'isBaChosenByClient'.
      * @return This builder.
      */
    public Builder setIsBaChosenByClient(boolean value) {
      validate(fields()[2], value);
      this.isBaChosenByClient = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'isBaChosenByClient' field has been set.
      * @return True if the 'isBaChosenByClient' field has been set, false otherwise.
      */
    public boolean hasIsBaChosenByClient() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'isBaChosenByClient' field.
      * @return This builder.
      */
    public Builder clearIsBaChosenByClient() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'activityId' field.
      * @return The value.
      */
    public CharSequence getActivityId() {
      return activityId;
    }

    /**
      * Sets the value of the 'activityId' field.
      * @param value The value of 'activityId'.
      * @return This builder.
      */
    public Builder setActivityId(CharSequence value) {
      validate(fields()[3], value);
      this.activityId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'activityId' field has been set.
      * @return True if the 'activityId' field has been set, false otherwise.
      */
    public boolean hasActivityId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'activityId' field.
      * @return This builder.
      */
    public Builder clearActivityId() {
      activityId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeId' field.
      * @return The value.
      */
    public CharSequence getStoreId() {
      return storeId;
    }

    /**
      * Sets the value of the 'storeId' field.
      * @param value The value of 'storeId'.
      * @return This builder.
      */
    public Builder setStoreId(CharSequence value) {
      validate(fields()[4], value);
      this.storeId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'storeId' field has been set.
      * @return True if the 'storeId' field has been set, false otherwise.
      */
    public boolean hasStoreId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'storeId' field.
      * @return This builder.
      */
    public Builder clearStoreId() {
      storeId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'skuId' field.
      * @return The value.
      */
    public CharSequence getSkuId() {
      return skuId;
    }

    /**
      * Sets the value of the 'skuId' field.
      * @param value The value of 'skuId'.
      * @return This builder.
      */
    public Builder setSkuId(CharSequence value) {
      validate(fields()[5], value);
      this.skuId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'skuId' field has been set.
      * @return True if the 'skuId' field has been set, false otherwise.
      */
    public boolean hasSkuId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'skuId' field.
      * @return This builder.
      */
    public Builder clearSkuId() {
      skuId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'startDateTime' field.
      * @return The value.
      */
    public CharSequence getStartDateTime() {
      return startDateTime;
    }

    /**
      * Sets the value of the 'startDateTime' field.
      * @param value The value of 'startDateTime'.
      * @return This builder.
      */
    public Builder setStartDateTime(CharSequence value) {
      validate(fields()[6], value);
      this.startDateTime = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'startDateTime' field has been set.
      * @return True if the 'startDateTime' field has been set, false otherwise.
      */
    public boolean hasStartDateTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'startDateTime' field.
      * @return This builder.
      */
    public Builder clearStartDateTime() {
      startDateTime = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'cancelChargeHours' field.
      * @return The value.
      */
    public CharSequence getCancelChargeHours() {
      return cancelChargeHours;
    }

    /**
      * Sets the value of the 'cancelChargeHours' field.
      * @param value The value of 'cancelChargeHours'.
      * @return This builder.
      */
    public Builder setCancelChargeHours(CharSequence value) {
      validate(fields()[7], value);
      this.cancelChargeHours = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'cancelChargeHours' field has been set.
      * @return True if the 'cancelChargeHours' field has been set, false otherwise.
      */
    public boolean hasCancelChargeHours() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'cancelChargeHours' field.
      * @return This builder.
      */
    public Builder clearCancelChargeHours() {
      cancelChargeHours = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventType' field.
      * @return The value.
      */
    public CharSequence getEventType() {
      return eventType;
    }

    /**
      * Sets the value of the 'eventType' field.
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public Builder setEventType(CharSequence value) {
      validate(fields()[8], value);
      this.eventType = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'eventType' field.
      * @return This builder.
      */
    public Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'tipIncluded' field.
      * @return The value.
      */
    public Boolean getTipIncluded() {
      return tipIncluded;
    }

    /**
      * Sets the value of the 'tipIncluded' field.
      * @param value The value of 'tipIncluded'.
      * @return This builder.
      */
    public Builder setTipIncluded(boolean value) {
      validate(fields()[9], value);
      this.tipIncluded = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'tipIncluded' field has been set.
      * @return True if the 'tipIncluded' field has been set, false otherwise.
      */
    public boolean hasTipIncluded() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'tipIncluded' field.
      * @return This builder.
      */
    public Builder clearTipIncluded() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'tipAmount' field.
      * @return The value.
      */
    public CharSequence getTipAmount() {
      return tipAmount;
    }

    /**
      * Sets the value of the 'tipAmount' field.
      * @param value The value of 'tipAmount'.
      * @return This builder.
      */
    public Builder setTipAmount(CharSequence value) {
      validate(fields()[10], value);
      this.tipAmount = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'tipAmount' field has been set.
      * @return True if the 'tipAmount' field has been set, false otherwise.
      */
    public boolean hasTipAmount() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'tipAmount' field.
      * @return This builder.
      */
    public Builder clearTipAmount() {
      tipAmount = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderXrefId' field.
      * @return The value.
      */
    public CharSequence getOrderXrefId() {
      return orderXrefId;
    }

    /**
      * Sets the value of the 'orderXrefId' field.
      * @param value The value of 'orderXrefId'.
      * @return This builder.
      */
    public Builder setOrderXrefId(CharSequence value) {
      validate(fields()[11], value);
      this.orderXrefId = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'orderXrefId' field has been set.
      * @return True if the 'orderXrefId' field has been set, false otherwise.
      */
    public boolean hasOrderXrefId() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'orderXrefId' field.
      * @return This builder.
      */
    public Builder clearOrderXrefId() {
      orderXrefId = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ServiceDetailsAvro build() {
      try {
        ServiceDetailsAvro record = new ServiceDetailsAvro();
        record.activityType = fieldSetFlags()[0] ? this.activityType : (CharSequence) defaultValue(fields()[0]);
        record.storeBaId = fieldSetFlags()[1] ? this.storeBaId : (CharSequence) defaultValue(fields()[1]);
        record.isBaChosenByClient = fieldSetFlags()[2] ? this.isBaChosenByClient : (Boolean) defaultValue(fields()[2]);
        record.activityId = fieldSetFlags()[3] ? this.activityId : (CharSequence) defaultValue(fields()[3]);
        record.storeId = fieldSetFlags()[4] ? this.storeId : (CharSequence) defaultValue(fields()[4]);
        record.skuId = fieldSetFlags()[5] ? this.skuId : (CharSequence) defaultValue(fields()[5]);
        record.startDateTime = fieldSetFlags()[6] ? this.startDateTime : (CharSequence) defaultValue(fields()[6]);
        record.cancelChargeHours = fieldSetFlags()[7] ? this.cancelChargeHours : (CharSequence) defaultValue(fields()[7]);
        record.eventType = fieldSetFlags()[8] ? this.eventType : (CharSequence) defaultValue(fields()[8]);
        record.tipIncluded = fieldSetFlags()[9] ? this.tipIncluded : (Boolean) defaultValue(fields()[9]);
        record.tipAmount = fieldSetFlags()[10] ? this.tipAmount : (CharSequence) defaultValue(fields()[10]);
        record.orderXrefId = fieldSetFlags()[11] ? this.orderXrefId : (CharSequence) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ServiceDetailsAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<ServiceDetailsAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ServiceDetailsAvro>
    READER$ = (org.apache.avro.io.DatumReader<ServiceDetailsAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
