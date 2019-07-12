package org.apache.beam.runners.dataflow;

import java.util.List;

import com.google.api.services.dataflow.model.CounterUpdate;

import org.apache.beam.sdk.annotations.Experimental;

@Experimental
public interface WorkerMetricsReceiver {
  void receiverCounterUpdates(List<CounterUpdate> updates);
}
