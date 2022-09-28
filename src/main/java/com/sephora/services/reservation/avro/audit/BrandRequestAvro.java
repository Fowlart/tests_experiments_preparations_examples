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
public class BrandRequestAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2887252342539633287L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BrandRequestAvro\",\"namespace\":\"com.sephora.services.reservation.avro.audit\",\"fields\":[{\"name\":\"brandId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"brandName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"requestHeadCount\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"brandRepFirstName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"brandRepLastName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"brandRepEmail\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"brandRepPhone\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BrandRequestAvro> ENCODER =
      new BinaryMessageEncoder<BrandRequestAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BrandRequestAvro> DECODER =
      new BinaryMessageDecoder<BrandRequestAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BrandRequestAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BrandRequestAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BrandRequestAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BrandRequestAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BrandRequestAvro from a ByteBuffer. */
  public static BrandRequestAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public CharSequence brandId;
  @Deprecated public CharSequence brandName;
  @Deprecated public CharSequence requestHeadCount;
  @Deprecated public CharSequence brandRepFirstName;
  @Deprecated public CharSequence brandRepLastName;
  @Deprecated public CharSequence brandRepEmail;
  @Deprecated public CharSequence brandRepPhone;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BrandRequestAvro() {}

  /**
   * All-args constructor.
   * @param brandId The new value for brandId
   * @param brandName The new value for brandName
   * @param requestHeadCount The new value for requestHeadCount
   * @param brandRepFirstName The new value for brandRepFirstName
   * @param brandRepLastName The new value for brandRepLastName
   * @param brandRepEmail The new value for brandRepEmail
   * @param brandRepPhone The new value for brandRepPhone
   */
  public BrandRequestAvro(CharSequence brandId, CharSequence brandName, CharSequence requestHeadCount, CharSequence brandRepFirstName, CharSequence brandRepLastName, CharSequence brandRepEmail, CharSequence brandRepPhone) {
    this.brandId = brandId;
    this.brandName = brandName;
    this.requestHeadCount = requestHeadCount;
    this.brandRepFirstName = brandRepFirstName;
    this.brandRepLastName = brandRepLastName;
    this.brandRepEmail = brandRepEmail;
    this.brandRepPhone = brandRepPhone;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return brandId;
    case 1: return brandName;
    case 2: return requestHeadCount;
    case 3: return brandRepFirstName;
    case 4: return brandRepLastName;
    case 5: return brandRepEmail;
    case 6: return brandRepPhone;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: brandId = (CharSequence)value$; break;
    case 1: brandName = (CharSequence)value$; break;
    case 2: requestHeadCount = (CharSequence)value$; break;
    case 3: brandRepFirstName = (CharSequence)value$; break;
    case 4: brandRepLastName = (CharSequence)value$; break;
    case 5: brandRepEmail = (CharSequence)value$; break;
    case 6: brandRepPhone = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'brandId' field.
   * @return The value of the 'brandId' field.
   */
  public CharSequence getBrandId() {
    return brandId;
  }

  /**
   * Sets the value of the 'brandId' field.
   * @param value the value to set.
   */
  public void setBrandId(CharSequence value) {
    this.brandId = value;
  }

  /**
   * Gets the value of the 'brandName' field.
   * @return The value of the 'brandName' field.
   */
  public CharSequence getBrandName() {
    return brandName;
  }

  /**
   * Sets the value of the 'brandName' field.
   * @param value the value to set.
   */
  public void setBrandName(CharSequence value) {
    this.brandName = value;
  }

  /**
   * Gets the value of the 'requestHeadCount' field.
   * @return The value of the 'requestHeadCount' field.
   */
  public CharSequence getRequestHeadCount() {
    return requestHeadCount;
  }

  /**
   * Sets the value of the 'requestHeadCount' field.
   * @param value the value to set.
   */
  public void setRequestHeadCount(CharSequence value) {
    this.requestHeadCount = value;
  }

  /**
   * Gets the value of the 'brandRepFirstName' field.
   * @return The value of the 'brandRepFirstName' field.
   */
  public CharSequence getBrandRepFirstName() {
    return brandRepFirstName;
  }

  /**
   * Sets the value of the 'brandRepFirstName' field.
   * @param value the value to set.
   */
  public void setBrandRepFirstName(CharSequence value) {
    this.brandRepFirstName = value;
  }

  /**
   * Gets the value of the 'brandRepLastName' field.
   * @return The value of the 'brandRepLastName' field.
   */
  public CharSequence getBrandRepLastName() {
    return brandRepLastName;
  }

  /**
   * Sets the value of the 'brandRepLastName' field.
   * @param value the value to set.
   */
  public void setBrandRepLastName(CharSequence value) {
    this.brandRepLastName = value;
  }

  /**
   * Gets the value of the 'brandRepEmail' field.
   * @return The value of the 'brandRepEmail' field.
   */
  public CharSequence getBrandRepEmail() {
    return brandRepEmail;
  }

  /**
   * Sets the value of the 'brandRepEmail' field.
   * @param value the value to set.
   */
  public void setBrandRepEmail(CharSequence value) {
    this.brandRepEmail = value;
  }

  /**
   * Gets the value of the 'brandRepPhone' field.
   * @return The value of the 'brandRepPhone' field.
   */
  public CharSequence getBrandRepPhone() {
    return brandRepPhone;
  }

  /**
   * Sets the value of the 'brandRepPhone' field.
   * @param value the value to set.
   */
  public void setBrandRepPhone(CharSequence value) {
    this.brandRepPhone = value;
  }

  /**
   * Creates a new BrandRequestAvro RecordBuilder.
   * @return A new BrandRequestAvro RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new BrandRequestAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BrandRequestAvro RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new BrandRequestAvro RecordBuilder by copying an existing BrandRequestAvro instance.
   * @param other The existing instance to copy.
   * @return A new BrandRequestAvro RecordBuilder
   */
  public static Builder newBuilder(BrandRequestAvro other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for BrandRequestAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BrandRequestAvro>
    implements org.apache.avro.data.RecordBuilder<BrandRequestAvro> {

    private CharSequence brandId;
    private CharSequence brandName;
    private CharSequence requestHeadCount;
    private CharSequence brandRepFirstName;
    private CharSequence brandRepLastName;
    private CharSequence brandRepEmail;
    private CharSequence brandRepPhone;

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
      if (isValidValue(fields()[0], other.brandId)) {
        this.brandId = data().deepCopy(fields()[0].schema(), other.brandId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brandName)) {
        this.brandName = data().deepCopy(fields()[1].schema(), other.brandName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.requestHeadCount)) {
        this.requestHeadCount = data().deepCopy(fields()[2].schema(), other.requestHeadCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brandRepFirstName)) {
        this.brandRepFirstName = data().deepCopy(fields()[3].schema(), other.brandRepFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.brandRepLastName)) {
        this.brandRepLastName = data().deepCopy(fields()[4].schema(), other.brandRepLastName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.brandRepEmail)) {
        this.brandRepEmail = data().deepCopy(fields()[5].schema(), other.brandRepEmail);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.brandRepPhone)) {
        this.brandRepPhone = data().deepCopy(fields()[6].schema(), other.brandRepPhone);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BrandRequestAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(BrandRequestAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.brandId)) {
        this.brandId = data().deepCopy(fields()[0].schema(), other.brandId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brandName)) {
        this.brandName = data().deepCopy(fields()[1].schema(), other.brandName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.requestHeadCount)) {
        this.requestHeadCount = data().deepCopy(fields()[2].schema(), other.requestHeadCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brandRepFirstName)) {
        this.brandRepFirstName = data().deepCopy(fields()[3].schema(), other.brandRepFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.brandRepLastName)) {
        this.brandRepLastName = data().deepCopy(fields()[4].schema(), other.brandRepLastName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.brandRepEmail)) {
        this.brandRepEmail = data().deepCopy(fields()[5].schema(), other.brandRepEmail);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.brandRepPhone)) {
        this.brandRepPhone = data().deepCopy(fields()[6].schema(), other.brandRepPhone);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'brandId' field.
      * @return The value.
      */
    public CharSequence getBrandId() {
      return brandId;
    }

    /**
      * Sets the value of the 'brandId' field.
      * @param value The value of 'brandId'.
      * @return This builder.
      */
    public Builder setBrandId(CharSequence value) {
      validate(fields()[0], value);
      this.brandId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'brandId' field has been set.
      * @return True if the 'brandId' field has been set, false otherwise.
      */
    public boolean hasBrandId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'brandId' field.
      * @return This builder.
      */
    public Builder clearBrandId() {
      brandId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'brandName' field.
      * @return The value.
      */
    public CharSequence getBrandName() {
      return brandName;
    }

    /**
      * Sets the value of the 'brandName' field.
      * @param value The value of 'brandName'.
      * @return This builder.
      */
    public Builder setBrandName(CharSequence value) {
      validate(fields()[1], value);
      this.brandName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'brandName' field has been set.
      * @return True if the 'brandName' field has been set, false otherwise.
      */
    public boolean hasBrandName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'brandName' field.
      * @return This builder.
      */
    public Builder clearBrandName() {
      brandName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'requestHeadCount' field.
      * @return The value.
      */
    public CharSequence getRequestHeadCount() {
      return requestHeadCount;
    }

    /**
      * Sets the value of the 'requestHeadCount' field.
      * @param value The value of 'requestHeadCount'.
      * @return This builder.
      */
    public Builder setRequestHeadCount(CharSequence value) {
      validate(fields()[2], value);
      this.requestHeadCount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'requestHeadCount' field has been set.
      * @return True if the 'requestHeadCount' field has been set, false otherwise.
      */
    public boolean hasRequestHeadCount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'requestHeadCount' field.
      * @return This builder.
      */
    public Builder clearRequestHeadCount() {
      requestHeadCount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'brandRepFirstName' field.
      * @return The value.
      */
    public CharSequence getBrandRepFirstName() {
      return brandRepFirstName;
    }

    /**
      * Sets the value of the 'brandRepFirstName' field.
      * @param value The value of 'brandRepFirstName'.
      * @return This builder.
      */
    public Builder setBrandRepFirstName(CharSequence value) {
      validate(fields()[3], value);
      this.brandRepFirstName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'brandRepFirstName' field has been set.
      * @return True if the 'brandRepFirstName' field has been set, false otherwise.
      */
    public boolean hasBrandRepFirstName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'brandRepFirstName' field.
      * @return This builder.
      */
    public Builder clearBrandRepFirstName() {
      brandRepFirstName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'brandRepLastName' field.
      * @return The value.
      */
    public CharSequence getBrandRepLastName() {
      return brandRepLastName;
    }

    /**
      * Sets the value of the 'brandRepLastName' field.
      * @param value The value of 'brandRepLastName'.
      * @return This builder.
      */
    public Builder setBrandRepLastName(CharSequence value) {
      validate(fields()[4], value);
      this.brandRepLastName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'brandRepLastName' field has been set.
      * @return True if the 'brandRepLastName' field has been set, false otherwise.
      */
    public boolean hasBrandRepLastName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'brandRepLastName' field.
      * @return This builder.
      */
    public Builder clearBrandRepLastName() {
      brandRepLastName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'brandRepEmail' field.
      * @return The value.
      */
    public CharSequence getBrandRepEmail() {
      return brandRepEmail;
    }

    /**
      * Sets the value of the 'brandRepEmail' field.
      * @param value The value of 'brandRepEmail'.
      * @return This builder.
      */
    public Builder setBrandRepEmail(CharSequence value) {
      validate(fields()[5], value);
      this.brandRepEmail = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'brandRepEmail' field has been set.
      * @return True if the 'brandRepEmail' field has been set, false otherwise.
      */
    public boolean hasBrandRepEmail() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'brandRepEmail' field.
      * @return This builder.
      */
    public Builder clearBrandRepEmail() {
      brandRepEmail = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'brandRepPhone' field.
      * @return The value.
      */
    public CharSequence getBrandRepPhone() {
      return brandRepPhone;
    }

    /**
      * Sets the value of the 'brandRepPhone' field.
      * @param value The value of 'brandRepPhone'.
      * @return This builder.
      */
    public Builder setBrandRepPhone(CharSequence value) {
      validate(fields()[6], value);
      this.brandRepPhone = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'brandRepPhone' field has been set.
      * @return True if the 'brandRepPhone' field has been set, false otherwise.
      */
    public boolean hasBrandRepPhone() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'brandRepPhone' field.
      * @return This builder.
      */
    public Builder clearBrandRepPhone() {
      brandRepPhone = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BrandRequestAvro build() {
      try {
        BrandRequestAvro record = new BrandRequestAvro();
        record.brandId = fieldSetFlags()[0] ? this.brandId : (CharSequence) defaultValue(fields()[0]);
        record.brandName = fieldSetFlags()[1] ? this.brandName : (CharSequence) defaultValue(fields()[1]);
        record.requestHeadCount = fieldSetFlags()[2] ? this.requestHeadCount : (CharSequence) defaultValue(fields()[2]);
        record.brandRepFirstName = fieldSetFlags()[3] ? this.brandRepFirstName : (CharSequence) defaultValue(fields()[3]);
        record.brandRepLastName = fieldSetFlags()[4] ? this.brandRepLastName : (CharSequence) defaultValue(fields()[4]);
        record.brandRepEmail = fieldSetFlags()[5] ? this.brandRepEmail : (CharSequence) defaultValue(fields()[5]);
        record.brandRepPhone = fieldSetFlags()[6] ? this.brandRepPhone : (CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BrandRequestAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<BrandRequestAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BrandRequestAvro>
    READER$ = (org.apache.avro.io.DatumReader<BrandRequestAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
