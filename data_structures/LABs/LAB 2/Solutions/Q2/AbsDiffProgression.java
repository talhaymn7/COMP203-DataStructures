/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//package dsaj.design;

//57 pts

import java.lang.Math; //4 pts

public class AbsDiffProgression extends Progression { //6 pts

  protected long prev; //4 pts

  /** Default constructor starting 2, 200, 198, 2, 196, 194, 2, ... */
  public AbsDiffProgression() { this(2, 200); } //8 pts

  /** Two parameter constructor */
  public AbsDiffProgression(long first, long second) { //7 pts
    super(first); //3 pts
    prev = first - second; //5 pts 
  }

  /** Replaces (prev,current) with (current, abs(current-prev)). */
  protected void advance() { //4 pts
    long temp = prev; //4 pts
    prev = current; //3 pts
    current = Math.abs(current-temp); //7 pts
  } //1 pts
} //1 pts

