package io.javabrains.ipldashboard.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;

class JobCompletionNotificationListenerTest {
    @Test
    void testAfterJob() {
        JobCompletionNotificationListener jobCompletionNotificationListener = new JobCompletionNotificationListener(null);
        JobExecution jobExecution = new JobExecution(123L);
        jobCompletionNotificationListener.afterJob(jobExecution);
        assertEquals("JobExecution: id=123, version=null, startTime=null, endTime=null, lastUpdated=null, status=STARTING,"
                + " exitStatus=exitCode=UNKNOWN;exitDescription=, job=[null], jobParameters=[{}]", jobExecution.toString());
        assertFalse(jobExecution.isRunning());
        assertTrue(jobExecution.getStepExecutions().isEmpty());
        assertEquals(BatchStatus.STARTING, jobExecution.getStatus());
        assertTrue(jobExecution.getFailureExceptions().isEmpty());
        assertEquals(123L, jobExecution.getId().longValue());
    }
}

