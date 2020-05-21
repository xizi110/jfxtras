/**
 * Copyright (c) 2011-2020, JFXtras
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *    Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *    Neither the name of the organization nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package jfxtras.internal.scene.control.skin.agenda.icalendar.base24hour.popup;

import java.time.temporal.Temporal;
import java.util.List;

import jfxtras.icalendarfx.components.VTodo;
import jfxtras.icalendarfx.properties.component.time.DurationProp;

/** 
 * Controller for editing descriptive properties in a {@link VTodo}
 * 
 * @author David Bal
 */
public class EditDescriptiveVTodoVBox extends EditDescriptiveLocatableVBox<VTodo>
{
    public EditDescriptiveVTodoVBox()
    {
        super();
        endLabel.setText( getResources().getString("due.time") );
    }
    
    @Override
    public void setupData(
//            Appointment appointment,
            VTodo vComponent,
            Temporal startRecurrence,
            Temporal endRecurrence,
            List<String> categories)
    {        
        // Convert duration to date/time end - this controller can't handle VEvents with duration
        if (vComponent.getDuration() != null)
        {
            Temporal end = vComponent.getDateTimeStart().getValue().plus(vComponent.getDuration().getValue());
            vComponent.setDuration((DurationProp) null);
            vComponent.setDateTimeDue(end);
        }
        
        super.setupData(vComponent, startRecurrence, endRecurrence, categories);
    }
}
