/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubmitNodeTupleOrderRequest extends RpcAcsRequest<SubmitNodeTupleOrderResponse> {
	
	public SubmitNodeTupleOrderRequest() {
		super("LinkWAN", "2018-12-30", "SubmitNodeTupleOrder", "linkwan");
	}

	private String loraVersion;

	private Long requiredCount;

	public String getLoraVersion() {
		return this.loraVersion;
	}

	public void setLoraVersion(String loraVersion) {
		this.loraVersion = loraVersion;
		if(loraVersion != null){
			putBodyParameter("LoraVersion", loraVersion);
		}
	}

	public Long getRequiredCount() {
		return this.requiredCount;
	}

	public void setRequiredCount(Long requiredCount) {
		this.requiredCount = requiredCount;
		if(requiredCount != null){
			putBodyParameter("RequiredCount", requiredCount.toString());
		}
	}

	@Override
	public Class<SubmitNodeTupleOrderResponse> getResponseClass() {
		return SubmitNodeTupleOrderResponse.class;
	}

}