/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents the result of conversational query or event processing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1QueryResult extends com.google.api.client.json.GenericJson {

  /**
   * The action name from the matched intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * This field is set to: - `false` if the matched intent has required parameters and not all of
   * the required parameter values have been collected. - `true` if all required parameter values
   * have been collected, or if the    matched intent doesn't contain any required parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allRequiredParamsPresent;

  /**
   * The free-form diagnostic info. For example, this field could contain webhook call latency. The
   * string keys of the Struct's fields map can change without notice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> diagnosticInfo;

  /**
   * The collection of rich messages to present to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentMessage> fulfillmentMessages;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1IntentMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1IntentMessage.class);
  }

  /**
   * The text to be pronounced to the user or shown on the screen. Note: This is a legacy field,
   * `fulfillment_messages` should be preferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fulfillmentText;

  /**
   * The intent that matched the conversational query. Some, not all fields are filled in this
   * message, including but not limited to: `name`, `display_name` and `webhook_state`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1Intent intent;

  /**
   * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain). If there are `multiple knowledge_answers` messages, this value is set to
   * the greatest `knowledgeAnswers.match_confidence` value in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float intentDetectionConfidence;

  /**
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1KnowledgeAnswers knowledgeAnswers;

  /**
   * The language that was triggered during intent detection. See [Language
   * Support](https://dialogflow.com/docs/reference/language) for a list of the currently supported
   * language codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * The collection of output contexts. If applicable, `output_contexts.parameters` contains entries
   * with name `.original` containing the original parameter values before the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1Context> outputContexts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1Context used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1Context.class);
  }

  /**
   * The collection of extracted parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> parameters;

  /**
   * The original conversational query text: - If natural language text was provided as input,
   * `query_text` contains   a copy of the input. - If natural language speech audio was provided as
   * input, `query_text`   contains the speech recognition result. If speech recognizer produced
   * multiple alternatives, a particular one is picked. - If an event was provided as input,
   * `query_text` is not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryText;

  /**
   * The sentiment analysis result, which depends on the `sentiment_analysis_request_config`
   * specified in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1SentimentAnalysisResult sentimentAnalysisResult;

  /**
   * The Speech recognition confidence between 0.0 and 1.0. A higher number indicates an estimated
   * greater likelihood that the recognized words are correct. The default of 0.0 is a sentinel
   * value indicating that confidence was not set.
   *
   * This field is not guaranteed to be accurate or set. In particular this field isn't set for
   * StreamingDetectIntent since the streaming endpoint has separate confidence estimates per
   * portion of the audio in StreamingRecognitionResult.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float speechRecognitionConfidence;

  /**
   * If the query was fulfilled by a webhook call, this field is set to the value of the `payload`
   * field returned in the webhook response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> webhookPayload;

  /**
   * If the query was fulfilled by a webhook call, this field is set to the value of the `source`
   * field returned in the webhook response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webhookSource;

  /**
   * The action name from the matched intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The action name from the matched intent.
   * @param action action or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * This field is set to: - `false` if the matched intent has required parameters and not all of
   * the required parameter values have been collected. - `true` if all required parameter values
   * have been collected, or if the    matched intent doesn't contain any required parameters.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllRequiredParamsPresent() {
    return allRequiredParamsPresent;
  }

  /**
   * This field is set to: - `false` if the matched intent has required parameters and not all of
   * the required parameter values have been collected. - `true` if all required parameter values
   * have been collected, or if the    matched intent doesn't contain any required parameters.
   * @param allRequiredParamsPresent allRequiredParamsPresent or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setAllRequiredParamsPresent(java.lang.Boolean allRequiredParamsPresent) {
    this.allRequiredParamsPresent = allRequiredParamsPresent;
    return this;
  }

  /**
   * The free-form diagnostic info. For example, this field could contain webhook call latency. The
   * string keys of the Struct's fields map can change without notice.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getDiagnosticInfo() {
    return diagnosticInfo;
  }

  /**
   * The free-form diagnostic info. For example, this field could contain webhook call latency. The
   * string keys of the Struct's fields map can change without notice.
   * @param diagnosticInfo diagnosticInfo or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setDiagnosticInfo(java.util.Map<String, java.lang.Object> diagnosticInfo) {
    this.diagnosticInfo = diagnosticInfo;
    return this;
  }

  /**
   * The collection of rich messages to present to the user.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentMessage> getFulfillmentMessages() {
    return fulfillmentMessages;
  }

  /**
   * The collection of rich messages to present to the user.
   * @param fulfillmentMessages fulfillmentMessages or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setFulfillmentMessages(java.util.List<GoogleCloudDialogflowV2beta1IntentMessage> fulfillmentMessages) {
    this.fulfillmentMessages = fulfillmentMessages;
    return this;
  }

  /**
   * The text to be pronounced to the user or shown on the screen. Note: This is a legacy field,
   * `fulfillment_messages` should be preferred.
   * @return value or {@code null} for none
   */
  public java.lang.String getFulfillmentText() {
    return fulfillmentText;
  }

  /**
   * The text to be pronounced to the user or shown on the screen. Note: This is a legacy field,
   * `fulfillment_messages` should be preferred.
   * @param fulfillmentText fulfillmentText or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setFulfillmentText(java.lang.String fulfillmentText) {
    this.fulfillmentText = fulfillmentText;
    return this;
  }

  /**
   * The intent that matched the conversational query. Some, not all fields are filled in this
   * message, including but not limited to: `name`, `display_name` and `webhook_state`.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1Intent getIntent() {
    return intent;
  }

  /**
   * The intent that matched the conversational query. Some, not all fields are filled in this
   * message, including but not limited to: `name`, `display_name` and `webhook_state`.
   * @param intent intent or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setIntent(GoogleCloudDialogflowV2beta1Intent intent) {
    this.intent = intent;
    return this;
  }

  /**
   * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain). If there are `multiple knowledge_answers` messages, this value is set to
   * the greatest `knowledgeAnswers.match_confidence` value in the list.
   * @return value or {@code null} for none
   */
  public java.lang.Float getIntentDetectionConfidence() {
    return intentDetectionConfidence;
  }

  /**
   * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain). If there are `multiple knowledge_answers` messages, this value is set to
   * the greatest `knowledgeAnswers.match_confidence` value in the list.
   * @param intentDetectionConfidence intentDetectionConfidence or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setIntentDetectionConfidence(java.lang.Float intentDetectionConfidence) {
    this.intentDetectionConfidence = intentDetectionConfidence;
    return this;
  }

  /**
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1KnowledgeAnswers getKnowledgeAnswers() {
    return knowledgeAnswers;
  }

  /**
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * @param knowledgeAnswers knowledgeAnswers or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setKnowledgeAnswers(GoogleCloudDialogflowV2beta1KnowledgeAnswers knowledgeAnswers) {
    this.knowledgeAnswers = knowledgeAnswers;
    return this;
  }

  /**
   * The language that was triggered during intent detection. See [Language
   * Support](https://dialogflow.com/docs/reference/language) for a list of the currently supported
   * language codes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The language that was triggered during intent detection. See [Language
   * Support](https://dialogflow.com/docs/reference/language) for a list of the currently supported
   * language codes.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * The collection of output contexts. If applicable, `output_contexts.parameters` contains entries
   * with name `.original` containing the original parameter values before the query.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1Context> getOutputContexts() {
    return outputContexts;
  }

  /**
   * The collection of output contexts. If applicable, `output_contexts.parameters` contains entries
   * with name `.original` containing the original parameter values before the query.
   * @param outputContexts outputContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setOutputContexts(java.util.List<GoogleCloudDialogflowV2beta1Context> outputContexts) {
    this.outputContexts = outputContexts;
    return this;
  }

  /**
   * The collection of extracted parameters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * The collection of extracted parameters.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setParameters(java.util.Map<String, java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * The original conversational query text: - If natural language text was provided as input,
   * `query_text` contains   a copy of the input. - If natural language speech audio was provided as
   * input, `query_text`   contains the speech recognition result. If speech recognizer produced
   * multiple alternatives, a particular one is picked. - If an event was provided as input,
   * `query_text` is not set.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryText() {
    return queryText;
  }

  /**
   * The original conversational query text: - If natural language text was provided as input,
   * `query_text` contains   a copy of the input. - If natural language speech audio was provided as
   * input, `query_text`   contains the speech recognition result. If speech recognizer produced
   * multiple alternatives, a particular one is picked. - If an event was provided as input,
   * `query_text` is not set.
   * @param queryText queryText or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setQueryText(java.lang.String queryText) {
    this.queryText = queryText;
    return this;
  }

  /**
   * The sentiment analysis result, which depends on the `sentiment_analysis_request_config`
   * specified in the request.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SentimentAnalysisResult getSentimentAnalysisResult() {
    return sentimentAnalysisResult;
  }

  /**
   * The sentiment analysis result, which depends on the `sentiment_analysis_request_config`
   * specified in the request.
   * @param sentimentAnalysisResult sentimentAnalysisResult or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setSentimentAnalysisResult(GoogleCloudDialogflowV2beta1SentimentAnalysisResult sentimentAnalysisResult) {
    this.sentimentAnalysisResult = sentimentAnalysisResult;
    return this;
  }

  /**
   * The Speech recognition confidence between 0.0 and 1.0. A higher number indicates an estimated
   * greater likelihood that the recognized words are correct. The default of 0.0 is a sentinel
   * value indicating that confidence was not set.
   *
   * This field is not guaranteed to be accurate or set. In particular this field isn't set for
   * StreamingDetectIntent since the streaming endpoint has separate confidence estimates per
   * portion of the audio in StreamingRecognitionResult.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSpeechRecognitionConfidence() {
    return speechRecognitionConfidence;
  }

  /**
   * The Speech recognition confidence between 0.0 and 1.0. A higher number indicates an estimated
   * greater likelihood that the recognized words are correct. The default of 0.0 is a sentinel
   * value indicating that confidence was not set.
   *
   * This field is not guaranteed to be accurate or set. In particular this field isn't set for
   * StreamingDetectIntent since the streaming endpoint has separate confidence estimates per
   * portion of the audio in StreamingRecognitionResult.
   * @param speechRecognitionConfidence speechRecognitionConfidence or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setSpeechRecognitionConfidence(java.lang.Float speechRecognitionConfidence) {
    this.speechRecognitionConfidence = speechRecognitionConfidence;
    return this;
  }

  /**
   * If the query was fulfilled by a webhook call, this field is set to the value of the `payload`
   * field returned in the webhook response.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getWebhookPayload() {
    return webhookPayload;
  }

  /**
   * If the query was fulfilled by a webhook call, this field is set to the value of the `payload`
   * field returned in the webhook response.
   * @param webhookPayload webhookPayload or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setWebhookPayload(java.util.Map<String, java.lang.Object> webhookPayload) {
    this.webhookPayload = webhookPayload;
    return this;
  }

  /**
   * If the query was fulfilled by a webhook call, this field is set to the value of the `source`
   * field returned in the webhook response.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebhookSource() {
    return webhookSource;
  }

  /**
   * If the query was fulfilled by a webhook call, this field is set to the value of the `source`
   * field returned in the webhook response.
   * @param webhookSource webhookSource or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult setWebhookSource(java.lang.String webhookSource) {
    this.webhookSource = webhookSource;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1QueryResult set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1QueryResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1QueryResult clone() {
    return (GoogleCloudDialogflowV2beta1QueryResult) super.clone();
  }

}
