package hu.jmemoryeditorw.jna;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

/** Locally Unique Identifier record. */
@FieldOrder({ "LowPart", "HiPart" })
public class LUID extends Structure {
    public int LowPart;
    public int HiPart;
}