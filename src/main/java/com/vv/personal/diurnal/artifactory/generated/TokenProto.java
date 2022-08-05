// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Token.proto

package com.vv.personal.diurnal.artifactory.generated;

public final class TokenProto {
  private static final com.google.protobuf.Descriptors.Descriptor
          internal_static_TokenShell_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_TokenShell_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.FileDescriptor
          descriptor;

  static {
    java.lang.String[] descriptorData = {
            "\n\013Token.proto\"*\n\nTokenShell\022\r\n\005email\030\001 \001" +
                    "(\t\022\r\n\005token\030\002 \001(\tB;\n-com.vv.personal.diu" +
                    "rnal.artifactory.generatedB\nTokenProtob\006" +
                    "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[]{
                    });
    internal_static_TokenShell_descriptor =
            getDescriptor().getMessageTypes().get(0);
    internal_static_TokenShell_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_TokenShell_descriptor,
            new java.lang.String[]{"Email", "Token",});
  }

  private TokenProto() {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  public interface TokenShellOrBuilder extends
          // @@protoc_insertion_point(interface_extends:TokenShell)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string email = 1;</code>
     *
     * @return The email.
     */
    java.lang.String getEmail();

    /**
     * <code>string email = 1;</code>
     *
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
    getEmailBytes();

    /**
     * <code>string token = 2;</code>
     *
     * @return The token.
     */
    java.lang.String getToken();

    /**
     * <code>string token = 2;</code>
     *
     * @return The bytes for token.
     */
    com.google.protobuf.ByteString
    getTokenBytes();
  }

  /**
   * Protobuf type {@code TokenShell}
   */
  public static final class TokenShell extends
          com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:TokenShell)
          TokenShellOrBuilder {
    public static final int EMAIL_FIELD_NUMBER = 1;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:TokenShell)
    private static final com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<TokenShell>
            PARSER = new com.google.protobuf.AbstractParser<TokenShell>() {
      @java.lang.Override
      public TokenShell parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new TokenShell(input, extensionRegistry);
      }
    };

    static {
      DEFAULT_INSTANCE = new com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell();
    }

    private volatile java.lang.Object email_;
    private volatile java.lang.Object token_;
    private byte memoizedIsInitialized = -1;

    // Use TokenShell.newBuilder() to construct.
    private TokenShell(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TokenShell() {
      email_ = "";
      token_ = "";
    }

    private TokenShell(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
              com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              email_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              token_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                      input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
                e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.vv.personal.diurnal.artifactory.generated.TokenProto.internal_static_TokenShell_descriptor;
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
              .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<TokenShell> parser() {
      return PARSER;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
      return new TokenShell();
    }

    @java.lang.Override
    public com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.vv.personal.diurnal.artifactory.generated.TokenProto.internal_static_TokenShell_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.class, com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.Builder.class);
    }

    /**
     * <code>string email = 1;</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }

    /**
     * <code>string email = 1;</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string token = 2;</code>
     *
     * @return The token.
     */
    @java.lang.Override
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      }
    }

    /**
     * <code>string token = 2;</code>
     *
     * @return The bytes for token.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    @java.lang.Override
    public boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, email_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, email_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell)) {
        return super.equals(obj);
      }
      com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell other = (com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell) obj;

      if (!getEmail()
              .equals(other.getEmail())) return false;
      if (!getToken()
              .equals(other.getToken())) return false;
      return unknownFields.equals(other.unknownFields);
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
              ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TokenShell> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code TokenShell}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:TokenShell)
            com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShellOrBuilder {
      private java.lang.Object email_ = "";
      private java.lang.Object token_ = "";

      // Construct using com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
              com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      public static com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.vv.personal.diurnal.artifactory.generated.TokenProto.internal_static_TokenShell_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.vv.personal.diurnal.artifactory.generated.TokenProto.internal_static_TokenShell_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.class, com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.Builder.class);
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        email_ = "";

        token_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.vv.personal.diurnal.artifactory.generated.TokenProto.internal_static_TokenShell_descriptor;
      }

      @java.lang.Override
      public com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell getDefaultInstanceForType() {
        return com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.getDefaultInstance();
      }

      @java.lang.Override
      public com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell build() {
        com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell buildPartial() {
        com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell result = new com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell(this);
        result.email_ = email_;
        result.token_ = token_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }

      @java.lang.Override
      public Builder setField(
              com.google.protobuf.Descriptors.FieldDescriptor field,
              java.lang.Object value) {
        return super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(
              com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(
              com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
              com.google.protobuf.Descriptors.FieldDescriptor field,
              int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
              com.google.protobuf.Descriptors.FieldDescriptor field,
              java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell) {
          return mergeFrom((com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell other) {
        if (other == com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell.getDefaultInstance()) return this;
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          onChanged();
        }
        if (!other.getToken().isEmpty()) {
          token_ = other.token_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.vv.personal.diurnal.artifactory.generated.TokenProto.TokenShell) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      /**
       * <code>string email = 1;</code>
       *
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>string email = 1;</code>
       *
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
              java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        email_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>string email = 1;</code>
       *
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
      getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>string email = 1;</code>
       *
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        email_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>string email = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearEmail() {

        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }

      /**
       * <code>string token = 2;</code>
       *
       * @return The token.
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
                  (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>string token = 2;</code>
       *
       * @param value The token to set.
       * @return This builder for chaining.
       */
      public Builder setToken(
              java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }

        token_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>string token = 2;</code>
       *
       * @return The bytes for token.
       */
      public com.google.protobuf.ByteString
      getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
                  com.google.protobuf.ByteString.copyFromUtf8(
                          (java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>string token = 2;</code>
       *
       * @param value The bytes for token to set.
       * @return This builder for chaining.
       */
      public Builder setTokenBytes(
              com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);

        token_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>string token = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearToken() {

        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }

      @java.lang.Override
      public Builder setUnknownFields(
              final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public Builder mergeUnknownFields(
              final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TokenShell)
    }

  }

  // @@protoc_insertion_point(outer_class_scope)
}
