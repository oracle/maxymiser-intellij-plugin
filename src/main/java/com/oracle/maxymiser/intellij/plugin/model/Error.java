/*
 * Copyright © 2019 Oracle America Inc. and its affiliates. All rights reserved.
 *
 * Licensed under the Universal Permissive License (UPL) v 1.0 as shown at http://oss.oracle.com/licenses/upl/.
 */

package com.oracle.maxymiser.intellij.plugin.model;

public class Error {
    private String message;
    private String parameter;
    private String code;

    public String getMessage() {
        return message;
    }

    public String getParameter() {
        return parameter;
    }

    public String getCode() {
        return code;
    }
}
