/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*
  Copyright (c) 2012 Pat Hickey <pat@moreproductive.org>
  All Rights Reserved.

  Sorry if this code smells - I have no idea how to write Java. - 20 Dec 2012

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License version 2
  as published by the Free Software Foundation.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software Foundation,
  Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package processing.app.ardupilot;

/** APHal is a datatype for keeping info associated with HAL board configs.
 *  I do a bad thing and use configFlag = null when we aren't building for the
 *  HAL.
 */
public class APHal {
    public String configFlag;
    public String description;
    public String boardName;
    public APHal( String aConfigFlag, String aDescription, String aBoardName ){
        configFlag = aConfigFlag;
        description = aDescription;
        boardName  = aBoardName;
    }
}

