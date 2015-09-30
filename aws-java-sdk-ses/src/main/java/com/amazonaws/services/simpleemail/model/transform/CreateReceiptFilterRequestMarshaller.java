/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Receipt Filter Request Marshaller
 */
public class CreateReceiptFilterRequestMarshaller implements Marshaller<Request<CreateReceiptFilterRequest>, CreateReceiptFilterRequest> {

    public Request<CreateReceiptFilterRequest> marshall(CreateReceiptFilterRequest createReceiptFilterRequest) {

        if (createReceiptFilterRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReceiptFilterRequest> request = new DefaultRequest<CreateReceiptFilterRequest>(createReceiptFilterRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateReceiptFilter");
        request.addParameter("Version", "2010-12-01");

        ReceiptFilter receiptFilterFilter = createReceiptFilterRequest.getFilter();
        if (receiptFilterFilter != null) {
            if (receiptFilterFilter.getName() != null) {
                request.addParameter("Filter.Name", StringUtils.fromString(receiptFilterFilter.getName()));
            }
            ReceiptIpFilter receiptIpFilterIpFilter = receiptFilterFilter.getIpFilter();
            if (receiptIpFilterIpFilter != null) {
                if (receiptIpFilterIpFilter.getPolicy() != null) {
                    request.addParameter("Filter.IpFilter.Policy", StringUtils.fromString(receiptIpFilterIpFilter.getPolicy()));
                }
                if (receiptIpFilterIpFilter.getCidr() != null) {
                    request.addParameter("Filter.IpFilter.Cidr", StringUtils.fromString(receiptIpFilterIpFilter.getCidr()));
                }
            }
        }

        return request;
    }
}
