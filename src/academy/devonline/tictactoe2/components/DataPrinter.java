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

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class DataPrinter {

    public void printMappingTable() {
        System.out.println("-------------");
        for (int i = 7; i > 0; i = i - 3) {
            for (int j = 0; j < 3; j++) {
                int number = j + i;
                System.out.print("| " + number + " ");
            }
            System.out.print("|");
            System.out.println();
            System.out.println("-------------");
        }
    }

    public void printGameTable(final GameTable gameTable) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }
}

