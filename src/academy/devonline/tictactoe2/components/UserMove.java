/*
 *
 * Copyright (c) 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.tictactoe2.components;

import academy.devonline.tictactoe2.model.Cell;
import academy.devonline.tictactoe2.model.GameTable;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class UserMove {


    private final CellNumberConverter cellNumberConverter;

    public UserMove(final CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void make(final GameTable gameTable) {


        while (true) {

            System.out.println("Please type number between 1 and 9:");
            Scanner in = new Scanner(System.in);
            String string = in.nextLine();
            char ch = string.charAt(0);

            if (ch >= '1' && ch <= '9') {
                Cell cell = cellNumberConverter.toCell(ch);
                if (gameTable.isEmpty(cell)) {
                    gameTable.setSign(cell, 'X');
                    return;
                } else {
                    System.out.println("Can't make a move, because the cell is not free! Try again!");
                }
            }
        }
    }
}


