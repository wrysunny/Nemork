/* =============================================================================
 *                      GENERATED FILE - DO NOT MODIFY
 * =============================================================================
 * Copyright (c) 2016 Microsoft. All rights reserved.
 * 
 */
package com.skype;
import android.support.v4.util.SparseArrayCompat;
import java.util.Set;
import java.util.HashSet;
import java.lang.ref.ReferenceQueue;
import com.skype.NativeStringConvert;

public interface AddParticipantParameters {
	public interface AddParticipantParametersIListener {
	}

	public void addListener(AddParticipantParametersIListener listener);

	public void removeListener(AddParticipantParametersIListener listener);

	
	public SkyLib.IN_MEMORY_OBJECTTYPE getInMemObjectType();

	public int getObjectID();

	public void setAdditionalData(String additionalData);

	public void setCauseId(String causeId);

	public void setDisableUnmute(boolean disableUnmute);

	public void setMessageId(String messageId);

	public void setThreadId(String threadId);

}

