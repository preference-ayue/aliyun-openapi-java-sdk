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

package com.aliyuncs.lubancloud.model.v20180509;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryCutoutTaskResultRequest extends RpcAcsRequest<QueryCutoutTaskResultResponse> {
	
	public QueryCutoutTaskResultRequest() {
		super("lubancloud", "2018-05-09", "QueryCutoutTaskResult", "luban");
	}

	private Long taskId;

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<QueryCutoutTaskResultResponse> getResponseClass() {
		return QueryCutoutTaskResultResponse.class;
	}

}
