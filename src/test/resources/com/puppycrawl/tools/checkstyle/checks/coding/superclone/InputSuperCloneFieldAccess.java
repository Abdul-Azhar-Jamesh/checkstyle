/*
SuperClone


*/

package com.puppycrawl.tools.checkstyle.checks.coding.superclone;

class InputSuperCloneFieldAccessParent {
    Object clone;
}

public class InputSuperCloneFieldAccess extends InputSuperCloneFieldAccessParent {

    @Override
    public Object clone() { // violation 'Method 'clone' should call 'super.clone'.'
        return super.clone;
    }

    Object fieldAccess() {
        return super.clone;
    }

    String fieldAccessAsArgument() {
        return String.valueOf(super.clone);
    }
}
