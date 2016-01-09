package org.apache.flink.scheduler;

import org.apache.mesos.Scheduler;

public class FlinkScheduler implements Scheduler {

    @Override
  public void registered(SchedulerDriver driver, FrameworkID frameworkId, MasterInfo masterInfo) {
    System.out.println("Registered! ID = " + frameworkId.getValue());
  }

  @Override
  public void reregistered(SchedulerDriver driver, MasterInfo masterInfo) {
  }

  @Override
  public void disconnected(SchedulerDriver driver) {
  }

  @Override
  public void resourceOffers(SchedulerDriver driver, List<Offer> offers) {
  }

  @Override
  public void offerRescinded(SchedulerDriver driver, OfferID offerId) {
  }

  @Override
  public void statusUpdate(SchedulerDriver driver, TaskStatus status) {
  }

  @Override
  public void frameworkMessage(SchedulerDriver driver, ExecutorID executorId, SlaveID slaveId,
      byte[] data) {
  }

  @Override
  public void slaveLost(SchedulerDriver driver, SlaveID slaveId) {
  }

  @Override
  public void executorLost(SchedulerDriver driver, ExecutorID executorId, SlaveID slaveId,
      int status) {
  }

  @Override
  public void error(SchedulerDriver driver, String message) {
    System.out.println("Error: " + message);
  }

}
