/*
 * Classname            : jna.TagWndClassExW
 * Version information  : 1.0
 * Date                 : 2008.12.16.
 * Copyright notice     : Karnok David
 */

package hu.jmemoryeditorw.jna;

import com.sun.jna.*;
import com.sun.jna.Structure.FieldOrder;
/**
 * The structure for the tagWNDCLASSEXW structure.
 * <a href='http://msdn.microsoft.com/en-us/library/ms633577(VS.85).aspx'>Msdn</a>
 * @author karnokd, 2008.12.16.
 * @version $Revision 1.0$
 */
@FieldOrder({ "cbSize", "style", "lpfnWndProc", "cbClsExtra", 
    "cbWndExtra", "hInstance", "hIcon", "hCursor", "hbrBackground", 
    "lpszMenuName", "lpszClassName", "hIconSm" })
public class TagWndClassExW extends Structure {
    public int cbSize;
    public int style;
    public int lpfnWndProc;
    public int cbClsExtra;
    public int cbWndExtra;
    public int hInstance;
    public int hIcon;
    public int hCursor;
    public int hbrBackground;
    public Pointer lpszMenuName;
    public Pointer lpszClassName;
    public int hIconSm;
    /**
     * Constructor. Sets the cbSize field to the actual record size.
     */
    public TagWndClassExW() {
        super();
        cbSize = size();
    }
}