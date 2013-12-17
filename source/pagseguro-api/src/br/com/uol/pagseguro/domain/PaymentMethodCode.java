/*
 * ***********************************************************************
 Copyright [2011] [PagSeguro Internet Ltda.]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 * ***********************************************************************
 */

package br.com.uol.pagseguro.domain;

import br.com.uol.pagseguro.enums.PaymentCode;

/**
 * Defines a list of known payment method codes.
 */
public class PaymentMethodCode {

    /**
     * Payment method code Example : 101
     * 
     * @var Integer
     */
    private Integer value;

    /**
     * Construct
     */
    public PaymentMethodCode() {
    }

    /**
     * Construct
     * 
     * @param value
     */
    public PaymentMethodCode(Integer value) {
        this.value = value;
    }

    /**
     * Set value method payment by type
     * 
     * @param type
     */
    public void setByType(String type) {

        Integer auxValue = 0;

        for (PaymentCode code : PaymentCode.values()) {
            if (type.equalsIgnoreCase(code.getType())) {
                auxValue = code.getValue();
            }
        }

        if (auxValue > 0) {
            this.setValue(auxValue);
        }
    }

    /**
     * 
     * @param value
     * @return type corresponding to the informed value
     */
    public String getTypeFromValue(Integer value) {

        String type = "";

        for (PaymentCode code : PaymentCode.values()) {
            if (value.equals(code.getValue())) {
                type = code.getType();
            }
        }
        return type;
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}