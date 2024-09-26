package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class HighestPriority implements Strategy{

	public JobDescription next(JobScheduler job) {
		JobDescription nextJob = null;
		nextJob = job.getJobs().stream()
                 .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                 .orElse(null);
        job.unschedule(nextJob);
        return nextJob;
	}
	
}
