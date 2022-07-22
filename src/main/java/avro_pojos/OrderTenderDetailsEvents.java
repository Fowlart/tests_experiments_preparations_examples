/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_pojos;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class OrderTenderDetailsEvents extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -483728486285775780L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderTenderDetailsEvents\",\"namespace\":\"com.sephora.dataplatform.avro\",\"fields\":[{\"name\":\"order_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"card_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"channel_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transaction_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_submit_date\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderTenderDetailsEvents> ENCODER =
      new BinaryMessageEncoder<OrderTenderDetailsEvents>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderTenderDetailsEvents> DECODER =
      new BinaryMessageDecoder<OrderTenderDetailsEvents>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderTenderDetailsEvents> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderTenderDetailsEvents> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderTenderDetailsEvents> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderTenderDetailsEvents>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderTenderDetailsEvents to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderTenderDetailsEvents from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderTenderDetailsEvents instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderTenderDetailsEvents fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public String order_number;
  @Deprecated public String card_number;
  @Deprecated public String channel_type;
  @Deprecated public String transaction_type;
  @Deprecated public String order_submit_date;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderTenderDetailsEvents() {}

  /**
   * All-args constructor.
   * @param order_number The new value for order_number
   * @param card_number The new value for card_number
   * @param channel_type The new value for channel_type
   * @param transaction_type The new value for transaction_type
   * @param order_submit_date The new value for order_submit_date
   */
  public OrderTenderDetailsEvents(String order_number, String card_number, String channel_type, String transaction_type, String order_submit_date) {
    this.order_number = order_number;
    this.card_number = card_number;
    this.channel_type = channel_type;
    this.transaction_type = transaction_type;
    this.order_submit_date = order_submit_date;
  }

  public SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return order_number;
    case 1: return card_number;
    case 2: return channel_type;
    case 3: return transaction_type;
    case 4: return order_submit_date;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: order_number = value$ != null ? value$.toString() : null; break;
    case 1: card_number = value$ != null ? value$.toString() : null; break;
    case 2: channel_type = value$ != null ? value$.toString() : null; break;
    case 3: transaction_type = value$ != null ? value$.toString() : null; break;
    case 4: order_submit_date = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'order_number' field.
   * @return The value of the 'order_number' field.
   */
  public String getOrderNumber() {
    return order_number;
  }


  /**
   * Sets the value of the 'order_number' field.
   * @param value the value to set.
   */
  public void setOrderNumber(String value) {
    this.order_number = value;
  }

  /**
   * Gets the value of the 'card_number' field.
   * @return The value of the 'card_number' field.
   */
  public String getCardNumber() {
    return card_number;
  }


  /**
   * Sets the value of the 'card_number' field.
   * @param value the value to set.
   */
  public void setCardNumber(String value) {
    this.card_number = value;
  }

  /**
   * Gets the value of the 'channel_type' field.
   * @return The value of the 'channel_type' field.
   */
  public String getChannelType() {
    return channel_type;
  }


  /**
   * Sets the value of the 'channel_type' field.
   * @param value the value to set.
   */
  public void setChannelType(String value) {
    this.channel_type = value;
  }

  /**
   * Gets the value of the 'transaction_type' field.
   * @return The value of the 'transaction_type' field.
   */
  public String getTransactionType() {
    return transaction_type;
  }


  /**
   * Sets the value of the 'transaction_type' field.
   * @param value the value to set.
   */
  public void setTransactionType(String value) {
    this.transaction_type = value;
  }

  /**
   * Gets the value of the 'order_submit_date' field.
   * @return The value of the 'order_submit_date' field.
   */
  public String getOrderSubmitDate() {
    return order_submit_date;
  }


  /**
   * Sets the value of the 'order_submit_date' field.
   * @param value the value to set.
   */
  public void setOrderSubmitDate(String value) {
    this.order_submit_date = value;
  }

  /**
   * Creates a new OrderTenderDetailsEvents RecordBuilder.
   * @return A new OrderTenderDetailsEvents RecordBuilder
   */
  public static OrderTenderDetailsEvents.Builder newBuilder() {
    return new OrderTenderDetailsEvents.Builder();
  }

  /**
   * Creates a new OrderTenderDetailsEvents RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderTenderDetailsEvents RecordBuilder
   */
  public static OrderTenderDetailsEvents.Builder newBuilder(OrderTenderDetailsEvents.Builder other) {
    if (other == null) {
      return new OrderTenderDetailsEvents.Builder();
    } else {
      return new OrderTenderDetailsEvents.Builder(other);
    }
  }

  /**
   * Creates a new OrderTenderDetailsEvents RecordBuilder by copying an existing OrderTenderDetailsEvents instance.
   * @param other The existing instance to copy.
   * @return A new OrderTenderDetailsEvents RecordBuilder
   */
  public static OrderTenderDetailsEvents.Builder newBuilder(OrderTenderDetailsEvents other) {
    if (other == null) {
      return new OrderTenderDetailsEvents.Builder();
    } else {
      return new OrderTenderDetailsEvents.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderTenderDetailsEvents instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderTenderDetailsEvents>
    implements org.apache.avro.data.RecordBuilder<OrderTenderDetailsEvents> {

    private String order_number;
    private String card_number;
    private String channel_type;
    private String transaction_type;
    private String order_submit_date;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(OrderTenderDetailsEvents.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.order_number)) {
        this.order_number = data().deepCopy(fields()[0].schema(), other.order_number);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.card_number)) {
        this.card_number = data().deepCopy(fields()[1].schema(), other.card_number);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.channel_type)) {
        this.channel_type = data().deepCopy(fields()[2].schema(), other.channel_type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.transaction_type)) {
        this.transaction_type = data().deepCopy(fields()[3].schema(), other.transaction_type);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.order_submit_date)) {
        this.order_submit_date = data().deepCopy(fields()[4].schema(), other.order_submit_date);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderTenderDetailsEvents instance
     * @param other The existing instance to copy.
     */
    private Builder(OrderTenderDetailsEvents other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.order_number)) {
        this.order_number = data().deepCopy(fields()[0].schema(), other.order_number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.card_number)) {
        this.card_number = data().deepCopy(fields()[1].schema(), other.card_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.channel_type)) {
        this.channel_type = data().deepCopy(fields()[2].schema(), other.channel_type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.transaction_type)) {
        this.transaction_type = data().deepCopy(fields()[3].schema(), other.transaction_type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.order_submit_date)) {
        this.order_submit_date = data().deepCopy(fields()[4].schema(), other.order_submit_date);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'order_number' field.
      * @return The value.
      */
    public String getOrderNumber() {
      return order_number;
    }


    /**
      * Sets the value of the 'order_number' field.
      * @param value The value of 'order_number'.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder setOrderNumber(String value) {
      validate(fields()[0], value);
      this.order_number = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'order_number' field has been set.
      * @return True if the 'order_number' field has been set, false otherwise.
      */
    public boolean hasOrderNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'order_number' field.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder clearOrderNumber() {
      order_number = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'card_number' field.
      * @return The value.
      */
    public String getCardNumber() {
      return card_number;
    }


    /**
      * Sets the value of the 'card_number' field.
      * @param value The value of 'card_number'.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder setCardNumber(String value) {
      validate(fields()[1], value);
      this.card_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'card_number' field has been set.
      * @return True if the 'card_number' field has been set, false otherwise.
      */
    public boolean hasCardNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'card_number' field.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder clearCardNumber() {
      card_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'channel_type' field.
      * @return The value.
      */
    public String getChannelType() {
      return channel_type;
    }


    /**
      * Sets the value of the 'channel_type' field.
      * @param value The value of 'channel_type'.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder setChannelType(String value) {
      validate(fields()[2], value);
      this.channel_type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'channel_type' field has been set.
      * @return True if the 'channel_type' field has been set, false otherwise.
      */
    public boolean hasChannelType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'channel_type' field.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder clearChannelType() {
      channel_type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'transaction_type' field.
      * @return The value.
      */
    public String getTransactionType() {
      return transaction_type;
    }


    /**
      * Sets the value of the 'transaction_type' field.
      * @param value The value of 'transaction_type'.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder setTransactionType(String value) {
      validate(fields()[3], value);
      this.transaction_type = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'transaction_type' field has been set.
      * @return True if the 'transaction_type' field has been set, false otherwise.
      */
    public boolean hasTransactionType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'transaction_type' field.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder clearTransactionType() {
      transaction_type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'order_submit_date' field.
      * @return The value.
      */
    public String getOrderSubmitDate() {
      return order_submit_date;
    }


    /**
      * Sets the value of the 'order_submit_date' field.
      * @param value The value of 'order_submit_date'.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder setOrderSubmitDate(String value) {
      validate(fields()[4], value);
      this.order_submit_date = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'order_submit_date' field has been set.
      * @return True if the 'order_submit_date' field has been set, false otherwise.
      */
    public boolean hasOrderSubmitDate() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'order_submit_date' field.
      * @return This builder.
      */
    public OrderTenderDetailsEvents.Builder clearOrderSubmitDate() {
      order_submit_date = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderTenderDetailsEvents build() {
      try {
        OrderTenderDetailsEvents record = new OrderTenderDetailsEvents();
        record.order_number = fieldSetFlags()[0] ? this.order_number : (String) defaultValue(fields()[0]);
        record.card_number = fieldSetFlags()[1] ? this.card_number : (String) defaultValue(fields()[1]);
        record.channel_type = fieldSetFlags()[2] ? this.channel_type : (String) defaultValue(fields()[2]);
        record.transaction_type = fieldSetFlags()[3] ? this.transaction_type : (String) defaultValue(fields()[3]);
        record.order_submit_date = fieldSetFlags()[4] ? this.order_submit_date : (String) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderTenderDetailsEvents>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderTenderDetailsEvents>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderTenderDetailsEvents>
    READER$ = (org.apache.avro.io.DatumReader<OrderTenderDetailsEvents>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.order_number == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.order_number);
    }

    if (this.card_number == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.card_number);
    }

    if (this.channel_type == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.channel_type);
    }

    if (this.transaction_type == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.transaction_type);
    }

    if (this.order_submit_date == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.order_submit_date);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.order_number = null;
      } else {
        this.order_number = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.card_number = null;
      } else {
        this.card_number = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.channel_type = null;
      } else {
        this.channel_type = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.transaction_type = null;
      } else {
        this.transaction_type = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.order_submit_date = null;
      } else {
        this.order_submit_date = in.readString();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.order_number = null;
          } else {
            this.order_number = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.card_number = null;
          } else {
            this.card_number = in.readString();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.channel_type = null;
          } else {
            this.channel_type = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.transaction_type = null;
          } else {
            this.transaction_type = in.readString();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.order_submit_date = null;
          } else {
            this.order_submit_date = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










