package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;

    public JobScheduler (Strategy strategy) {
        this.jobs = new ArrayList<>();
        this.strategy = strategy;
    }

    public void schedule(JobDescription job) {//agrega un job a la coleccion
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {// saca un job de la coleccion
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Strategy aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
    	return strategy.next(this);
    }

}
