/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.pinot.common.request;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * AUTO GENERATED: DO NOT EDIT
 * GroupBy
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-10-31")
public class GroupBy implements org.apache.thrift.TBase<GroupBy, GroupBy._Fields>, java.io.Serializable, Cloneable, Comparable<GroupBy> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GroupBy");

  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TOP_N_FIELD_DESC = new org.apache.thrift.protocol.TField("topN", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField EXPRESSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("expressions", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GroupByStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GroupByTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns; // optional
  private long topN; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> expressions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMNS((short)1, "columns"),
    TOP_N((short)2, "topN"),
    EXPRESSIONS((short)3, "expressions");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COLUMNS
          return COLUMNS;
        case 2: // TOP_N
          return TOP_N;
        case 3: // EXPRESSIONS
          return EXPRESSIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOPN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COLUMNS,_Fields.TOP_N,_Fields.EXPRESSIONS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.TOP_N, new org.apache.thrift.meta_data.FieldMetaData("topN", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXPRESSIONS, new org.apache.thrift.meta_data.FieldMetaData("expressions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GroupBy.class, metaDataMap);
  }

  public GroupBy() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroupBy(GroupBy other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColumns()) {
      java.util.List<java.lang.String> __this__columns = new java.util.ArrayList<java.lang.String>(other.columns);
      this.columns = __this__columns;
    }
    this.topN = other.topN;
    if (other.isSetExpressions()) {
      java.util.List<java.lang.String> __this__expressions = new java.util.ArrayList<java.lang.String>(other.expressions);
      this.expressions = __this__expressions;
    }
  }

  public GroupBy deepCopy() {
    return new GroupBy(this);
  }

  @Override
  public void clear() {
    this.columns = null;
    setTopNIsSet(false);
    this.topN = 0;
    this.expressions = null;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(java.lang.String elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<java.lang.String>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColumns() {
    return this.columns;
  }

  public void setColumns(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns) {
    this.columns = columns;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public long getTopN() {
    return this.topN;
  }

  public void setTopN(long topN) {
    this.topN = topN;
    setTopNIsSet(true);
  }

  public void unsetTopN() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOPN_ISSET_ID);
  }

  /** Returns true if field topN is set (has been assigned a value) and false otherwise */
  public boolean isSetTopN() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOPN_ISSET_ID);
  }

  public void setTopNIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOPN_ISSET_ID, value);
  }

  public int getExpressionsSize() {
    return (this.expressions == null) ? 0 : this.expressions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getExpressionsIterator() {
    return (this.expressions == null) ? null : this.expressions.iterator();
  }

  public void addToExpressions(java.lang.String elem) {
    if (this.expressions == null) {
      this.expressions = new java.util.ArrayList<java.lang.String>();
    }
    this.expressions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getExpressions() {
    return this.expressions;
  }

  public void setExpressions(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> expressions) {
    this.expressions = expressions;
  }

  public void unsetExpressions() {
    this.expressions = null;
  }

  /** Returns true if field expressions is set (has been assigned a value) and false otherwise */
  public boolean isSetExpressions() {
    return this.expressions != null;
  }

  public void setExpressionsIsSet(boolean value) {
    if (!value) {
      this.expressions = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<java.lang.String>)value);
      }
      break;

    case TOP_N:
      if (value == null) {
        unsetTopN();
      } else {
        setTopN((java.lang.Long)value);
      }
      break;

    case EXPRESSIONS:
      if (value == null) {
        unsetExpressions();
      } else {
        setExpressions((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMNS:
      return getColumns();

    case TOP_N:
      return getTopN();

    case EXPRESSIONS:
      return getExpressions();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COLUMNS:
      return isSetColumns();
    case TOP_N:
      return isSetTopN();
    case EXPRESSIONS:
      return isSetExpressions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GroupBy)
      return this.equals((GroupBy)that);
    return false;
  }

  public boolean equals(GroupBy that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_topN = true && this.isSetTopN();
    boolean that_present_topN = true && that.isSetTopN();
    if (this_present_topN || that_present_topN) {
      if (!(this_present_topN && that_present_topN))
        return false;
      if (this.topN != that.topN)
        return false;
    }

    boolean this_present_expressions = true && this.isSetExpressions();
    boolean that_present_expressions = true && that.isSetExpressions();
    if (this_present_expressions || that_present_expressions) {
      if (!(this_present_expressions && that_present_expressions))
        return false;
      if (!this.expressions.equals(that.expressions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetTopN()) ? 131071 : 524287);
    if (isSetTopN())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(topN);

    hashCode = hashCode * 8191 + ((isSetExpressions()) ? 131071 : 524287);
    if (isSetExpressions())
      hashCode = hashCode * 8191 + expressions.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GroupBy other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTopN()).compareTo(other.isSetTopN());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopN()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topN, other.topN);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExpressions()).compareTo(other.isSetExpressions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpressions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expressions, other.expressions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupBy(");
    boolean first = true;

    if (isSetColumns()) {
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetTopN()) {
      if (!first) sb.append(", ");
      sb.append("topN:");
      sb.append(this.topN);
      first = false;
    }
    if (isSetExpressions()) {
      if (!first) sb.append(", ");
      sb.append("expressions:");
      if (this.expressions == null) {
        sb.append("null");
      } else {
        sb.append(this.expressions);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GroupByStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupByStandardScheme getScheme() {
      return new GroupByStandardScheme();
    }
  }

  private static class GroupByStandardScheme extends org.apache.thrift.scheme.StandardScheme<GroupBy> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GroupBy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list70 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<java.lang.String>(_list70.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem71;
                for (int _i72 = 0; _i72 < _list70.size; ++_i72)
                {
                  _elem71 = iprot.readString();
                  struct.columns.add(_elem71);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOP_N
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.topN = iprot.readI64();
              struct.setTopNIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPRESSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list73 = iprot.readListBegin();
                struct.expressions = new java.util.ArrayList<java.lang.String>(_list73.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem74;
                for (int _i75 = 0; _i75 < _list73.size; ++_i75)
                {
                  _elem74 = iprot.readString();
                  struct.expressions.add(_elem74);
                }
                iprot.readListEnd();
              }
              struct.setExpressionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GroupBy struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columns != null) {
        if (struct.isSetColumns()) {
          oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
            for (java.lang.String _iter76 : struct.columns)
            {
              oprot.writeString(_iter76);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTopN()) {
        oprot.writeFieldBegin(TOP_N_FIELD_DESC);
        oprot.writeI64(struct.topN);
        oprot.writeFieldEnd();
      }
      if (struct.expressions != null) {
        if (struct.isSetExpressions()) {
          oprot.writeFieldBegin(EXPRESSIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.expressions.size()));
            for (java.lang.String _iter77 : struct.expressions)
            {
              oprot.writeString(_iter77);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupByTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupByTupleScheme getScheme() {
      return new GroupByTupleScheme();
    }
  }

  private static class GroupByTupleScheme extends org.apache.thrift.scheme.TupleScheme<GroupBy> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GroupBy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColumns()) {
        optionals.set(0);
      }
      if (struct.isSetTopN()) {
        optionals.set(1);
      }
      if (struct.isSetExpressions()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (java.lang.String _iter78 : struct.columns)
          {
            oprot.writeString(_iter78);
          }
        }
      }
      if (struct.isSetTopN()) {
        oprot.writeI64(struct.topN);
      }
      if (struct.isSetExpressions()) {
        {
          oprot.writeI32(struct.expressions.size());
          for (java.lang.String _iter79 : struct.expressions)
          {
            oprot.writeString(_iter79);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GroupBy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list80 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.columns = new java.util.ArrayList<java.lang.String>(_list80.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem81;
          for (int _i82 = 0; _i82 < _list80.size; ++_i82)
          {
            _elem81 = iprot.readString();
            struct.columns.add(_elem81);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.topN = iprot.readI64();
        struct.setTopNIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list83 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.expressions = new java.util.ArrayList<java.lang.String>(_list83.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem84;
          for (int _i85 = 0; _i85 < _list83.size; ++_i85)
          {
            _elem84 = iprot.readString();
            struct.expressions.add(_elem84);
          }
        }
        struct.setExpressionsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}