package tsw.accountnumber.db.greendaogen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import tsw.accountnumber.db.greendaobean.Account_Type;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "account_type".
*/
public class Account_TypeDao extends AbstractDao<Account_Type, Long> {

    public static final String TABLENAME = "account_type";

    /**
     * Properties of entity Account_Type.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Account_type_name = new Property(1, String.class, "account_type_name", false, "account_type_name");
        public final static Property Account_type_id = new Property(2, int.class, "account_type_id", false, "account_type_id");
        public final static Property Account_type_describe = new Property(3, String.class, "account_type_describe", false, "account_type_describe");
    }


    public Account_TypeDao(DaoConfig config) {
        super(config);
    }
    
    public Account_TypeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"account_type\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"account_type_name\" TEXT," + // 1: account_type_name
                "\"account_type_id\" INTEGER NOT NULL ," + // 2: account_type_id
                "\"account_type_describe\" TEXT);"); // 3: account_type_describe
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"account_type\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Account_Type entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String account_type_name = entity.getAccount_type_name();
        if (account_type_name != null) {
            stmt.bindString(2, account_type_name);
        }
        stmt.bindLong(3, entity.getAccount_type_id());
 
        String account_type_describe = entity.getAccount_type_describe();
        if (account_type_describe != null) {
            stmt.bindString(4, account_type_describe);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Account_Type entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String account_type_name = entity.getAccount_type_name();
        if (account_type_name != null) {
            stmt.bindString(2, account_type_name);
        }
        stmt.bindLong(3, entity.getAccount_type_id());
 
        String account_type_describe = entity.getAccount_type_describe();
        if (account_type_describe != null) {
            stmt.bindString(4, account_type_describe);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Account_Type readEntity(Cursor cursor, int offset) {
        Account_Type entity = new Account_Type( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // account_type_name
            cursor.getInt(offset + 2), // account_type_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // account_type_describe
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Account_Type entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAccount_type_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAccount_type_id(cursor.getInt(offset + 2));
        entity.setAccount_type_describe(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Account_Type entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Account_Type entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Account_Type entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}