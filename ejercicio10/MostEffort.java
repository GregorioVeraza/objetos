package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class MostEffort implements Strategy{

	@Override
	public JobDescription next(JobScheduler job) {
		JobDescription nextJob = null;
		nextJob = job.getJobs().stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
        job.unschedule(nextJob);
        return nextJob;
	}

}
