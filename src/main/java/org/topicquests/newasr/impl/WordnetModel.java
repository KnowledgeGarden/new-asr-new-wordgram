/**
 * 
 */
package org.topicquests.newasr.impl;

import org.topicquests.newasr.ASRNewWordgramEnvironment;
import org.topicquests.newasr.api.IWordnetModel;

import com.google.gson.JsonObject;

/**
 * @author jackpark
 *
 */
public class WordnetModel implements IWordnetModel {
	private ASRNewWordgramEnvironment environment;

	/**
	 * 
	 */
	public WordnetModel(ASRNewWordgramEnvironment env) {
		environment = env;
	}

	@Override
	public boolean acceptDocument(JsonObject data) {
		// TODO Auto-generated method stub
		return false;
	}

}
