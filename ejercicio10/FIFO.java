package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class FIFO implements Strategy{

	public JobDescription next(JobScheduler scheduler) {
		JobDescription nextJob = null;
		nextJob = scheduler.jobs.get(0);
        scheduler.unschedule(nextJob);
        return nextJob;
	}
}
