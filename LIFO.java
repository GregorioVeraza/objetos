package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class LIFO implements Strategy{

	public JobDescription next(JobScheduler job) {
		JobDescription nextJob = null;
		nextJob = job.getJobs().get(job.getJobs().size()-1);
        job.unschedule(nextJob);
        return nextJob;
	}
}
