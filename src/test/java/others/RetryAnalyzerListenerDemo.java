package others;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryAnalyzerListenerDemo implements IAnnotationTransformer
{
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
    {
         annotation.setRetryAnalyzer(RetryAnalyzerDemo.class);
    }

}
