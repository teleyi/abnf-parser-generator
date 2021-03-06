/**
 * Copyright 2011 ABNF Parser Generator Authors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package apg.abnfofabnf;

import apg.syntax.Rule;
import apg.syntax.Token;

public class BitRule extends Rule {
    // BIT = "0" / "1"
    private static final Token[] TOKENS = new Token[]{Token.newChar('0'),
            Token.newChar('1'), Token.newAlternation(),};

    public BitRule() {
        super("BIT", TOKENS);
    }

    public Object reduce(Object[] body) {
        return (Integer) body[0] - (int) '0';
    }
}
