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
public class GroupedCustomerTransactions extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1673397159222986261L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GroupedCustomerTransactions\",\"namespace\":\"com.sephora.dataplatform.avro\",\"fields\":[{\"name\":\"customer_transactions\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CustomerTransactionsPair\",\"fields\":[{\"name\":\"previous\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CustomerTransactions\",\"fields\":[{\"name\":\"return_surrogate_key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"dp_reference_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"return_reference_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"usa_id\",\"type\":[\"null\",\"long\"],\"doc\":\"bi_id\",\"default\":null},{\"name\":\"sephora_id\",\"type\":[\"null\",\"long\"],\"doc\":\"sephora_id field\",\"default\":null},{\"name\":\"online_atg_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"online_atg_id field\",\"default\":null},{\"name\":\"card_numbers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":[]}],\"default\":null},{\"name\":\"return_auth_flag\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"return_auth_flag field\",\"default\":null},{\"name\":\"reason_text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"the reason why the current return has such return_auth_flag\",\"default\":null},{\"name\":\"cust_sale_counter\",\"type\":\"int\",\"doc\":\"cust_sale_counter field\"},{\"name\":\"cust_return_counter\",\"type\":\"int\",\"doc\":\"cust_return_counter field\"},{\"name\":\"pct_sale_to_return\",\"type\":\"double\",\"doc\":\"pct_sale_to_return field\"},{\"name\":\"created_date\",\"type\":\"long\",\"doc\":\"created_date field\"},{\"name\":\"start_date\",\"type\":\"long\",\"doc\":\"start_date field\"},{\"name\":\"end_date\",\"type\":\"long\",\"doc\":\"end_date field\"},{\"name\":\"active_flag\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"active_flag field A or I\",\"default\":\"A\"},{\"name\":\"orders\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderHeaderTender\",\"fields\":[{\"name\":\"order_header\",\"type\":[{\"type\":\"record\",\"name\":\"OrderHeaderConsolidated\",\"fields\":[{\"name\":\"org_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"atg_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"usa_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"sephora_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"order_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"original_order_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"channel_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transaction_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"store_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cancel_flag\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_cancel_flag\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_cancel_datetime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_submit_datetime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_submit_datetime_local\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_submit_date\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"is_declined\",\"type\":\"boolean\",\"default\":false},{\"name\":\"return_auth_flag\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"return_reason_text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"return_reference_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"return_group_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"return_sale_counter\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"return_return_counter\",\"type\":[\"null\",\"int\"],\"default\":null}]},\"null\"]},{\"name\":\"order_tender\",\"type\":[{\"type\":\"record\",\"name\":\"OrderTenderDetailsEvents\",\"fields\":[{\"name\":\"order_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"card_number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"channel_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transaction_type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"order_submit_date\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},\"null\"]},{\"name\":\"batch_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"group_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"number_of_accounts\",\"type\":\"int\",\"default\":1},{\"name\":\"is_primary\",\"type\":\"boolean\",\"doc\":\"means that transaction is directly related to the aggregation key\",\"default\":false},{\"name\":\"is_merge\",\"type\":\"boolean\",\"doc\":\"means that need to change key to usa_id from order_header (only if is_primary = true)\",\"default\":false}]},\"default\":[]},\"default\":[]},{\"name\":\"record_update_flag\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"record_update_flag field U or D\",\"default\":\"U\"},{\"name\":\"number_of_accounts\",\"type\":\"int\",\"default\":1},{\"name\":\"group_id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"is_primary\",\"type\":\"boolean\",\"default\":false}]}],\"default\":null},{\"name\":\"current\",\"type\":\"CustomerTransactions\"}]},\"default\":[]},\"default\":[]},{\"name\":\"group_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"return_auth_flag\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"return_auth_flag field\",\"default\":null},{\"name\":\"number_of_records\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GroupedCustomerTransactions> ENCODER =
      new BinaryMessageEncoder<GroupedCustomerTransactions>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GroupedCustomerTransactions> DECODER =
      new BinaryMessageDecoder<GroupedCustomerTransactions>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GroupedCustomerTransactions> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GroupedCustomerTransactions> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GroupedCustomerTransactions> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GroupedCustomerTransactions>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GroupedCustomerTransactions to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GroupedCustomerTransactions from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GroupedCustomerTransactions instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GroupedCustomerTransactions fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.List<CustomerTransactionsPair> customer_transactions;
  @Deprecated public String group_id;
  /** return_auth_flag field */
  @Deprecated public String return_auth_flag;
  @Deprecated public int number_of_records;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GroupedCustomerTransactions() {}

  /**
   * All-args constructor.
   * @param customer_transactions The new value for customer_transactions
   * @param group_id The new value for group_id
   * @param return_auth_flag return_auth_flag field
   * @param number_of_records The new value for number_of_records
   */
  public GroupedCustomerTransactions(java.util.List<CustomerTransactionsPair> customer_transactions, String group_id, String return_auth_flag, Integer number_of_records) {
    this.customer_transactions = customer_transactions;
    this.group_id = group_id;
    this.return_auth_flag = return_auth_flag;
    this.number_of_records = number_of_records;
  }

  public SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return customer_transactions;
    case 1: return group_id;
    case 2: return return_auth_flag;
    case 3: return number_of_records;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: customer_transactions = (java.util.List<CustomerTransactionsPair>)value$; break;
    case 1: group_id = value$ != null ? value$.toString() : null; break;
    case 2: return_auth_flag = value$ != null ? value$.toString() : null; break;
    case 3: number_of_records = (Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'customer_transactions' field.
   * @return The value of the 'customer_transactions' field.
   */
  public java.util.List<CustomerTransactionsPair> getCustomerTransactions() {
    return customer_transactions;
  }


  /**
   * Sets the value of the 'customer_transactions' field.
   * @param value the value to set.
   */
  public void setCustomerTransactions(java.util.List<CustomerTransactionsPair> value) {
    this.customer_transactions = value;
  }

  /**
   * Gets the value of the 'group_id' field.
   * @return The value of the 'group_id' field.
   */
  public String getGroupId() {
    return group_id;
  }


  /**
   * Sets the value of the 'group_id' field.
   * @param value the value to set.
   */
  public void setGroupId(String value) {
    this.group_id = value;
  }

  /**
   * Gets the value of the 'return_auth_flag' field.
   * @return return_auth_flag field
   */
  public String getReturnAuthFlag() {
    return return_auth_flag;
  }


  /**
   * Sets the value of the 'return_auth_flag' field.
   * return_auth_flag field
   * @param value the value to set.
   */
  public void setReturnAuthFlag(String value) {
    this.return_auth_flag = value;
  }

  /**
   * Gets the value of the 'number_of_records' field.
   * @return The value of the 'number_of_records' field.
   */
  public int getNumberOfRecords() {
    return number_of_records;
  }


  /**
   * Sets the value of the 'number_of_records' field.
   * @param value the value to set.
   */
  public void setNumberOfRecords(int value) {
    this.number_of_records = value;
  }

  /**
   * Creates a new GroupedCustomerTransactions RecordBuilder.
   * @return A new GroupedCustomerTransactions RecordBuilder
   */
  public static GroupedCustomerTransactions.Builder newBuilder() {
    return new GroupedCustomerTransactions.Builder();
  }

  /**
   * Creates a new GroupedCustomerTransactions RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GroupedCustomerTransactions RecordBuilder
   */
  public static GroupedCustomerTransactions.Builder newBuilder(GroupedCustomerTransactions.Builder other) {
    if (other == null) {
      return new GroupedCustomerTransactions.Builder();
    } else {
      return new GroupedCustomerTransactions.Builder(other);
    }
  }

  /**
   * Creates a new GroupedCustomerTransactions RecordBuilder by copying an existing GroupedCustomerTransactions instance.
   * @param other The existing instance to copy.
   * @return A new GroupedCustomerTransactions RecordBuilder
   */
  public static GroupedCustomerTransactions.Builder newBuilder(GroupedCustomerTransactions other) {
    if (other == null) {
      return new GroupedCustomerTransactions.Builder();
    } else {
      return new GroupedCustomerTransactions.Builder(other);
    }
  }

  /**
   * RecordBuilder for GroupedCustomerTransactions instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GroupedCustomerTransactions>
    implements org.apache.avro.data.RecordBuilder<GroupedCustomerTransactions> {

    private java.util.List<CustomerTransactionsPair> customer_transactions;
    private String group_id;
    /** return_auth_flag field */
    private String return_auth_flag;
    private int number_of_records;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(GroupedCustomerTransactions.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customer_transactions)) {
        this.customer_transactions = data().deepCopy(fields()[0].schema(), other.customer_transactions);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.group_id)) {
        this.group_id = data().deepCopy(fields()[1].schema(), other.group_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.return_auth_flag)) {
        this.return_auth_flag = data().deepCopy(fields()[2].schema(), other.return_auth_flag);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.number_of_records)) {
        this.number_of_records = data().deepCopy(fields()[3].schema(), other.number_of_records);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing GroupedCustomerTransactions instance
     * @param other The existing instance to copy.
     */
    private Builder(GroupedCustomerTransactions other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.customer_transactions)) {
        this.customer_transactions = data().deepCopy(fields()[0].schema(), other.customer_transactions);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.group_id)) {
        this.group_id = data().deepCopy(fields()[1].schema(), other.group_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.return_auth_flag)) {
        this.return_auth_flag = data().deepCopy(fields()[2].schema(), other.return_auth_flag);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.number_of_records)) {
        this.number_of_records = data().deepCopy(fields()[3].schema(), other.number_of_records);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'customer_transactions' field.
      * @return The value.
      */
    public java.util.List<CustomerTransactionsPair> getCustomerTransactions() {
      return customer_transactions;
    }


    /**
      * Sets the value of the 'customer_transactions' field.
      * @param value The value of 'customer_transactions'.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder setCustomerTransactions(java.util.List<CustomerTransactionsPair> value) {
      validate(fields()[0], value);
      this.customer_transactions = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_transactions' field has been set.
      * @return True if the 'customer_transactions' field has been set, false otherwise.
      */
    public boolean hasCustomerTransactions() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customer_transactions' field.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder clearCustomerTransactions() {
      customer_transactions = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'group_id' field.
      * @return The value.
      */
    public String getGroupId() {
      return group_id;
    }


    /**
      * Sets the value of the 'group_id' field.
      * @param value The value of 'group_id'.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder setGroupId(String value) {
      validate(fields()[1], value);
      this.group_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'group_id' field has been set.
      * @return True if the 'group_id' field has been set, false otherwise.
      */
    public boolean hasGroupId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'group_id' field.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder clearGroupId() {
      group_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'return_auth_flag' field.
      * return_auth_flag field
      * @return The value.
      */
    public String getReturnAuthFlag() {
      return return_auth_flag;
    }


    /**
      * Sets the value of the 'return_auth_flag' field.
      * return_auth_flag field
      * @param value The value of 'return_auth_flag'.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder setReturnAuthFlag(String value) {
      validate(fields()[2], value);
      this.return_auth_flag = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'return_auth_flag' field has been set.
      * return_auth_flag field
      * @return True if the 'return_auth_flag' field has been set, false otherwise.
      */
    public boolean hasReturnAuthFlag() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'return_auth_flag' field.
      * return_auth_flag field
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder clearReturnAuthFlag() {
      return_auth_flag = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'number_of_records' field.
      * @return The value.
      */
    public int getNumberOfRecords() {
      return number_of_records;
    }


    /**
      * Sets the value of the 'number_of_records' field.
      * @param value The value of 'number_of_records'.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder setNumberOfRecords(int value) {
      validate(fields()[3], value);
      this.number_of_records = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'number_of_records' field has been set.
      * @return True if the 'number_of_records' field has been set, false otherwise.
      */
    public boolean hasNumberOfRecords() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'number_of_records' field.
      * @return This builder.
      */
    public GroupedCustomerTransactions.Builder clearNumberOfRecords() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GroupedCustomerTransactions build() {
      try {
        GroupedCustomerTransactions record = new GroupedCustomerTransactions();
        record.customer_transactions = fieldSetFlags()[0] ? this.customer_transactions : (java.util.List<CustomerTransactionsPair>) defaultValue(fields()[0]);
        record.group_id = fieldSetFlags()[1] ? this.group_id : (String) defaultValue(fields()[1]);
        record.return_auth_flag = fieldSetFlags()[2] ? this.return_auth_flag : (String) defaultValue(fields()[2]);
        record.number_of_records = fieldSetFlags()[3] ? this.number_of_records : (Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GroupedCustomerTransactions>
    WRITER$ = (org.apache.avro.io.DatumWriter<GroupedCustomerTransactions>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GroupedCustomerTransactions>
    READER$ = (org.apache.avro.io.DatumReader<GroupedCustomerTransactions>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.customer_transactions.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (CustomerTransactionsPair e0: this.customer_transactions) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    out.writeString(this.group_id);

    if (this.return_auth_flag == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.return_auth_flag);
    }

    out.writeInt(this.number_of_records);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<CustomerTransactionsPair> a0 = this.customer_transactions;
      if (a0 == null) {
        a0 = new SpecificData.Array<CustomerTransactionsPair>((int)size0, SCHEMA$.getField("customer_transactions").schema());
        this.customer_transactions = a0;
      } else a0.clear();
      SpecificData.Array<CustomerTransactionsPair> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<CustomerTransactionsPair>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          CustomerTransactionsPair e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new CustomerTransactionsPair();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      this.group_id = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.return_auth_flag = null;
      } else {
        this.return_auth_flag = in.readString();
      }

      this.number_of_records = in.readInt();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<CustomerTransactionsPair> a0 = this.customer_transactions;
          if (a0 == null) {
            a0 = new SpecificData.Array<CustomerTransactionsPair>((int)size0, SCHEMA$.getField("customer_transactions").schema());
            this.customer_transactions = a0;
          } else a0.clear();
          SpecificData.Array<CustomerTransactionsPair> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<CustomerTransactionsPair>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              CustomerTransactionsPair e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new CustomerTransactionsPair();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 1:
          this.group_id = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.return_auth_flag = null;
          } else {
            this.return_auth_flag = in.readString();
          }
          break;

        case 3:
          this.number_of_records = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










