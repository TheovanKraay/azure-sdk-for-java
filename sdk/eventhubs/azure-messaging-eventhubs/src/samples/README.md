---
page_type: sample
languages:
  - java
products:
  - azure
  - azure-event-hubs
urlFragment: eventhubs-samples
---

# Azure Event Hubs client library samples for Java

Azure Event Hubs samples are a set of self-contained Java programs that demonstrate interacting with Azure Event Hubs
using the client library. Each sample focuses on a specific scenario and can be executed independently.

## Key concepts
Key concepts are explained in detail [here][sdk_readme_key_concepts].

## Getting started
Please refer to the [Getting Started][sdk_readme_getting_started] section.

### Obtaining an Event Hub instance connection string

All the samples authorize with an Event Hub using a connection string generated for that Event Hub. The connection
string value can be obtained by:

1. Going to your Event Hubs namespace in Azure Portal.
1. Creating an Event Hub instance.
1. Creating a "Shared access policy" for your Event Hub instance.
1. Copying the connection string from the policy's properties.

## Examples

- [Inspect Event Hub and partition properties][sample_get_event_hubs_metadata]
- [Publish events using Microsoft identity platform][sample_publish_identity]
- [Publish events to a specific Event Hub partition with partition identifier][sample_publish_partitionId]
- [Publish events to a specific Event Hub partition with partition key][sample_publish_partitionKey]
- [Publish events to an Event Hub with a size-limited batch][sample_publish_size_limited]
- [Publish events using web sockets and a proxy][sample_publish_web_sockets_proxy]
- [Publish events with custom metadata][sample_publish_custom_metadata]
- [Publish events with EventHubBufferedProducerClient][sample_publish_buffered_producer]
- [Publish stream of events][sample_publish_stream_events]
- [Publish events through an intermediary endpoint][sample_intermediary_endpoint]
- [Publish events and consume events using a shared connection][sample_share_connection]
- [Consume events from an Event Hub partition][sample_consume_event]
- [Consume events from all partitions using EventProcessorClient][sample_event_processor]
- [Consume events from all partitions and checkpoint after some number of events][sample_event_processor_checkpointing]
- [Consume events from all partitions and manage state of events using
  EventProcessorClient][sample_event_processor_aggregate_state_management]
- [Consume events from all partitions and provide an initial EventPosition][sample_event_processor_initial_event_position]
- [Consume events starting from an event sequence number][sample_consume_sequence_number]

## Troubleshooting
See [Troubleshooting][sdk_readme_troubleshooting].

## Next steps
See [Next steps][sdk_readme_next_steps].

## Contributing

If you would like to become an active contributor to this project please refer to our [Contribution
Guidelines](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/CONTRIBUTING.md) for more information.

<!-- Links -->
[sample_consume_event]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/ConsumeEvents.java
[sample_consume_sequence_number]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/ConsumeEventsFromKnownSequenceNumberPosition.java
[sample_event_processor_aggregate_state_management]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/EventProcessorClientAggregateEventsSample.java
[sample_event_processor]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/EventProcessorClientSample.java
[sample_event_processor_checkpointing]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/EventProcessorClientCheckpointing.java
[sample_event_processor_initial_event_position]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/EventProcessorClientSetInitialEventPosition.java
[sample_get_event_hubs_metadata]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/GetEventHubMetadata.java
[sample_intermediary_endpoint]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsCustomEndpoint.java
[sample_publish_buffered_producer]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsBufferedProducer.java
[sample_publish_custom_metadata]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsWithCustomMetadata.java
[sample_publish_identity]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsWithAzureIdentity.java
[sample_publish_partitionId]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsToSpecificPartition.java
[sample_publish_partitionKey]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsWithPartitionKey.java
[sample_publish_size_limited]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsWithSizeLimitedBatches.java
[sample_publish_stream_events]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishStreamOfEvents.java
[sample_publish_web_sockets_proxy]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/PublishEventsWithWebSocketsAndProxy.java
[sample_share_connection]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/src/samples/java/com/azure/messaging/eventhubs/ShareConnectionBetweenClients.java
[sdk_readme_getting_started]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/README.md#getting-started
[sdk_readme_key_concepts]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/README.md#key-concepts
[sdk_readme_next_steps]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/README.md#next-steps
[sdk_readme_troubleshooting]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventhubs/azure-messaging-eventhubs/README.md#troubleshooting


