package denispavlov.sandbox.cloning;

import com.google.caliper.Benchmark;
import com.google.caliper.Param;
import com.google.caliper.runner.CaliperMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * User: denispavlov
 * Date: 24/03/2014
 * Time: 11:05
 */
public class PerformanceBasicClonableVsConstructor extends Benchmark {

    @Param({ "5000", "7500", "10000" })
    private int length;

    private final ClonableBasicImpl clonable;
    private final NonClonableBasicImpl nonclonable;

    public PerformanceBasicClonableVsConstructor() {
        clonable = createCloneInstance();

        nonclonable = createNonCloneInstance();
    }

    public Object timeClonablePerformance(int reps) throws Exception {

        final List obj = new ArrayList(length);

        for (int i = 0; i < reps; i++) {

            for (int ii = 0; ii < length; ii++) {

                obj.add(clonable.clone());

            }

        }

        return obj;
    }

    private ClonableBasicImpl createCloneInstance() {

        final ClonableBasicImpl instance = new ClonableBasicImpl();
        instance.setProp1("1");
        instance.setProp2("2");
        instance.setProp3("3");
        instance.setProp4("4");
        instance.setProp5("5");
        instance.setProp6("6");
        instance.setProp7("7");
        instance.setProp8("8");
        instance.setProp9("9");
        instance.setProp10("10");

        return instance;

    }

    public Object timeNonClonablePerformance(int sampleSize) throws Exception {

        final List obj = new ArrayList(length);

        for (int i = 0; i < sampleSize; i++) {

            for (int ii = 0; ii < length; ii++) {

                obj.add(nonclonable.copy());

            }

        }

        return obj;

    }


    private NonClonableBasicImpl createNonCloneInstance() {

        final NonClonableBasicImpl instance = new NonClonableBasicImpl();
        instance.setProp1("1");
        instance.setProp2("2");
        instance.setProp3("3");
        instance.setProp4("4");
        instance.setProp5("5");
        instance.setProp6("6");
        instance.setProp7("7");
        instance.setProp8("8");
        instance.setProp9("9");
        instance.setProp10("10");

        return instance;

    }



    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        CaliperMain.main(PerformanceBasicClonableVsConstructor.class, new String[]{
                "-l", "0",
//                "-p"
//                "-v"
        });
    }

    /*
    Extra stuff, expected only class name: [instrument.micro.options.warmup, 5s, denispavlov.sandbox.cloning.PerformanceClonableVsConstructor]

Usage:
 caliper [options...] <benchmark_class_name>
 java <benchmark_class_name> [options...]

Options:
 -h, --help         print this message
 -n, --dry-run      instead of measuring, execute a single rep for each scenario
                    in-process
 -b, --benchmark    comma-separated list of benchmark methods to run; 'foo' is
                    an alias for 'timeFoo' (default: all found in class)
 -m, --vm           comma-separated list of VMs to test on; possible values are
                    configured in Caliper's configuration file (default:
                    whichever VM caliper itself is running in, only)
 -i, --instrument   comma-separated list of measuring instruments to use; possible
                    values are configured in Caliper's configuration file
                    (default: 'micro')
 -t, --trials       number of independent trials to peform per benchmark scenario;
                    a positive integer (default: 1)
 -l, --time-limit   maximum length of time allowed for a single trial; use 0 to allow
                    trials to run indefinitely. (default: 30s)
 -r, --run-name     a user-friendly string used to identify the run
 -v, --verbose      in addition to normal console output, display a raw feed of very
                    detailed information from the worker (GC, compilation events, etc.).
                    runner output can also be controlled via
                    $HOME/.caliper/logging.properties
 -p, --print-config print the effective configuration that will be used by caliper
 -d, --delimiter    separator used in -b, -m, -D and -J options (default: ',')
 -c, --config       location of Caliper's configuration file (default:
                    $HOME/.caliper/config.properties)
 --directory        location of Caliper's configuration and data directory
                    (default: $HOME/.caliper)

 -Dparam=val1,val2,...
     Specifies the values to inject into the 'param' field of the benchmark
     class; if multiple values or parameters are specified in this way, caliper
     will try all possible combinations.

 -CconfigProperty=value
     Specifies a value for any property that could otherwise be specified in
     $HOME/.caliper/config.properties. Properties specified on the command line
     will override those specified in the file.
     */

}
