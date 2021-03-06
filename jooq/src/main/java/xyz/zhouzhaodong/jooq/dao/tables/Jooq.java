/*
 * This file is generated by jOOQ.
 */
package xyz.zhouzhaodong.jooq.dao.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import xyz.zhouzhaodong.jooq.dao.Keys;
import xyz.zhouzhaodong.jooq.dao.tables.records.JooqRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jooq extends TableImpl<JooqRecord> {

    private static final long serialVersionUID = 1746778046;

    /**
     * The reference instance of <code>jooq.jooq</code>
     */
    public static final Jooq JOOQ_ = new Jooq();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JooqRecord> getRecordType() {
        return JooqRecord.class;
    }

    /**
     * The column <code>jooq.jooq.name</code>.
     */
    public final TableField<JooqRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>jooq.jooq.age</code>.
     */
    public final TableField<JooqRecord, Integer> AGE = createField(DSL.name("age"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jooq.jooq.address</code>.
     */
    public final TableField<JooqRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>jooq.jooq.id</code>.
     */
    public final TableField<JooqRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>jooq.jooq</code> table reference
     */
    public Jooq() {
        this(DSL.name("jooq"), null);
    }

    /**
     * Create an aliased <code>jooq.jooq</code> table reference
     */
    public Jooq(String alias) {
        this(DSL.name(alias), JOOQ_);
    }

    /**
     * Create an aliased <code>jooq.jooq</code> table reference
     */
    public Jooq(Name alias) {
        this(alias, JOOQ_);
    }

    private Jooq(Name alias, Table<JooqRecord> aliased) {
        this(alias, aliased, null);
    }

    private Jooq(Name alias, Table<JooqRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Jooq(Table<O> child, ForeignKey<O, JooqRecord> key) {
        super(child, key, JOOQ_);
    }

    @Override
    public Schema getSchema() {
        return xyz.zhouzhaodong.jooq.dao.Jooq.JOOQ;
    }

    @Override
    public UniqueKey<JooqRecord> getPrimaryKey() {
        return Keys.KEY_JOOQ_PRIMARY;
    }

    @Override
    public List<UniqueKey<JooqRecord>> getKeys() {
        return Arrays.<UniqueKey<JooqRecord>>asList(Keys.KEY_JOOQ_PRIMARY);
    }

    @Override
    public Jooq as(String alias) {
        return new Jooq(DSL.name(alias), this);
    }

    @Override
    public Jooq as(Name alias) {
        return new Jooq(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Jooq rename(String name) {
        return new Jooq(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Jooq rename(Name name) {
        return new Jooq(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Integer, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
