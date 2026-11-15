/*
SuperFinalize


*/

package com.puppycrawl.tools.checkstyle.checks.coding.superfinalize;

class InputSuperFinalizeFieldAccessParent {
    int finalize;
}

public class InputSuperFinalizeFieldAccess extends InputSuperFinalizeFieldAccessParent {

    @Override
    protected void finalize() { // violation 'Method 'finalize' should call 'super.finalize'.'
        int value = super.finalize;
    }

    int fieldAccess() {
        return super.finalize;
    }

    int fieldAccessInExpression() {
        return super.finalize + 1;
    }
}
