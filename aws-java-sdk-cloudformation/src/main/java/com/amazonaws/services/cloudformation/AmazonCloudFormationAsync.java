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
package com.amazonaws.services.cloudformation;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cloudformation.model.*;

/**
 * Interface for accessing AmazonCloudFormation asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS CloudFormation <p>
 * AWS CloudFormation enables you to create and manage AWS infrastructure
 * deployments predictably and repeatedly. AWS CloudFormation helps you
 * leverage AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and
 * Auto Scaling to build highly-reliable, highly scalable, cost effective
 * applications without worrying about creating and configuring the
 * underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and
 * dependencies in a template file. The template defines a collection of
 * resources as a single unit called a stack. AWS CloudFormation creates
 * and deletes all member resources of the stack together and manages all
 * dependencies between the resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the
 * <a href="http://aws.amazon.com/cloudformation/"> CloudFormation Product Page </a>
 * .
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need
 * additional technical information about a specific AWS product, you can
 * find the product's technical documentation at
 * <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a>
 * .
 * </p>
 */
public interface AmazonCloudFormationAsync extends AmazonCloudFormation {
    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the
     * maximum number of stacks that you can create in your account.
     * </p>
     *
     * @param describeAccountLimitsRequest Container for the necessary
     *           parameters to execute the DescribeAccountLimits operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAccountLimits service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the
     * maximum number of stacks that you can create in your account.
     * </p>
     *
     * @param describeAccountLimitsRequest Container for the necessary
     *           parameters to execute the DescribeAccountLimits operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAccountLimits service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types,
     * before you create or update a stack.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you
     * submit a template, or you can get template information for a running
     * or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the
     * template information for up to 90 days after the stack has been
     * deleted. If the template does not exist, a
     * <code>ValidationError</code> is returned.
     * </p>
     *
     * @param getTemplateSummaryRequest Container for the necessary
     *           parameters to execute the GetTemplateSummary operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplateSummary service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest getTemplateSummaryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types,
     * before you create or update a stack.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you
     * submit a template, or you can get template information for a running
     * or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the
     * template information for up to 90 days after the stack has been
     * deleted. If the template does not exist, a
     * <code>ValidationError</code> is returned.
     * </p>
     *
     * @param getTemplateSummaryRequest Container for the necessary
     *           parameters to execute the GetTemplateSummary operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplateSummary service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest getTemplateSummaryRequest,
            AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest validateTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest validateTemplateRequest,
            AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest,
            AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't
     * have a policy, a null value is returned.
     * </p>
     *
     * @param getStackPolicyRequest Container for the necessary parameters to
     *           execute the GetStackPolicy operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         GetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest getStackPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't
     * have a policy, a null value is returned.
     * </p>
     *
     * @param getStackPolicyRequest Container for the necessary parameters to
     *           execute the GetStackPolicy operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest getStackPolicyRequest,
            AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the
     * template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90
     * days after the stack has been deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the
     * template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90
     * days after the stack has been deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplate service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest,
            AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     *
     * @param listStacksRequest Container for the necessary parameters to
     *           execute the ListStacks operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ListStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStacksResult> listStacksAsync(ListStacksRequest listStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     *
     * @param listStacksRequest Container for the necessary parameters to
     *           execute the ListStacks operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListStacks service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStacksResult> listStacksAsync(ListStacksRequest listStacksRequest,
            AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     *
     * @param setStackPolicyRequest Container for the necessary parameters to
     *           execute the SetStackPolicy operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         SetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStackPolicyAsync(SetStackPolicyRequest setStackPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     *
     * @param setStackPolicyRequest Container for the necessary parameters to
     *           execute the SetStackPolicy operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetStackPolicy service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setStackPolicyAsync(SetStackPolicyRequest setStackPolicyRequest,
            AsyncHandler<SetStackPolicyRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a stack as specified in the template. After the call
     * completes successfully, the stack creation starts. You can check the
     * status of the stack via the DescribeStacks API.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a stack as specified in the template. After the call
     * completes successfully, the stack creation starts. You can check the
     * status of the stack via the DescribeStacks API.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest,
            AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     *
     * @param estimateTemplateCostRequest Container for the necessary
     *           parameters to execute the EstimateTemplateCost operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         EstimateTemplateCost service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest estimateTemplateCostRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     *
     * @param estimateTemplateCostRequest Container for the necessary
     *           parameters to execute the EstimateTemplateCost operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EstimateTemplateCost service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest estimateTemplateCostRequest,
            AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to
     * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"> Stacks </a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b>You can list events for stacks that have failed to create
     * or have been deleted by specifying the unique stack identifier (stack
     * ID).
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackEvents service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest describeStackEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to
     * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"> Stacks </a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b>You can list events for stacks that have failed to create
     * or have been deleted by specifying the unique stack identifier (stack
     * ID).
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackEvents service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest describeStackEventsRequest,
            AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a
     * creation policy or update policy. AWS CloudFormation doesn't proceed
     * with a stack creation or update until resources receive the required
     * number of signals or the timeout period is exceeded. The
     * SignalResource API is useful in cases where you want to send signals
     * from anywhere other than an Amazon EC2 instance.
     * </p>
     *
     * @param signalResourceRequest Container for the necessary parameters to
     *           execute the SignalResource operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         SignalResource service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> signalResourceAsync(SignalResourceRequest signalResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a
     * creation policy or update policy. AWS CloudFormation doesn't proceed
     * with a stack creation or update until resources receive the required
     * number of signals or the timeout period is exceeded. The
     * SignalResource API is useful in cases where you want to send signals
     * from anywhere other than an Amazon EC2 instance.
     * </p>
     *
     * @param signalResourceRequest Container for the necessary parameters to
     *           execute the SignalResource operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SignalResource service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> signalResourceAsync(SignalResourceRequest signalResourceRequest,
            AsyncHandler<SignalResourceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a description of the specified resource in the specified
     * stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param describeStackResourceRequest Container for the necessary
     *           parameters to execute the DescribeStackResource operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResource service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest describeStackResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a description of the specified resource in the specified
     * stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param describeStackResourceRequest Container for the necessary
     *           parameters to execute the DescribeStackResource operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResource service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest describeStackResourceRequest,
            AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the
     * previous stack configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>You can cancel only stacks that are in the
     * UPDATE_IN_PROGRESS state.
     * </p>
     *
     * @param cancelUpdateStackRequest Container for the necessary parameters
     *           to execute the CancelUpdateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         CancelUpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelUpdateStackAsync(CancelUpdateStackRequest cancelUpdateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the
     * previous stack configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>You can cancel only stacks that are in the
     * UPDATE_IN_PROGRESS state.
     * </p>
     *
     * @param cancelUpdateStackRequest Container for the necessary parameters
     *           to execute the CancelUpdateStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelUpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelUpdateStackAsync(CancelUpdateStackRequest cancelUpdateStackRequest,
            AsyncHandler<CancelUpdateStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a stack as specified in the template. After the call
     * completes successfully, the stack update starts. You can check the
     * status of the stack via the DescribeStacks action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
     * </p>
     * <p>
     * Tags that were associated with this stack during creation time will
     * still be associated with the stack after an <code>UpdateStack</code>
     * operation.
     * </p>
     * <p>
     * For more information about creating an update template, updating a
     * stack, and monitoring the progress of the update, see
     * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"> Updating a Stack </a>
     * .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a stack as specified in the template. After the call
     * completes successfully, the stack update starts. You can check the
     * status of the stack via the DescribeStacks action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
     * </p>
     * <p>
     * Tags that were associated with this stack during creation time will
     * still be associated with the stack after an <code>UpdateStack</code>
     * operation.
     * </p>
     * <p>
     * For more information about creating an update template, updating a
     * stack, and monitoring the progress of the update, see
     * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"> Updating a Stack </a>
     * .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest,
            AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <p>
     * <b>NOTE:</b>Only the first 100 resources will be returned. If your
     * stack has more resources than this, you should use ListStackResources
     * instead.
     * </p>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns
     * resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the
     * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide"> AWS CloudFormation User Guide </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b>A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest describeStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <p>
     * <b>NOTE:</b>Only the first 100 resources will be returned. If your
     * stack has more resources than this, you should use ListStackResources
     * instead.
     * </p>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns
     * resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the
     * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide"> AWS CloudFormation User Guide </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b>A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest describeStackResourcesRequest,
            AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param listStackResourcesRequest Container for the necessary
     *           parameters to execute the ListStackResources operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ListStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest listStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param listStackResourcesRequest Container for the necessary
     *           parameters to execute the ListStackResources operation on
     *           AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListStackResources service method, as returned by
     *         AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest listStackResourcesRequest,
            AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully,
     * stack deletion starts. Deleted stacks do not show up in the
     * DescribeStacks API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully,
     * stack deletion starts. Deleted stacks do not show up in the
     * DescribeStacks API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AmazonCloudFormation.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(DeleteStackRequest deleteStackRequest,
            AsyncHandler<DeleteStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        