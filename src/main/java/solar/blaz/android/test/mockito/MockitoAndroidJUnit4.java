package solar.blaz.android.test.mockito;

import android.support.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.mockito.internal.runners.RunnerFactory;
import org.mockito.internal.runners.RunnerImpl;

import java.lang.reflect.InvocationTargetException;

public class MockitoAndroidJUnit4 extends AndroidJUnit4ClassRunner {

    private final RunnerImpl runner;

    public MockitoAndroidJUnit4(Class<?> klass) throws InitializationError, InvocationTargetException {
        super(klass, null);
        runner = new RunnerFactory().create(klass);
    }

    @Override
    public void run(final RunNotifier notifier) {
        runner.run(notifier);
    }

    @Override
    public Description getDescription() {
        return runner.getDescription();
    }

    public void filter(Filter filter) throws NoTestsRemainException {
        //filter is required because without it UnrootedTests show up in Eclipse
        runner.filter(filter);
    }
}
