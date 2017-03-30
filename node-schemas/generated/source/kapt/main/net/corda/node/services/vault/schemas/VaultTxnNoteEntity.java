// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package net.corda.node.services.vault.schemas;

import io.requery.Persistable;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.AttributeDelegate;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.IntProperty;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("io.requery.processor.EntityProcessor")
public class VaultTxnNoteEntity implements VaultSchema.VaultTxnNote, Persistable {
    public static final AttributeDelegate<VaultTxnNoteEntity, Integer> SEQ_NO = new AttributeDelegate(
    new AttributeBuilder<VaultTxnNoteEntity, Integer>("seq_no", int.class)
    .setProperty(new IntProperty<VaultTxnNoteEntity>() {
        @Override
        public Integer get(VaultTxnNoteEntity entity) {
            return entity.seqNo;
        }

        @Override
        public void set(VaultTxnNoteEntity entity, Integer value) {
            if(value != null) {
                entity.seqNo = value;
            }
        }

        @Override
        public int getInt(VaultTxnNoteEntity entity) {
            return entity.seqNo;
        }

        @Override
        public void setInt(VaultTxnNoteEntity entity, int value) {
            entity.seqNo = value;
        }
    })
    .setPropertyName("getSeqNo")
    .setPropertyState(new Property<VaultTxnNoteEntity, PropertyState>() {
        @Override
        public PropertyState get(VaultTxnNoteEntity entity) {
            return entity.$seqNo_state;
        }

        @Override
        public void set(VaultTxnNoteEntity entity, PropertyState value) {
            entity.$seqNo_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build());

    public static final AttributeDelegate<VaultTxnNoteEntity, String> TX_ID = new AttributeDelegate(
    new AttributeBuilder<VaultTxnNoteEntity, String>("transaction_id", String.class)
    .setProperty(new Property<VaultTxnNoteEntity, String>() {
        @Override
        public String get(VaultTxnNoteEntity entity) {
            return entity.txId;
        }

        @Override
        public void set(VaultTxnNoteEntity entity, String value) {
            entity.txId = value;
        }
    })
    .setPropertyName("getTxId")
    .setPropertyState(new Property<VaultTxnNoteEntity, PropertyState>() {
        @Override
        public PropertyState get(VaultTxnNoteEntity entity) {
            return entity.$txId_state;
        }

        @Override
        public void set(VaultTxnNoteEntity entity, PropertyState value) {
            entity.$txId_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setLength(64)
    .build());

    public static final AttributeDelegate<VaultTxnNoteEntity, String> NOTE = new AttributeDelegate(
    new AttributeBuilder<VaultTxnNoteEntity, String>("note", String.class)
    .setProperty(new Property<VaultTxnNoteEntity, String>() {
        @Override
        public String get(VaultTxnNoteEntity entity) {
            return entity.note;
        }

        @Override
        public void set(VaultTxnNoteEntity entity, String value) {
            entity.note = value;
        }
    })
    .setPropertyName("getNote")
    .setPropertyState(new Property<VaultTxnNoteEntity, PropertyState>() {
        @Override
        public PropertyState get(VaultTxnNoteEntity entity) {
            return entity.$note_state;
        }

        @Override
        public void set(VaultTxnNoteEntity entity, PropertyState value) {
            entity.$note_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build());

    public static final Type<VaultTxnNoteEntity> $TYPE = new TypeBuilder<VaultTxnNoteEntity>(VaultTxnNoteEntity.class, "vault_transaction_notes")
    .setBaseType(VaultSchema.VaultTxnNote.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setView(false)
    .setFactory(new Supplier<VaultTxnNoteEntity>() {
        @Override
        public VaultTxnNoteEntity get() {
            return new VaultTxnNoteEntity();
        }
    })
    .setProxyProvider(new Function<VaultTxnNoteEntity, EntityProxy<VaultTxnNoteEntity>>() {
        @Override
        public EntityProxy<VaultTxnNoteEntity> apply(VaultTxnNoteEntity entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(SEQ_NO)
    .addAttribute(NOTE)
    .addAttribute(TX_ID)
    .build();

    private PropertyState $seqNo_state;

    private PropertyState $txId_state;

    private PropertyState $note_state;

    private int seqNo;

    private String txId;

    private String note;

    private final transient EntityProxy<VaultTxnNoteEntity> $proxy = new EntityProxy<VaultTxnNoteEntity>(this, $TYPE);

    public VaultTxnNoteEntity() {
    }

    @Override
    public int getSeqNo() {
        return $proxy.get(SEQ_NO);
    }

    public void setSeqNo(int seqNo) {
        $proxy.set(SEQ_NO, seqNo);
    }

    @Override
    public String getTxId() {
        return $proxy.get(TX_ID);
    }

    public void setTxId(String txId) {
        $proxy.set(TX_ID, txId);
    }

    @Override
    public String getNote() {
        return $proxy.get(NOTE);
    }

    public void setNote(String note) {
        $proxy.set(NOTE, note);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof VaultTxnNoteEntity && ((VaultTxnNoteEntity)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }

    @Override
    public String toString() {
        return $proxy.toString();
    }
}