package org.apache.flink.scheduler;

import org.apache.mesos.Protos;
import org.apache.mesos.Scheduler;
import org.apache.mesos.SchedulerDriver;

import java.util.List;

public class FlinkScheduler implements Scheduler {

	@Override
	public void registered(SchedulerDriver driver, Protos.FrameworkID frameworkId, Protos.MasterInfo masterInfo) {
		System.out.println("Registered! ID = " + frameworkId.getValue());
	}

	@Override
	public void reregistered(SchedulerDriver driver, Protos.MasterInfo masterInfo) {

	}

	@Override
	public void resourceOffers(SchedulerDriver driver, List<Protos.Offer> offers) {

	}

	@Override
	public void offerRescinded(SchedulerDriver driver, Protos.OfferID offerId) {

	}

	@Override
	public void statusUpdate(SchedulerDriver driver, Protos.TaskStatus status) {

	}

	@Override
	public void frameworkMessage(SchedulerDriver driver, Protos.ExecutorID executorId, Protos.SlaveID slaveId, byte[] data) {

	}

	@Override
	public void disconnected(SchedulerDriver driver) {

	}

	@Override
	public void slaveLost(SchedulerDriver driver, Protos.SlaveID slaveId) {

	}

	@Override
	public void executorLost(SchedulerDriver driver, Protos.ExecutorID executorId, Protos.SlaveID slaveId, int status) {

	}

	@Override
	public void error(SchedulerDriver driver, String message) {
		System.out.println("Error: " + message);
	}
}
