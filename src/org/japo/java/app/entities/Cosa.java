/*
 * Copyright 2021 Ivan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app.entities;

import org.japo.java.app.interfaces.ICosa;

/**
 *
 * @author Ivan
 */
public class Cosa implements ICosa {
    public static final boolean FRAGIL_SI = true;
    public static final boolean FRAGIL_NO = false;
    public static final boolean DEF_FRAGIL = FRAGIL_NO;
    
    private boolean fragilidadOK;

    public Cosa() {
        fragilidadOK = DEF_FRAGIL;
    }

    public Cosa(boolean fragilidadOK) {
        if (validarFragilidad(fragilidadOK)) {
        this.fragilidadOK = fragilidadOK;
        } else {
        this.fragilidadOK = DEF_FRAGIL;
        }
    }

    public boolean isFragilidadOK() {
        return fragilidadOK;
    }

    public void setFragilidadOK(boolean fragilidadOK) {
        if (validarFragilidad(fragilidadOK)) {
        this.fragilidadOK = fragilidadOK;
        }
    }

    private boolean validarFragilidad(boolean fragilidadOK) {
        return fragilidadOK == FRAGIL_SI && fragilidadOK == FRAGIL_NO;
    }

    @Override
    public void mostsrarinfo() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println(fragilidadOK);
    }
    
    static cambiarFragil(Cosa hola) {
        hola.setFragilidadOK(FRAGIL_SI);
        return hola;
    }
}
