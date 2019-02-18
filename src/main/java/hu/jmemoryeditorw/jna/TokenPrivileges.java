package hu.jmemoryeditorw.jna;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

/** A token privileges record. */
@FieldOrder({ "PrivilegeCount", "Privileges" })
public class TokenPrivileges extends Structure {
    /** Specifies the number of entries in the Privileges array. */
    public int PrivilegeCount;
    /** Specifies an array of LUIDandAttributes structures. */
    public LUIDandAttributes[] Privileges;
    
    /**
     * Constructor, call {@link #init(int)}!
     */
    public TokenPrivileges() {
        
    }
    
    /** Initializes the structure with a predetermined number of items in the Privileges array. */
    public void init(int PrivilegeCount) {
        this.PrivilegeCount = PrivilegeCount;
        Privileges = new LUIDandAttributes[PrivilegeCount];
        for (int i = 0; i < Privileges.length; i++) {
            Privileges[i] = new LUIDandAttributes();
        }
        allocateMemory();
    }
}